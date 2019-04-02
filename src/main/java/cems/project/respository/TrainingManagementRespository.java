package cems.project.respository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import cems.project.model.TrainingManagement;

public interface TrainingManagementRespository extends CrudRepository<TrainingManagement, Integer> {

	public TrainingManagement findById(int id);
	public List<TrainingManagement> getById(int id);
}
