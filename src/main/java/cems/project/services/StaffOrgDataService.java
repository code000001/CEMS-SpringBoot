package cems.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StaffOrgData;
import cems.project.respository.StaffOrgDataRepository;

@Service
@Configuration
public class StaffOrgDataService {
	@Autowired
	private StaffOrgDataRepository staffOrg;
	
	public StaffOrgData getStaffOrgDataBystfOrgAccId(int stfOrgAccId) {
		return staffOrg.getBystfOrgAccId(stfOrgAccId);
	}
}
