package br.com.mediway.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.mediway.api.model.Doctor_speciality;
import br.com.mediway.api.repository.Doctor_specialityRepository;
import br.com.mediway.api.service.Doctor_specialityService;

public class Doctor_specialityController {

	@Autowired
	private Doctor_specialityRepository doctor_specialityRepository;
	
	@Autowired
	private Doctor_specialityService doctor_specialityService;
	
	@GetMapping
	public List<Doctor_speciality> listar () {
		return doctor_specialityRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)	
	public Doctor_speciality adicionar (@Valid @RequestBody Doctor_speciality doctor_speciality) {
		return doctor_specialityService.salvar(doctor_speciality);
	}
}
