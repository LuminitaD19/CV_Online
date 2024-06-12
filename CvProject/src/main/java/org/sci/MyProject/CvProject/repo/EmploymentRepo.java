package org.sci.MyProject.CvProject.repo;

import org.sci.MyProject.CvProject.model.Employment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentRepo extends CrudRepository<Employment, Integer> {
    public Employment findByEmploymentId(Integer employmentId);
    public Employment findByEmploymentName(String employmentName);
}
