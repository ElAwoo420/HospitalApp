/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.List;

/**
 *
 * @author MAYERLLI
 */
public class Paciente {
      private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private String telefono;
    private String estado;
    private List<Enfermedad> enfermedades;
    private List<Medicina> medicinas;

    public void curarEnfermedad(Enfermedad enfermedad, Medicina medicina) {}
    public void actualizarEstado() {}
    
}
