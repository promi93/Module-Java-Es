package Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class starThread extends Thread {

	private Logger log = LoggerFactory.getLogger(starThread.class);
	
	private String message;
	
	public starThread(String message) {
		this.message = message;
	}

	
@Override
public void run() {
	for (int i = 0; i < 10; i++) {
		try {
			log.info("Stampato primo Thread " + message);
			Thread.sleep(1000);
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
	}
}
	

}
