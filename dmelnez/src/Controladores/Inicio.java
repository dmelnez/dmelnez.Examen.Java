package Controladores;

import Servicios.EmpleadosImplementacion;
import Servicios.EmpleadosInterfaz;
import Servicios.GerenciaInterfaz;
import Servicios.GerenciasImplementacion;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz me = new MenuImplementacion();
		
		EmpleadosInterfaz  emp = new EmpleadosImplementacion ();
		
		GerenciaInterfaz ge = new GerenciasImplementacion();
		
		
		
		boolean cerrarAplicacion = false;
		
		
		
		do {
			
			int seleccionMenuPrincipal = me.menuPrincipal();
			
			switch(seleccionMenuPrincipal) {
			
			case 0:
				System.out.println("Se cerrara de la Aplicacion");
				cerrarAplicacion = true;
				break;
				
			case 1:
				System.out.println("Menu Empleado");
				emp.operativasEmpleado();
		
				
				break;
				
			case 2:
				System.out.println("Menu Gerencia");
				ge.operativaGerencias();
		
				break;
			
			default:
				System.out.println("Seleccion no valida");
				break;
				
			}
			
		}
		
		
		while(!cerrarAplicacion);
		
		
	}

}
