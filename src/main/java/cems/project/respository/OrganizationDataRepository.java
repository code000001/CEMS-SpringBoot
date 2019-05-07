package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.OrganizationData;


/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: OrganizationDataRepository inherited from CrudRepository
 * Module			: OrganizationData
 * Last edited		: 01/05/2019
 */
public interface OrganizationDataRepository extends CrudRepository< OrganizationData, Integer> {
	public OrganizationData findById(int id);
	public List<OrganizationData> getOrganizationDataById(int id);
}
