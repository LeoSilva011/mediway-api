package br.com.mediway.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mediway.api.model.Doctor;
import br.com.mediway.api.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	
	
	public List<Doctor> buscarTodosDoctor(){
		return doctorRepository.findAll();
	}
	
	@Transactional
	public Doctor salvar(Doctor doctor) {
	
		return doctorRepository.save(doctor);
	}
}
