package cems.project.respository;

import org.springframework.data.repository.CrudRepository;

import cems.project.model.UserDetail;

public interface UserDetailRepository extends CrudRepository<UserDetail, Integer> {
	public UserDetail findByAccLogin(String acc_login);
	
	public UserDetail findById(int id);
	
}
