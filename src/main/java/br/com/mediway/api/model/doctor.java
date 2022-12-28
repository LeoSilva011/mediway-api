package br.com.mediway.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class doctor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_doctor;
	private String category;
	private String document;
	
	private Long id_usuario;
	
	
	
}
