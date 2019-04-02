package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_data")
public class StudentSkillGrade {
	
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
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	
	@Column(name = "std_skill_HTML")
	private String skillhtml;
	public String getStdSkillHtml() {
		return skillhtml;
	}
	public void setStdSkillHtml(String skillhtml) {
		this.skillhtml = skillhtml;
	}
	
	@Column(name = "std_skill_CSS")
	private String skillcss;
	public String getStdSkillCss() {
		return skillcss;
	}
	public void setStdSkillCss(String skillcss) {
		this.skillcss = skillcss;
	}
	
	@Column(name = "std_skill_PHP")
	private String skillphp;
	public String getStdSkillPhp() {
		return skillphp;
	}
	public void setStdSkillPhp(String skillphp) {
		this.skillphp = skillphp;
	}
	
	@Column(name = "std_skill_SQL")
	private String skillsql;
	public String getStdSkillSql() {
		return skillsql;
	}
	public void setStdSkillSql(String skillsql) {
		this.skillsql = skillsql;
	}
	
	@Column(name = "std_skill_JS")
	private String skilljs;
	public String getStdSkillJs() {
		return skilljs;
	}
	public void setStdSkillJs(String skilljs) {
		this.skilljs = skilljs;
	}
}
