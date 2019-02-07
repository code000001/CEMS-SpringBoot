package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name= "account_data")
public class UserDetail {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
    @Column(name = "acc_login")
    @NotEmpty(message = "*Please provide an email")
    private String accLogin;
    
    
    @Column(name= "acc_type_id")
    private Integer accTypeId;

	public Integer getAccTypeId() {
		return accTypeId;
	}

	public void setAccTypeId(Integer accTypeId) {
		this.accTypeId = accTypeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccLogin() {
		return accLogin;
	}

	public void setAccLogin(String accLogin) {
		this.accLogin = accLogin;
	}

}
