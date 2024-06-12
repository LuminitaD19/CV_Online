package org.sci.MyProject.CvProject.controller;


import org.sci.MyProject.CvProject.model.Admin;
import org.sci.MyProject.CvProject.model.EmailDetails;
import org.sci.MyProject.CvProject.service.AdminService;
import org.sci.MyProject.CvProject.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/admin")
    public String showContactForm()
    {

        return "admin";
    }

    @RequestMapping("/submitAdmin")
    public String submitAdmin(Admin user) {

        if (adminService.login(user))
        {
            return "/submitAdmin";
        }
        else {
            return "error";
        }
    }
}




