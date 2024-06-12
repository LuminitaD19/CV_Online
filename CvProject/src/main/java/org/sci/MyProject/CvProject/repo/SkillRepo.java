package org.sci.MyProject.CvProject.repo;

import org.sci.MyProject.CvProject.model.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepo extends CrudRepository<Skill,Integer> {
    public Skill findBySkillId(Integer profileId);
    public Skill findBySkillDescription(String profileDescription);

}
