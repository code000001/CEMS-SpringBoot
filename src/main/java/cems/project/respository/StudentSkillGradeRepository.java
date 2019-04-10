package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StudentSkillGrade;

public interface StudentSkillGradeRepository extends CrudRepository<StudentSkillGrade, Integer>  {

	public StudentSkillGrade findById(int id);
	public List<StudentSkillGrade> getById(int id);
	public StudentSkillGrade getBystdAccId(int stdAccId);
}
