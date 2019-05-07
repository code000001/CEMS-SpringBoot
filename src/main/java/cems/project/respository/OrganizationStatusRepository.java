package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.OrganizationStatus;


/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: OrganizationStatusRepository inherited from CrudRepository
 * Module			: OrganizationStatus
 * Last edited		: 01/05/2019
 */
public interface OrganizationStatusRepository extends CrudRepository<OrganizationStatus, Integer> {
	public List<OrganizationStatus> getOrganizationStatusById(int id);
}
