package died.guia05.ejercicio02;

public class PedidoBasico extends Pedido {
	private final int CANT_MAX_PRODUCTOS = 5;
	private boolean esExpress;
	
	public PedidoBasico(boolean esExpress) {
		this.esExpress = esExpress;
		this.cantMaxProductos = CANT_MAX_PRODUCTOS;
	}

	@Override
	public double precio() {
		double precio = 0;
		for(Producto unProducto : productos) {
			precio += unProducto.getPrecio() * 1.05;
		}
		return esExpress ? precio * 1.2 : precio;
	}

	@Override
	public double comision() {
		return fechaEntrega != null ? precio() * 0.1 : 0;
	}
}