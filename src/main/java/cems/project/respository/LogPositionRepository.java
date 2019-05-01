package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.LogPosition;

/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: LogPositionRepository inherited from CrudRepository
 * Module			: LogPosition
 * Last edited		: 01/05/2019
 */
public interface LogPositionRepository extends CrudRepository<LogPosition, Integer>{
	public List<LogPosition> getLogPositionBylogpAnnId(int logpAnnId);
}
