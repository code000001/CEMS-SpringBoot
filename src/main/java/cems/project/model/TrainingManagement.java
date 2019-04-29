package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_data")
public class TrainingManagement {
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getStdAccId() {
		return stdAccId;
	}


	public void setStdAccId(Integer stdAccId) {
		this.stdAccId = stdAccId;
	}


	public Integer getStdId() {
		return stdId;
	}


	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}


	public String getStdFirstnameTH() {
		return stdFirstnameTH;
	}


	public void setStdFirstnameTH(String stdFirstnameTH) {
		this.stdFirstnameTH = stdFirstnameTH;
	}


	public String getStdLastnameTH() {
		return stdLastnameTH;
	}


	public void setStdLastnameTH(String stdLastnameTH) {
		this.stdLastnameTH = stdLastnameTH;
	}


	public String getStdFirstnameEN() {
		return stdFirstnameEN;
	}


	public void setStdFirstnameEN(String stdFirstnameEN) {
		this.stdFirstnameEN = stdFirstnameEN;
	}


	public String getStdLastnameEN() {
		return stdLastnameEN;
	}


	public void setStdLastnameEN(String stdLastnameEN) {
		this.stdLastnameEN = stdLastnameEN;
	}


	public Integer getStdHrprepare() {
		if(stdHrprepare == null) {
			return 0;
		}
		return stdHrprepare;
	}


	public void setStdHrprepare(Integer stdHrprepare) {
		this.stdHrprepare = stdHrprepare;
	}


	public Integer getStdHrConference() {
		if(stdHrConference == null) {
			return 0;
		}
		return stdHrConference;
	}


	public void setStdHrConference(Integer stdHrConference) {
		this.stdHrConference = stdHrConference;
	}

	public String getStdTestScore() {
		return stdTestScore;
	}


	public void setStdTestScore(String stdTestScore) {
		this.stdTestScore = stdTestScore;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "std_acc_id")
	private Integer stdAccId;

	@Column(name = "std_id")
	private Integer stdId;
	
	@Column(name = "std_first_name_th")
	private String stdFirstnameTH;

	
	@Column(name = "std_last_name_th")
	private String stdLastnameTH;

	
	@Column(name = "std_first_name_en")
	private String stdFirstnameEN;

	
	@Column(name = "std_last_name_en")
	private String stdLastnameEN;

	
	@Column(name = "std_hr_prepare")
	private Integer stdHrprepare;

	
	@Column(name = "std_hr_conference")
	private Integer stdHrConference;
	



	@Column(name = "std_test_score")
	private String stdTestScore;
}
