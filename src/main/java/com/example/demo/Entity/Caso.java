package com.example.demo.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "casos")
public class Caso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="fecha")
	private Date fecha;
	@Column(name="latitud")
	private Float latitud;
	@Column(name="longitud")
	private Float  longitud;
	@Column(name="estado")
	private Boolean estado;
	@Column(name="detalle")
	private String detalle;
	@Column(name="urlmap")
	private String urlmap;
	@Column(name="idusuario")
	private Long idusuario;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getfecha() {
		return fecha;
	}
	public void setfecha(Date fecha) {
		this.fecha = fecha;
	}
	public Float getLatitud() {
		return latitud;
	}
	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}
	public Float getLongitud() {
		return longitud;
	}
	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getUrlmap() {
		return urlmap;
	}
	public void setUrlmap(String urlmap) {
		this.urlmap = urlmap;
	}
	public Long getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}	
}
