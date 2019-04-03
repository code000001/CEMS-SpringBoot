package cems.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StudentAddInsForm;
import cems.project.respository.StudentAddInsFormRepository; 

@Service
@Configuration
public class StudentAddInsFormService {

	@Autowired
	private StudentAddInsFormRepository AddformRepository;
	
	public Iterable<StudentAddInsForm> getstddata(){
		return AddformRepository.findAll();
	}
	
	public Iterable<StudentAddInsForm> getstddataById(int stdId){
		return AddformRepository.getBystdId(stdId);
	}
	
	public StudentAddInsForm addInsForm (StudentAddInsForm newStudentAddInsForm) {
		StudentAddInsForm stdaddinsform = AddformRepository.save(newStudentAddInsForm);
		return AddformRepository.save(stdaddinsform);
	}
	
}
