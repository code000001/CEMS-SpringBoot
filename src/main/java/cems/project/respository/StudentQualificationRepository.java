package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StudentQualificationPersonDetail;

public interface StudentQualificationRepository extends CrudRepository<StudentQualificationPersonDetail, Integer> {

}
