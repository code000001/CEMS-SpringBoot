package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.AnnouncementStatus;


public interface AnnouncementStatusRepository  extends CrudRepository<AnnouncementStatus, Integer>{
	
}
