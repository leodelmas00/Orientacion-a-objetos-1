package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Balanza {
	Ticket ticket;
	int cantDeProductos;
	double precioTotal;
	double pesoTotal;

	public Balanza(int cantDeProductos, double precioTotal, double pesoTotal) {
		super();
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
	public void ponerEnCero() {
		cantDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		cantDeProductos = cantDeProductos + 1;
		precioTotal = precioTotal + producto.getPrecio();
		pesoTotal = pesoTotal + producto.getPeso();
		
	}
	public Ticket emitirTicket() {
		ticket = new Ticket(cantDeProductos,pesoTotal,precioTotal);
		return ticket;
	}
	
}
