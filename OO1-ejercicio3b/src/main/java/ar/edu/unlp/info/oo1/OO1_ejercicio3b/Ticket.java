package ar.edu.unlp.info.oo1.OO1_ejercicio3b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	LocalDate fecha = LocalDate.now();
	int cantProductos;
	private ArrayList<Producto> productos;
	double pesoTotal;
	double precioTotal;
	
	public Ticket(int cantProductos, ArrayList<Producto> productos, double pesoTotal, double precioTotal) {
		super();
		this.cantProductos = cantProductos;
		this.productos = productos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}
	
	public Ticket() {
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public ArrayList getProductos() {
		return productos;
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
