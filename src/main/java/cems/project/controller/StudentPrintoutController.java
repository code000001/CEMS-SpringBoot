package cems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.StudentPrintout;
import cems.project.services.StudentPrintoutService;
@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class StudentPrintoutController {

	Logger logger = LoggerFactory.getLogger(StudentPrintoutController.class);
	@Autowired
	private StudentPrintoutService stdprintoutService;
	
	@GetMapping(path="/std_printout_ins001/{id}")
	public @ResponseBody StudentPrintout getBystdId(@PathVariable("id") int stdId) {	
		logger.info("test : "+ stdId);
		return stdprintoutService.getstudentdata(stdId);
	}
	
}
