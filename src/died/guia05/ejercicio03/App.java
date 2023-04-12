package died.guia05.ejercicio03;

import java.time.LocalDate;
import java.time.LocalDateTime;

import died.guia05.ejercicio02.Cadete;
import died.guia05.ejercicio02.Pedido;
import died.guia05.ejercicio02.PedidoBasico;
import died.guia05.ejercicio02.PedidoPremium;
import died.guia05.ejercicio02.Producto;

public class App {

	public static void main(String[] args) {
		Producto p1 = new Producto("Jabon", 50);
		Producto p2 = new Producto("Shampoo", 50);
		Producto p3 = new Producto("Acondicionador", 50);
		Cadete juan = new Cadete();
		Pedido c1 = new PedidoBasico(false);
		c1.agregarProducto(p1);
		c1.agregarProducto(p2);
		c1.agregarProducto(p3);
		juan.agregarComisionable(c1);
		Pedido c2 = new PedidoBasico(true);
		c2.agregarProducto(p1);
		c2.agregarProducto(p2);
		c2.agregarProducto(p3);
		juan.agregarComisionable(c2);
		Pedido c3 = new PedidoPremium();
		c3.agregarProducto(p1);
		c3.agregarProducto(p2);
		c3.agregarProducto(p3);
		juan.agregarComisionable(c3);
		Pedido c4 = new PedidoPremium();
		c4.agregarProducto(p1);
		c4.agregarProducto(p2);
		c4.agregarProducto(p3);
		c4.agregarProducto(p3);
		c4.agregarProducto(p3);
		c4.agregarProducto(p3);
		juan.agregarComisionable(c4);
		c1.setFechaEntrega(LocalDate.now());
		c3.setFechaEntrega(LocalDate.now());
		Tramite c5 = new Tramite("Retirar encomienda","Rivadavia 1350", LocalDateTime.now());
		juan.agregarComisionable(c5);
		
		int indice = 1;
		for(Comisionable c : juan.getComisionables()) {
			System.out.println("El precio del comisionable "+indice+" es: "+c.precio());
			indice++;
		}
		System.out.println("Lo que va a cobrar el cadete es: "+juan.comisiones());
	}
}