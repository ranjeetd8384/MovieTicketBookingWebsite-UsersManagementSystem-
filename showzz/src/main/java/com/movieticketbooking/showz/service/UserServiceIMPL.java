package com.movieticketbooking.showz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticketbooking.showz.model.UserDetails;
import com.movieticketbooking.showz.repository.UserRepo;

@Service
public class UserServiceIMPL implements UserService {
    @Autowired
    UserRepo obj;

    @Override
    public UserDetails addUser(UserDetails user) {
        return obj.save(user);

    }

    // @Override
    // public void deleteuser(UserDetails user) {
    // obj.deleteById(1);
    // }
    // @Override
    // public UserDetails deleteUser(UserDetails user) {
    // obj.deleteById(user);
    // return user;
    // }
    @Override
    public UserDetails deleteUser(UserDetails user) {
        obj.deleteById(user.getId()); // Assuming UserDetails has a getId method
        return user;
    }
    // @Override
    // public void updatepassword(UserDetails pass) {
    // obj.save(pass);
    // }

    @Override
    public UserDetails getUserById(int id) {
        return obj.findById(id);
        //  return obj.findById(id).orElse(null);
    }
    @Override
    public UserDetails getUserByEmail(String email) {
        return obj.findByEmail(email);
    }

    // @Override
    // public void updateUser(UserDetails user) {
    // UserDetails existingUser = obj.findByEmail(user.getEmail());
    // if (existingUser != null) {
    // existingUser.setPassword(user.getPassword());
    // obj.save(existingUser);
    // }
    // }

    // @Override
    // public UserDetails updateUser(UserDetails user) {
    //     UserDetails existingUser = obj.findByEmail(user.getEmail());
    //     if (existingUser != null) {
    //         existingUser.setPassword(user.getPassword());

    //         // Update other fields as needed
    //         return obj.save(existingUser);
    //     }
    //     return null;
    // }
     
    @Override
public UserDetails updateUser(UserDetails user) {
    UserDetails existingUser = obj.findByEmail(user.getEmail());
    
    if (existingUser != null) {
        existingUser.setName(user.getName());
        existingUser.setName(user.getName());
        existingUser.setGender(user.getGender());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhone(user.getPhone());
        existingUser.setPassword(user.getPassword());

        // Update other fields as needed

        return obj.save(existingUser);
    }
    
    return null; // Or throw an exception if required
}

    @Override
    public List<UserDetails> getAllUsers() {
        return obj.findAll();
    }
  
    @Override
    public UserDetails save(UserDetails user) {
        return obj.save(user);
    }
    // public Object getUserById(Long id) {
    //     return null;
    // }

}
