package ej12;

public class EmpiezaConPrograma {

	public static void main(String[] args) {
		String frase = "Ejemplo de fras3";
		String frase2 = "programa de fras3";
		System.out.println(frase);
		System.out.println(empiezaPorPrograma(frase));
		System.out.println(frase2);
		System.out.println(empiezaPorPrograma(frase2));

	}

	public static boolean empiezaPorPrograma(String f) {
		return f.startsWith("programa");
	}
}
