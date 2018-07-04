package com.posew7.girisapp.session;

import com.posew7.girisapp.entity.Ogrenci;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OgrenciFacade extends AbstractFacade<Ogrenci> {

    @PersistenceContext(unitName = "com.posew7_GirisAPP_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OgrenciFacade() {
        super(Ogrenci.class);
    }

}
