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

import cems.project.model.StudentSkillGrade;
import cems.project.services.StudentSkillGradeService;
@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class StudentSkillGradeController {

	Logger logger = LoggerFactory.getLogger(StudentPrintoutController.class);
	@Autowired
	private StudentSkillGradeService stdskillService;
	
	@GetMapping(path="/std_skill/{id}")
	public @ResponseBody StudentSkillGrade getBystdId(@PathVariable("id") int stdId) {	
		logger.info("test : "+ stdId);
		return stdskillService.getstdskill(stdId);
	}
	
	@PutMapping(path="/edit_skill/{id}")
	public  StudentSkillGrade addupskill(@PathVariable("id") int stdId, @RequestBody StudentSkillGrade newStdAddUpSkill) {
		return stdskillService.addupskill(stdId, newStdAddUpSkill);
	}
	
}
