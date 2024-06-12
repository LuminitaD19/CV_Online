package org.sci.MyProject.CvProject.service;

import org.sci.MyProject.CvProject.model.Profile;
import org.sci.MyProject.CvProject.model.Skill;
import org.sci.MyProject.CvProject.repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    @Autowired
    private SkillRepo skillRepo;
    public void saveNewSkill (String descriptionSkill) {

        if (!descriptionSkill.isEmpty()) {
            Skill newSkill = new Skill(descriptionSkill);
            skillRepo.save(newSkill);
        }
        else {
            System.out.println("No skill description to add ");
        }

    }
    public Iterable<Skill> findAll() {
        return skillRepo.findAll();
    }
    public void deleteSkill(Integer skillIdToDelete)
    {
        boolean exist = skillRepo.existsById(skillIdToDelete);
        if (exist)
        {
            skillRepo.deleteById(skillIdToDelete);
        }
        else
        {
            throw new IllegalStateException("This id skill does not exist!!");
        }
    }
    public void updateSkill(Integer skillIdToUpdate, String description )
    {
        boolean exist = skillRepo.existsById(skillIdToUpdate);
        if (!exist)
        {
            System.out.println("No skill index to update ");
        }
        else if (description.isEmpty())
        {
            System.out.println("No new skill description to update ");
        }
        else
        {
            Skill newSkill = new Skill(description);
            skillRepo.save(newSkill);
        }
    }
}
