package ej8;

public class MainEj8Exc {

	public static void main(String[] args) {
		int[] tabla = {2,3,4};
		try {
		for (int i = 0;i<4;i++) {
			System.out.println(tabla[i]);
		}
		}catch (IndexOutOfBoundsException in) {
			System.out.println("Se ha superado el indice");
		}

	}

}
