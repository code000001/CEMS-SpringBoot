package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.LogPosition;

public interface LogPositionRepository extends CrudRepository<LogPosition, Integer>{
	public List<LogPosition> getLogPositionBylogpAnnId(int logpAnnId);
}
