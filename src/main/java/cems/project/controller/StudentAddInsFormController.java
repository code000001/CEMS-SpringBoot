package cems.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@Autowired
	private StudentAddInsFormService stdaddService;
	
	@GetMapping(path="/std_data/{id}")
	public @ResponseBody Iterable<StudentAddInsForm> getBystdId(@PathVariable("id") int stdId) {	
		return stdaddService.getstddataById(stdId);
	}
	
	
	@PostMapping(path="/std_addform/{id}")
	public StudentAddInsForm addInsForm(@PathVariable("id") int stdId, @RequestBody StudentAddInsForm newStdaddinsform) {
		return stdaddService.addInsForm(newStdaddinsform);
	}

	
	
}
