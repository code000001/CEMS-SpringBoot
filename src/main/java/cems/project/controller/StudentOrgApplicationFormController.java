package cems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.StudentAllInfo;
import cems.project.model.Provinces;
import cems.project.model.Amphures;
import cems.project.model.Districts;
import cems.project.services.AppFormService;;

@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class StudentOrgApplicationFormController {
    
	Logger logger = LoggerFactory.getLogger(StudentOrgApplicationFormController.class);
	@Autowired
	private AppFormService AppFormService;
	
	@GetMapping(path="/getINS/{id}")
	public @ResponseBody StudentAllInfo getStuInfo(@PathVariable("id") int std_acc_id){
		// logger.info("std_acc_id : "+ std_acc_id);
		return AppFormService.getUserData(std_acc_id);
	}

	@GetMapping(path="/getProvinces")
	public @ResponseBody Iterable<Provinces> getProvinces(){
		// logger.info("return : "+ ProvincesRepository.findAll());
		return AppFormService.getAllProvinces();
	}

	@GetMapping(path="/getAmphures/{id}")
	public @ResponseBody Iterable<Amphures> getAmphures(@PathVariable("id") int pv_id){
		return AppFormService.getAmphuresByProvince(pv_id);
	}

	@GetMapping(path="/getDistricts/{id}")
	public @ResponseBody Iterable<Districts> getDistricts(@PathVariable("id") int amp_id){
		return AppFormService.getDistrictsByAmphure(amp_id);
	}
	


}