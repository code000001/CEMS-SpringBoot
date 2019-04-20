package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_data")
public class StdAppInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "std_acc_id")
    private Integer stdAccId;

    @Column(name = "std_status_id")
    private Integer stdStatusId;

    @Column(name = "std_org_id")
    private Integer stdOrgId;

    @Column(name = "std_id")
    private Integer stdId;

    @Column(name = "std_first_name_th")
    private String stdFirstNameTh;

    @Column(name = "std_last_name_th")
    private String stdLastNameTh;

    @Column(name = "std_first_name_en")
    private String stdFirstNameEn;

    @Column(name = "std_last_name_en")
    private String stdLastNameEn;
    
    @Column(name = "std_test_score")
    private String stdTestScore;

    @Column(name = "std_hr_prepare")
    private Integer stdHrPrepare;

    @Column(name = "std_hr_conference")
    private Integer stdHrConference;

    @Column(name = "std_gpax")
    private String stdGpax;

    @Column(name = "std_year")
    private Integer stdYear;

    @Column(name = "std_course")
    private String stdCourse;

    @Column(name = "std_branch")
    private String stdBranch;

    @Column(name = "std_passed_credit")
    private Integer stdPassedCredit;

    @Column(name = "std_house_particulars_address")
    private String stdHouseParticularsAddress;

    @Column(name = "std_now_address")
    private String stdNowAddress;

    @Column(name = "std_tel")
    private String stdTel;

    @Column(name = "std_mobile_tel")
    private String stdMmobileTel;

    @Column(name = "std_email")
    private String stdEmail;

    @Column(name = "std_post_no")
    private String stdPostNo;

    @Column(name = "std_parent_first_name")
    private String stdParentFirstName;

    @Column(name = "std_parent_last_name")
    private String stdParentLastName;

    @Column(name = "std_parent_relation")
    private String stdParentRelation;

    @Column(name = "std_parent_address")
    private String stdParentAddress;

    @Column(name = "std_parent_email")
    private String stdParentEmail;

    @Column(name = "std_parent_tel")
    private String stdParentTel;

    @Column(name = "std_parent_post_no")
    private String stdParentPostNo;

    @Column(name = "std_parent_mobile_tel")
    private String stdParentMobileTel;

    /**
     * @return the id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        Id = id;
    }

    /**
     * @return the stdAccId
     */
    public Integer getStdAccId() {
        return stdAccId;
    }

    /**
     * @param stdAccId the stdAccId to set
     */
    public void setStdAccId(Integer stdAccId) {
        this.stdAccId = stdAccId;
    }

    /**
     * @return the stdStatusId
     */
    public Integer getStdStatusId() {
        return stdStatusId;
    }

    /**
     * @param stdStatusId the stdStatusId to set
     */
    public void setStdStatusId(Integer stdStatusId) {
        this.stdStatusId = stdStatusId;
    }

    /**
     * @return the stdOrgId
     */
    public Integer getStdOrgId() {
        return stdOrgId;
    }

    /**
     * @param stdOrgId the stdOrgId to set
     */
    public void setStdOrgId(Integer stdOrgId) {
        this.stdOrgId = stdOrgId;
    }

    /**
     * @return the stdId
     */
    public Integer getStdId() {
        return stdId;
    }

    /**
     * @param stdId the stdId to set
     */
    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    /**
     * @return the stdFirstNameTh
     */
    public String getStdFirstNameTh() {
        return stdFirstNameTh;
    }

    /**
     * @param stdFirstNameTh the stdFirstNameTh to set
     */
    public void setStdFirstNameTh(String stdFirstNameTh) {
        this.stdFirstNameTh = stdFirstNameTh;
    }

    /**
     * @return the stdLastNameTh
     */
    public String getStdLastNameTh() {
        return stdLastNameTh;
    }

    /**
     * @param stdLastNameTh the stdLastNameTh to set
     */
    public void setStdLastNameTh(String stdLastNameTh) {
        this.stdLastNameTh = stdLastNameTh;
    }

    /**
     * @return the stdFirstNameEn
     */
    public String getStdFirstNameEn() {
        return stdFirstNameEn;
    }

    /**
     * @param stdFirstNameEn the stdFirstNameEn to set
     */
    public void setStdFirstNameEn(String stdFirstNameEn) {
        this.stdFirstNameEn = stdFirstNameEn;
    }

    /**
     * @return the stdLastNameEn
     */
    public String getStdLastNameEn() {
        return stdLastNameEn;
    }

    /**
     * @param stdLastNameEn the stdLastNameEn to set
     */
    public void setStdLastNameEn(String stdLastNameEn) {
        this.stdLastNameEn = stdLastNameEn;
    }

    /**
     * @return the stdTestScore
     */
    public String getStdTestScore() {
        return stdTestScore;
    }

    /**
     * @param stdTestScore the stdTestScore to set
     */
    public void setStdTestScore(String stdTestScore) {
        this.stdTestScore = stdTestScore;
    }

    /**
     * @return the stdHrPrepare
     */
    public Integer getStdHrPrepare() {
        return stdHrPrepare;
    }

    /**
     * @param stdHrPrepare the stdHrPrepare to set
     */
    public void setStdHrPrepare(Integer stdHrPrepare) {
        this.stdHrPrepare = stdHrPrepare;
    }

    /**
     * @return the stdHrConference
     */
    public Integer getStdHrConference() {
        return stdHrConference;
    }

    /**
     * @param stdHrConference the stdHrConference to set
     */
    public void setStdHrConference(Integer stdHrConference) {
        this.stdHrConference = stdHrConference;
    }

    /**
     * @return the stdGpax
     */
    public String getStdGpax() {
        return stdGpax;
    }

    /**
     * @param stdGpax the stdGpax to set
     */
    public void setStdGpax(String stdGpax) {
        this.stdGpax = stdGpax;
    }

    /**
     * @return the stdYear
     */
    public Integer getStdYear() {
        return stdYear;
    }

    /**
     * @param stdYear the stdYear to set
     */
    public void setStdYear(Integer stdYear) {
        this.stdYear = stdYear;
    }

    /**
     * @return the stdCourse
     */
    public String getStdCourse() {
        return stdCourse;
    }

    /**
     * @param stdCourse the stdCourse to set
     */
    public void setStdCourse(String stdCourse) {
        this.stdCourse = stdCourse;
    }

    /**
     * @return the stdBranch
     */
    public String getStdBranch() {
        return stdBranch;
    }

    /**
     * @param stdBranch the stdBranch to set
     */
    public void setStdBranch(String stdBranch) {
        this.stdBranch = stdBranch;
    }

    /**
     * @return the stdPassedCredit
     */
    public Integer getStdPassedCredit() {
        return stdPassedCredit;
    }

    /**
     * @param stdPassedCredit the stdPassedCredit to set
     */
    public void setStdPassedCredit(Integer stdPassedCredit) {
        this.stdPassedCredit = stdPassedCredit;
    }

    /**
     * @return the stdHouseParticularsAddress
     */
    public String getStdHouseParticularsAddress() {
        return stdHouseParticularsAddress;
    }

    /**
     * @param stdHouseParticularsAddress the stdHouseParticularsAddress to set
     */
    public void setStdHouseParticularsAddress(String stdHouseParticularsAddress) {
        this.stdHouseParticularsAddress = stdHouseParticularsAddress;
    }

    /**
     * @return the stdNowAddress
     */
    public String getStdNowAddress() {
        return stdNowAddress;
    }

    /**
     * @param stdNowAddress the stdNowAddress to set
     */
    public void setStdNowAddress(String stdNowAddress) {
        this.stdNowAddress = stdNowAddress;
    }

    /**
     * @return the stdTel
     */
    public String getStdTel() {
        return stdTel;
    }

    /**
     * @param stdTel the stdTel to set
     */
    public void setStdTel(String stdTel) {
        this.stdTel = stdTel;
    }

    /**
     * @return the stdMmobileTel
     */
    public String getStdMmobileTel() {
        return stdMmobileTel;
    }

    /**
     * @param stdMmobileTel the stdMmobileTel to set
     */
    public void setStdMmobileTel(String stdMmobileTel) {
        this.stdMmobileTel = stdMmobileTel;
    }

    /**
     * @return the stdEmail
     */
    public String getStdEmail() {
        return stdEmail;
    }

    /**
     * @param stdEmail the stdEmail to set
     */
    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }

    /**
     * @return the stdPostNo
     */
    public String getStdPostNo() {
        return stdPostNo;
    }

    /**
     * @param stdPostNo the stdPostNo to set
     */
    public void setStdPostNo(String stdPostNo) {
        this.stdPostNo = stdPostNo;
    }

    /**
     * @return the stdParentFirstName
     */
    public String getStdParentFirstName() {
        return stdParentFirstName;
    }

    /**
     * @param stdParentFirstName the stdParentFirstName to set
     */
    public void setStdParentFirstName(String stdParentFirstName) {
        this.stdParentFirstName = stdParentFirstName;
    }

    /**
     * @return the stdParentLastName
     */
    public String getStdParentLastName() {
        return stdParentLastName;
    }

    /**
     * @param stdParentLastName the stdParentLastName to set
     */
    public void setStdParentLastName(String stdParentLastName) {
        this.stdParentLastName = stdParentLastName;
    }

    /**
     * @return the stdParentRelation
     */
    public String getStdParentRelation() {
        return stdParentRelation;
    }

    /**
     * @param stdParentRelation the stdParentRelation to set
     */
    public void setStdParentRelation(String stdParentRelation) {
        this.stdParentRelation = stdParentRelation;
    }

    /**
     * @return the stdParentAddress
     */
    public String getStdParentAddress() {
        return stdParentAddress;
    }

    /**
     * @param stdParentAddress the stdParentAddress to set
     */
    public void setStdParentAddress(String stdParentAddress) {
        this.stdParentAddress = stdParentAddress;
    }

    /**
     * @return the stdParentEmail
     */
    public String getStdParentEmail() {
        return stdParentEmail;
    }

    /**
     * @param stdParentEmail the stdParentEmail to set
     */
    public void setStdParentEmail(String stdParentEmail) {
        this.stdParentEmail = stdParentEmail;
    }

    /**
     * @return the stdParentTel
     */
    public String getStdParentTel() {
        return stdParentTel;
    }

    /**
     * @param stdParentTel the stdParentTel to set
     */
    public void setStdParentTel(String stdParentTel) {
        this.stdParentTel = stdParentTel;
    }

    /**
     * @return the stdParentPostNo
     */
    public String getStdParentPostNo() {
        return stdParentPostNo;
    }

    /**
     * @param stdParentPostNo the stdParentPostNo to set
     */
    public void setStdParentPostNo(String stdParentPostNo) {
        this.stdParentPostNo = stdParentPostNo;
    }

    /**
     * @return the stdParentMobileTel
     */
    public String getStdParentMobileTel() {
        return stdParentMobileTel;
    }

    /**
     * @param stdParentMobileTel the stdParentMobileTel to set
     */
    public void setStdParentMobileTel(String stdParentMobileTel) {
        this.stdParentMobileTel = stdParentMobileTel;
    }
}