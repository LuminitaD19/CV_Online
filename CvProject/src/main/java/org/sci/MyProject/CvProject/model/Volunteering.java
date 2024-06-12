package org.sci.MyProject.CvProject.model;

import javax.persistence.*;

@Entity
@Table(name="volunteering")
public class Volunteering {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "volunteering_Id")
    private Integer volunteeringId;
    private  Integer year;
    private String volunteeringName;

    public Volunteering(Integer year, String volunteeringName, String volunteeringDetails) {
        this.year = year;
        this.volunteeringName = volunteeringName;
        this.volunteeringDetails = volunteeringDetails;
    }

    public Volunteering(Integer volunteeringId, Integer year, String volunteeringName, String volunteeringDetails) {
        this.volunteeringId = volunteeringId;
        this.year = year;
        this.volunteeringName = volunteeringName;
        this.volunteeringDetails = volunteeringDetails;
    }

    public Integer getVolunteeringId() {
        return volunteeringId;
    }

    public void setVolunteeringId(Integer volunteeringId) {
        this.volunteeringId = volunteeringId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getVolunteeringName() {
        return volunteeringName;
    }

    public void setVolunteeringName(String volunteeringName) {
        this.volunteeringName = volunteeringName;
    }

    public String getVolunteeringDetails() {
        return volunteeringDetails;
    }

    public void setVolunteeringDetails(String volunteeringDetails) {
        this.volunteeringDetails = volunteeringDetails;
    }

    public Volunteering() {
    }

    private String volunteeringDetails;
}
