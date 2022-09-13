package ar.edu.unlp.info.oo1.OO1_ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
	private ArrayList<Item> items = new ArrayList<Item>();
	private LocalDate date;
	private String cliente;
	
	public Presupuesto(ArrayList<Item> items, LocalDate date, String cliente) {
		super();
		this.items = items;
		this.date = date;
		this.cliente = cliente;
	}
	
	public Presupuesto() {
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		return items.stream().mapToDouble(item -> item.costo()).sum();
	}
	
}
