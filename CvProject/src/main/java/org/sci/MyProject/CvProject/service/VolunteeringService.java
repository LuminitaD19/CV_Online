package org.sci.MyProject.CvProject.service;

import org.sci.MyProject.CvProject.model.Volunteering;
import org.sci.MyProject.CvProject.repo.VolunteeringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VolunteeringService {
    @Autowired
    private VolunteeringRepo volunteeringRepo;
    public void saveNewVolunteering (String newName, String newDetails, Integer newYear) {

        if (newName.isEmpty())
        {
            System.out.println("No volunteering name to add ");
        }
        else if (newDetails.isEmpty())
        {
            System.out.println("No volunteering details to add ");
        }
        else if (newYear == 0)
        {
            System.out.println("No volunteering year to add ");
        }
        else {
            Volunteering newVolunteering = new Volunteering(newYear, newName, newDetails);
            volunteeringRepo.save(newVolunteering);

        }

    }
    public Iterable<Volunteering> findAll() {

        return volunteeringRepo.findAll();
    }

    public void deleteVolunteering(Volunteering volunteeringToDelete)
    {
        volunteeringRepo.delete(volunteeringToDelete);
    }

}