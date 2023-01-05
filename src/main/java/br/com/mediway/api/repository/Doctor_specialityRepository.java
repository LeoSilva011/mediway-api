package br.com.mediway.api.repository;


import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import br.com.mediway.api.model.Doctor_speciality;
@Repository
public interface Doctor_specialityRepository  extends JpaRepositoryImplementation<Doctor_speciality, Long> {

}
