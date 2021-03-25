package ej1;

public class Cliente {

	private String dni;
	private String nombre;
	private int telefono;
	private String email;
	private String direccion;

	public Cliente() {
		super();
	}

	public Cliente(String dni, String nombre, int telefono, String email, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}

	public String mostrarDatos() {
		return "Cliente " + this.nombre + " con Dni " + this.dni + " datos:\nCorreo= " + this.email + "\nTelefono= "
				+ this.telefono + "\nDireccion " + this.direccion;

	}
	
	

	public String getDni() {
		return this.dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
