package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;

public class Ticket {
	LocalDate fecha = LocalDate.now();
	int cantProductos;
	double pesoTotal;
	double precioTotal;
	
	public Ticket(int cantProductos, double pesoTotal, double precioTotal) {
		super();
		this.cantProductos = cantProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantProductos;
	}

	public void setCantidadDeProductos(int cantProductos) {
		this.cantProductos = cantProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double impuesto() {
		return (precioTotal * 21) / 100;
	}
	
}
