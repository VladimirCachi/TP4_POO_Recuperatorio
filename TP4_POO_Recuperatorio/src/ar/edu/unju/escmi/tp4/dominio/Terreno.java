package ar.edu.unju.escmi.tp4.dominio;

public class Terreno extends Inmueble{

	private double latitud;
	private double longitud;
	private double superficie;
	
	public Terreno(int id, double precio, boolean disponibilidad, double latitud, double longitud, double superficie) {
		super(id, precio, disponibilidad);
		this.latitud = latitud;
		this.longitud = longitud;
		this.superficie = superficie;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
        System.out.println("\nID: " + id);
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Latitud: " + latitud);
        System.out.println("Longitud: " + longitud);
        System.out.println("Superficie: " + superficie);
        System.out.println("Precio de Venta: " + precio);

      
    }

}
