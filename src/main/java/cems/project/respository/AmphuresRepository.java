package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.Amphures;

public interface AmphuresRepository extends CrudRepository<Amphures, Integer>  {
	
	public Amphures findById(int id);
	public Iterable<Amphures> getByProvinceId(int pvid);
	public Iterable<Amphures> findByProvinceId(int pvid);

}
