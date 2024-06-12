package org.sci.MyProject.CvProject;

import org.sci.MyProject.CvProject.model.Profile;
import org.sci.MyProject.CvProject.model.Skill;
import org.sci.MyProject.CvProject.service.EducationService;
import org.sci.MyProject.CvProject.service.ProfileService;
import org.sci.MyProject.CvProject.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CvProjectApplication implements CommandLineRunner {

    @Autowired
    private ProfileService profileService;
    @Autowired
    private SkillService skillService;

    public static void main(String[] args) {

        SpringApplication.run(CvProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // initialization();
    }

     private void initialization(){
         //************************************************************************
        /* Profile profile1 = new Profile("This is the profile description from run");
         profileService.saveNewProfile(profile1);
         Skill skill1 = new Skill("This is the skill description from run");
         skillService.saveNewSkill(skill1);*/

         //************************************************************************


    }

}