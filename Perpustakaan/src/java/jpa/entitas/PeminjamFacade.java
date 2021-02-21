/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entitas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rudigigihprabowo
 */
@Stateless
public class PeminjamFacade extends AbstractFacade<Peminjam> {
    @PersistenceContext(unitName = "PerpustakaanPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeminjamFacade() {
        super(Peminjam.class);
    }
    
}
