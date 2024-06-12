package org.sci.MyProject.CvProject.controller;

import org.sci.MyProject.CvProject.model.Volunteering;
import org.sci.MyProject.CvProject.service.VolunteeringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;


@Controller
public class VolunteeringController {
    @Autowired
    private VolunteeringService volunteeringService;

    @RequestMapping("/volunteering")
    public String getAllDataFromProfile(Model model) {

        List<Volunteering> myVolunteeringList = new ArrayList<>();
        Iterable<Volunteering> iterableVolunteering = volunteeringService.findAll();
        for (Volunteering elementVolunteering : iterableVolunteering) {
            myVolunteeringList.add(elementVolunteering);
        }
        model.addAttribute("myVolunteeringList", myVolunteeringList);

        return "volunteering";
    }

    @RequestMapping("/addNewValuesForVolunteering")
    public String addNewSkill(HttpServletRequest request, Model model)
    {
        return "addNewValues";
    }
    @RequestMapping("/addNewVolunteering")
    public String addNewSkillValue(HttpServletRequest request, Model model)
    {
        String volunteeringName = request.getParameter("volunteeringName");
        String volunteeringDetails = request.getParameter("volunteeringDetails");
        Integer volunteeringYear = valueOf(request.getParameter("volunteeringYear"));
        volunteeringService.saveNewVolunteering(volunteeringName, volunteeringDetails, volunteeringYear);
        return "submitAdmin";
    }
}