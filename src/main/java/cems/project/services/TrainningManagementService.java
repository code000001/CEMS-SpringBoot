package cems.project.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.respository.TrainningManagementRepository;
import cems.project.controller.StudentPrintoutController;
import cems.project.model.TrainingManagement;
import cems.project.model.StudentAddInsForm;
import cems.project.respository.StudentAddInsFormRepository;

@Service
@Configuration
public class TrainningManagementService {

	Logger logger = LoggerFactory.getLogger(TrainningManagementService.class);
	@Autowired
	private TrainningManagementRepository trainReporitory;
	
	public Iterable<TrainingManagement> getAlltraindata() {
		return trainReporitory.findAll();
	}
	
	public TrainingManagement getHrByAccId(int stdId) {
		return trainReporitory.getBystdAccId(stdId);
	}
	
	public TrainingManagement addupHourTrain(int stdId, TrainingManagement newTrainingManagement) {
		
		
		TrainingManagement currentStudent = trainReporitory.findByStdAccId(stdId);
		currentStudent.setStdHrprepare(newTrainingManagement.getStdHrprepare());
		currentStudent.setStdHrConference(newTrainingManagement.getStdHrConference());
		currentStudent.setStdTestScore(newTrainingManagement.getStdTestScore());
		return trainReporitory.save(currentStudent);
		
	}
}
