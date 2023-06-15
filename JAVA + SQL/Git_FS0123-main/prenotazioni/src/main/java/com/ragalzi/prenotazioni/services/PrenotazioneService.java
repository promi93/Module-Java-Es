package com.ragalzi.prenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragalzi.prenotazioni.models.Postazione;
import com.ragalzi.prenotazioni.models.Prenotazione;
import com.ragalzi.prenotazioni.models.PrenotazioneDTO;
import com.ragalzi.prenotazioni.repository.PrenotazioneRepository;

import jakarta.persistence.EntityExistsException;


@Service
public class PrenotazioneService {

	@Autowired PrenotazioneRepository prenotazioneDAO;

	
	public Prenotazione savePrenotazione(PrenotazioneDTO p) {
		
		//return prenotazioneDAO.save(p);
		return null;
	}
	
	
	public Prenotazione updatePrenotazione(Long id,Prenotazione p) {
		if(!prenotazioneDAO.existsById(id)) {
			throw new EntityExistsException("Edificio non presente");
		}
		return prenotazioneDAO.save(p);
	}
	
	
	public String deletePrenotazione(Long id) {
		if(!prenotazioneDAO.existsById(id)) {
			throw new EntityExistsException("Edificio non presente");
		}
		prenotazioneDAO.deleteById(id);
		 return "Edifico cancellato";
	}
	
	
	public Prenotazione getById(Long id) {
		if(!prenotazioneDAO.existsById(id)) {
			throw new EntityExistsException("Edificio non presente");
		}
		return prenotazioneDAO.findById(id).get();
	}
	
	
	public List<Prenotazione> getAllPrenotazione(){
		return prenotazioneDAO.findAll();
		}
}
