package com.posew7.girisapp.mb;

import com.posew7.girisapp.entity.Ogrenci;
import com.posew7.girisapp.session.OgrenciFacade;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "ogrenciMB")
@RequestScoped
public class OgrenciMB {

    @EJB
    private OgrenciFacade ogrenciFacade;

    private String ad;
    private String soyad;
    private double harc;

    public OgrenciMB() {
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

    public String ekle() {

        try {
            Ogrenci ogr = new Ogrenci();

            ogr.setAd(ad);
            ogr.setSoyad(soyad);
            ogr.setHarc(harc);

            ogrenciFacade.create(ogr);

            return "ogrenciListele.xhtml";
        } catch (Exception e) {
            return "";
        }

    }

}
