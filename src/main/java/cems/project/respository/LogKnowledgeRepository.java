package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.LogKnowledge;


/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: LogKnowledgeRepository inherited from CrudRepository
 * Module			: LogKnowledge
 * Last edited		: 01/05/2019
 */
public interface LogKnowledgeRepository extends CrudRepository<LogKnowledge, Integer>{
	public LogKnowledge findById(int id);
	public List<LogKnowledge> getLogKnowledgeBylogkAnnId(int logkAnnId);
}
