/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *
 * @author MAYERLLI
 */
public class EmpleadoSalud extends Empleado {
    private String especialidad;
    private int horasTrabajadas;

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.012 * horasTrabajadas);
    }
}
