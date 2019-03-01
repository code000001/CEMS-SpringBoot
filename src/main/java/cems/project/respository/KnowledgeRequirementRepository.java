package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.KnowledgeRequirement;

public interface KnowledgeRequirementRepository extends CrudRepository<KnowledgeRequirement, Integer>{
	public KnowledgeRequirement findById(int id);
	public List<KnowledgeRequirement> getKnowledgeRequirementByannKreqStatusId(int annKreqStatusId);
}
