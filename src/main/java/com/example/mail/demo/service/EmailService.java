package com.example.mail.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.mail.demo.repository.EmailRepository;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private EmailRepository emailRepository;

    public void sendEmails(List<String> recipients, String subject, String body) {
        for (String recipient : recipients) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(recipient);
            message.setSubject(subject);
            message.setText(body);
            mailSender.send(message);
        }
    }



    public List<String> getEmailRecipients() {
        // Recupera tutte le email salvate dal database
        return emailRepository.findAll()
                .stream()
                .flatMap(emailRequest -> emailRequest.getEmailAddresses().stream())
                .toList();
    }


}
