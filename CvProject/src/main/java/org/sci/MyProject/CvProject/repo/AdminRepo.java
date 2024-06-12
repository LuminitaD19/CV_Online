package org.sci.MyProject.CvProject.repo;

import org.sci.MyProject.CvProject.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer> {
    public Admin findByUser(String user);
    public Admin findByUserId(Integer userID);
}