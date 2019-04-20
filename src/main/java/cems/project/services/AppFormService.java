package cems.project.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StdAppInfo;
import cems.project.model.StudentAllInfo;
import cems.project.model.StudentPrintout;
import cems.project.model.StdAppCoop;
import cems.project.respository.StdAppInfoRepository;
import cems.project.respository.StudentOrgApplicationFormRepository;
import cems.project.respository.StudentPrintoutRepository;
import cems.project.respository.StdAppCoopRepository;
import cems.project.model.Provinces;
import cems.project.respository.ProvincesRepository;
import cems.project.model.Amphures;
import cems.project.respository.AmphuresRepository;
import cems.project.model.Districts;
import cems.project.respository.DistrictsRepository;
import cems.project.model.Announcement;
import cems.project.respository.AnnouncementRepository;

@Service
@Configuration
public class AppFormService {
	Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private StdAppInfoRepository StdAppInfoRepository;
	@Autowired
	private StudentOrgApplicationFormRepository StudentOrgApplicationForm;
	@Autowired
	private StudentPrintoutRepository StudentPrintoutRepository;
	@Autowired
	private StdAppCoopRepository StdAppCoopRepository;
	@Autowired
	private ProvincesRepository ProvincesRepository;
	@Autowired
	private AmphuresRepository AmphuresRepository;
	@Autowired
	private DistrictsRepository DistrictsRepository;
	@Autowired
	private AnnouncementRepository AnnouncementRepository;

	public StudentAllInfo getUserData(int acc_id) {

		return StudentOrgApplicationForm.findByStdAccId(acc_id);
	}

	public boolean checkStatusStd(int StdId) {
		StdAppInfo currentStd = StdAppInfoRepository.findByStdAccId(StdId);
		if (currentStd.getStdStatusId() < 3 && currentStd.getStdTestScore() == "N"
				&& currentStd.getStdHrConference() < 30 && currentStd.getStdHrPrepare() < 12) {
			String str = "ไม่ผ่านเงื่อนไข";
			return false;
		}
		return true;
	}

	public StdAppCoop updateStudentAllInfo(int id, StudentAllInfo std) {
		// StudentAllInfo customerOptional =

		StudentAllInfo current = StudentOrgApplicationForm.findByStdAccId(id);
		logger.info("id : " + current.getId());
		id = current.getId();
		StdAppInfo currentStd = StdAppInfoRepository.findById(id);
		currentStd.setStdParentTel(std.getStdParentTel());
		currentStd.setStdStatusId(3);
		currentStd.setStdOrgId(std.getstdOrgId());
		currentStd.setStdGpax(std.getStdGpax());
		currentStd.setStdYear(std.getStdYear());
		currentStd.setStdHouseParticularsAddress(std.getStdHouseParticularsAddress());
		currentStd.setStdNowAddress(std.getStdNowAddress());
		currentStd.setStdTel(std.getStdTel());
		currentStd.setStdParentMobileTel(std.getStdParentMobileTel());

		StdAppInfoRepository.save(currentStd);
		// เงื่อนไขก่อนเปลี่ยน
		// จัด/แบ่ง ฟังก์ชั่น

		StdAppCoop currentStdAC = StdAppCoopRepository.findById(id);
		// logger.info("Name : "+ currentStd.getAccFirstNameEn());
		// logger.info("tel : "+ std.getStdParentTel());
		// if (std.getId().equals(null)) {
		// 	throw new ArithmeticException("Has not this id");
		// }

		// StdAppInfoRepository.
		// currentStd.setStdpareTel(std.getStdParentTel());
		// StudentPrintoutRepository.save(currentStd);
		// App Coop
		
		currentStdAC.setStdLastGpa(std.getStd_LastGpa());
		currentStdAC.setStdAge(std.getStdAge());
		currentStdAC.setStdHsGpa(std.getStdHsGpa());
		currentStdAC.setStdBornPlace(std.getStdBornPlace());
		currentStdAC.setStdNation(std.getStdNation());
		currentStdAC.setStdReligion(std.getStdReligion());
		currentStdAC.setStdHeight(std.getStdHeight());
		currentStdAC.setStdWeigh(std.getStdWeigh());
		currentStdAC.setStdFatherJob(std.getStdFatherJob());
		currentStdAC.setStdMotherJob(std.getStdMotherJob());
		currentStdAC.setStdFatherMobileTel(std.getStdFatherMobileTel());
		currentStdAC.setStdMotherMobileTel(std.getStdMotherMobileTel());
		// StudentPrintoutRepository.save(currentStd);
		// if(StudentPrintoutRepository.save(currentStd)){
		return StdAppCoopRepository.save(currentStdAC);
	}

	public Iterable<Provinces> getAllProvinces() {

		return ProvincesRepository.findAll();
	}

	public Iterable<Amphures> getAmphuresByProvince(int pv_id) {

		return AmphuresRepository.findByProvinceId(pv_id);
	}

	public Iterable<Districts> getDistrictsByAmphure(int amp_id) {

		return DistrictsRepository.getByAmphureId(amp_id);
	}

	public boolean getStatusAnnById(int id) {
		Announcement currentAnn = AnnouncementRepository.findById(id);
		int status = currentAnn.getAnnStatusId();
		if (status == 1) {
			return true;
		}
		return false;

	}

}
