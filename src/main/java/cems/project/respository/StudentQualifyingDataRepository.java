package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StudentQualifyingData;

public interface StudentQualifyingDataRepository extends CrudRepository<StudentQualifyingData, Integer> {
	public StudentQualifyingData findByStdAccId(int id);
}
