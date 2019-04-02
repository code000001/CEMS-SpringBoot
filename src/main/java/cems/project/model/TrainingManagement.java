package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_data,student_training_data")
public class TrainingManagement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "std_acc_id")
	private Integer stdAccId;
	public Integer getStdAccId() {
		return stdAccId;
		
	}
	
	@Column(name = "std_id")
	private Integer stdId;
	public Integer getStdId() {
		return stdId;
	}
	
	@Column(name = "std_first_name_th")
	private String stdFirstnameTH;
	public String getStdFirstnameTh() {
		return stdFirstnameTH;
	}
	
	@Column(name = "std_last_name_th")
	private String stdLastnameTH;
	public String getStdLastnameTh() {
		return stdLastnameTH;
	}
	
	@Column(name = "std_first_name_en")
	private String stdFirstnameEN;
	public String getStdFirstnameEn() {
		return stdFirstnameEN;
	}
	
	@Column(name = "std_last_name_en")
	private String stdLastnameEN;
	public String getStdLastnameEn() {
		return stdLastnameEN;
	}
	
	@Column(name = "std_hr_prepare")
	private Integer stdHrprepare;
	public Integer getStdHrPrepare() {
		return stdHrprepare;
	}
	public void setStdHrPrepare(Integer stdHrprepare) {
		this.stdHrprepare = stdHrprepare;
	}
	
	@Column(name = "std_hr_conference")
	private Integer stdHrConference;
	public Integer getStdHrConference() {
		return stdHrConference;
	}
	public void setStdHrConference(Integer stdHrConference) {
		this.stdHrConference = stdHrConference;
	}
	
	@Column(name = "std_train_name_th")
	private String stdTrainTh;
	public String getStdTringTH() {
		return stdTrainTh;
	}
	public void setStdTrainTH(String stdTrainTh) {
		this.stdTrainTh = stdTrainTh;
	}
}
