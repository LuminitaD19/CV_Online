package org.sci.MyProject.CvProject.service;

import org.sci.MyProject.CvProject.model.Employment;
import org.sci.MyProject.CvProject.model.Knowledge;
import org.sci.MyProject.CvProject.repo.EmploymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmploymentService {
    @Autowired


 /*     if (!newKnowledgeName.isEmpty()) {
        Knowledge newKnowledge = new Knowledge(newKnowledgeName);
        knowledgeRepo.save(newKnowledge);
    }
        else {
        System.out.println("No knowledge description to add ");
    }

*/

    private EmploymentRepo employmentRepo;
    public void saveNewEmployment (Employment newEmployment) {
        //TODO mai verifica
       /* if(newEmployment.getEmploymentName().isEmpty()) {
            System.out.println("No employment name to add ");
        } else if (newEmployment.getPosition().isEmpty()) {
            System.out.println("No position to add ");
        } else if (newEmployment.getTasks().isEmpty()) {
            System.out.println("No tasks to add ");
        }
        else */{
            employmentRepo.save(newEmployment);
        }

    }
    public Iterable<Employment> findAll() {

        return employmentRepo.findAll();
    }

    public void deleteEmployment(Employment employmentToDelete){
        employmentRepo.delete(employmentToDelete);
    }

}
