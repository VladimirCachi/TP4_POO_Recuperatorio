package ar.edu.unju.escmi.tp4.collections;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp4.dominio.Contrato;

public class CollectionContrato {
	static public List<Contrato> contratos = new ArrayList<Contrato>();
	
	static public void agregarContrato(Contrato contrato) {
		contratos.add(contrato);
	}
	
}
