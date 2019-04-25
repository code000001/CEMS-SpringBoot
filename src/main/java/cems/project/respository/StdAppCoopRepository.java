package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StdAppCoop;

public interface StdAppCoopRepository extends CrudRepository<StdAppCoop, Integer> {
	
	public StdAppCoop findById(int id);
	public StdAppCoop findByStdDataId(int id);
}
