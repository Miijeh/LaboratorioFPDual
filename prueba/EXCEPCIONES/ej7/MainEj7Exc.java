package ej7;

public class MainEj7Exc {

	public static void main(String[] args) {
		System.out.println("Empieza");
		try {
			lanzarErrores(1);
		}catch (Errores1 | Errores2 | Errores3 e) {
			System.out.println("Entra en catch");
			e.printStackTrace();
		} 
	}
	public static void lanzarErrores(int numero) throws Errores1,Errores2,Errores3 {
		if (numero==1) {
			throw new Errores1();
		}else if (numero==2) {
			throw new Errores2();
		}else {
			throw new Errores3();
		}
		
	}

}
