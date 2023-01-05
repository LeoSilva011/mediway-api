package br.com.mediway.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.mediway.api.model.Doctor_speciality;
import br.com.mediway.api.repository.Doctor_specialityRepository;

public class Doctor_specialityService {

	
	@Autowired
	private Doctor_specialityRepository doctor_specialityRepository;
	
	
	
	public List<Doctor_speciality> buscarTodosDoctor(){
		return doctor_specialityRepository.findAll();
	}
	
	@Transactional
	public Doctor_speciality salvar(Doctor_speciality doctor_speciality) {
	
		return doctor_specialityRepository.save(doctor_speciality);
	}
}
