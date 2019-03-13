
package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.Districts;

public interface DistrictsRepository extends CrudRepository<Districts, Integer>  {
	
	public Districts findById(int id);
	public Iterable<Districts> getByAmphureId(int amp_id);

}
