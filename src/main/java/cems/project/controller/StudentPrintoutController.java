package cems.project.controller;

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

	@Autowired
	private StudentPrintoutService stdprintoutService;
	
	@GetMapping(path="/std_printout_ins001/{id}")
	public @ResponseBody Iterable<StudentPrintout> getBystdId(@PathVariable("id") int stdId) {	
		return stdprintoutService.getstudentdata(stdId);
	}
	
}
