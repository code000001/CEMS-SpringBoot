package cems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.TrainingManagement;
import cems.project.services.TrainningManagementService;


@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class TrainningManagementController {

	Logger logger = LoggerFactory.getLogger(StudentPrintoutController.class);
	@Autowired
	private TrainningManagementService stafftrainService;
	
	@GetMapping(path="/train")
	public Iterable<TrainingManagement> getAllTrain() {
		return stafftrainService.getAlltraindata();
	}
	
}
