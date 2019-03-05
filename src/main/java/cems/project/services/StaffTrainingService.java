package cems.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StaffTrainingManagement;
import cems.project.respository.StaffTrainingRespository;

@Service
@Configuration
public class StaffTrainingService {
	
	@Autowired
	private StaffTrainingRespository sftResporitory;

	public Iterable<StaffTrainingManagement> getStudentData() {
		
		return sftResporitory.findAll();
	}
	
}
