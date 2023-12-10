package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "casosdelitos")
public class CasoDelito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="idcaso")
	private Long idcaso;
	
	@Column(name="iddelito")
	private Long iddelito;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdcaso() {
		return idcaso;
	}

	public void setIdcaso(Long idcaso) {
		this.idcaso = idcaso;
	}

	public Long getIddelito() {
		return iddelito;
	}

	public void setIddelito(Long iddelito) {
		this.iddelito = iddelito;
	}

}
