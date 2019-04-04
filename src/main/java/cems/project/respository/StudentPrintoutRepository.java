package cems.project.respository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import cems.project.model.StudentPrintout;



public interface StudentPrintoutRepository extends CrudRepository<StudentPrintout, Integer> {

	public StudentPrintout findById(int id);
	public List<StudentPrintout> getById(int id);
	public StudentPrintout getByStdAccId(int stdAccId);
}
