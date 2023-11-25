package com.movieticketbooking.showz.service;

import java.util.List;

import com.movieticketbooking.showz.model.UserDetails;

public interface UserService {
    public UserDetails addUser(UserDetails user);
    // public void deleteuser(UserDetails user);
    public UserDetails deleteUser(UserDetails user);

    // public void updatepassword(UserDetails pass);

    public UserDetails getUserById(int id);

    public UserDetails getUserByEmail(String email);

    // public void updateUser(UserDetails user);
    UserDetails updateUser(UserDetails user);
    List<UserDetails> getAllUsers();
    UserDetails save(UserDetails user);
    
    

    
    
}
