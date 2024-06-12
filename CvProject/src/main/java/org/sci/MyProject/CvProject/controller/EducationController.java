package org.sci.MyProject.CvProject.controller;

import org.sci.MyProject.CvProject.model.Education;
import org.sci.MyProject.CvProject.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EducationController {
    @Autowired
    private EducationService educationService;

    @RequestMapping("/education")
    public String getAllDataFromEducation(Model model) {

        List<Education> myEducationList = new ArrayList<>();
        Iterable<Education> iterableEducation = educationService.findAll();
        for (Education elementEducation : iterableEducation) {
            myEducationList.add(elementEducation);
        }
        model.addAttribute("myEducationList", myEducationList);

        return "education";
    }

    @RequestMapping("/addNewValuesForEducation")
    public String addNewEducation(HttpServletRequest request, Model model)
    {
        return "addNewValues";
    }
    @RequestMapping("/addNewEducation")
    public String addNewEducationValue(HttpServletRequest request, Model model)
    {
        String newCertification = request.getParameter("certification");
        String newEducationName = request.getParameter("educationName");
        educationService.saveNewEducation(newCertification,newEducationName);
        return "submitAdmin";
    }
}
