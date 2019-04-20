package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name= "std_app_coop")
public class StdAppCoop {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
    @Column(name = "std_data_id")
    private Integer stdDataId;
    
    @Column(name = "std_born_place")
    private String stdBornPlace;

    @Column(name = "std_last_gpa")
    private String stdLastGpa;
    
    @Column(name = "std_born_date")
    private String stdBornDate;
    
    @Column(name = "std_age")
    private Integer stdAge;
    
	@Column(name = "std_gender_id")
    private Integer stdGenderId;
    
    @Column(name= "std_person_id")
    private String stdPersonId;
    
    @Column(name= "std_nation")
    private String stdNation;
    
    @Column(name= "std_religion")
    private String stdReligion;
    
    @Column(name = "std_height")
    private String stdHeight;

    @Column(name = "std_weigh")
    private String stdWeigh;

    @Column(name = "std_father_name_th")
    private String stdFatherNameTh;

    @Column(name = "std_father_name_en")
    private String stdFatherNameEn;

    @Column(name = "std_mother_name_th")
    private String stdMotherNameTh;

    @Column(name = "std_mother_name_en")
    private String stdMotherNameEn;

    @Column(name = "std_father_job")
    private String stdFatherJob;

    @Column(name = "std_mother_job")
    private String stdMotherJob;

    @Column(name = "std_father_mobile_tel")
    private String stdFatherMobileTel;

    @Column(name = "std_mother_mobile_tel")
    private String stdMotherMobileTel;

    @Column(name = "std_hs_study_place")
    private String stdHsStudyPlace;

    @Column(name = "std_hs_start_year")
    private Integer stdHsStartYear;

    @Column(name = "std_hs_end_year")
    private Integer stdHsEndYear;

    @Column(name = "std_hs_gpa")
    private String stdHsGpa;

    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return the stdDataId
     */
    public Integer getStdDataId() {
        return stdDataId;
    }

    /**
     * @param stdDataId the stdDataId to set
     */
    public void setStdDataId(Integer stdDataId) {
        this.stdDataId = stdDataId;
    }

    /**
     * @return the stdBornPlace
     */
    public String getStdBornPlace() {
        return stdBornPlace;
    }

    /**
     * @param stdBornPlace the stdBornPlace to set
     */
    public void setStdBornPlace(String stdBornPlace) {
        this.stdBornPlace = stdBornPlace;
    }

    /**
     * @return the stdLastGpa
     */
    public String getStdLastGpa() {
        return stdLastGpa;
    }

    /**
     * @param stdLastGpa the stdLastGpa to set
     */
    public void setStdLastGpa(String stdLastGpa) {
        this.stdLastGpa = stdLastGpa;
    }

    /**
     * @return the stdBornDate
     */
    public String getStdBornDate() {
        return stdBornDate;
    }

    /**
     * @param stdBornDate the stdBornDate to set
     */
    public void setStdBornDate(String stdBornDate) {
        this.stdBornDate = stdBornDate;
    }

    /**
     * @return the stdAge
     */
    public Integer getStdAge() {
        return stdAge;
    }

    /**
     * @param stdAge the stdAge to set
     */
    public void setStdAge(Integer stdAge) {
        this.stdAge = stdAge;
    }

    /**
     * @return the stdGenderId
     */
    public Integer getStdGenderId() {
        return stdGenderId;
    }

    /**
     * @param stdGenderId the stdGenderId to set
     */
    public void setStdGenderId(Integer stdGenderId) {
        this.stdGenderId = stdGenderId;
    }

    /**
     * @return the stdPersonId
     */
    public String getStdPersonId() {
        return stdPersonId;
    }

    /**
     * @param stdPersonId the stdPersonId to set
     */
    public void setStdPersonId(String stdPersonId) {
        this.stdPersonId = stdPersonId;
    }

    /**
     * @return the stdNation
     */
    public String getStdNation() {
        return stdNation;
    }

    /**
     * @param stdNation the stdNation to set
     */
    public void setStdNation(String stdNation) {
        this.stdNation = stdNation;
    }

    /**
     * @return the stdReligion
     */
    public String getStdReligion() {
        return stdReligion;
    }

    /**
     * @param stdReligion the stdReligion to set
     */
    public void setStdReligion(String stdReligion) {
        this.stdReligion = stdReligion;
    }

    /**
     * @return the stdHeight
     */
    public String getStdHeight() {
        return stdHeight;
    }

    /**
     * @param stdHeight the stdHeight to set
     */
    public void setStdHeight(String stdHeight) {
        this.stdHeight = stdHeight;
    }

    /**
     * @return the stdWeigh
     */
    public String getStdWeigh() {
        return stdWeigh;
    }

    /**
     * @param stdWeigh the stdWeigh to set
     */
    public void setStdWeigh(String stdWeigh) {
        this.stdWeigh = stdWeigh;
    }

    /**
     * @return the stdFatherNameTh
     */
    public String getStdFatherNameTh() {
        return stdFatherNameTh;
    }

    /**
     * @param stdFatherNameTh the stdFatherNameTh to set
     */
    public void setStdFatherNameTh(String stdFatherNameTh) {
        this.stdFatherNameTh = stdFatherNameTh;
    }

    /**
     * @return the stdFatherNameEn
     */
    public String getStdFatherNameEn() {
        return stdFatherNameEn;
    }

    /**
     * @param stdFatherNameEn the stdFatherNameEn to set
     */
    public void setStdFatherNameEn(String stdFatherNameEn) {
        this.stdFatherNameEn = stdFatherNameEn;
    }

    /**
     * @return the stdMotherNameTh
     */
    public String getStdMotherNameTh() {
        return stdMotherNameTh;
    }

    /**
     * @param stdMotherNameTh the stdMotherNameTh to set
     */
    public void setStdMotherNameTh(String stdMotherNameTh) {
        this.stdMotherNameTh = stdMotherNameTh;
    }

    /**
     * @return the stdMotherNameEn
     */
    public String getStdMotherNameEn() {
        return stdMotherNameEn;
    }

    /**
     * @param stdMotherNameEn the stdMotherNameEn to set
     */
    public void setStdMotherNameEn(String stdMotherNameEn) {
        this.stdMotherNameEn = stdMotherNameEn;
    }

    /**
     * @return the stdFatherJob
     */
    public String getStdFatherJob() {
        return stdFatherJob;
    }

    /**
     * @param stdFatherJob the stdFatherJob to set
     */
    public void setStdFatherJob(String stdFatherJob) {
        this.stdFatherJob = stdFatherJob;
    }

    /**
     * @return the stdMotherJob
     */
    public String getStdMotherJob() {
        return stdMotherJob;
    }

    /**
     * @param stdMotherJob the stdMotherJob to set
     */
    public void setStdMotherJob(String stdMotherJob) {
        this.stdMotherJob = stdMotherJob;
    }

    /**
     * @return the stdFatherMobileTel
     */
    public String getStdFatherMobileTel() {
        return stdFatherMobileTel;
    }

    /**
     * @param stdFatherMobileTel the stdFatherMobileTel to set
     */
    public void setStdFatherMobileTel(String stdFatherMobileTel) {
        this.stdFatherMobileTel = stdFatherMobileTel;
    }

    /**
     * @return the stdMotherMobileTel
     */
    public String getStdMotherMobileTel() {
        return stdMotherMobileTel;
    }

    /**
     * @param stdMotherMobileTel the stdMotherMobileTel to set
     */
    public void setStdMotherMobileTel(String stdMotherMobileTel) {
        this.stdMotherMobileTel = stdMotherMobileTel;
    }

    /**
     * @return the stdHsStudyPlace
     */
    public String getStdHsStudyPlace() {
        return stdHsStudyPlace;
    }

    /**
     * @param stdHsStudyPlace the stdHsStudyPlace to set
     */
    public void setStdHsStudyPlace(String stdHsStudyPlace) {
        this.stdHsStudyPlace = stdHsStudyPlace;
    }

    /**
     * @return the stdHsStartYear
     */
    public Integer getStdHsStartYear() {
        return stdHsStartYear;
    }

    /**
     * @param stdHsStartYear the stdHsStartYear to set
     */
    public void setStdHsStartYear(Integer stdHsStartYear) {
        this.stdHsStartYear = stdHsStartYear;
    }

    /**
     * @return the stdHsEndYear
     */
    public Integer getStdHsEndYear() {
        return stdHsEndYear;
    }

    /**
     * @param stdHsEndYear the stdHsEndYear to set
     */
    public void setStdHsEndYear(Integer stdHsEndYear) {
        this.stdHsEndYear = stdHsEndYear;
    }

    /**
     * @return the stdHsGpa
     */
    public String getStdHsGpa() {
        return stdHsGpa;
    }

    /**
     * @param stdHsGpa the stdHsGpa to set
     */
    public void setStdHsGpa(String stdHsGpa) {
        this.stdHsGpa = stdHsGpa;
    }
    
}
