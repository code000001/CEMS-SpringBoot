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

import cems.project.model.StudentAddInsForm;
import cems.project.services.StudentAddInsFormService;

@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class StudentAddInsFormController {
	
	Logger logger = LoggerFactory.getLogger(StudentAddInsFormController.class);
	@Autowired
	private StudentAddInsFormService stdaddService;
	
	@GetMapping(path="/std_data/{id}")
	public @ResponseBody StudentAddInsForm getBystdId(@PathVariable("id") int stdId) {
		logger.info("input : "+ stdId);
		return stdaddService.getstddataById(stdId);
	}
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: GET all_std_data
	 * Function input	: 
	 * 						as path 		=> student status id (stdStatusId) : int
	 * 						as parameter	=> -
	 * Function output	: all student data with the specific status
	 * Purpose			: GET api for student data with the specific status in qualification module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/all_std_data/{id}")
	public @ResponseBody Iterable<StudentAddInsForm> getstddata(@PathVariable("id") int stdStatusId){
		
		return stdaddService.getstddata(stdStatusId);
	}
	//END OF GET all_std_data
	
	@PutMapping(path="/std_addform/{id}")
	public StudentAddInsForm addupInsForm(@PathVariable("id") int stdId, @RequestBody StudentAddInsForm newStdaddinsform) {
	//		logger.info("name : "+ newStdaddinsform.getStdFirstnameTh());
		return stdaddService.addupInsForm(stdId, newStdaddinsform);
	}
	

}
