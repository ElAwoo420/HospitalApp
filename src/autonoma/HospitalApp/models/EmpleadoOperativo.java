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

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.2);
    }
}

