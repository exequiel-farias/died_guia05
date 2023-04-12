package died.guia05.ejercicio02;

import java.util.ArrayList;
import java.util.List;

import died.guia05.ejercicio03.Comisionable;

public class Cadete {
	private List<Comisionable> comisionables = new ArrayList<Comisionable>();
	
	public void agregarComisionable(Comisionable c) {
		comisionables.add(c);
	}
	
	public double comisiones() {
		double comisiones = 0;
		for(Comisionable c : comisionables) {
			comisiones += c.comision();
		}
		return comisiones;
	}
	
	public List<Comisionable> getComisionables(){
		return comisionables;
	}
}