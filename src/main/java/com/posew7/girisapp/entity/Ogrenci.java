/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posew7.girisapp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yunus
 */
@Entity
@Table(name = "ogrenci")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ogrenci.findAll", query = "SELECT o FROM Ogrenci o")
    , @NamedQuery(name = "Ogrenci.findByNo", query = "SELECT o FROM Ogrenci o WHERE o.no = :no")
    , @NamedQuery(name = "Ogrenci.findByAd", query = "SELECT o FROM Ogrenci o WHERE o.ad = :ad")
    , @NamedQuery(name = "Ogrenci.findBySoyad", query = "SELECT o FROM Ogrenci o WHERE o.soyad = :soyad")
    , @NamedQuery(name = "Ogrenci.findByHarc", query = "SELECT o FROM Ogrenci o WHERE o.harc = :harc")})
public class Ogrenci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "no")
    private Integer no;
    @Size(max = 30)
    @Column(name = "ad")
    private String ad;
    @Size(max = 30)
    @Column(name = "soyad")
    private String soyad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "harc")
    private double harc;

    public Ogrenci() {
    }

    public Ogrenci(Integer no) {
        this.no = no;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public double getHarc() {
        return harc;
    }

    public void setHarc(double harc) {
        this.harc = harc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ogrenci)) {
            return false;
        }
        Ogrenci other = (Ogrenci) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.posew7.girisapp.entity.Ogrenci[ no=" + no + " ]";
    }
    
}
