package org.sci.MyProject.CvProject.controller;
import org.sci.MyProject.CvProject.model.Knowledge;
import org.sci.MyProject.CvProject.service.KnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class KnowledgeController {
    @Autowired
    private KnowledgeService knowledgeService;

    @RequestMapping("/knowledge")
    public String getAllDataFromKnowledge(Model model) {

        List<Knowledge> myKnowledgeList = new ArrayList<>();
        Iterable<Knowledge> iterableKnowledge = knowledgeService.findAll();
        for (Knowledge elementKnowledge : iterableKnowledge) {
            myKnowledgeList.add(elementKnowledge);
        }
        model.addAttribute("myKnowledgeList", myKnowledgeList);
        return "knowledge";
    }

    @RequestMapping("/addNewValuesForKnowledge")
    public String addNewKnowledge(HttpServletRequest request, Model model)
    {
        return "addNewValues";
    }
    @RequestMapping("/addNewKnowledge")
    public String addNewSkillValue(HttpServletRequest request, Model model)
    {
        String newName= request.getParameter("knowledgeName");
        knowledgeService.saveNewKnowledge(newName);
        return "submitAdmin";
    }
}