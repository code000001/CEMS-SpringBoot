package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Class			: KnowledgeRequirement
 * Module			: knowledge requirement data
 * Last edited		: 01/05/2019
 * Purpose			: Contain 
 * 						=> getter
 * 						=> setter
 * 					  of variables. 
 * 					  This class connect to database in announcement_knowledge_req_data table
 */
@Entity
@Table(name = "announcement_knowledge_req_data")
public class KnowledgeRequirement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="ann_kreq_status_id")
	private Integer annKreqStatusId;
	
	@Column(name="ann_kreq_name_th")
	private String annKreqNameTh;
	
	@Column(name="ann_kreq_name_en")
	private String annKreqNameEn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnnKreqStatusId() {
		return annKreqStatusId;
	}

	public void setAnnKreqStatusId(Integer annKreqStatusId) {
		this.annKreqStatusId = annKreqStatusId;
	}

	public String getAnnKreqNameTh() {
		return annKreqNameTh;
	}

	public void setAnnKreqNameTh(String annKreqNameTh) {
		this.annKreqNameTh = annKreqNameTh;
	}

	public String getAnnKreqNameEn() {
		return annKreqNameEn;
	}

	public void setAnnKreqNameEn(String annKreqNameEn) {
		this.annKreqNameEn = annKreqNameEn;
	}

	
}
