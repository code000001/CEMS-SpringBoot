package cems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.StudentQualificationPersonDetail;
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
		
		//logger.info("bla"+ sqcService.getStudentRegisteredData().toString());

		return sqcService.getStudentRegisteredData();
	}
}
