/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class VehiculoAuto extends Vehiculo {

    private boolean esLujo;// Indica si el auto es de lujo.

    public VehiculoAuto(boolean esLujo, String modelo, double precioBasePorDia) {
        super(modelo, precioBasePorDia);
        this.esLujo = esLujo;
    }

    @Override
    double calcularCostoAlquiler(int dias) {
        
        double costo = getPrecioBasePorDia() + dias;
        if (esLujo) {
            costo += costo * 0.25; // Incremento del 25% si es de lujo

        }
        return costo;
    }

}
