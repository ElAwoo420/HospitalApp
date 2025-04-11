/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *
 * @author MAYERLLI
 */
public abstract class Medicina {

    protected String nombre;
    protected String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Enfermedad getEnfermedadAliviada() {
        return enfermedadAliviada;
    }

    public void setEnfermedadAliviada(Enfermedad enfermedadAliviada) {
        this.enfermedadAliviada = enfermedadAliviada;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Medicina(String nombre, String descripcion, Enfermedad enfermedadAliviada, double costo, double precioVenta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadAliviada = enfermedadAliviada;
        this.costo = costo;
        this.precioVenta = precioVenta;
    }
    protected Enfermedad enfermedadAliviada;
    protected double costo;
    protected double precioVenta;

    public abstract void calcularPrecioVenta();
}
