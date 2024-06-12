package org.sci.MyProject.CvProject.service;
import org.sci.MyProject.CvProject.model.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender javamailSender;
    @Autowired
    public EmailSenderService(JavaMailSender javaMailSender) {
        this.javamailSender = javaMailSender;
    }
    public boolean sendEmail(EmailDetails emailDetails){
        try {
            SimpleMailMessage emailMessage = new SimpleMailMessage();
            String message;

            emailMessage.setTo((emailDetails.getRecipient()));
            emailMessage.setFrom(emailDetails.getSender());
            emailMessage.setSubject(emailDetails.getSubject());
            message = emailDetails.getFirstName() + " " + emailDetails.getLastName();
            message = message +" with email " + emailDetails.getSender() + " sent ";
            message = message + "\n \n " + emailDetails.getBody();


            emailMessage.setText(message);
            emailMessage.setSentDate(new Date());
            //attempt to send email
            javamailSender.send(emailMessage);
            System.out.println("Mail send successfully!!");
            return true;

        } catch(Exception e)
        {
            //Error occurred, return error message
            System.out.println("Sending email failed: " + e.getMessage());
            return false;
        }
    }
}

