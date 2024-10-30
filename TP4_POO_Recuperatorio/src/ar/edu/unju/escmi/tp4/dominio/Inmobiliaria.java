package ar.edu.unju.escmi.tp4.dominio;

public class Inmobiliaria {
	private String nombre;
	private String telefono;
	private String direccion;
	
	public Inmobiliaria(String nombre, String telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Inmobiliaria [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}

	public void mostrarDatos() {
        System.out.println(toString());
	}
}
