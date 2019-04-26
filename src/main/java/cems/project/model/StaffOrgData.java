package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff_org_data")
public class StaffOrgData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="stf_org_id")
	private Integer stfOrgId;
	
	public Integer getStfOrgId() {
		return stfOrgId;
	}

	public void setStfOrgId(Integer stfOrgId) {
		this.stfOrgId = stfOrgId;
	}

	@Column(name="stf_org_acc_id")
	private Integer stfOrgAccId;
	
	@Column(name="stf_org_first_name_th")
	private String stfOrgFirstNameTh;
	
	@Column(name="stf_org_first_name_en")
	private String stfOrgFirstNameEn;
	
	@Column(name="stf_org_last_name_th")
	private String stfOrgLastNameTh;
	
	@Column(name="stf_org_last_name_en")
	private String stfOrgLastNameEn;
	
	@Column(name="stf_org_tel")
	private String stfOrgTel;
	
	@Column(name="stf_org_email")
	private String stfOrgEmail;
	
	@Column(name="stf_org_mobile_tel")
	private String stfOrgMobileTel;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStfAccId() {
		return stfOrgId;
	}

	public void setStfAccId(Integer stfOrgId) {
		this.stfOrgId = stfOrgId;
	}

	public Integer getStfOrgAccId() {
		return stfOrgAccId;
	}

	public void setStfOrgAccId(Integer stfOrgAccId) {
		this.stfOrgAccId = stfOrgAccId;
	}

	public String getStfOrgFirstNameTh() {
		return stfOrgFirstNameTh;
	}

	public void setStfOrgFirstNameTh(String stfOrgFirstNameTh) {
		this.stfOrgFirstNameTh = stfOrgFirstNameTh;
	}

	public String getStfOrgFirstNameEn() {
		return stfOrgFirstNameEn;
	}

	public void setStfOrgFirstNameEn(String stfOrgFirstNameEn) {
		this.stfOrgFirstNameEn = stfOrgFirstNameEn;
	}

	public String getStfOrgLastNameTh() {
		return stfOrgLastNameTh;
	}

	public void setStfOrgLastNameTh(String stfOrgLastNameTh) {
		this.stfOrgLastNameTh = stfOrgLastNameTh;
	}

	public String getStfOrgLastNameEn() {
		return stfOrgLastNameEn;
	}

	public void setStfOrgLastNameEn(String stfOrgLastNameEn) {
		this.stfOrgLastNameEn = stfOrgLastNameEn;
	}

	public String getStfOrgTel() {
		return stfOrgTel;
	}

	public void setStfOrgTel(String stfOrgTel) {
		this.stfOrgTel = stfOrgTel;
	}

	public String getStfOrgEmail() {
		return stfOrgEmail;
	}

	public void setStfOrgEmail(String stfOrgEmail) {
		this.stfOrgEmail = stfOrgEmail;
	}

	public String getStfOrgMobileTel() {
		return stfOrgMobileTel;
	}

	public void setStfOrgMobileTel(String stfOrgMobileTel) {
		this.stfOrgMobileTel = stfOrgMobileTel;
	}

	
}
