package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_districts")
public class Districts {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "amphure_id")
    private Integer amphureId;

    @Column(name = "name_th")
    private String nameTh;

    @Column(name = "name_en")
    private String nameEn;

    @Column(name = "zip_code")
    private String zipcode;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the amphureId
     */
    public Integer getAmphureId() {
        return amphureId;
    }

    /**
     * @param amphureId the amphureId to set
     */
    public void setAmphureId(Integer amphureId) {
        this.amphureId = amphureId;
    }

    /**
     * @return the nameTh
     */
    public String getNameTh() {
        return nameTh;
    }

    /**
     * @param nameTh the nameTh to set
     */
    public void setNameTh(String nameTh) {
        this.nameTh = nameTh;
    }

    /**
     * @return the nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * @param nameEn the nameEn to set
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
