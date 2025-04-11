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
public class InventarioFarmacia {

    private String codigo;
    private int añoActualizacion;
    private List<Medicina> medicamentos;

    public InventarioFarmacia(String codigo, int añoActualizacion, List<Medicina> medicamentos) {
        this.codigo = codigo;
        this.añoActualizacion = añoActualizacion;
        this.medicamentos = medicamentos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAñoActualizacion() {
        return añoActualizacion;
    }

    public void setAñoActualizacion(int añoActualizacion) {
        this.añoActualizacion = añoActualizacion;
    }

    public List<Medicina> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicina> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void agregarMedicina(Medicina med) {
    }

    public void eliminarMedicina(Medicina med) {
    }

    public Medicina buscarMedicina(String nombre) {
        return null;
    }

}
