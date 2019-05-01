package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Class			: OrganizationStatus
 * Module			: Organization data status
 * Last edited		: 01/05/2019
 * Purpose			: Contain 
 * 						=> getter
 * 						=> setter
 * 					  of variables. 
 * 					  This class connect to database in org_status table
 */
@Entity
@Table(name = "org_status")
public class OrganizationStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="org_status_name_th")
	private String orgStatusNameTh;
	
	@Column(name="org_status_name_en")
	private String orgStatusNameEn;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrgStatusNameTh() {
		return orgStatusNameTh;
	}

	public void setOrgStatusNameTh(String orgStatusNameTh) {
		this.orgStatusNameTh = orgStatusNameTh;
	}

	public String getOrgStatusNameEn() {
		return orgStatusNameEn;
	}

	public void setOrgStatusNameEh(String orgStatusNameEn) {
		this.orgStatusNameEn = orgStatusNameEn;
	}

	
}
