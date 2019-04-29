package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import cems.project.model.StudentAddInsForm;

public interface StudentAddInsFormRepository extends CrudRepository<StudentAddInsForm, Integer> {

	public StudentAddInsForm findById(int id);
	public List<StudentAddInsForm> getById(int id);
	public List<StudentAddInsForm> getBystdId(int stdId);
	public StudentAddInsForm getBystdAccId(int stdId);
	public List<StudentAddInsForm> getByStdStatusId(int stdStatusId);
}
