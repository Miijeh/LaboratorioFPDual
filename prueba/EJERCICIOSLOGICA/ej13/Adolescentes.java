package ej13;

public class Adolescentes {

	public static void main(String[] args) {

		int edad = 4;
		int edad2 = 19;
		int edad3 = 45;
		System.out.println(hayAdolescente(edad,edad2,edad3));
	}

	public static boolean hayAdolescente(int e1,int e2,int e3) {
		
		
		return (e1>=13&&e1<=19 ? true : e2>=13&&e2<=19 ? true :e3>=13&&e3<=19 ? true : false);
		
	}
}
