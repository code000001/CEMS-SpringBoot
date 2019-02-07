package cems.project.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StudentQualificationOrgDetail;
import cems.project.model.StudentQualificationPersonDetail;
import cems.project.model.StudentQualificationStatus;
import cems.project.respository.StudentQualificationOrgRepository;
import cems.project.respository.StudentQualificationRepository;
import cems.project.respository.StudentQualificationStatusRepository;

@Service
@Configuration
public class StudentQualificationService {
	Logger logger = LoggerFactory.getLogger(StudentQualificationService.class);
	@Autowired
	private StudentQualificationRepository sqcRepository;
	
	@Autowired
	private StudentQualificationOrgRepository sqcOrgRepository;
	
	@Autowired
	private StudentQualificationStatusRepository sqcStatusRepository;
	
	
	public Iterable<StudentQualificationPersonDetail> getStudentRegisteredData(){
		
		return sqcRepository.findAll();
	}
	
	public Iterable<StudentQualificationOrgDetail> getOrganizationData(){
		
		return sqcOrgRepository.findAll();
	}
	
	public Iterable<StudentQualificationStatus> getStudentStatusData(){
		
		return sqcStatusRepository.findAll();
	}
}
