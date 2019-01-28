package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.UserType;

public interface UserTypeRepository extends CrudRepository<UserType, Integer> {
	public UserType findByAccTypeNameEn(String acc_type_name_en);
}
