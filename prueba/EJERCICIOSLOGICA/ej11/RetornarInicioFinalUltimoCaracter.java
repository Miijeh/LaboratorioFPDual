package ej11;

public class RetornarInicioFinalUltimoCaracter {

	public static void main(String[] args) {
		String frase = "Ejemplo de fras3";
		
		System.out.println(frase);
		System.out.println(ultimoCaracterExtremos(frase));

	}
	
	public static String ultimoCaracterExtremos(String frase) {
		
		frase = frase.substring(frase.length()-1) + frase +frase.substring(frase.length()-1) ;
		return frase;
		
	}
}
