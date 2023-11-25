package com.movieticketbooking.showz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticketbooking.showz.model.ContactInfo;
import com.movieticketbooking.showz.repository.ContactRepository;

@Service
public class ContactInfoServiceIMPL implements ContactInfoservice {
    
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public ContactInfo saveContactInfo(ContactInfo contactInfo) {
       return contactRepository.save(contactInfo);
    }

    @Override
    public List<ContactInfo> getAllContactInfos() {
       return contactRepository.findAll();
    }
    
}
