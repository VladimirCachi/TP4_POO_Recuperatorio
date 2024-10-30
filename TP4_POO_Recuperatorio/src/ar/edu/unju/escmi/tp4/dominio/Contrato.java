package ar.edu.unju.escmi.tp4.dominio;
import java.time.LocalDate;

public abstract class Contrato {
    protected double precio;
    protected LocalDate fechaDeContrato;
    protected Cliente cliente;
    protected Inmobiliaria inmobiliaria;

    public Contrato(double precio, LocalDate fechaDeContrato, Cliente cliente, Inmobiliaria inmobiliaria) {
        this.precio = precio;
        this.fechaDeContrato = fechaDeContrato;
        this.cliente = cliente;
        this.inmobiliaria = inmobiliaria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaDeContrato() {
        return fechaDeContrato;
    }

    public void setFechaDeContrato(LocalDate fechaDeContrato) {
        this.fechaDeContrato = fechaDeContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Inmobiliaria getInmobiliaria() {
        return inmobiliaria;
    }

    public void setInmobiliaria(Inmobiliaria inmobiliaria) {
        this.inmobiliaria = inmobiliaria;
    }

    public abstract double recibirPrecioTotal();
    public abstract void mostrarDatos();
}