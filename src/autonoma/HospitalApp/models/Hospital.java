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
public class Hospital {
     private String nombre;
    private String direccion;
    private String telefono;
    private String logo;
    private double presupuesto;
    private double metaVentasAnual;
    private int fechaFundacion;
    private String estado;
    private double latitud;
    private double longitud;
    private Gerente gerente;
    private List<Empleado> empleados;
    private List<Paciente> pacientes;
    private InventarioFarmacia inventarioFarmacia;
    private Reportes reportes;

    public void actualizarInformacion() {}
    public void calcularPresupuesto() {}
    public void registrarPatrocinio(double monto) {}
    public void verificarEstadoHospital() {}
    
}
