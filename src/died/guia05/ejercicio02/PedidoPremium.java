package died.guia05.ejercicio02;

public class PedidoPremium extends Pedido {
	private final int CANT_MAX_PRODUCTOS = 20;
	
	public PedidoPremium() {
		this.cantMaxProductos = CANT_MAX_PRODUCTOS;
	}

	@Override
	public double precio() {
		double precio = 0;
		for(Producto unProducto : productos) {
			precio += productos.size() > 5 ? unProducto.getPrecio() * 1.3 : unProducto.getPrecio() * 1.2;
		}
		return precio;
	}

	@Override
	public double comision() {
		double comision = (productos.size() > 10) ? precio()*0.15+50 : precio()*0.15;
		return fechaEntrega != null ? comision : 0;
	}
}