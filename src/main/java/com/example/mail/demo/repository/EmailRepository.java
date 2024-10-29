package com.example.mail.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mail.demo.entity.EmailRequest;

@Repository
public interface EmailRepository extends JpaRepository<EmailRequest,Integer> {





}
