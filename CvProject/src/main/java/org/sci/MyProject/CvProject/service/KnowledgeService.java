package org.sci.MyProject.CvProject.service;

import org.sci.MyProject.CvProject.model.Knowledge;
import org.sci.MyProject.CvProject.repo.KnowledgeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KnowledgeService {
    @Autowired
    private KnowledgeRepo knowledgeRepo;
    public void saveNewKnowledge (String newKnowledgeName) {

        if (!newKnowledgeName.isEmpty()) {
            Knowledge newKnowledge = new Knowledge(newKnowledgeName);
            knowledgeRepo.save(newKnowledge);
        }
        else {
            System.out.println("No knowledge description to add ");
        }

    }
    public Iterable<Knowledge> findAll() {

        return knowledgeRepo.findAll();
    }

    public void deleteProfile(Knowledge knowledgeToDelete) {
        knowledgeRepo.delete(knowledgeToDelete);
    }

}
