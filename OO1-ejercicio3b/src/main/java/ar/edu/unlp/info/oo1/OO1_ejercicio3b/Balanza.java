package ar.edu.unlp.info.oo1.OO1_ejercicio3b;

import java.util.ArrayList;

public class Balanza {
	ArrayList<Producto> productos = new ArrayList<Producto>();
	Ticket ticket;
	int cantDeProductos;
	double precioTotal;
	double pesoTotal;

	public Balanza(int cantDeProductos, double precioTotal, double pesoTotal) {
		this.cantDeProductos = cantDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
	}
	public Balanza() {
	}
	
	public int getCantidadDeProductos() {
		return cantDeProductos;
	}
	public void setCantidadDeProductos(int cantDeProductos) {
		this.cantDeProductos = cantDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public ArrayList getProductos() {
		return productos;
	}
	
	public void ponerEnCero() {
		productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		pesoTotal = productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
		precioTotal = productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
		ticket = new Ticket(productos.size(),productos,pesoTotal,precioTotal);
		return ticket;
	}
	
}
