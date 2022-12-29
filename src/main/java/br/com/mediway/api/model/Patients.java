package br.com.mediway.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Patients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_patients;
	
	private String bloadType;
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	
	@ManyToMany
	@JoinTable(name = "patients_vaccine",
	 joinColumns = @JoinColumn(name = "id_patients"),
     inverseJoinColumns = @JoinColumn(name = "id_vaccine")
 )
	private List<Vaccine> vaccines;
	
	
	

	public List<Vaccine> getVaccines() {
		return vaccines;
	}

	public void setVaccines(List<Vaccine> vaccines) {
		this.vaccines = vaccines;
	}

	public Long getId_patients() {
		return id_patients;
	}

	public String getBloadType() {
		return bloadType;
	}

	public void setBloadType(String bloadType) {
		this.bloadType = bloadType;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	

}
