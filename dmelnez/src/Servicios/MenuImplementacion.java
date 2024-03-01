package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	
	public int menuPrincipal() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[0] -> Cerrar Aplicacion");
		System.out.println("[1] -> Menu Empleado");
		System.out.println("[2] -> Menu Gerencia");
		
		int seleccionMenuPrincipal = sc.nextInt();
		
		return seleccionMenuPrincipal;
		
		
	}
	
	
	public int menuEmpleado () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[0] -> Subir al Menu Principal");
		System.out.println("[1] -> Calculo total de ventas diario");
		System.out.println("[2] -> Añadir Venta");
		
		int seleccionMenuEmpleado = sc.nextInt();
		return seleccionMenuEmpleado;
		
	}
	
	public int menuGerencia() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[0] -> Subir al Menu Principal");
		System.out.println("[1] -> Mostrar Todas las ventas del Dia");
		System.out.println("[2] -> Crear Nuevo Pedido");
		
		int seleccionMenuEmpleado = sc.nextInt();
		return seleccionMenuEmpleado;
		
		
	}
	
	
	
	
	
	
}
