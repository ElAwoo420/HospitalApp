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
    protected Enfermedad enfermedadAliviada;
    protected double costo;
    protected double precioVenta;

    public abstract void calcularPrecioVenta();
}
