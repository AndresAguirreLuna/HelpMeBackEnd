package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "delitos")
public class Delito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String nombreName;
	@Column(name="descripcion")
	private String descripcionName;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreName() {
		return nombreName;
	}
	public void setNombreName(String nombreName) {
		this.nombreName = nombreName;
	}
	public String getDescripcionName() {
		return descripcionName;
	}
	public void setDescripcionName(String descripcionName) {
		this.descripcionName = descripcionName;
	}
	
}
