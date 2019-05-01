package cems.project.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StaffOrgData;

/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Interface		: StaffOrgDataRepository inherited from CrudRepository
 * Module			: StaffOrgData
 * Last edited		: 01/05/2019
 */
public interface StaffOrgDataRepository extends CrudRepository <StaffOrgData,Integer>{
	public StaffOrgData getBystfOrgAccId(int stfOrgAccId);
}
