package com.movieticketbooking.showz.usercontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieticketbooking.showz.model.UserDetails;
import com.movieticketbooking.showz.service.UserServiceIMPL;

@RestController
// @RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
// @CrossOrigin(origins = "http://localhost:4200", methods =
// {RequestMethod.OPTIONS, RequestMethod.DELETE})
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    UserServiceIMPL service;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public UserDetails registertologin(@RequestBody UserDetails user) {
        service.addUser(user);
        // service.deleteuser(a);
        System.out.println(user);
        System.out.println("user registered");
        // return service.addUser(user);
        return user;
    }

    // @PostMapping("/register")
    // public ResponseEntity<String> registerUser(@RequestBody UserDetails user) {
    // service.addUser(user);
    // return ResponseEntity.ok("User registered successfully");
    // }
    // @PostMapping("/register")
    // public ResponseEntity<UserDetails> registerUser(@RequestBody UserDetails
    // user) {
    // service.addUser(user);
    // user.setMessage("User registered successfully");
    // return ResponseEntity.ok(user);
    // }
    // create employee rest api
    // @PostMapping("/employees")
    // public Employee createEmployee(@RequestBody Employee employee) {
    // return employeeRepository.save(employee);
    // }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // @GetMapping("/contact")
    // public String contact() {
    // return "contact";
    // }

    @GetMapping("/usermovies")
    public String movies() {
        return "usermovies";
    }

    @GetMapping("/updatePassword")
    public String updatePassword() {
        return "updatePassword";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    // @GetMapping("/deleteUser/{id}")
    // public String deleteUser(@PathVariable int id) {
    // service.deleteUser(id);
    // System.out.println("user deleted");
    // return "redirect:/index"; // Redirect to the index page after deleting the
    // user.
    // }

    // @DeleteMapping("/register/{id}")
    // public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id) {
    //     UserDetails user = (UserDetails) service.getUserById(id);
    //       .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));

    //     service.deleteUser(user);
    //     Map<String, Boolean> response = new HashMap<>();
    //     response.put("deleted", Boolean.TRUE);
    //     return ResponseEntity.ok(response);
    // }

     @DeleteMapping("/register/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int id) {
        UserDetails user = (UserDetails) service.getUserById(id);
        //   .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));

        service.deleteUser(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getUser/{id}")
    public String getUser(@PathVariable int id, Model model) {
        UserDetails users = service.getUserById(id);
        System.out.println(users);
        return "index";

    }
    @GetMapping("/register/{id}")
	public ResponseEntity<UserDetails> getEmployeeById(@PathVariable int id) {
		UserDetails user = service.getUserById(id);
				// .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(user);
	}

    @GetMapping("/getUseremail/{email}")
    public String getUseremail(@PathVariable String email, Model model) {
        UserDetails usersemail = service.getUserByEmail(email);
        System.out.println(usersemail);
        return "index";

    }

    // @PostMapping("/updatePassword")
    // public String updatePassword(@ModelAttribute UserDetails user, Model model) {
    // // Retrieve the user by email
    // UserDetails existingUser = service.getUserByEmail(user.getEmail());

    // if (existingUser != null) {
    // // Check if the old password matches the user's current password
    // if (existingUser.getPassword().equals(user.getOldPassword())) {
    // // Update the password
    // existingUser.setPassword(user.getPassword());
    // service.updateUser(existingUser);
    // model.addAttribute("message", "Password updated successfully");
    // } else {
    // model.addAttribute("message", "Old password is incorrect");
    // }
    // } else {
    // model.addAttribute("message", "User not found with the provided email");
    // }
    // return "updatePasswordResult";
    // }
    // @PutMapping("/register/{id}")
    // public ResponseEntity<UserDetails> updateUser(@RequestBody UserDetails user) {
    //     UserDetails updatedUser = service.updateUser(user);
    //     if (updatedUser != null) {
    //         return ResponseEntity.ok(updatedUser);
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

    @PutMapping("/register/{id}")
	public ResponseEntity<UserDetails> updateEmployee(@PathVariable int id, @RequestBody UserDetails userDetails){
		UserDetails user = service.getUserById(id);
				// .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		user.setName(userDetails.getName());
		user.setGender(userDetails.getGender());
		user.setEmail(userDetails.getEmail());
		user.setPhone(userDetails.getPhone());
        user.setPassword(userDetails.getPassword());
		UserDetails updatedUser = service.save(user);
		return ResponseEntity.ok(updatedUser);
	}

    // @GetMapping("/allUsers")
    // public String showAllUsers(Model model) {
    // List<UserDetails> allUsers = service.getAllUsers();
    // model.addAttribute("users", allUsers);
    // return "allUsersView"; // Create a new HTML view to display all users
    // }

    @GetMapping("/allUsers")
    @ResponseBody
    public List<UserDetails> showAllUsers() {
        return service.getAllUsers();
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        UserDetails user = service.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            // User is valid, you can set a session variable to remember the user's login
            // state if needed
            System.out.println("login successful");
            return "dashboard"; // Redirect to the dashboard page on successful login
        } else {
            model.addAttribute("error", "Invalid email or password. Please try again.");
            System.out.println("login failed");
            return "login"; // Stay on the login page with an error message
        }
    }

}
