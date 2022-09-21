package ar.edu.unlp.info.oo1.OO1_ejercicio5;

import java.util.Date;

public class Mamifero {
	private String id;
	private String especie;
	private Date fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;		
	
	public Mamifero(String id, String especie, Date fechaDeNacimiento, Mamifero padre, Mamifero madre) {
		super();
		this.id = id;
		this.especie = especie;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.padre = padre;
		this.madre = madre;
	}
	
	public Mamifero(String especie) {
		this.especie = especie;
	}
	
	public Mamifero() {
	}
	
	public String getIdentificador() {
		return id;
	}
	public void setIdentificador(String id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (madre != null)
			return madre.getPadre();
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (madre != null)
			return madre.getMadre();
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (padre != null)
			return padre.getPadre();
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (padre != null)
			return padre.getMadre();
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if (this == unMamifero)
			return false;
		else
			return tieneAncestro(unMamifero,false);
	}
	
	public boolean tieneAncestro(Mamifero unMamifero, boolean exito) {
		if (this == unMamifero)
			return (!exito);
		else {
			if (padre != null)
				exito = padre.tieneAncestro(unMamifero, exito);
			if ( (madre != null) && (exito != true) )
				exito = madre.tieneAncestro(unMamifero, exito);
			return exito;
		}
	}
	
}
