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
	
}
