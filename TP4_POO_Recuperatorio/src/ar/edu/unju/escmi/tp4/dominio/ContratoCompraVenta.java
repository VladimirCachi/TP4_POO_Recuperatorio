package ar.edu.unju.escmi.tp4.dominio;

import java.time.LocalDate;
 
public class ContratoCompraVenta extends Contrato {
    private double impuesto;
    private Terreno terreno;

    public ContratoCompraVenta(double impuesto, double precio, LocalDate fechaDeContrato, Cliente cliente, Inmobiliaria inmobiliaria, Terreno terreno) {
        super (precio, fechaDeContrato, cliente, inmobiliaria);
    	this.impuesto = impuesto;
    	this.terreno = terreno;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    public Terreno getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

	@Override
    public double recibirPrecioTotal() {
        return (this.precio + this.impuesto);
    }

	@Override
	public void mostrarDatos() {
		System.out.println("Fecha de Contrato: "+this.fechaDeContrato+"\n");
		System.out.println("Impuestos: "+this.impuesto+"\n");
		System.out.println("Cliente: "+this.cliente.getApellido()+" "+this.cliente.getNombre()+"\n");
		System.out.println("Terreno: \n");
		this.terreno.mostrarDatos();
		System.out.println("Inmobiliaria: "+this.inmobiliaria.getNombre()+"\n");
		System.out.print("Precio Total: "+recibirPrecioTotal()+"\n");
	}
}
