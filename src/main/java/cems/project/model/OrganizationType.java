package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "org_type")
public class OrganizationType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="org_type_name_th")
	private String orgTypeNameTh;
	
	@Column(name="org_type_name_en")
	private String orgTypeNameEn;
	
	@Column(name="org_type_detail_th")
	private String orgTypeDetailTh;
	
	@Column(name="org_type_detail_en")
	private String orgTypeDetailEn;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrgTypeNameTh() {
		return orgTypeNameTh;
	}

	public void setOrgTypeNameTh(String orgTypeNameTh) {
		this.orgTypeNameTh = orgTypeNameTh;
	}

	public String getOrgTypeNameEn() {
		return orgTypeNameEn;
	}

	public void setOrgTypeNameEn(String orgTypeNameEn) {
		this.orgTypeNameEn = orgTypeNameEn;
	}

	public String getOrgTypeDetailTh() {
		return orgTypeDetailTh;
	}

	public void setOrgTypeDetailTh(String orgTypeDetailTh) {
		this.orgTypeDetailTh = orgTypeDetailTh;
	}

	public String getOrgTypeDetailEn() {
		return orgTypeDetailEn;
	}

	public void setOrgTypeDetailEn(String orgTypeDetailEn) {
		this.orgTypeDetailEn = orgTypeDetailEn;
	}


}
