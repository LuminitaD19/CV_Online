package org.sci.MyProject.CvProject.service;

import org.sci.MyProject.CvProject.model.Admin;
import org.sci.MyProject.CvProject.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepo adminRepo;
    public boolean login(Admin user) {
        Admin foundUser = adminRepo.findByUser(user.getUser());
        if (foundUser == null) {
            //User has not been found
            return false;
        }else if (user.getPassword().equals(foundUser.getPassword())) {
            //User has been logged in
            return true;
        }
        //Should not get here
        return false;
    }
}
