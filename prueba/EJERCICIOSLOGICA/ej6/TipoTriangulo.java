package ej6;

public class TipoTriangulo {

	public static void main(String[] args) {

		System.out.println("El tipo de triangulo pasado por parametro es :");
		System.out.println(decirTipoTriangulo(78f,7f, 7.2f));
	}

	public static String decirTipoTriangulo(float l1, float l2, float l3) { // l de lado
		String tipoTriangulo = "Escaleno";
		if (l1==l2&&l2==l3) {
			tipoTriangulo= "Equilatero";
		}else if (l1==l2||l1==l3||l2==l3) {
			tipoTriangulo = "Isosceles";
		}
		
		return tipoTriangulo; 

	}
}
