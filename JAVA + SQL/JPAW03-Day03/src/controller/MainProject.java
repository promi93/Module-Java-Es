//package controller;
//
//import java.time.LocalDate;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import dao.EventiDao;
//import model.Evento;
//import utils.TipoEvento;
//
//public class MainProject {
//
//	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");
//	static EntityManager em = emf.createEntityManager();
//
//
//	public static void main(String[] args) {
//
//		try {
//		EventiDao evD = new EventiDao(em);
//		Evento ev1 = new Evento("EpicodeLecture", LocalDate.of(2023, 7, 10), TipoEvento.PUBLIC, 50);
//		Evento ev2 = new Evento("EpicodeLecture", LocalDate.of(2023, 7, 10), TipoEvento.PUBLIC, 50);
//		Evento ev3 = new Evento("EpicodeLecture", LocalDate.of(2023, 7, 10), TipoEvento.PUBLIC, 50);
//		Evento ev4 = new Evento("EpicodeGlobal", LocalDate.of(2023, 7, 10), TipoEvento.PUBLIC, 50);
//		Evento ev5 = new Evento("EpicodeGlobal", LocalDate.of(2023, 7, 10), TipoEvento.PRIVATE, 50);
//
//		//inserisciEvento(ev1);
//		Evento evl1 = evD.readEvento(1);
//		evD.saveEvento(evl1);
//		
//		
//		
//		
//		
//
//
//	System.out.println(ev1);
//		
//	inserisciEvento(ev5);
//		
//		
//		
//		
//		}catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			em.close();
//    		emf.close();
//		}
//
//
//	}
//
//	public static void inserisciEvento(Evento e) {
//
//		em.getTransaction().begin();
//		em.persist(e);
//		em.getTransaction().commit();
//
//	}
//
//	public static Evento leggiEvento(Integer id) {
//
//		em.getTransaction().begin();
//		Evento e = em.find(Evento.class, id);
//		em.getTransaction().commit();
//		return e;
//
//	}
//
//	public static void modificaEvento(Evento e) {
//
//		em.getTransaction().begin();
//		em.merge(e);
//		em.getTransaction().commit();
//
//	}
//
//	public static void eliminaEvento(Evento e) {
//
//		em.getTransaction().begin();
//		em.remove(e);
//		em.getTransaction().commit();
//
//	}
//
//
//
//}
