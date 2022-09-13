package ar.edu.unlp.info.oo1.OO1_ejercicio3b;

public class Producto {
	double peso;
	double precioPorKilo;
	String descripcion;
	
	public Producto(double peso, double precioPorKilo, String descripcion) {
		super();
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	
	public Producto() {
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return (precioPorKilo*peso);
	}
	
}
