package br.com.mediway.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaccine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_vaccine;
	private String vaccine_name;
	private Integer dose;
	
	
	
	
	

	public String getVaccine_name() {
		return vaccine_name;
	}
	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}
	public Integer getDose() {
		return dose;
	}
	public void setDose(Integer dose) {
		this.dose = dose;
	}
	public Long getId_vaccine() {
		return id_vaccine;
	}
	
	
	
	
	
	
}
