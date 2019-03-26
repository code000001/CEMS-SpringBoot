package cems.project.respository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.PositionData;

public interface PositionDataRepository extends CrudRepository<PositionData, Integer>  {
	public Optional<PositionData> getById(int id);
}
