package com.movieticketbooking.showz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movieticketusers")
public class UserDetails {
    @Column
    @GeneratedValue
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    
    private int id;
    private String name;
    private String gender;
    private String email;
    private String phone;
    private String password;
    private String oldPassword;

     // Add a message field for registration response
     private String message;

    
   

    public UserDetails() {
    }

    

    public UserDetails(int id, String name, String gender, String email, String phone, String password,
            String oldPassword, String message) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.oldPassword = oldPassword;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // public void setPassword(String password) {
    //     this.password = password;
    // }
    public String getOldPassword() {
        return oldPassword;
    }
    
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
    
     public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "UserDetails [name=" + name + ", gender=" + gender + ", email=" + email + ", phone=" + phone
                + ", password=" + password + ", message=" + message + "]";
    }

    
}
