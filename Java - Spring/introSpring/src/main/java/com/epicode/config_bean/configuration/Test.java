package com.epicode.config_bean.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString 
@Getter
@Setter
public class Test {

	private String title;
	private String txt;
	
	public String readTxt() {
		return  "Titolo: " + title + "Testo test: " + txt;
	}
	
}
