package com.ragalzi.prenotazioni.models;

import java.time.LocalDate;

import com.ragalzi.prenotazioni.security.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PrenotazioneDTO {

	private LocalDate dataPrenotazione;
	private String username;
	private Postazione postazione;
}
