package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_data")
public class StudentQualificationPersonDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "std_id")
	private String stdId;
	
	@Column(name = "std_first_name_th")
	private String stdFirstNameTh;
	
	@Column(name = "std_last_name_th")
	private String stdLastNameTh;
	
	@Column(name = "std_first_name_en")
	private String stdFirstNameEn;
	
	@Column(name = "std_last_name_en")
	private String stdLastNameEn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getStdFirstNameEn() {
		return stdFirstNameEn;
	}

	public void setStdFirstNameEn(String stdFirstNameEn) {
		this.stdFirstNameEn = stdFirstNameEn;
	}

	public String getStdLastNameEn() {
		return stdLastNameEn;
	}

	public void setStdLastNameEn(String stdLastNameEn) {
		this.stdLastNameEn = stdLastNameEn;
	}

}
