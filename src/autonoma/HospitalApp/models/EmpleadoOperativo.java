/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *
 * @author MAYERLLI
 */
public class EmpleadoOperativo extends Empleado {

    private String area;

    public EmpleadoOperativo(String nombre, String documento, int edad, double salarioBase, String area) {
        super(nombre, salarioBase, edad);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * 0.2); // Usa getter del padre
    }
}

