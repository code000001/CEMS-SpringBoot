package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StudentSkillGrade;

public interface StudentSkillGradeRepository extends CrudRepository<StudentSkillGrade, Integer>  {

	public StudentSkillGrade findById(int id);
	public StudentSkillGrade findBystdAccId(int stdAccId);
	public StudentSkillGrade getBystdAccId(int stdAccId);
}
