package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// SELECT
//     `infoa`.`id` AS `id`,
//     `infoa`.`std_org_id` AS `std_org_id`,
//     `infoa`.`std_acc_id` AS `std_acc_id`,
//     `status`.`status_name_th` AS `status_name_th`,
//     `status`.`status_name_en` AS `status_name_en`,
//     `infoa`.`std_id` AS `std_id`,
//     `infoa`.`std_th_prefix` AS `std_th_prefix`,
//     `infoa`.`std_en_prefix` AS `std_en_prefix`,
//     `infoa`.`std_first_name_th` AS `std_first_name_th`,
//     `infoa`.`std_last_name_th` AS `std_last_name_th`,
//     `infoa`.`std_test_score` AS `std_test_score`,
//     `infoa`.`std_hr_prepare` AS `std_hr_prepare`,
//     `infoa`.`std_hr_conference` AS `std_hr_conference`,
//     `infoa`.`std_gpax` AS `std_gpax`,
//     `infoa`.`std_year` AS `std_year`,
//     `infoa`.`std_course` AS `std_course`,
//     `infoa`.`std_branch` AS `std_branch`,
//     `infoa`.`std_passed_credit` AS `std_passed_credit`,
//     `infoa`.`std_house_particulars_address` AS `std_house_particulars_address`,
//     `infoa`.`std_now_address` AS `std_now_address`,
//     `infoa`.`std_tel` AS `std_tel`,
//     `infoa`.`std_mobile_tel` AS `std_mobile_tel`,
//     `infoa`.`std_email` AS `std_email`,
//     `infoa`.`std_parent_first_name` AS `std_parent_first_name`,
//     `infoa`.`std_parent_last_name` AS `std_parent_last_name`,
//     `infoa`.`std_parent_relation` AS `std_parent_relation`,
//     `infoa`.`std_parent_address` AS `std_parent_address`,
//     `infoa`.`std_parent_email` AS `std_parent_email`,
//     `infoa`.`std_parent_tel` AS `std_parent_tel`,
//     `infoa`.`std_first_name_en` AS `std_first_name_en`,
//     `infoa`.`std_last_name_en` AS `std_last_name_en`,
//     `infoa`.`std_parent_mobile` AS `std_parent_mobile`,
//     `infob`.`std_born_place` AS `std_born_place`,
//     `infob`.`std_last_gpa` AS `std_last_gpa`,
//     `infob`.`std_born_date` AS `std_born_date`,
//     `infob`.`std_age` AS `std_age`,
//     `gender`.`gender_name_th` AS `gender_name_th`,
//     `gender`.`gender_name_en` AS `gender_name_en`,
//     `infob`.`std_person_id` AS `std_person_id`,
//     `infob`.`std_nation` AS `std_nation`,
//     `infob`.`std_religion` AS `std_religion`,
//     `infob`.`std_height` AS `std_height`,
//     `infob`.`std_weigh` AS `std_weigh`,
//     `infob`.`std_father_name_th` AS `std_father_name_th`,
//     `infob`.`std_father_name_en` AS `std_father_name_en`,
//     `infob`.`std_mother_name_th` AS `std_mother_name_th`,
//     `infob`.`std_mother_name_en` AS `std_mother_name_en`,
//     `infob`.`std_father_job` AS `std_father_job`,
//     `infob`.`std_mother_job` AS `std_mother_job`,
//     `infob`.`std_father_mobile_tel` AS `std_father_mobile_tel`,
//     `infob`.`std_mother_mobile_tel` AS `std_mother_mobile_tel`,
//     `infob`.`std_hs_study_place` AS `std_hs_study_place`,
//     `infob`.`std_hs_start_year` AS `std_hs_start_year`,
//     `infob`.`std_hs_end_year` AS `std_hs_end_year`,
//     `infob`.`std_hs_gpa` AS `std_hs_gpa`
// FROM
//     (
//         (
//             (
//                 `cems_db`.`std_data` `infoa`
//             JOIN `cems_db`.`std_app_coop` `infob`
//             ON
//                 ((`infob`.`std_data_id` = `infoa`.`id`))
//             )
//         JOIN `cems_db`.`std_status` `status`
//         ON
//             (
//                 (
//                     `infoa`.`std_status_id` = `status`.`id`
//                 )
//             )
//         )
//     JOIN `cems_db`.`gender_data` `gender`
//     ON
//         (
//             (
//                 `infob`.`std_gender_id` = `gender`.`id`
//             )
//         )
//     )

@Entity
@Table(name = "all_student_info")
public class StudentAllInfo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "std_acc_id")
    private Integer stdAccId;

    @Column(name = "std_id")
    private Integer stdId;

    @Column(name = "std_org_id")
    private Integer stdOrgId;

    @Column(name = "status_name_th")
    private String stdStatusTh;

    @Column(name = "status_name_en")
    private String stdStatusEn;

    @Column(name = "std_th_prefix")
    private String stdPrefixTh;

    @Column(name = "std_en_prefix")
    private String stdPrefixEn;

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

    @Column(name = "std_parent_mobile")
    private String stdParentMobile;

    @Column(name = "std_born_place")
    private String stdBornPlace;

    @Column(name = "std_last_gpa")
    private String std_LastGpa;

    @Column(name = "std_born_date")
    private String stdBornDate;

    @Column(name = "std_age")
    private Integer stdAge;

    @Column(name = "gender_name_th")
    private String genderNameTh;

    @Column(name = "gender_name_en")
    private String genderNameEn;

    @Column(name = "std_person_id")
    private String stdPersonId;

    @Column(name = "std_nation")
    private String stdNation;

    @Column(name = "std_religion")
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
     * @return the stdStatusTh
     */
    public String getStdStatusTh() {
        return stdStatusTh;
    }

    /**
     * @param stdStatusTh the stdStatusTh to set
     */
    public void setStdStatusTh(String stdStatusTh) {
        this.stdStatusTh = stdStatusTh;
    }

    /**
     * @return the stdStatusEn
     */
    public String getStdStatusEn() {
        return stdStatusEn;
    }

    /**
     * @param stdStatusEn the stdStatusEn to set
     */
    public void setStdStatusEn(String stdStatusEn) {
        this.stdStatusEn = stdStatusEn;
    }

    /**
     * @return the stdPrefixTh
     */
    public String getStdPrefixTh() {
        return stdPrefixTh;
    }

    /**
     * @param stdPrefixTh the stdPrefixTh to set
     */
    public void setStdPrefixTh(String stdPrefixTh) {
        this.stdPrefixTh = stdPrefixTh;
    }

    /**
     * @return the stdPrefixEn
     */
    public String getStdPrefixEn() {
        return stdPrefixEn;
    }

    /**
     * @param stdPrefixEn the stdPrefixEn to set
     */
    public void setStdPrefixEn(String stdPrefixEn) {
        this.stdPrefixEn = stdPrefixEn;
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
     * @return the stdParentMobile
     */
    public String getStdParentMobile() {
        return stdParentMobile;
    }

    /**
     * @param stdParentMobile the stdParentMobile to set
     */
    public void setStdParentMobile(String stdParentMobile) {
        this.stdParentMobile = stdParentMobile;
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
     * @return the std_LastGpa
     */
    public String getStd_LastGpa() {
        return std_LastGpa;
    }

    /**
     * @param std_LastGpa the std_LastGpa to set
     */
    public void setStd_LastGpa(String std_LastGpa) {
        this.std_LastGpa = std_LastGpa;
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
     * @return the genderNameTh
     */
    public String getGenderNameTh() {
        return genderNameTh;
    }

    /**
     * @param genderNameTh the genderNameTh to set
     */
    public void setGenderNameTh(String genderNameTh) {
        this.genderNameTh = genderNameTh;
    }

    /**
     * @return the genderNameEn
     */
    public String getGenderNameEn() {
        return genderNameEn;
    }

    /**
     * @param genderNameEn the genderNameEn to set
     */
    public void setGenderNameEn(String genderNameEn) {
        this.genderNameEn = genderNameEn;
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
