package com.movieticketbooking.showz.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.movieticketbooking.showz.model.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails, Integer>  {
    UserDetails findByEmail(String email);

    void deleteById(UserDetails user);

    UserDetails findById(int id);
}
