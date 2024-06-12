package org.sci.MyProject.CvProject.repo;

import org.sci.MyProject.CvProject.model.Profile;
import org.sci.MyProject.CvProject.model.Volunteering;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteeringRepo extends CrudRepository<Volunteering, Integer> {
    public Volunteering findByVolunteeringId(Integer volunteeringId);
    public Volunteering findByVolunteeringName(String volunteeringName);

    }
