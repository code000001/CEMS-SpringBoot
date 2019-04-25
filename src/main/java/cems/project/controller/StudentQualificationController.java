package cems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.StudentQualificationOrgDetail;
import cems.project.model.StudentQualificationPersonDetail;
import cems.project.model.StudentQualificationStatus;
import cems.project.model.StudentQualifyingData;
import cems.project.services.StudentQualificationService;

@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class StudentQualificationController {
	Logger logger = LoggerFactory.getLogger(StudentQualificationService.class);
	@Autowired
	private StudentQualificationService sqcService;
	
	@GetMapping(path="/student_qc")
	public @ResponseBody Iterable<StudentQualificationPersonDetail> getAllStudentRegisteredData(){
		
		return sqcService.getStudentRegisteredData();
	}
	
	@GetMapping(path="/org_name")
	public @ResponseBody Iterable<StudentQualificationOrgDetail> getAllOrganizationData(){
		
		return sqcService.getOrganizationData();
	}
	
	@GetMapping(path="/std_status")
	public @ResponseBody Iterable<StudentQualificationStatus> getAllStudentStatusData(){
		
		return sqcService.getStudentStatusData();
	}
	@PutMapping(path="/update_student_status_org/{id}")
	public StudentQualifyingData updateAnnouncement(@PathVariable("id") int id,@RequestBody StudentQualifyingData updateStudentStatus) {
		return sqcService.updateStudentStatus(id, updateStudentStatus);
	}
}
