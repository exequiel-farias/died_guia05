package died.guia05.ejercicio03;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tramite implements Comisionable{
	private String descripcion;
	private String domicilio;
	private LocalDateTime turno;
	private LocalDate fechaRealizado;
	
	public Tramite(String descripcion, String domicilio, LocalDateTime turno) {
		super();
		this.descripcion = descripcion;
		this.domicilio = domicilio;
		this.turno = turno;
	}
	
	public void setFechaRealizado(LocalDate fechaRealizado) {
		this.fechaRealizado = fechaRealizado;
	}

	@Override
	public double comision() {
		return 20.0;
	}
	
	@Override
	public double precio() {
		return 50.0;
	}
}