package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StaffOrgData;

public interface StaffOrgDataRepository extends CrudRepository <StaffOrgData,Integer>{
	public StaffOrgData getBystfOrgAccId(int stfOrgAccId);
}
