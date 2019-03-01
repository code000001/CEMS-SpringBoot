package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.AnnouncementStatus;


public interface AnnouncementStatusRepository  extends CrudRepository<AnnouncementStatus, Integer>{
	public AnnouncementStatus findById(int id);
	public List<AnnouncementStatus> getAnnouncementStatusById(int id);
}
