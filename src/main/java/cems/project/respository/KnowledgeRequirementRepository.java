package cems.project.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.KnowledgeRequirement;

public interface KnowledgeRequirementRepository extends CrudRepository<KnowledgeRequirement, Integer>{
	public Optional<KnowledgeRequirement> findById(Integer id);
	public List<KnowledgeRequirement> getKnowledgeRequirementByannKreqStatusId(int annKreqStatusId);
}
