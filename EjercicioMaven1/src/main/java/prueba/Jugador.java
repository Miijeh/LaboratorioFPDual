package prueba;

import java.lang.annotation.Annotation;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Creacion(version = "1.0", autor = "Dani")
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {

	String nombre;
	int puntuacion;
	Date ultFechaJug;
	

}
