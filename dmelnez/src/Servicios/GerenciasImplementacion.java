package Servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.PedidosDtos;
import Dtos.VentasDtos;

public class GerenciasImplementacion implements GerenciaInterfaz{

	List<VentasDtos> listaVentas = new ArrayList<>();
	
	List<PedidosDtos> listaPedidos = new ArrayList<>();
	
	MenuInterfaz me = new MenuImplementacion();
	
	
	
	
	public void operativaGerencias() {
	
		
		
		
		boolean cerrarMenu = false;
		
		do {
		
		int seleccionMenuEmpleado = me.menuGerencia();
		
		
		switch(seleccionMenuEmpleado) {
		
		case 0:
			System.out.println("Se Subira al Menu Princpal");
			cerrarMenu = true;
			break;
			
		case 1:
			System.out.println("Mostrar todas las ventas del dia");
			mostrarVentasDia();
			break;
			
		case 2:
			System.out.println("Crear Nuevo pedido para Proveedores");
			pedidosProveedores();
						
			break;
			
		default:
			System.out.println("Seleccion no valida");
			break;
		
		}
		
		
	}
		
		while(!cerrarMenu);
	
	
	}
	
	
	
	private void mostrarVentasDia() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduzca una fecha en formato (dd-MM-yyyy)");
		LocalDate fechaDiaVentas = LocalDate.parse(sc.next());
		
		for(var ventas : listaVentas) {
							
				System.out.println("Venta número: " + ventas.getIdVenta());
				System.out.println("Euros: " + ventas.getImporteVenta());
				System.out.println("Instante de compra: " + ventas.getIntanteVenta());
		
		}
		
				
	}
	

	
	private void pedidosProveedores() {
		
		boolean cerrarApli = false;
		
		do {
		
		long id = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del Producto: ");
		String nombreProducto = sc.next();
		System.out.println("Cantidad del Producto: ");
		int cantidadProducto = sc.nextInt();
		System.out.println("Fecha Desada de Entrega (dd-MM-yyyy)");
		String fechaEstimadaEntrega = sc.next();
		


		PedidosDtos nuevoPedido = new PedidosDtos(id, nombreProducto,cantidadProducto,fechaEstimadaEntrega);
		
		listaPedidos.add(nuevoPedido);
		
		System.out.println("¿Desea No anidir mas Productos? SI/NO");
		System.out.println("[1] -> SI");
		System.out.println("[2] -> NO");
		int aniadir = sc.nextInt();
		
		if (aniadir == 1) {
			cerrarApli = true;
			
			for(PedidosDtos pedidos: listaPedidos) {
				
				
				System.out.println("Producto: " + pedidos.getNombreProducto());
				System.out.println("Cantidad: " + pedidos.getCantidadProducto() + "Unidades");
				System.out.println("Fecha Entrega: " + pedidos.getFechaEntrega());
				
			}
			
			
		}
		

		else {
			break;
		}
		
		}
		
		
		while(!cerrarApli);
			
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	

