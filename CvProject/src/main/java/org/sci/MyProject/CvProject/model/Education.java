package org.sci.MyProject.CvProject.model;

import javax.persistence.*;

@Entity
@Table(name="education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "education_id")
    private Integer educationId;
    private String educationName;

    public Education(String educationName, String certification) {
        this.educationName = educationName;
        this.certification = certification;
    }

    public Education() {
    }

    public Education(Integer educationId, String educationName, String certification) {
        this.educationId = educationId;
        this.educationName = educationName;
        this.certification = certification;
    }

    private String certification;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}
