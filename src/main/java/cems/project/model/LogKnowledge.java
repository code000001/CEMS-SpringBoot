package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Class			: LogKnowledge
 * Module			: LogKnowledge data
 * Last edited		: 01/05/2019
 * Purpose			: Contain 
 * 						=> getter
 * 						=> setter
 * 					  of variables. 
 * 					  This class connect to database in announcement_log_krd table
 */
@Entity
@Table(name = "announcement_log_krd")
public class LogKnowledge {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="logk_ann_id")
	private Integer logkAnnId;
	
	@Column(name="logk_ann_krd_id")
	private Integer logkAnnKrdId;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLogkAnnId() {
		return logkAnnId;
	}

	public void setLogkAnnId(Integer logkAnnId) {
		this.logkAnnId = logkAnnId;
	}

	public Integer getLogkAnnKrdId() {
		return logkAnnKrdId;
	}

	public void setLogkAnnKrdId(Integer logkAnnKrdId) {
		this.logkAnnKrdId = logkAnnKrdId;
	}

	

}
