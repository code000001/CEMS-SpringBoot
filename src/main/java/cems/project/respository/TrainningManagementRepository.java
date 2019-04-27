package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.TrainingManagement;

public interface TrainningManagementRepository extends CrudRepository<TrainingManagement, Integer> {

	public Iterable<TrainingManagement> findAll();
	
}
