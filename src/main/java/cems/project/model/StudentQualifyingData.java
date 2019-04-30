package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Author			: Phakhanan Thongmee
 * Author ID		: 58160673
 * Class			: StudentQualifyingData
 * Module			: Student qualification
 * Last edited		: 01/05/2019
 * Purpose			: Contain 
 * 						=> getter
 * 						=> setter
 * 					  of variables. 
 * 					  This class connect to database in std_data table
 */
@Entity
@Table(name = "std_data")
public class StudentQualifyingData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "std_acc_id")
	private Integer stdAccId;
	public Integer getStdAccId() {
		return stdAccId;
	}
	public void setStdAccId(Integer stdAccId) {
		this.stdAccId = stdAccId;
	}
	@Column(name = "std_org_id")
	private Integer stdOrgId;
	public Integer getStdOrgId() {
		return stdOrgId;
	}
	public void setStdOrgId(Integer stdOrgId) {
		this.stdOrgId = stdOrgId;
	}
	@Column(name = "std_status_id")
	private Integer stdStatusId;
	public Integer getStdStatusId() {
		return stdStatusId;
	}
	public void setStdStatusId(Integer stdStatusId) {
		this.stdStatusId = stdStatusId;
	}
	
}
//END OF CLASS StudentQualifyingData
