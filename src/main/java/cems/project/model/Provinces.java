package cems.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//SELECT pv.id, geo.name ,pv.name_th, pv.name_en FROM data_provinces as pv,data_geographies as geo WHERE pv.geography_id = geo.id ORDER BY geo.name ASC,pv.name_th ASC,pv.name_en ASC

@Entity
@Table(name = "Provinces")
public class Provinces {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String geoName;

    @Column(name = "name_th")
    private String nameTh;

    @Column(name = "name_en")
    private String nameEn;

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
     * @return the geoName
     */
    public String getGeoName() {
        return geoName;
    }

    /**
     * @param geoName the geoName to set
     */
    public void setGeoName(String geoName) {
        this.geoName = geoName;
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

}
