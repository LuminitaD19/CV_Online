package org.sci.MyProject.CvProject.controller;

import org.sci.MyProject.CvProject.model.EmailDetails;
import org.sci.MyProject.CvProject.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/contact")
    public String showContactForm()
    {
       return "contact_form";
    }

    @RequestMapping(value = "/submitContact")
    public String submitContact(HttpServletRequest request)
    {
        EmailDetails emailDetails = new EmailDetails();
        EmailSenderService emailSenderService = new EmailSenderService(javaMailSender);
        emailDetails.setRecipient("luminita.daraban@gmail.com");
        emailDetails.setFirstName(request.getParameter("name"));
        emailDetails.setLastName(request.getParameter("lastName"));
        emailDetails.setSender(request.getParameter("email"));
        emailDetails.setSubject(request.getParameter("subject"));
        emailDetails.setBody(request.getParameter("content"));

        if (emailSenderService.sendEmail(emailDetails))
        {
            return "/submitContact";
        }
        else {
            return "error";
        }
    }
}


