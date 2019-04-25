package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Column(name = "std_status_id")
	private Integer stdStatusId;
	public Integer getStdStatusId() {
		return stdStatusId;
	}
	public void setStdStatusId(Integer stdStatusId) {
		this.stdStatusId = stdStatusId;
	}
	
	@Column(name = "std_id")
	private Integer stdId;
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	
	@Column(name = "std_test_score")
	private String stdTestScore;
	public String getStdTestScore() {
		return stdTestScore;
	}
	public void setStdTestScore(String stdTestScore) {
		this.stdTestScore = stdTestScore;
	}
	
	@Column(name = "std_hr_prepare")
	private Integer stdHrPrepare;
	public Integer getStdHrPrepare() {
		return stdHrPrepare;
	}
	public void setStdHrPrepare(Integer stdHrPrepare) {
		this.stdHrPrepare = stdHrPrepare;
	}
	@Column(name = "std_hr_conference")
	private Integer stdHrConference;
	public Integer getStdHrConference() {
		return stdHrConference;
	}
	public void setStdHrConference(Integer stdHrConference) {
		this.stdHrConference = stdHrConference;
	}
}
