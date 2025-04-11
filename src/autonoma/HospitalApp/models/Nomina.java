/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author MAYERLLI
 */
public class Nomina {

    private String id;
    private Date fecha;
    private double totalPago;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public void generarNomina(List<Empleado> empleados) {
    }

    public Nomina(String id, Date fecha, double totalPago) {
        this.id = id;
        this.fecha = fecha;
        this.totalPago = totalPago;
    }

}
