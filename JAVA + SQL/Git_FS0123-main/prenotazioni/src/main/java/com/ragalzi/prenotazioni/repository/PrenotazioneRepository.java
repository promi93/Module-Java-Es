package com.ragalzi.prenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ragalzi.prenotazioni.models.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

}
