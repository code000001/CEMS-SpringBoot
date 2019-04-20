package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.StudentAllInfo;;

public interface StudentOrgApplicationFormRepository extends CrudRepository<StudentAllInfo, Integer>{
    public StudentAllInfo findByStdAccId(int std_acc_id);
    public StudentAllInfo findById(int id);
}
