/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *
 * @author MAYERLLI
 */
public class MedicinaMarca extends Medicina {
    private String fabricante;

    @Override
    public void calcularPrecioVenta() {
        precioVenta = costo + (costo * 0.25);
    }
}

