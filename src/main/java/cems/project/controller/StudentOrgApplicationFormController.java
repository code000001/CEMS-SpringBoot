package cems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.StudentAllInfo;
import cems.project.respository.StudentOrgApplicationFormRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class StudentOrgApplicationFormController {
    
	Logger logger = LoggerFactory.getLogger(StudentOrgApplicationFormController.class);
	@Autowired
	private StudentOrgApplicationFormRepository StudentOrgApplicationFormRepository;
	
	@GetMapping(path="/getINS/{id}")
	public @ResponseBody StudentAllInfo getStuInfo(@PathVariable("id") int std_acc_id){
		// logger.info("std_acc_id : "+ std_acc_id);
		return StudentOrgApplicationFormRepository.findByStdAccId(std_acc_id);
	}

}