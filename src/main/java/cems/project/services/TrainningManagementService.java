package cems.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.respository.TrainningManagementRepository;
import cems.project.model.TrainingManagement;

@Service
@Configuration
public class TrainningManagementService {

	@Autowired
	private TrainningManagementRepository trainReporitory;
	
	public Iterable<TrainingManagement> getAlltraindata() {
		return trainReporitory.findAll();
	}
	
}
