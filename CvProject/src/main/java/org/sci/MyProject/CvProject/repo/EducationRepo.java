package org.sci.MyProject.CvProject.repo;


import org.sci.MyProject.CvProject.model.Education;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends CrudRepository<Education, Integer> {
    public Education findByEducationId(Integer educationId);
    public Education findByEducationName(String educationName);
}