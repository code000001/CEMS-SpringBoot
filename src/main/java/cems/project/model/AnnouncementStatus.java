package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "announcement_status")
public class AnnouncementStatus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="ann_status_name_th")
	private String annStatusNameTh;
	
	@Column(name="ann_status_name_en")
	private String annStatusNameEn;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnnStatusNameTh() {
		return annStatusNameTh;
	}

	public void setAnnStatusNameTh(String annStatusNameTh) {
		this.annStatusNameTh = annStatusNameTh;
	}

	public String getAnnStatusNameEn() {
		return annStatusNameEn;
	}

	public void setAnnStatusNameEn(String annStatusNameEn) {
		this.annStatusNameEn = annStatusNameEn;
	}

	

}
