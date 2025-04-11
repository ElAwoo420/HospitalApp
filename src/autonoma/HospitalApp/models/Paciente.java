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

    public Paciente(String nombre, String documento, int edad, String correo, String telefono, String estado, List<Enfermedad> enfermedades, List<Medicina> medicinas) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.enfermedades = enfermedades;
        this.medicinas = medicinas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public List<Medicina> getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(List<Medicina> medicinas) {
        this.medicinas = medicinas;
    }
    private List<Medicina> medicinas;

    public void curarEnfermedad(Enfermedad enfermedad, Medicina medicina) {
    }

    public void actualizarEstado() {
    }

}
