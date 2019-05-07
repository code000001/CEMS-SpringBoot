package cems.project.respository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.PositionData;


/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: PositionDataRepository inherited from CrudRepository
 * Module			: PositionData
 * Last edited		: 01/05/2019
 */
public interface PositionDataRepository extends CrudRepository<PositionData, Integer>  {
	public Optional<PositionData> getById(int id);
}
