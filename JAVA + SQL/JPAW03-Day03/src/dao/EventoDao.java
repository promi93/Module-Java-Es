package dao;

import model.Evento;
import utils.JpaUtil;

import javax.persistence.EntityManager;



public class EventoDao implements IEventoDao {


	public void save(Evento e) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        System.out.println("EVENTO SALVATO CORRETTAMENTE!!!!!");
    }

	
	
}
