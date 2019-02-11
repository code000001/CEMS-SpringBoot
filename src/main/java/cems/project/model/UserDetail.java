package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

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
    
    @Column(name = "acc_pass")
    private String accPassword;

    @Column(name = "acc_first_name_th")
    private String accFirstNameTh;
    
    @Column(name = "acc_last_name_th")
    private String accLastNameTh;
    
    @Column(name = "acc_first_name_en")
    private String accFirstNameEn;
    
	@Column(name = "acc_last_name_en")
    private String accLastNameEn;
    
    @Column(name= "acc_type_id")
    private Integer accTypeId;
    
    public String getAccFirstNameTh() {
		return accFirstNameTh;
	}

	public void setAccFirstNameTh(String accFirstNameTh) {
		this.accFirstNameTh = accFirstNameTh;
	}

	public String getAccLastNameTh() {
		return accLastNameTh;
	}

	public void setAccLastNameTh(String accLastNameTh) {
		this.accLastNameTh = accLastNameTh;
	}

	public String getAccFirstNameEn() {
		return accFirstNameEn;
	}

	public void setAccFirstNameEn(String accFirstNameEn) {
		this.accFirstNameEn = accFirstNameEn;
	}

	public String getAccLastNameEn() {
		return accLastNameEn;
	}

	public void setAccLastNameEn(String accLastNameEn) {
		this.accLastNameEn = accLastNameEn;
	}

	public Integer getAccTypeId() {
		return accTypeId;
	}

	public String getAccPassword() {
		return accPassword;
	}

	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
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
