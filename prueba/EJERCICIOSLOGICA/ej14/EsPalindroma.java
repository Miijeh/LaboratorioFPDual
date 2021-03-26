package ej14;

public class EsPalindroma {

	public static void main(String[] args) {
		String frase = "Hola que tal";
		frase = frase.toLowerCase().replaceAll(" ","");
		System.out.println(frase);
		System.out.println(invertir(frase));
		System.out.println(esPalindroma(frase));
		String frase2 = "Anita lava la tina";
		frase2 = frase2.toLowerCase().replaceAll(" ","");
		System.out.println(frase2);
		System.out.println(invertir(frase2));
		System.out.println(esPalindroma(frase2));

	}

	public static String invertir(String f) {
		String fraseInvertida = "";
		for (int i=f.length();i>0;i--) {
			fraseInvertida += f.charAt(i-1);
		}
		return fraseInvertida;
	}
	
	public static boolean esPalindroma(String f) {
		
		return f.equals(invertir(f));
		
	}
}
