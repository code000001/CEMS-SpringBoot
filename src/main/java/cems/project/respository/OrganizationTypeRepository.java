package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.OrganizationType;

public interface OrganizationTypeRepository extends CrudRepository<OrganizationType,Integer>{
	public List<OrganizationType> getOrganizationTypeById(int id);
}
