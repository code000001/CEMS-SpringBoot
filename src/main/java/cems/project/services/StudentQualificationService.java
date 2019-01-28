package cems.project.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StudentQualificationPersonDetail;
import cems.project.respository.StudentQualificationRepository;

@Service
@Configuration
public class StudentQualificationService {
	Logger logger = LoggerFactory.getLogger(StudentQualificationService.class);
	@Autowired
	private StudentQualificationRepository sqcRepository;
	
	
	public Iterable<StudentQualificationPersonDetail> getStudentRegisteredData(){
		
		return sqcRepository.findAll();
	}
	
}
