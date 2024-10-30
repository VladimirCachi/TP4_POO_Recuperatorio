package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp4.dominio.Cliente;

public class CollectionCliente {
	static public List<Cliente> clientes = new ArrayList<Cliente>();

	static public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	static public List<Cliente> obtenerClientes() {
		return clientes;
	}
}
