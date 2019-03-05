package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_data")
public class StaffTrainingManagement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "std_acc_id")
	private Integer stdAccId;
	
	public Integer getStdAccId() {
		return stdAccId;
		
	}
	
	@Column(name = "std_id")
	private String stdId;
	
	@Column(name = "std_first_name_th")
	private String stdFirstNameTh;
	
	@Column(name = "std_last_name_th")
	private String stdLastNameTh;
	
	@Column(name= "std_hr_prepare")
	private Integer hourPrepare; 
	
	@Column(name = "std_hr_conference")
	private Integer hourConference;
	
	public Integer getId() {
		return id;
	}
	
	public String getStdId() {
		return stdId;
	}
	
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	
	public String getStdFirstNameTh() {
		return stdFirstNameTh;
	}

	public void setStdFirstNameTh(String stdFirstNameTh) {
		this.stdFirstNameTh = stdFirstNameTh;
	}

	public String getStdLastNameTh() {
		return stdLastNameTh;
	}

	public void setStdLastNameTh(String stdLastNameTh) {
		this.stdLastNameTh = stdLastNameTh;
	}
}
