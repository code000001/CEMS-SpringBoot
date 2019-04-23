package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_data")
public class StudentAddInsForm {

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
	
	@Column(name = "std_th_prefix")
	private String stdprefixTH;
	public String getStdPrefixTh() {
		return stdprefixTH;
	}
	public void setStdPrefixTh(String stdprefixTH) {
		this.stdprefixTH = stdprefixTH;
	}
	
	@Column(name = "std_first_name_th")
	private String stdFirstnameTH;
	public String getStdFirstnameTh() {
		return stdFirstnameTH;
	}
	public void setStdFirstnameTh(String stdFirstnameTH) {
		this.stdFirstnameTH = stdFirstnameTH;
	}
	
	@Column(name = "std_last_name_th")
	private String stdLastnameTH;
	public String getStdLastnameTh() {
		return stdLastnameTH;
	}
	public void setStdLastnameTh(String stdLastnameTH) {
		this.stdLastnameTH = stdLastnameTH;
	}
	
	@Column(name = "std_en_prefix")
	private String stdprefixEN;
	public String getStdPrefixEn() {
		return stdprefixEN;
	}
	public void setStdPrefixEn(String stdprefixEN) {
		this.stdprefixEN = stdprefixEN;
	}
	
	@Column(name = "std_first_name_en")
	private String stdFirstnameEN;
	public String getStdFirstnameEn() {
		return stdFirstnameEN;
	}
	public void setStdFirstnameEn(String stdFirstnameEN) {
		this.stdFirstnameEN = stdFirstnameEN;
	}
	
	@Column(name = "std_last_name_en")
	private String stdLastnameEN;
	public String getStdLastnameEn() {
		return stdLastnameEN;
	}
	public void setStdLastnameEn(String stdLastnameEN) {
		this.stdLastnameEN = stdLastnameEN;
	}
	
	@Column(name = "std_year")
	private Integer stdYear;
	public Integer getStdYear() {
		return stdYear;
	}
	public void setStdYear(Integer stdYear) {
		this.stdYear = stdYear;
	}
	
	@Column(name = "std_passed_credit")
	private Integer stdCredit;
	public Integer getStdCredit() {
		return stdCredit;
	}
	public void setStdCredit(Integer stdCredit) {
		this.stdCredit = stdCredit;
	}
	
	@Column(name = "std_gpax")
	private String stdGpax;
	public String getStdGpax() {
		return stdGpax;
	}
	public void setStdGpax(String stdGpax) {
		this.stdGpax = stdGpax;
	}
	
	@Column(name = "std_course")
	private String stdCourse;
	public String getStdCourse() {
		return stdCourse;
	}
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
	
	@Column(name = "std_branch")
	private String stdBranch;
	public String getStdBranch() {
		return stdBranch;
	}
	public void setStdBranch(String stdBranch) {
		this.stdBranch = stdBranch;
	}
	
	@Column(name = "std_house_particulars_address")
	private String stdAddressPartic;
	public String getStdAddressPartic() {
		return stdAddressPartic;
	}
	public void setStdAddressPartic(String stdAddressPartic) {
		this.stdAddressPartic = stdAddressPartic;
	}
	
	@Column(name = "std_now_address")
	private String stdAddressNow;
	public String getStdAddressNow() {
		return stdAddressNow;
	}
	public void setStdAddressNow(String stdAddressNow) {
		this.stdAddressNow = stdAddressNow;
	}
	
	@Column(name = "std_tel")
	private String stdTel;
	public String getStdTel() {
		return stdTel;
	}
	public void setStdTel(String stdTel) {
		this.stdTel = stdTel;
	}
	
	@Column(name = "std_mobile_tel")
	private String stdMobile;
	public String getStdMobile() {
		return stdMobile;
	}
	public void setStdMobile(String stdMobile) {
		this.stdMobile = stdMobile;
	}
	
	@Column(name = "std_email")
	private String stdEmail;
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	
	@Column(name = "std_parent_first_name")
	private String stdpareFname;
	public String getStdpareFname() {
		return stdpareFname;
	}
	public void setStdpareFname(String stdpareFname) {
		this.stdpareFname = stdpareFname;
	}
	
	@Column(name = "std_parent_last_name")
	private String stdpareLname;
	public String getStdpareLname() {
		return stdpareLname;
	}
	public void setStdpareLname(String stdpareLname) {
		this.stdpareLname = stdpareLname;
	}
	
	@Column(name = "std_parent_relation")
	private String stdpareRelation;
	public String getStdpareRelation() {
		return stdpareRelation;
	}
	public void setStdpareRelation(String stdpareRelation) {
		this.stdpareRelation = stdpareRelation;
	}
	
	@Column(name = "std_parent_address")
	private String stdpareAddress;
	public String getStdpareAddress() {
		return stdpareAddress;
	}
	public void setStdpareAddress(String stdpareAddress) {
		this.stdpareAddress = stdpareAddress;
	}
	
	@Column(name = "std_parent_mobile")
	private String stdpareMobile;
	public String getStdpareMobile() {
		return stdpareMobile;
	}
	public void setStdpareMobile(String stdpareMobile) {
		this.stdpareMobile = stdpareMobile;
	}
	
	@Column(name = "std_parent_tel")
	private String stdpareTel;
	public String getStdpareTel() {
		return stdpareTel;
	}
	public void setStdpareTel(String stdpareTel) {
		this.stdpareTel = stdpareTel;
	}
	
	@Column(name = "std_parent_email")
	private String stdpareEmail;
	public String getStdpareEmail() {
		return stdpareEmail;
	}
	public void setStdpareEmail(String stdpareEmail) {
		this.stdpareEmail = stdpareEmail;
	}
	
}
