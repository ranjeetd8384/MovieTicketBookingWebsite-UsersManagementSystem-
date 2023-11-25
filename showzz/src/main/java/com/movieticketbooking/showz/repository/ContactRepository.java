package com.movieticketbooking.showz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieticketbooking.showz.model.ContactInfo;

public interface  ContactRepository extends JpaRepository<ContactInfo, Long>{
    
}
