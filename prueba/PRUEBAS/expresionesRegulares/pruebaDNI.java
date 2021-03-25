package expresionesRegulares;

public class pruebaDNI {
	private String dni;

	public pruebaDNI(String dni) {
		super();
		if(validarDNI(dni)) {
		this.dni = dni;
		}else {
			System.out.println("DNI con formato incorrecto");
		}
	}
	
	@Override
	public String toString() {
		return "pruebaDNI [dni=" + dni + "]";
	}

	public static boolean validarDNI(String dni) {
		return dni.matches("[0-9]{8}-[A-Z]");
	}
}
