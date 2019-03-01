package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.OrganizationStatus;

public interface OrganizationStatusRepository extends CrudRepository<OrganizationStatus, Integer> {
	public List<OrganizationStatus> getOrganizationStatusById(int id);
}
