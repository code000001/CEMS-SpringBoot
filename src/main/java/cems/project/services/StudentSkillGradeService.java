package cems.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StudentSkillGrade;
import cems.project.respository.StudentSkillGradeRepository;


@Service
@Configuration
public class StudentSkillGradeService {
	
	@Autowired
	private StudentSkillGradeRepository stdSkillGrade;
	
	public StudentSkillGrade getstdskill (int stdId) {
		return stdSkillGrade.getBystdAccId(stdId);
	}
	
	public StudentSkillGrade addupskill(int stdId, StudentSkillGrade newStudentSkillGrade) {
		StudentSkillGrade currentStudent = stdSkillGrade.findById(stdId);
		currentStudent.setStdSkillHtml(newStudentSkillGrade.getStdSkillHtml());
		currentStudent.setStdSkillCss(newStudentSkillGrade.getStdSkillCss());
		currentStudent.setStdSkillPhp(newStudentSkillGrade.getStdSkillPhp());
		currentStudent.setStdSkillSql(newStudentSkillGrade.getStdSkillSql());
		currentStudent.setStdSkillJs(newStudentSkillGrade.getStdSkillJs());
		return stdSkillGrade.save(currentStudent);
		
	}
}
