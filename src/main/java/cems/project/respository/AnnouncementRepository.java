package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.Announcement;

public interface AnnouncementRepository extends CrudRepository<Announcement, Integer>  {
	
	public Announcement findById(int id);
	public List<Announcement> getById(int id);

}
