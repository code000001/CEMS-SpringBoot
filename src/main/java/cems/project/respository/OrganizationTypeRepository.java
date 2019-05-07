package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.OrganizationType;

/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: OrganizationTypeRepository inherited from CrudRepository
 * Module			: OrganizationType
 * Last edited		: 01/05/2019
 */
public interface OrganizationTypeRepository extends CrudRepository<OrganizationType,Integer>{
	public List<OrganizationType> getOrganizationTypeById(int id);
}
