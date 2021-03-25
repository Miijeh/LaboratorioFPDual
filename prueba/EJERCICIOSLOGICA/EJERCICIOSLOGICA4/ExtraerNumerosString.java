package EJERCICIOSLOGICA4;

public class ExtraerNumerosString {

	public static void main(String[] args) {

		String frase = "Hola7 qu5e 2 t1a789";
		System.out.println(extraerNum(frase));

	}

	public static String extraerNum(String f) {
		String devolver = "";
		for (int i = 0; i < f.length(); i++) {
			if (f.charAt(i) == '1' || f.charAt(i) == '2' || f.charAt(i) == '3' || f.charAt(i) == '4'
					|| f.charAt(i) == '5' || f.charAt(i) == '6' || f.charAt(i) == '7' || f.charAt(i) == '8'
					|| f.charAt(i) == '9' || f.charAt(i) == '0') {
				devolver += f.charAt(i);
			}
		}
		return devolver;

	}
}
