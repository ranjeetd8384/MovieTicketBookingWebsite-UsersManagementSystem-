import { Component } from '@angular/core';
import { UserService } from '../user.service';
import{ UserDetails } from 'C:/JFSJD/Angular/NewProject/src/app/user-details';
import { Router } from '@angular/router';
// import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-registration-form',
  templateUrl: './registration-form.component.html',
  styleUrls: ['./registration-form.component.css']
})
export class RegistrationFormComponent {
  user: UserDetails = new UserDetails();
  // registrationForm: any;

  constructor(private userService: UserService, private router: Router) { }

  // registerUser() {
  //   // Get the form values
  //   const name = this.registrationForm.value.name;
  //   const gender = this.registrationForm.value.gender;
  //   const email = this.registrationForm.value.email;
  //   const phone = this.registrationForm.value.phone;
  //   const password = this.registrationForm.value.password;

  //   // Call the service to register the user
  //   this.userService.registerUser({ name, gender, email, phone, password })
  //     .subscribe(
  //       (response: any) => {
  //         console.log('User registered successfully:', response);
  //         // Access the message field from the response
  //         const message = response.message;
  //         // Handle success, e.g., show a success message or redirect to login
  //         console.log('Registration Message:', message);
  //       },
  //       (error: any) => {
  //         console.error('Error registering user:', error);
  //         // Handle error, e.g., show an error message
  //       }
  //     );
  // }
  // onSubmit(){
  //   // console.log(this.);
  //   this.registerUser();
  // }
  saveEmployee(){
    this.userService.createEmployee(this.user).subscribe( data =>{
      // console.log(data);
      // this.goToEmployeeList();
    },
    );
    // error => console.log(error));
  }
  onSubmit(){
    console.log(this.user);
    this.saveEmployee();
    this.goToUserList();
  }
  // navigationtoSignin(){
  //   this.router.navigate(['signin']);
  // }
  goToUserList(){
    this.router.navigate(['/userlist']);
  }
}
