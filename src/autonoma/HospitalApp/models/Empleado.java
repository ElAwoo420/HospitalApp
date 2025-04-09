/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *
 * @author MAYERLLI
 */
public abstract class Empleado {
    protected String nombre;
    protected String documento;
    protected int edad;
    protected double salarioBase;

    public abstract double calcularSalario();
}