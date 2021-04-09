package prueba;

import java.lang.annotation.Annotation;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class PruebaCrearJug {

	public static void main(String[] args) {
		Jugador jugador = new Jugador();
		
		Annotation[] anotaciones = jugador.getClass().getAnnotations();
		Creacion creacion = jugador.getClass().getAnnotation(Creacion.class);
		
		for (Annotation anotacion : anotaciones) {
			System.out.println(anotacion.toString());
			System.out.println("Hola");
		}
		
		//System.out.println(creacion.autor() + " -- " + creacion.fechaCreacion() + " -- " + creacion.version());

	}

}
