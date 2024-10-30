package ar.edu.unju.escmi.tp4.dominio;

public class Cliente {
	private String nombre;
	private String apellido;
	private long dni;
	private String telefono;
	private String direccion;
	private String email;
	
	public Cliente(String nombre, String apellido, long dni, String telefono, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public long getDni() {
		return dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEmail() {
		return email;
	}
	
	
}