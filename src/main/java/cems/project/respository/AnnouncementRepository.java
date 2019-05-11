package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.Announcement;

/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: AnnouncementRepository inherited from CrudRepository
 * Module			: Announcement
 * Last edited		: 01/05/2019
 */
public interface AnnouncementRepository extends CrudRepository<Announcement, Integer>  {
	
	public Announcement findById(int id);
	public List<Announcement> getById(int id);
	public List<Announcement> getByannOrgId(int annOrgId);
	public Announcement findByannOrgId(int annOrgId);

}
