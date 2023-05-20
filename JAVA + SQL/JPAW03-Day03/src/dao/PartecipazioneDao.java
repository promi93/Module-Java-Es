package dao;

import javax.persistence.EntityManager;


import model.Partecipazione;
import utils.JpaUtil;

public class PartecipazioneDao implements IPartecipazioneDao {

	public void save(Partecipazione p) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        System.out.println("EVENTO SALVATO CORRETTAMENTE!!!!!");
    }

}
