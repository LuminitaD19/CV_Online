package org.sci.MyProject.CvProject.model;

import javax.persistence.*;

@Entity
@Table(name="profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "profile_Id")
    private Integer profileId;

    private String profileDescription;

    public Profile() {
    }

    public Profile(String profileDescription) {

        this.profileDescription = profileDescription;
    }

    public Profile(Integer profileId, String profileDescription) {

        this.profileId = profileId;
        this.profileDescription = profileDescription;
    }

    public void setProfileDescription(String profileDescription) {

        this.profileDescription = profileDescription;
    }
    public String getProfileDescription() {

        return profileDescription;
    }
    public Integer getProfileId() {

        return profileId;
    }

}
