package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.AnnouncementStatus;

/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: AnnouncementStatusRepository inherited from CrudRepository
 * Module			: Announcement Status
 * Last edited		: 01/05/2019
 */
public interface AnnouncementStatusRepository  extends CrudRepository<AnnouncementStatus, Integer>{
	public AnnouncementStatus findById(int id);
	public List<AnnouncementStatus> getAnnouncementStatusById(int id);
}
