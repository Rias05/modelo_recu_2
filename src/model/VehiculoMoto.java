/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class VehiculoMoto extends Vehiculo {
    private int cilindrada ;

    public VehiculoMoto(int cilindrada, String modelo, double precioBasePorDia) {
        super(modelo, precioBasePorDia);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    double calcularCostoAlquiler(int dias) {
        double costo  = getPrecioBasePorDia() * dias;
        //  Incrementa un 15%si la cilindrada es mayor a 500 cc.
        if (cilindrada> 500){
            costo = costo * 0.15;
            
        }
        return costo;
    }
    

   
    
}
