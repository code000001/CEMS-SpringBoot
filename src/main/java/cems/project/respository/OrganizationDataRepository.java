package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.OrganizationData;

public interface OrganizationDataRepository extends CrudRepository< OrganizationData, Integer> {
	public OrganizationData findById(int id);
	public List<OrganizationData> getOrganizationDataById(int id);
}
