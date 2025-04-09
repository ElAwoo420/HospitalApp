/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *
 * @author MAYERLLI
 */
public class MedicinaGenerica extends Medicina {
    @Override
    public void calcularPrecioVenta() {
        precioVenta = costo + (costo * 0.10);
    }
}
