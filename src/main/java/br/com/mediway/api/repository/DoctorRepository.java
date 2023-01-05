package br.com.mediway.api.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import br.com.mediway.api.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepositoryImplementation<Doctor, Long> {

}
