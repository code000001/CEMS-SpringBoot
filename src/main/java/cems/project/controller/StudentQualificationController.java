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

/* Author			: Phakhanan Thongmee
 * Author ID		: 58160673
 * Class			: StudentQualificationController
 * Module			: Student qualification
 * Last edited		: 01/05/2019
 */
@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class StudentQualificationController {
	Logger logger = LoggerFactory.getLogger(StudentQualificationService.class);
	@Autowired
	private StudentQualificationService sqcService;
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: GET student_qc
	 * Function input	: -
	 * Function output	: all student data
	 * Purpose			: GET api testing
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/student_qc")
	public @ResponseBody Iterable<StudentQualificationPersonDetail> getAllStudentRegisteredData(){
		
		return sqcService.getStudentRegisteredData();
	}
	// END OF GET student_qc
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: GET org_name
	 * Function input	: -
	 * Function output	: all organization data
	 * Purpose			: GET api testing
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/org_name")
	public @ResponseBody Iterable<StudentQualificationOrgDetail> getAllOrganizationData(){
		
		return sqcService.getOrganizationData();
	}
	// END OF GET org_name
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: GET std_status
	 * Function input	: -
	 * Function output	: all student status data
	 * Purpose			: GET api for qualification module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/std_status")
	public @ResponseBody Iterable<StudentQualificationStatus> getAllStudentStatusData(){
		
		return sqcService.getStudentStatusData();
	}
	// END OF GET std_status
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: PUT update_student_status_org
	 * Function input	: 
	 * 						as path 		=> student account id (stdAccId) 	: int
	 * 						as parameter 	=> updateStudentStatus 				: StudentQualifyingData
	 * Function output	: -
	 * Purpose			: PUT api for updating student status in qualification module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	@PutMapping(path="/update_student_status_org/{id}")
	public StudentQualifyingData updateStudentStatus(@PathVariable("id") int id,@RequestBody StudentQualifyingData updateStudentStatus) {
		return sqcService.updateStudentStatus(id, updateStudentStatus);
	}
	// END OF PUT update_student_status_org
}
//END OF CLASS StudentQualificationController