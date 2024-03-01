package Servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.VentasDtos;

public class EmpleadosImplementacion implements EmpleadosInterfaz{

	MenuInterfaz me = new MenuImplementacion();
	
	List<VentasDtos> listaVentas = new ArrayList<>();
	
	
	public void operativasEmpleado() {
	
		
		
		
		boolean cerrarMenu = false;
		
		do {
		
		int seleccionMenuEmpleado = me.menuEmpleado();
		
		
		switch(seleccionMenuEmpleado) {
		
		case 0:
			System.out.println("Se Subira al Menu Princpal");
			cerrarMenu = true;
			break;
			
		case 1:
			System.out.println("Calculo total de ventas diario");
			calculoVentasDiario();
			break;
			
		case 2:
			System.out.println("Añadir Venta");
			aniadirVenta();
			break;
			
		default:
			System.out.println("Seleccion no valida");
			break;
		
		}
		
		
	}
	
	
	
	while(!cerrarMenu);
	
	
	}
	
	/*
	 * Metodo de realizar la suma de ventas totales diarias.
	 * @author DMN - 01/03/2024
	 * */

	private void calculoVentasDiario () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una fecha en formato (dd-MM-yyyy)");
		LocalDate fechaDiaVentas = LocalDate.parse(sc.next());
		
		
		
		long sumaVentas = 0;
		long auxVentas = 0;
		
		
		
		for (var ventas : listaVentas) {
			
	
			
			if(ventas.getIntanteVenta().getMonth().equals(fechaDiaVentas.getMonth())){
				
		
					
						
					
					
					
				}
			
			else {}
				
			}			
		}
		
		

				

	
	
	/*
	 * Metodo Encargado de aniadir una Venta al sistema.
	 * @author DMN - 01/03/2024
	 * */

	
	private void aniadirVenta () {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		
		System.out.println("Importe Venta: ");
		long importeVenta = sc.nextLong();
		
		VentasDtos nuevaVenta = new VentasDtos(a,importeVenta );
		
		listaVentas.add(nuevaVenta);
		
		
		listaVentas.size();
		
	
	}

	
	
}
