package br.com.mediway.api.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.mediway.api.model.Doctor;

public class DoctorDto {

	
	
	
	private String category;
	private String document;
	
	public DoctorDto (Doctor doctor) {
		
		this.category = doctor.getCategory();
		this.document = doctor.getDocument();
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}
	
	 
	public static List<DoctorDto> converter(List<Doctor> doctors) {
		return doctors.stream().map(DoctorDto::new).collect(Collectors.toList());
	}
}
