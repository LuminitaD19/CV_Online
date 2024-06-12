package org.sci.MyProject.CvProject.controller;

import org.sci.MyProject.CvProject.model.Skill;
import org.sci.MyProject.CvProject.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

@Controller
public class SkillController {
    @Autowired
    private SkillService skillService;

    List<Skill> setSkillList()
    {
        List<Skill> mySkillList = new ArrayList<>();
        Iterable<Skill> iterableSkill = skillService.findAll();
        for (Skill elementSkill : iterableSkill)
        {
            mySkillList.add(elementSkill);
        }
        return mySkillList;

    }
    @RequestMapping("/keySkills")
     public String getAllDataFromSkill(Model model) {

        List<Skill> mySkillsList = setSkillList();
        model.addAttribute("mySkillsList", mySkillsList);
        return "keySkills";
    }

    @RequestMapping("/addNewValuesForSkill")
    public String addNewSkill(HttpServletRequest request, Model model)
    {
        return "addNewValues";
    }
    @RequestMapping("/addNewSkill")
    public String addNewSkillValue(HttpServletRequest request, Model model)
    {
        String newDescription = request.getParameter("skillDescription");
        skillService.saveNewSkill(newDescription);
        return "submitAdmin";
    }

    @RequestMapping("/deleteSkillValues")
    public String getAllDataFromSkillToSelectForDelete(Model model) {
        List<Skill> mySkillList = setSkillList();
        model.addAttribute("mySkillList", mySkillList);
        return "/deleteValues";
    }
    @RequestMapping("/deleteSkill")
    public String deleteSkill(HttpServletRequest request, Model model)
    {
        Integer skillIdToDelete = valueOf(request.getParameter("skillId"));
        skillService.deleteSkill(skillIdToDelete);
        List<Skill> mySkillList = setSkillList();
        model.addAttribute("mySkillList", mySkillList);
        return "deleteValues";
    }

}
