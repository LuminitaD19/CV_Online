package org.sci.MyProject.CvProject.repo;

import org.sci.MyProject.CvProject.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Integer> { //CrudRepository<Profile, Integer> {

    public Profile findByProfileId(Integer profileId);
    public boolean existsById(Integer profileId);
    public Profile findByProfileDescription(String profileDescription);
}
