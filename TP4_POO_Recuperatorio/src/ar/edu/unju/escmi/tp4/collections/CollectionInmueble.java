package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp4.dominio.ContratoCompraVenta;
import ar.edu.unju.escmi.tp4.dominio.Inmueble;
import ar.edu.unju.escmi.tp4.dominio.Terreno;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;

public class CollectionInmueble {
	static public List<Inmueble> inmuebles = new ArrayList<Inmueble>();
	
	static public void agregarInmueble(Inmueble inmueble) {
		inmuebles.add(inmueble);
	}
	
	static public void consultarInmueble(int opcion ) {
		if(opcion == 1) {//viviendas
			inmuebles.stream()
			.filter(inmueble -> inmueble instanceof Vivienda && inmueble.getDisponibilidad() == true)
			.forEach(inmueble -> inmueble.mostrarDatos());
		}
		else {//terrenos
			inmuebles.stream()
			.filter(inmueble -> inmueble instanceof Terreno && inmueble.getDisponibilidad() == true)
			.forEach(inmueble -> inmueble.mostrarDatos());
		}
	}
	
	static public void consultarNoDisponibles(int opcion) { //Para cuando se consulten las viviendas alquiladas o vendidas
		if(opcion == 1) { //viviendas
			long contador = inmuebles.stream()
					.filter(inmueble -> inmueble instanceof Vivienda && inmueble.getDisponibilidad() == false)
					.count();
			if(contador > 0) {
				inmuebles.stream()
				.filter(inmueble -> inmueble instanceof Vivienda && inmueble.getDisponibilidad() == false)
				.forEach(inmueble -> inmueble.mostrarDatos());
			}
			else {
				System.out.println("\nNO EXISTEN VIVIENDAS ALQUILADAS");
			}
		}
		else { //terrenos
			long contador = inmuebles.stream()
			.filter(inmueble -> inmueble instanceof Terreno && inmueble.getDisponibilidad() == false)
			.count();
			if(contador > 0) {
				inmuebles.stream()
				.filter(inmueble -> inmueble instanceof Terreno && inmueble.getDisponibilidad() == false)
				.forEach(inmueble -> inmueble.mostrarDatos());
				double montoTotal = CollectionContrato.contratos.stream()
							.filter(contratoTerreno -> contratoTerreno instanceof ContratoCompraVenta)
							.mapToDouble(contratoTerreno -> contratoTerreno.recibirPrecioTotal())
							.sum();
				System.out.println("\nMONTO TOTAL: " + montoTotal);
			}
			else {
				System.out.println("\nNO EXISTEN TERRENOS VENDIDOS");
			}
		}
	}
	
}