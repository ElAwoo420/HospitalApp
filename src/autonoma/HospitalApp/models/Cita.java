/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.Date;

/**
 *
 * @author MAYERLLI
 */
public class Cita {

    private Paciente paciente;
    private EmpleadoSalud medico;
    private Date fecha;

    public Cita(Paciente paciente, EmpleadoSalud medico, Date fecha, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.valor = valor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public EmpleadoSalud getMedico() {
        return medico;
    }

    public void setMedico(EmpleadoSalud medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    private double valor;

    public void registrarCita(Paciente paciente, EmpleadoSalud medico, double valor) {
    }

}
