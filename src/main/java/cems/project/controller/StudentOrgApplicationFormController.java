package cems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import cems.project.model.StdAppCoop;
import cems.project.model.StudentPrintout;
import cems.project.model.StudentAllInfo;
import cems.project.model.Provinces;
import cems.project.model.Amphures;
import cems.project.model.Districts;
import cems.project.services.AppFormService;;

@CrossOrigin
@RestController
@RequestMapping(path = "/cems")
public class StudentOrgApplicationFormController {

	Logger logger = LoggerFactory.getLogger(StudentOrgApplicationFormController.class);
	@Autowired
	private AppFormService AppFormService;

	@GetMapping(path = "/getINS/{id}")
	public @ResponseBody StudentAllInfo getStuInfo(@PathVariable("id") int id) {
		// logger.info("std_acc_id : "+ std_acc_id);
		return AppFormService.getUserData(id);
	}

	@GetMapping(path = "/getProvinces")
	public @ResponseBody Iterable<Provinces> getProvinces() {
		// logger.info("return : "+ ProvincesRepository.findAll());
		return AppFormService.getAllProvinces();
	}

	@GetMapping(path = "/getAmphures/{id}")
	public @ResponseBody Iterable<Amphures> getAmphures(@PathVariable("id") int pv_id) {
		return AppFormService.getAmphuresByProvince(pv_id);
	}

	@GetMapping(path = "/getDistricts/{id}")
	public @ResponseBody Iterable<Districts> getDistricts(@PathVariable("id") int amp_id) {
		return AppFormService.getDistrictsByAmphure(amp_id);
	}

	
	// @RequestMapping(value = "/updateProfileAppForm/{id}", method = RequestMethod.PUT)
	@PutMapping(path = "/updateProfileAppForm/{id}")
	public StdAppCoop updateProfileAppForm(@PathVariable("id") int id, @RequestBody StudentAllInfo body) {
		// Optional<StdAppCoop> customer = customerService.updateCustomer(id, body);
		// if(!customer.isPresent()) {
		// return ResponseEntity.notFound().build();
		// }
		// return ResponseEntity.ok().build();
		// return null;
		// logger.info("id : "+ id);
		// logger.info("data : "+ body.getStdParentTel());

		// Optional<Customer> customer = customerService.updateCustomer(id, body);
		// if(!customer.isPresent()) {
		// return ResponseEntity.notFound().build();
		// }
		// return ResponseEntity.ok().build();

		HttpHeaders Headers = new HttpHeaders();

		if (AppFormService.checkStatusStd(id) == false) {
			// return false;
			throw new ArithmeticException("cannot accept");
		}
		return AppFormService.updateStudentAllInfo(id, body);
		// return ResponseEntity.ok().build();
	}

	@GetMapping(path = "/getStatusAnn/{ann}")
	public @ResponseBody String getStatusAnn(@PathVariable("ann") int annId) {
		logger.info("ann : " + annId);
		HttpHeaders Headers = new HttpHeaders();
		// return AppFormService.getStatusAnnById(annId);
		if (AppFormService.getStatusAnnById(annId) == true) {
			Headers.set("Status Ann", "OK");
			// return new ResponseEntity<>("OK", Headers, HttpStatus.OK);
			return "OK";
		} else {
			Headers.set("Status Ann", "Fail");
			// return new ResponseEntity<>("FORBIDDEN", HttpStatus.OK);
			return "FORBIDDEN";
		}
	}

}