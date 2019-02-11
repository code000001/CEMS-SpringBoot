package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StudentQualificationPersonDetail;
import cems.project.model.UserDetail;

public interface StudentQualificationRepository extends CrudRepository<StudentQualificationPersonDetail, Integer> {
	public StudentQualificationPersonDetail findByStdAccId(int std_acc_id);
}
