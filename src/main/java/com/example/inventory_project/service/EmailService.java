package com.example.inventory_project.service;

import com.example.inventory_project.DTO.EmailDetailsDTO;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String sendMail(EmailDetailsDTO emailDetailsDTO) {
        String to = emailDetailsDTO.getRecipient();
        String subject = emailDetailsDTO.getSubject();
        String mailBody = emailDetailsDTO.getText();

        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom("sarkersafat99@gmail.com");
            mailMessage.setTo(to);
            mailMessage.setSubject(subject);
            mailMessage.setText(mailBody);

            javaMailSender.send(mailMessage);
            return "Mail sent successfully!";
        }
        catch (Exception e) {
            return "Error happened during send the mail";
        }
    }


}
