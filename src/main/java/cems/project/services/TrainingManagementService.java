package cems.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.TrainingManagement;
import cems.project.respository.TrainingManagementRespository;

@Service
@Configuration
public class TrainingManagementService {
	
	@Autowired
	private TrainingManagementRespository TrainManageResporitory;

	public Iterable<TrainingManagement> getStudentData() {
		
		return TrainManageResporitory.findAll();
	}
	
}
