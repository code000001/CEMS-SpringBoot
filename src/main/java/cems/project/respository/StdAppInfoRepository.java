package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StdAppInfo;

public interface StdAppInfoRepository extends CrudRepository<StdAppInfo, Integer> {
	
	public StdAppInfo findById(int id);
	public StdAppInfo findByStdAccId(int id);
}
