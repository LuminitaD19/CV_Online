package org.sci.MyProject.CvProject.controller;

import org.sci.MyProject.CvProject.model.Profile;
import org.sci.MyProject.CvProject.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

@Controller
public class ProfileController {
    @Autowired
    private ProfileService profileService;
    private Integer profileIdToUpdate;

    List<Profile> setProfileList()
    {
        List<Profile> myProfileList = new ArrayList<>();
        Iterable<Profile> iterableProfile = profileService.findAll();
        for (Profile elementProfile : iterableProfile)
        {
            myProfileList.add(elementProfile);
        }
        return myProfileList;

    }

    @RequestMapping("/profile")
    public String getAllDataFromProfile(Model model) {

        List<Profile> myProfileList = setProfileList();
        model.addAttribute("myProfileList", myProfileList);
        return "profile";
    }

    @RequestMapping("/deleteValues")
    public String getAllDataFromProfileToSelectForDelete(Model model) {
        List<Profile> myProfileList = setProfileList();
        model.addAttribute("myProfileList", myProfileList);
        return "/deleteValues";
    }
    @RequestMapping("/deleteProfile")
    public String deleteProfile(HttpServletRequest request, Model model)
    {
        Integer profileIdToDelete = valueOf(request.getParameter("profileId"));
        profileService.deleteProfile(profileIdToDelete);
        List<Profile> myProfileList = setProfileList();
        model.addAttribute("myProfileList", myProfileList);
        return "deleteValues";
    }
    @RequestMapping("/addNewValues")
    public String addNewProfile(HttpServletRequest request, Model model)
    {
        //String newDescription = request.getParameter("profileDescription");
        //  Integer profileIdToUpdate = valueOf(request.getParameter("profileId"));
        //profileService.saveNewProfile(5, newDescription);
        return "addNewValues";
    }
    @RequestMapping("/addNewProfile")
    public String addNewProfileValue(HttpServletRequest request, Model model)
    {
        String newDescription = request.getParameter("profileDescription");
        //  Integer profileIdToUpdate = valueOf(request.getParameter("profileId"));
        profileService.saveNewProfile(5, newDescription);
        return "submitAdmin";
    }

    @RequestMapping("/updateValues")
    public String selectProfileToUpdate(HttpServletRequest request, Model model)
    {
        List<Profile> myProfileList = setProfileList();
        model.addAttribute("myProfileList", myProfileList);
        return "updateValues";
    }
    @RequestMapping("/updateProfile")
    public String updateProfile(HttpServletRequest request, Model model)
    {
        profileIdToUpdate = valueOf(request.getParameter("profileId"));
        model.addAttribute("myProfileId", profileIdToUpdate);
        return "updateNewData";
    }
    @RequestMapping("/updateProfileNewData")
    public String updateNewProfile(HttpServletRequest request, Model model) {
        String newDescription = request.getParameter("description");
      //  Integer profileIdToUpdate = valueOf(request.getParameter("profileId"));
        profileService.updateProfile(profileIdToUpdate, newDescription);
        List<Profile> myProfileList = setProfileList();
        return "submitAdmin";
    }
}


