package org.sci.MyProject.CvProject.repo;

import org.sci.MyProject.CvProject.model.Knowledge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KnowledgeRepo extends CrudRepository<Knowledge, Integer> {

    public KnowledgeRepo findByKnowledgeId(Integer knowledgeId);
    public KnowledgeRepo findByKnowledgeName(String knowledgeName);
}