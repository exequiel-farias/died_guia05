package died.guia05.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Camino {
	private List<Coordenada> camino = new ArrayList<Coordenada>();
	
	public void agregar(Coordenada x) {
		camino.add(x);
	}
	
	public void agregar(double lat, double lng) {
		agregar(new Coordenada(lat,lng));
	}
	
	public void agregar(int mtsLt, int mtsLn) {
		/* Nota: Aca el enunciado dice de sumar mtsLat y mtsLn para obtener una nueva coordenada pero no dice a partir
         de que punto. Voy a asumir que este metodo opera sobre la ultima coordenada de la lista y si no hay una
         que sea a partir del origen. */
		Coordenada ultimaCoordenada = camino.isEmpty() ? new Coordenada() : camino.get(camino.size()-1);
		Coordenada nuevaCoordenada = new Coordenada(ultimaCoordenada.getLatitud(), ultimaCoordenada.getLongitud());
		nuevaCoordenada.sumarMts(mtsLt, mtsLn);
		agregar(nuevaCoordenada);
	}
	
	public List<Coordenada> buscar(Coordenada no, Coordenada se){
		List<Coordenada> encontrados = new ArrayList<Coordenada>();
		for(Coordenada punto : camino) {
			boolean dentroDeLimiteSuperiorIzquierdo = no.getLatitud() >= punto.getLatitud() && no.getLongitud() <= punto.getLongitud();
			boolean dentroDeLimiteInferiorDerecho = se.getLatitud() <= punto.getLatitud() && se.getLongitud() >= punto.getLongitud();
			if(dentroDeLimiteInferiorDerecho && dentroDeLimiteSuperiorIzquierdo) encontrados.add(punto);
		}
		return encontrados;
	}
	
	public List<Coordenada> buscar(Coordenada punto, int distancia){
		Coordenada no = new Coordenada(punto.getLatitud(), punto.getLongitud());
		Coordenada se = new Coordenada(punto.getLatitud(), punto.getLongitud());
		no.sumarMts(distancia, -distancia);
		se.sumarMts(-distancia, distancia);
		return buscar(no, se);
	}
	
	public List<Coordenada> getCamino(){
		return camino;
	}
}