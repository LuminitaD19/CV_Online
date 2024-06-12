package org.sci.MyProject.CvProject.service;

import org.sci.MyProject.CvProject.model.Profile;
import org.sci.MyProject.CvProject.model.Skill;
import org.sci.MyProject.CvProject.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepo profileRepo;
    public void saveNewProfile (Integer profileIdToAdd, String descriptionProfile)
    {
        if (descriptionProfile.isEmpty())
        {
            System.out.println("No new profile description to add ");
        }
        else
        {
            Profile newProfile = new Profile(profileIdToAdd,descriptionProfile);
            profileRepo.save(newProfile);
        }
    }
    public Iterable<Profile> findAll()
    {
        return profileRepo.findAll();
    }

    public void deleteProfile(Integer profileIdToDelete)
    {
        boolean exist = profileRepo.existsById(profileIdToDelete);
        if (exist)
        {
            profileRepo.deleteById(profileIdToDelete);
        }
        else
        {
            throw new IllegalStateException("This id profile does not exist!!");
        }
    }
    public void updateProfile(Integer profileIdToUpdate, String description )
    {
        boolean exist = profileRepo.existsById(profileIdToUpdate);
        if (!exist)
        {
            System.out.println("No profile index to update ");
        }
        else if (description.isEmpty())
        {
            System.out.println("No new profile description to update ");
        }
        else
        {
            Profile newProfile = new Profile(profileIdToUpdate,description);
            profileRepo.save(newProfile);
        }
    }
}
