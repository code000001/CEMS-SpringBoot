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
	
	public StudentAddInsForm getstddataById(int stdId){
		return AddformRepository.getBystdAccId(stdId);
	}
	
	public StudentAddInsForm addupInsForm (int stdId, StudentAddInsForm newStudentAddInsForm) {
		StudentAddInsForm currentStudent = AddformRepository.findById(stdId);
		currentStudent.setStdPrefixTh(newStudentAddInsForm.getStdPrefixTh());
		currentStudent.setStdFirstnameTh(newStudentAddInsForm.getStdFirstnameTh());
		currentStudent.setStdLastnameTh(newStudentAddInsForm.getStdLastnameTh());
		currentStudent.setStdPrefixEn(newStudentAddInsForm.getStdPrefixEn());
		currentStudent.setStdFirstnameEn(newStudentAddInsForm.getStdFirstnameEn());
		currentStudent.setStdLastnameEn(newStudentAddInsForm.getStdLastnameEn());
		currentStudent.setStdId(newStudentAddInsForm.getStdId());
		currentStudent.setStdYear(newStudentAddInsForm.getStdYear());
		currentStudent.setStdCredit(newStudentAddInsForm.getStdCredit());
		currentStudent.setStdGpax(newStudentAddInsForm.getStdGpax());
		currentStudent.setStdCourse(newStudentAddInsForm.getStdCourse());
		currentStudent.setStdBranch(newStudentAddInsForm.getStdBranch());
		currentStudent.setStdAddressPartic(newStudentAddInsForm.getStdAddressPartic());
		currentStudent.setStdMobile(newStudentAddInsForm.getStdMobile());
		currentStudent.setStdTel(newStudentAddInsForm.getStdTel());
		currentStudent.setStdEmail(newStudentAddInsForm.getStdEmail());
		currentStudent.setStdAddressNow(newStudentAddInsForm.getStdAddressNow());
		currentStudent.setStdpareFname(newStudentAddInsForm.getStdpareFname());
		currentStudent.setStdpareLname(newStudentAddInsForm.getStdpareLname());
		currentStudent.setStdpareRelation(newStudentAddInsForm.getStdpareRelation());
		currentStudent.setStdpareAddress(newStudentAddInsForm.getStdpareAddress());
		currentStudent.setStdpareMobile(newStudentAddInsForm.getStdpareMobile());
		currentStudent.setStdpareTel(newStudentAddInsForm.getStdpareTel());
		currentStudent.setStdpareEmail(newStudentAddInsForm.getStdpareEmail());
		return AddformRepository.save(currentStudent);
	}
	
}
