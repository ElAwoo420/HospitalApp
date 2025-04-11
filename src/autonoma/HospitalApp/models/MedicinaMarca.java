/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *
 * @author MAYERLLI
 */
public class MedicinaMarca extends Medicina {
    private String fabricante;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

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

    public MedicinaMarca(String fabricante, String nombre, String descripcion, Enfermedad enfermedadAliviada, double costo, double precioVenta) {
        super(nombre, descripcion, enfermedadAliviada, costo, precioVenta);
        this.fabricante = fabricante;
    }

    @Override
    public void calcularPrecioVenta() {
        precioVenta = costo + (costo * 0.25);
    }
}

