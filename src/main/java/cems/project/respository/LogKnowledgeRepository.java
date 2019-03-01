package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.LogKnowledge;

public interface LogKnowledgeRepository extends CrudRepository<LogKnowledge, Integer>{
	public LogKnowledge findById(int id);
	public List<LogKnowledge> getLogKnowledgeBylogkAnnId(int logkAnnId);
}
