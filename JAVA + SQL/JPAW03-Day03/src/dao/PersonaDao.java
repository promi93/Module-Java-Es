package dao;

import javax.persistence.EntityManager;


import model.Persona;
import utils.JpaUtil;

public class PersonaDao implements IPersonaDao {

	public void save(Persona pe) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(pe);
        em.getTransaction().commit();
        System.out.println("EVENTO SALVATO CORRETTAMENTE!!!!!");
    }
}
