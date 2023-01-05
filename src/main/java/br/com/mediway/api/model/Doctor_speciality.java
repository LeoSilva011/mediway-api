package br.com.mediway.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Doctor_speciality {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_doctor_spciality;
}
