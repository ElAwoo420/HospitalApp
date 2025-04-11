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

    public EmpleadoSalud(String nombre, String documento, int edad) {
        super(nombre, documento, edad);
        this.salarioBase = salarioBase;
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        // Ejemplo simple de cálculo de salario
        return salarioBase + (horasTrabajadas * 20000); // 20,000 por hora adicional
    }
}
