package cems.project.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.KnowledgeRequirement;

/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: KnowledgeRequirementRepository inherited from CrudRepository
 * Module			: KnowledgeRequirement
 * Last edited		: 01/05/2019
 */
public interface KnowledgeRequirementRepository extends CrudRepository<KnowledgeRequirement, Integer>{
	public Optional<KnowledgeRequirement> findById(Integer id);
	public List<KnowledgeRequirement> getKnowledgeRequirementByannKreqStatusId(int annKreqStatusId);
}
