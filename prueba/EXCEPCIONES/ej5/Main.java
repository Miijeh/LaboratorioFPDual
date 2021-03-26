package ej5;

public class Main {

	public static void main(String[] args) {
		System.out.println("Empieza");
		try {
		g();
		}catch (Error e) {
			System.out.println("Entra en el catch 1 (main)");
			throw new RuntimeException();		}
	}

	public static void g() throws Error {
		System.out.println("Entra en g()");
		throw new Error();
	}
	
	public static void f() throws Error, Error2 {
		try {
			g();
		}catch (Error e) {
			System.out.println("Entra en el catch f()");
			throw new Error2();
		}
	}
}
