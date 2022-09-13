package ar.edu.unlp.info.oo1.OO1_ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		super();
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public Item() {		
	}

	public String getDetalle() {
		return detalle;
	}

	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}

	public int getCantidad() {
		return cantidad;
	}

	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}
	
	public double costo() {
		return (costoUnitario*cantidad);
	}

}
