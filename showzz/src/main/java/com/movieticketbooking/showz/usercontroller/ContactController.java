package com.movieticketbooking.showz.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.movieticketbooking.showz.model.ContactInfo;
// import com.movieticketbooking.showz.service.ContactInfoServiceIMPL;
import com.movieticketbooking.showz.service.ContactInfoservice;

@Controller
public class ContactController {
    @Autowired
    ContactInfoservice contactInfoservice;

    @GetMapping("/contact")
    public String showContactForm(Model model){
        model.addAttribute("contactInfo", new ContactInfo());
        return "contact";
    }

    @PostMapping("/contact")
    public String saveContactInfo(@ModelAttribute ContactInfo contactInfo){
        contactInfoservice.saveContactInfo(contactInfo);
        return "redirect:/contact/list";
    }

    @GetMapping("/contact/list")
    public String listContactInfos(Model model){
        List<ContactInfo> contactInfos = contactInfoservice.getAllContactInfos();
        model.addAttribute("contactInfos", contactInfos);
        return "contact-list";
    }
}
