package died.guia05.ejercicio02;

public class Producto {
	private String descripcion;
	private double precio;
	
	public Producto(String descripcion, double precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}
}