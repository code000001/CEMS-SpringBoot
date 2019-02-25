package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "announcement_log_pos")
public class LogPosition {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="logp_ann_id")
	private Integer logpAnnId;
	
	@Column(name="logp_ann_pos_id")
	private Integer logpAnnPosId;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLogpAnnId() {
		return logpAnnId;
	}

	public void setLogpAnnId(Integer logpAnnId) {
		this.logpAnnId = logpAnnId;
	}

	public Integer getLogpAnnPosId() {
		return logpAnnPosId;
	}

	public void setLogpAnnPosId(Integer logpAnnPosId) {
		this.logpAnnPosId = logpAnnPosId;
	}

	
	
}
