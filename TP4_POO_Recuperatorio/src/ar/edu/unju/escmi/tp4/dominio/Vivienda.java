package ar.edu.unju.escmi.tp4.dominio;

public class Vivienda extends Inmueble{

	private String direccion;
	private int cantidadHabitaciones;
	
	
	public Vivienda(int id, double precio, boolean disponibilidad, String direccion, int cantidadHabitaciones) {
		super(id, precio, disponibilidad);
		this.direccion = direccion;
		this.cantidadHabitaciones = cantidadHabitaciones;
	}

	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}

	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		System.out.println("\nID: " + id);
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cantidad de Habitaciones: " + cantidadHabitaciones);
        System.out.println("Precio de Alquiler Diario: " + precio);

	}

}
