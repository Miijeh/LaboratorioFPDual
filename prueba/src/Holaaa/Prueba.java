package Holaaa;

public class Prueba {

	public static void main(String[] args) {
		countX("xHola");
	}
	
	public static int countX(String str) {
		  return str.indexOf("x")==-1 ? 0  : 1 + countX(str.substring(str.indexOf("x")));
		}

}
