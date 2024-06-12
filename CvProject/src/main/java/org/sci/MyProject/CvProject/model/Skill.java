package org.sci.MyProject.CvProject.model;

import javax.persistence.*;
@Entity
@Table(name="skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer skillId;
    private String skillDescription;

    public Skill() {
    }

    public Skill(String skillDescription) {

        this.skillDescription = skillDescription;
    }

    public void setSkillDescription(String skillDescription) {

        this.skillDescription = skillDescription;
    }
    public String getSkillDescription() {

        return skillDescription;
    }
    public Integer getSkillId() {
        return skillId;
    }
}