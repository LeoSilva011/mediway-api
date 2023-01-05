package br.com.mediway.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.mediway.api.controller.dto.DoctorDto;
import br.com.mediway.api.model.Doctor;
import br.com.mediway.api.repository.DoctorRepository;
import br.com.mediway.api.service.DoctorService;

public class DoctorController {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping
	public List<DoctorDto> listar () {
		List<Doctor> doctors = doctorRepository.findAll();
		return DoctorDto.converter(doctors);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)	
	public Doctor adicionar (@Valid @RequestBody Doctor doctor) {
		return doctorService.salvar(doctor);
	}
}
