package cems.project.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StudentQualificationOrgDetail;
import cems.project.model.StudentQualificationPersonDetail;
import cems.project.model.StudentQualificationStatus;
import cems.project.model.StudentQualifyingData;
import cems.project.respository.StudentQualificationOrgRepository;
import cems.project.respository.StudentQualificationRepository;
import cems.project.respository.StudentQualificationStatusRepository;
import cems.project.respository.StudentQualifyingDataRepository;

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
	
	@Autowired
	private StudentQualifyingDataRepository sqdRepository;
	
public StudentQualificationPersonDetail getAccountRegisteredData(int std_acc_id){
		
		return sqcRepository.findByStdAccId(std_acc_id);
	}
	
	public Iterable<StudentQualificationPersonDetail> getStudentRegisteredData(){
		
		return sqcRepository.findAll();
	}
	
	public Iterable<StudentQualificationOrgDetail> getOrganizationData(){
		
		return sqcOrgRepository.findAll();
	}
	
	public Iterable<StudentQualificationStatus> getStudentStatusData(){
		
		return sqcStatusRepository.findAll();
	}
	public StudentQualifyingData updateStudentStatus(int id, StudentQualifyingData stdStatus) {
		StudentQualifyingData curStatus = sqdRepository.findByStdAccId(id);
		if (sqdRepository.findByStdAccId(id).equals(null)) {
			throw new ArithmeticException("Invalid ID.");
		}
		
		if(stdStatus.getStdStatusId().equals(2)) {
			curStatus.setStdOrgId(null);
		}
		if(stdStatus.getStdStatusId().equals(3)) {
			curStatus.setStdOrgId(stdStatus.getStdOrgId());
		}
		curStatus.setStdStatusId(stdStatus.getStdStatusId());
		return sqdRepository.save(curStatus);	

	}
}
