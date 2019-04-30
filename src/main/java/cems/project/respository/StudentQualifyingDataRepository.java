package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StudentQualifyingData;

/* Author			: Phakhanan Thongmee
 * Author ID		: 58160673
 * Interface		: StudentQualifyingDataRepository inherited from CrudRepository
 * Module			: Student qualification
 * Last edited		: 01/05/2019
 */
public interface StudentQualifyingDataRepository extends CrudRepository<StudentQualifyingData, Integer> {
	public StudentQualifyingData findByStdAccId(int id);
}
//END OF INTERFACE StudentQualifyingDataRepository