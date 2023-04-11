package died.guia05.ejercicio01;

public class App {

	public static void main(String[] args) {
		Camino camino = new Camino();
		camino.agregar(new Coordenada());
		camino.agregar(10.3,10.3);
		camino.agregar(100.3, 5.5);
		Coordenada c1 = new Coordenada(-27.3, -2.3);
		camino.agregar(c1);
		camino.agregar(10, 10);

		System.out.println("El camino tiene " + camino.getCamino().size() + " puntos");

		for(Coordenada punto : camino.getCamino()) {
			System.out.println(punto);
		}

		Coordenada no = new Coordenada(11.0, -11.0);
		Coordenada se = new Coordenada(-11.0, 11.0);
		System.out.println("Punto NO: "+no);
		System.out.println("Punto SE: "+se);
		System.out.println("Los puntos NO y SE son iguales?: " + no.equals(se));

		System.out.println("Cuales puntos se encuentran dentro de NO y SE?:");
		for(Coordenada punto : camino.buscar(no, se)) {
			System.out.println(punto);
		}

		Coordenada c2 = new Coordenada(-27.3, -2.3);
		System.out.println("Punto c2: "+c2);
		System.out.println("Partiendo del punto c2 y buscando 50 metros a la redonda estan los puntos:");
		for(Coordenada punto : camino.buscar(c2, 50)) {
			System.out.println(punto);
		}
	}

}