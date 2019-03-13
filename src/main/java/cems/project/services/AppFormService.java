package cems.project.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StudentAllInfo;
import cems.project.respository.StudentOrgApplicationFormRepository;
import cems.project.model.Provinces;
import cems.project.respository.ProvincesRepository;
import cems.project.model.Amphures;
import cems.project.respository.AmphuresRepository;
import cems.project.model.Districts;
import cems.project.respository.DistrictsRepository;

@Service
@Configuration
public class AppFormService {
	Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private StudentOrgApplicationFormRepository StudentOrgApplicationForm;
	@Autowired
	private ProvincesRepository ProvincesRepository;
	@Autowired
	private AmphuresRepository AmphuresRepository;
	@Autowired
	private DistrictsRepository DistrictsRepository;

	public StudentAllInfo getUserData(int acc_id){

		return StudentOrgApplicationForm.findByStdAccId(acc_id);
	}
	
	public Iterable<Provinces> getAllProvinces(){
		
		return ProvincesRepository.findAll();
	}

	public Iterable<Amphures> getAmphuresByProvince(int pv_id){
		
		return AmphuresRepository.findByProvinceId(pv_id);
	}

	public Iterable<Districts> getDistrictsByAmphure(int amp_id){
		
		return DistrictsRepository.getByAmphureId(amp_id);
	}

	
}
