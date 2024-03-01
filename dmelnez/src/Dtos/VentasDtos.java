package Dtos;

import java.time.LocalDate;

public class VentasDtos {

	int idVenta;
	
	long importeVenta = 11111;
	
	LocalDate intanteVenta = LocalDate.now(); 
	
	
	
	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public long getImporteVenta() {
		return importeVenta;
	}

	public void setImporteVenta(long importeVenta) {
		this.importeVenta = importeVenta;
	}

	public LocalDate getIntanteVenta() {
		return intanteVenta;
	}

	public void setIntanteVenta(LocalDate intanteVenta) {
		this.intanteVenta = intanteVenta;
	}

	public VentasDtos(int idVenta, long importeVenta) {
		super();
		this.idVenta = idVenta;
		this.importeVenta = importeVenta;

	}

	public VentasDtos() {}
	

	
	}
