package ar.edu.unju.escmi.tp4.dominio;

public abstract class Inmueble {
	
	protected int id;
	protected double precio;
	protected boolean disponibilidad;
	
	public Inmueble(int id, double precio, boolean disponibilidad) {
		this.id = id;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public abstract void mostrarDatos();
	
}

