package ej1;

import ej2.Empleado;
import ej2.Programador;

public class Main {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Maria Garcia", "Informatica", 24, false, 780);
		Empleado e2 = new Empleado("Antonio Jimenez", "Informatico", 38, true, 780);
		Empleado e3 = new Programador("Daniel Mijens", "Informatico", 20, false, 780,200,"Java");
		
		System.out.println(e3.mostrarDatos());
		System.out.println(e3.clasificarPorEdad());
		e3.aumentarSalario(5);
		System.out.println(e3.mostrarDatos());
	
	}

}
