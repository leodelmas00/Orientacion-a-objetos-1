package ar.edu.unlp.info.oo1.OO1_ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendido;
	private List<Farola> farolasVecinas;
	
	public Farola () {
		encendido = false;
		farolasVecinas = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		farolasVecinas.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	
	public List<Farola> getNeighbors() {
		return farolasVecinas;
	}
	
	public void turnOn() {
		if (!encendido) {
			encendido = !encendido;
			for (int i=0;i<farolasVecinas.size();i++)
				farolasVecinas.get(i).turnOn();;
		}
	}
	
	public void turnOff() {
		if (encendido) {
			encendido = !encendido;
			for (int i=0;i<farolasVecinas.size();i++)
				farolasVecinas.get(i).turnOff();;
		}
	}
	
	public boolean isOn() {
		return encendido;
	}
}
