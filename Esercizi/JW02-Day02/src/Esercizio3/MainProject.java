package Esercizio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class MainProject {

	static Logger log = LoggerFactory.getLogger(MainProject.class);
	
	
	public static void main(String[] args) {

//		testCollection();
//		testList();
//		testSet();
//		testMap();
//		testQueue();
	}
	
	public static void testCollection() {
		Collection<String> c = new ArrayList<String>();
		
		// Una Collection non memorizza l'ordine in cui sono stati memorizzati i dati
		// Una Collection non può contenere valori primitivi
		// Una Collection non definisce se ci possono essere valori duplicati
		
		c.add("Primo Elemento");
		c.add("Secondo Elemento");
		c.add("Terzo Elemento");
		
		boolean cont = c.contains("Secondo Elemento");
		log.info("Contains 'Secondo Elemento': " + cont);
		
		boolean isEmp = c.isEmpty();
		log.info("Collection isEmpty: " + isEmp);
		
		int size = c.size();
		log.info("Collection size: " + size);
		
		c.forEach(e -> log.info(e));
		
	}
	

	public static void testList() {
		List<String> list = new ArrayList<String>();
		
		list.add("Primo Elemento List");
		list.add("Secondo Elemento List");
		list.add("Terzo Elemento List");
		
		boolean cont = list.contains("Secondo Elemento List");
		log.info("Contains 'Secondo Elemento List': " + cont);
		
		boolean isEmp = list.isEmpty();
		log.info("Collection isEmpty List: " + isEmp);
		
		int size = list.size();
		log.info("Collection size List: " + size);
		
		list.remove("Primo Elemento");
		
	}
	
	public static void testSet() {
		Set<String> set = new HashSet<String>();
		
		set.add("Primo Elemento Set");
		set.add("Secondo Elemento Set");
		set.add("Terzo Elemento Set");
		set.add("Primo Elemento Set");
		
		boolean cont = set.contains("Secondo Elemento Set");
		log.info("Contains 'Secondo Elemento Set': " + cont);
		
		boolean isEmp = set.isEmpty();
		log.info("Collection isEmpty Set: " + isEmp);
		
		int size = set.size();
		log.info("Collection size Set: " + size);
		
		
	}
	
	public static void testMap() {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("A1", "B1");
		map.put("A2", "B2");
		map.put("A3", "B3");
		
		boolean cont = map.containsKey("Secondo Elemento Map");
		log.info("Contains 'Secondo Elemento Set': " + cont);
		
		boolean isEmp = map.isEmpty();
		log.info("Collection isEmpty Map: " + isEmp);
		
		int size = map.size();
		log.info("Collection size Map: " + size);
		
		Set<String> key = map.keySet();
		key.forEach(e -> log.info(e));
	
	}
	
	public static void testQueue() {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Primo Elemento queue");
		queue.add("Secondo Elemento queue");
		queue.add("Terzo Elemento queue");
		
		
		boolean cont = queue.contains("Secondo Elemento List");
		log.info("Contains 'Secondo Elemento List': " + cont);
		
		boolean isEmp = queue.isEmpty();
		log.info("Collection isEmpty List: " + isEmp);
		
		int size = queue.size();
		log.info("Collection size List: " + size);
	}

}
