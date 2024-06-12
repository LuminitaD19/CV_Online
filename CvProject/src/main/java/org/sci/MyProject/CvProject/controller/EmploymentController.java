package org.sci.MyProject.CvProject.controller;

import org.sci.MyProject.CvProject.model.Employment;
import org.sci.MyProject.CvProject.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class EmploymentController {
    @Autowired
    private EmploymentService employmentService;

    @RequestMapping("/employmentHistory")
    public String getAllDataFromEmployment(Model model) {

        List<Employment> myEmploymentHistoryList = new ArrayList<>();
        Iterable<Employment> iterableEmployment = employmentService.findAll();
        for (Employment elementEmployment : iterableEmployment) {
            myEmploymentHistoryList.add(elementEmployment);
        }
        model.addAttribute("myEmploymentHistoryList", myEmploymentHistoryList);

        return "employmentHistory";
    }
    @RequestMapping("/addNewValueForEmployer")
    public String addNewEmployer(HttpServletRequest request, Model model)
    {
        return "addNewValues";
    }
    @RequestMapping("/addNewEmployer")
    public String addNewEmployerValue(HttpServletRequest request, Model model)
    {
        String newTasks= request.getParameter("tasks");
        String newUsedTools= request.getParameter("usedTools");
        Date newStartData;
        Date newEndData;
        try {
            newStartData =  new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("startDate")); //get the parameter convert it to a data type Date.
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        try {
            newEndData =  new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("endDate")); //get the parameter convert it to a data type Date.
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        String newEmploymentName= request.getParameter("nameEmployment");
        String newPosition= request.getParameter("position");
        Employment newEmployment = new Employment(newPosition, newEmploymentName, newStartData, newEndData, newTasks, newUsedTools);
        employmentService.saveNewEmployment(newEmployment);
        return "submitAdmin";
    }

}
