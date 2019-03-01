package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "org_data")
public class OrganizationData {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="org_status_id")
	private Integer orgStatusId;
	
	@Column(name="org_type_id")
	private Integer orgTypeId;
	
	@Column(name="org_name_th")
	private String orgNameTh;
	
	@Column(name="org_name_en")
	private String orgNameEn;
	
	@Column(name="org_address")
	private String orgAddress;
	
	@Column(name="org_tel")
	private String orgTel;
	
	@Column(name="org_email")
	private String orgEmail;
	
	@Column(name="org_coop_std_amount")
	private Integer orgCoopStdAmount;
	
	@Column(name="org_ann_amount")
	private Integer orgAnnAmount;
	
	@Column(name="org_detail")
	private String orgDetail;
	
	@Column(name="org_training_amount")
	private Integer orgTrainingAmount;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrgStatusId() {
		return orgStatusId;
	}

	public void setOrgStatusId(Integer orgStatusId) {
		this.orgStatusId = orgStatusId;
	}

	public Integer getOrgTypeId() {
		return orgTypeId;
	}

	public void setOrgTypeId(Integer orgTypeId) {
		this.orgTypeId = orgTypeId;
	}

	public String getOrgNameTh() {
		return orgNameTh;
	}

	public void setOrgNameTh(String orgNameTh) {
		this.orgNameTh = orgNameTh;
	}

	public String getOrgNameEn() {
		return orgNameEn;
	}

	public void setOrgNameEn(String orgNameEn) {
		this.orgNameEn = orgNameEn;
	}

	public String getOrgAddress() {
		return orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getOrgTel() {
		return orgTel;
	}

	public void setOrgTel(String orgTel) {
		this.orgTel = orgTel;
	}

	public String getOrgEmail() {
		return orgEmail;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public Integer getOrgCoopStdAmount() {
		return orgCoopStdAmount;
	}

	public void setOrgCoopStdAmount(Integer orgCoopStdAmount) {
		this.orgCoopStdAmount = orgCoopStdAmount;
	}

	public Integer getOrgAnnAmount() {
		return orgAnnAmount;
	}

	public void setOrgAnnAmount(Integer orgAnnAmount) {
		this.orgAnnAmount = orgAnnAmount;
	}

	public String getOrgDetail() {
		return orgDetail;
	}

	public void setOrgDetail(String orgDetail) {
		this.orgDetail = orgDetail;
	}

	public Integer getOrgTrainingAmount() {
		return orgTrainingAmount;
	}

	public void setOrgTrainingAmount(Integer orgTrainingAmount) {
		this.orgTrainingAmount = orgTrainingAmount;
	}
	
}
