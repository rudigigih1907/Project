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
public class PenulisFacade extends AbstractFacade<Penulis> {
    @PersistenceContext(unitName = "PerpustakaanPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PenulisFacade() {
        super(Penulis.class);
    }
    
}
