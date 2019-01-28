package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_type")
public class UserType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
    @Column(name = "acc_type_name_th")
    private String accTypeNameTh;
    
    @Column(name = "acc_type_name_en")
    private String accTypeNameEn;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccTypeNameTh() {
		return accTypeNameTh;
	}

	public void setAccTypeNameTh(String accTypeNameTh) {
		this.accTypeNameTh = accTypeNameTh;
	}

	public String getAccTypeNameEn() {
		return accTypeNameEn;
	}

	public void setAccTypeNameEn(String accTypeNameEn) {
		this.accTypeNameEn = accTypeNameEn;
	}
}
