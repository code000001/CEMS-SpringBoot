package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "announcement_position_data")
public class PositionData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="ann_pos_status_id")
	private Integer annPosStatusId;
	
	@Column(name="ann_pos_name_th")
	private String annPosNameTh;
	
	@Column(name="ann_pos_name_en")
	private String annPosNameEn;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnnPosStatusId() {
		return annPosStatusId;
	}

	public void setAnnPosStatusId(Integer annPosStatusId) {
		this.annPosStatusId = annPosStatusId;
	}

	public String getAnnPosNameTh() {
		return annPosNameTh;
	}

	public void setAnnPosNameTh(String annPosNameTh) {
		this.annPosNameTh = annPosNameTh;
	}

	public String getAnnPosNameEn() {
		return annPosNameEn;
	}

	public void setAnnPosNameEn(String annPosNameEn) {
		this.annPosNameEn = annPosNameEn;
	}

	


}
