package EJERCICIOSLOGICA1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String devolver = "Hola Daniel";
		System.out.println(devolver);
		System.out.println("Dame un parametro");
		String añadir = scan.nextLine();
		boolean seAñade = true;
		List<Integer> listaNum = null;;
		listaNum.add(0);
		listaNum.add(1);
		listaNum.add(2);
		listaNum.add(3);
		listaNum.add(4);
		listaNum.add(5);
		listaNum.add(6);
		listaNum.add(7);
		listaNum.add(8);
		listaNum.add(9);
		
		for (char c : añadir.toCharArray()) {
			if(listaNum.contains((int) c)) {
			System.out.println("Contiene numero");	
			}
		}
		System.out.println(devolver);

	}
}
