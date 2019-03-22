package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.PositionData;

public interface PositionDataRepository extends CrudRepository<PositionData, Integer>  {
	public List<PositionData> getPositionDataById(int Id);
}
