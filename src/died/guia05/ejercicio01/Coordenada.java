package died.guia05.ejercicio01;

import java.util.Objects;

public class Coordenada {
	private final double RADIO_TIERRA_KM = 6378.137;
	private final double UN_METRO_EN_GRADOS = (1 / ((2 * Math.PI / 360) * RADIO_TIERRA_KM)) / 1000;
	
	private double latitud, longitud;
	
	public Coordenada() {
		this(0,0);
	}
	
	public Coordenada(double latitud, double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public double getLatitud() {
		return latitud;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public void sumarMts(int mtsLt, int mtsLn) {
		double latitudOriginal = latitud;
		latitud = latitud + (mtsLt * UN_METRO_EN_GRADOS);
		longitud = longitud + (mtsLn * UN_METRO_EN_GRADOS) / Math.cos(latitudOriginal * (Math.PI/180));
	}

	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		return Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}

	@Override
	public String toString() {
		return "Coordenada [latitud=" + latitud + ", longitud=" + longitud + "]";
	}
}