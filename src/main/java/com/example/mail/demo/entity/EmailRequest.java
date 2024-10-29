package com.example.mail.demo.entity;

import java.util.Collection;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class EmailRequest {

    private Integer id;
    private String subject;
    private String body;
    public Collection<String> getEmailAddresses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmailAddresses'");
    }




 
}
