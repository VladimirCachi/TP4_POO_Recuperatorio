package ar.edu.unju.escmi.tp4.dominio;

import java.time.LocalDate;

public class ContratoAlquiler extends Contrato {
	private long duracion;
	private double gastosDeInmobiliaria;
	private Vivienda vivienda;
	
	public long getDuracion() {
		return duracion;
	}
	
	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}
	
	public double getGastosDeInmobiliaria() {
		return gastosDeInmobiliaria;
	}
	
	public void setGastosDeInmobiliaria(double gastosDeInmobiliaria) {
		this.gastosDeInmobiliaria = gastosDeInmobiliaria;
	}
	
	public Vivienda getVivienda() {
		return vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public ContratoAlquiler(double precio, LocalDate fechaDeContrato, Cliente cliente, Inmobiliaria inmobiliaria, long duracion, double gastosDeInmobiliaria, Vivienda vivienda) {
		super(precio, fechaDeContrato, cliente, inmobiliaria);
		this.duracion=duracion;
		this.gastosDeInmobiliaria=gastosDeInmobiliaria;
		this.vivienda=vivienda;
	}
	
	@Override
	public double recibirPrecioTotal() {
		return (this.gastosDeInmobiliaria + this.precio)*this.duracion;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Fecha de Contrato: "+this.fechaDeContrato+"\n");
		System.out.println("Duracion: "+this.duracion+"\n");
		System.out.println("Gastos de la Inmobiliaria: "+this.gastosDeInmobiliaria+"\n");
		System.out.println("Cliente: "+this.cliente.getApellido()+" "+this.cliente.getNombre()+"\n");
		System.out.println("Vivienda: \n");
		this.vivienda.mostrarDatos();
		System.out.println("Inmobiliaria: "+this.inmobiliaria.getNombre()+"\n");
		System.out.print("Precio Total: "+recibirPrecioTotal()+"\n");
	}
}
