package org.sci.MyProject.CvProject.model;

import javax.persistence.*;

@Entity
@Table(name="knowledge")
public class Knowledge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "knowledge_Id")
    private Integer knowledgeId;

    private String knowledgeName;

    public Knowledge() {
    }

    public Knowledge(String knowledgeName) {
        this.knowledgeName = knowledgeName;
    }

    public Knowledge(Integer knowledgeId, String knowledgeName) {
        this.knowledgeId = knowledgeId;
        this.knowledgeName = knowledgeName;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName;
    }
}