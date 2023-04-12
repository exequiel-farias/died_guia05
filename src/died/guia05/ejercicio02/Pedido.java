package died.guia05.ejercicio02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import died.guia05.ejercicio03.Comisionable;

public abstract class Pedido implements Comisionable{
	protected List<Producto> productos = new ArrayList<Producto>();
	protected LocalDate fechaEntrega = null;
	protected int cantMaxProductos; 
	
	public final boolean agregarProducto(Producto p) {
		if(productos.size() < cantMaxProductos) {
			productos.add(p);
			return true;
		}
		return false;
	}
	
	public abstract double precio();
	public abstract double comision();
	
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
}