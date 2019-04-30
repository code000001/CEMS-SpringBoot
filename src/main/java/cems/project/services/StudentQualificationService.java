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

/* Author			: Phakhanan Thongmee
 * Author ID		: 58160673
 * Class			: StudentQualificationService
 * Module			: Student qualification
 * Last edited		: 01/05/2019
 */
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
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: getAccountRegisteredData
	 * Function input	: as parameter => std_acc_id : int
	 * Function output	: specific student data
	 * Purpose			: function testing
	 * Last edited		: 01/05/2019
	 */
public StudentQualificationPersonDetail getAccountRegisteredData(int std_acc_id){
		
		return sqcRepository.findByStdAccId(std_acc_id);
	}
	//END OF getAccountRegisteredData
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: getStudentRegisteredData
	 * Function input	: -
	 * Function output	: all student data
	 * Purpose			: function testing
	 * Last edited		: 01/05/2019
	 */
	public Iterable<StudentQualificationPersonDetail> getStudentRegisteredData(){
		
		return sqcRepository.findAll();
	}
	//END OF getStudentRegisteredData
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: getOrganizationData
	 * Function input	: -
	 * Function output	: all organization data
	 * Purpose			: function testing
	 * Last edited		: 01/05/2019
	 */
	public Iterable<StudentQualificationOrgDetail> getOrganizationData(){
		
		return sqcOrgRepository.findAll();
	}
	//END OF getOrganizationData
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: getStudentStatusData
	 * Function input	: -
	 * Function output	: all student status data
	 * Purpose			: function testing
	 * Last edited		: 01/05/2019
	 */
	public Iterable<StudentQualificationStatus> getStudentStatusData(){
		
		return sqcStatusRepository.findAll();
	}
	//END OF getStudentStatusData
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: updateStudentStatus
	 * Function input	: as parameter 	=> 	student account id (stdAccId) : int , 
	 * 										updateStudentStatus : StudentQualifyingData
	 * Function output	: -
	 * Purpose			: function for updating student status in qualification module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
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
	//END OF updateStudentStatus
}
//END OF CLASS StudentQualificationService