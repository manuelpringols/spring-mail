package com.example.mail.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mail.demo.entity.EmailRequest;
import com.example.mail.demo.service.EmailService;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-emails")
    public String sendEmails(@RequestBody EmailRequest emailRequest) {
        List<String> recipients = this.emailService.getEmailRecipients();
        String subject = emailRequest.getSubject();
        String body = emailRequest.getBody();
        
        emailService.sendEmails(recipients, subject, body);
        return "Emails sent successfully!";
    }


    
}
