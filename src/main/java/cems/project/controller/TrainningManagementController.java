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
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.StudentSkillGrade;
import cems.project.model.TrainingManagement;
import cems.project.services.TrainningManagementService;


@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class TrainningManagementController {

	Logger logger = LoggerFactory.getLogger(TrainningManagementController.class);
	@Autowired
	private TrainningManagementService stafftrainService;
	
	@GetMapping(path="/train")
	public Iterable<TrainingManagement> getAllTrain() {
		return stafftrainService.getAlltraindata();
	}
	
	@PutMapping(path="/edit_Train/{id}")
	public  TrainingManagement addupHourTrain(@PathVariable("id") int stdId, @RequestBody TrainingManagement newStdTrain) {
		logger.info("test" + newStdTrain.getStdHrConference());
		return stafftrainService.addupHourTrain(stdId, newStdTrain);
	}
	
}
