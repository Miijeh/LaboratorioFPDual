package ej6;

public class MainEj6Exc {

	public static void main(String[] args) {
		System.out.println("Empieza");
		try {
		f();
		}catch (Error e) {
			System.out.println("Entra en el catch 1 (main)");
		} catch (Error2 e) {
			System.out.println("Entra en el catch 2 (main)");
			e.printStackTrace();
		}
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
