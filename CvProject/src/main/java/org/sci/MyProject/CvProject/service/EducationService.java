package org.sci.MyProject.CvProject.service;

import org.sci.MyProject.CvProject.model.Education;
import org.sci.MyProject.CvProject.repo.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {
    @Autowired
    private EducationRepo educationRepo;
    public void saveNewEducation (String certification, String educationName) {

        if (educationName.isEmpty()) {
            System.out.println("No education description to add ");
        } else if (certification.isEmpty()) {
            System.out.println("No certification to add ");
        }
        else{
            Education newEducation = new Education(educationName, certification);
            educationRepo.save(newEducation);
        }
    }
    public Iterable<Education> findAll() {

        return educationRepo.findAll();
    }

    public void deleteEducation(Education educationToDelete)
    {
        educationRepo.delete(educationToDelete);
    }

}
