package Dtos;

import java.time.LocalDate;

public class PedidosDtos {

	
	public long getIdPedido() {
		return idPedido;
	}




	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}




	public String getNombreProducto() {
		return nombreProducto;
	}




	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}




	public int getCantidadProducto() {
		return cantidadProducto;
	}




	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}




	public String getFechaEntrega() {
		return fechaEntrega;
	}




	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}




	public PedidosDtos(long idPedido, String nombreProducto, int cantidadProducto, String fechaEntrega) {
		super();
		this.idPedido = idPedido;
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.fechaEntrega = fechaEntrega;
	}




	long idPedido;
	
	String nombreProducto = "aaaaa";
	
	int cantidadProducto = 11111;
	
	String fechaEntrega;
	

	

	public PedidosDtos() {}
	
	
	
	
	
	
}
