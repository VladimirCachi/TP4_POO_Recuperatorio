package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp4.dominio.Inmobiliaria;

public class CollectionInmobiliaria {
	static public List<Inmobiliaria> inmobiliarias = new ArrayList<Inmobiliaria>();
	
	static public void agregarInmobiliaria(Inmobiliaria inmobiliaria) {
		inmobiliarias.add(inmobiliaria);
	}
	
}