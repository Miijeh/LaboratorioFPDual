package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) throws MiError {
		
		String numerador = new Scanner(System.in).next();
		String denominador = new Scanner(System.in).next();
		
		Double result = null;
		
		try {
			result = (Double.valueOf(Integer.valueOf(numerador))/Integer.valueOf(denominador));
			throw new MiError("Mi Error");
		} catch (NumberFormatException n) {
			System.out.println("Ha escrito una letra");
			
		} finally {
			System.out.println(result);
			System.out.println("Terminado");
		}

	}

}
