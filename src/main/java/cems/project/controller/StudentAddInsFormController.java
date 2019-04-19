package cems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.StudentAddInsForm;
import cems.project.services.StudentAddInsFormService;
import cems.project.services.UserServiceImp;

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
	
	@PutMapping(path="/std_addform/{id}")
	public StudentAddInsForm addupInsForm(@PathVariable("id") int stdId, @RequestBody StudentAddInsForm newStdaddinsform) {
//		logger.info("name : "+ newStdaddinsform.getStdFirstnameTh());
		return stdaddService.addupInsForm(stdId, newStdaddinsform);
	}

	
	
}
