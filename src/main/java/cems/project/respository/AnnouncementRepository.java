package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.Announcement;

public interface AnnouncementRepository extends CrudRepository<Announcement, Integer>  {
	
	public Announcement findById(int id);

}
