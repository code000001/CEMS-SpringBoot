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
	private StudentAddInsFormRepository stdAddInsForm;
	
	public Iterable<StudentAddInsForm> getstddata(){
		return stdAddInsForm.findAll();
	}
	
	//public Iterable<StudentAddInsForm> getstddataById(int stdId){
	//	return stdAddInsForm.getBystdId(stdId);
	//}
	
	public StudentAddInsForm addInsForm(StudentAddInsForm newStudentAddInsForm) {
		StudentAddInsForm stdaddinsform = stdAddInsForm.save(newStudentAddInsForm);
		return stdAddInsForm.save(stdaddinsform);
	}
}
