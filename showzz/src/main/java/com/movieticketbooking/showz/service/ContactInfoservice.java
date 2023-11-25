package com.movieticketbooking.showz.service;

import java.util.List;

import com.movieticketbooking.showz.model.ContactInfo;

public interface ContactInfoservice {
    ContactInfo saveContactInfo(ContactInfo contactInfo);
    List<ContactInfo> getAllContactInfos();
}
