package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Class			: Announcement
 * Module			: Announcement data
 * Last edited		: 01/05/2019
 * Purpose			: Contain 
 * 						=> getter
 * 						=> setter
 * 					  of variables. 
 * 					  This class connect to database in announcement_data table
 */
@Entity
@Table(name = "announcement_data")
public class Announcement{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="ann_status_id")
	private Integer annStatusId;
	
	@Column(name="ann_acc_id")
	private Integer annAccId;
	
	@Column(name="ann_org_id")
	private Integer annOrgId;
	
	@Column(name="ann_start_date")
	private String annStartDate;
	
	@Column(name="ann_end_date")
	private String annEndDate;
	
	@Column(name="ann_std_amount")
	private String annStdAmount;
	
	@Column(name="ann_reward")
	private String annReward;
	
	@Column(name="ann_workshift")
	private String annWorkshift;
	
	@Column(name="ann_item_req")
	private String annItemReq;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnnStatusId() {
		return annStatusId;
	}

	public void setAnnStatusId(Integer annStatusId) {
		this.annStatusId = annStatusId;
	}

	public Integer getAnnAccId() {
		return annAccId;
	}

	public void setAnnAccId(Integer annAccId) {
		this.annAccId = annAccId;
	}

	public Integer getAnnOrgId() {
		return annOrgId;
	}

	public void setAnnOrgId(Integer annOrgId) {
		this.annOrgId = annOrgId;
	}

	public String getAnnStartDate() {
		return annStartDate;
	}

	public void setAnnStartDate(String annStartDate) {
		this.annStartDate = annStartDate;
	}

	public String getAnnEndDate() {
		return annEndDate;
	}

	public void setAnnEndDate(String annEndDate) {
		this.annEndDate = annEndDate;
	}

	public String getAnnStdAmount() {
		return annStdAmount;
	}

	public void setAnnStdAmount(String annStdAmount) {
		this.annStdAmount = annStdAmount;
	}

	public String getAnnReward() {
		return annReward;
	}

	public void setAnnReward(String annReward) {
		this.annReward = annReward;
	}

	public String getAnnWorkshift() {
		return annWorkshift;
	}

	public void setAnnWorkshift(String annWorkshift) {
		this.annWorkshift = annWorkshift;
	}

	public String getAnnItemReq() {
		return annItemReq;
	}

	public void setAnnItemReq(String annItemReq) {
		this.annItemReq = annItemReq;
	}	
	
}
//END OF CLASS Announcement