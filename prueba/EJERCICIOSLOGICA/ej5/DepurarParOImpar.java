package ej5;

import java.util.ArrayList;
import java.util.List;

public class DepurarParOImpar {

	public static void main(String[] args) {
		System.out.println("Dame parametros");
		System.out.println(depurarParametrosPar("Hola","Que tal", "meh", "Daniel"));
		

	}
	
	
	public static List<String> depurarParametrosPar(String... parametros) {
		
		List<String> parametrosDep = new ArrayList<>();
		
		for (String p : parametros) {
			if (p.length()%2==0) {
				parametrosDep.add(p + " Par ");
			}else {
				parametrosDep.add(p + " Impar ");
			}
		}
		
		return parametrosDep;
		
		
		
		
	}
}
