package com.example.mail.demo;

import java.util.List;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mail.demo.service.EmailService;

@SpringBootApplication(scanBasePackages = "com.example.mail.demo")
public class DemoApplication implements CommandLineRunner  {

	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		testSendEmails();
	}

	   private void testSendEmails() {
        // Dati di test
        List<String> recipients = Arrays.asList("manuelpringols@gmail.com", "sonofdesert22@gmail.com");
        String subject = "Grazie per esserti Registrat*";
        String body = "sei un grande sei un grande sei un grande";

        // Invoca il metodo
        emailService.sendEmails(recipients, subject, body);

        System.out.println("Emails sent successfully for testing!");
    }

}
