/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Noxie
 */
public abstract class Vehiculo implements Serializable {

    private static int contadorId = 1;
    private static final long serialVersionUID = 1L; // Identificador de versión


    private int id;
    private String modelo;
    private double precioBasePorDia;

    public Vehiculo(String modelo, double precioBasePorDia) {
        this.id = contadorId++;
        this.modelo = modelo;
        this.precioBasePorDia = precioBasePorDia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public double getPrecioBasePorDia() {
        return precioBasePorDia;
    }

    public void setPrecioBasePorDia(double precioBasePorDia) {
        this.precioBasePorDia = precioBasePorDia;
    }

    abstract double calcularCostoAlquiler(int dias);

    public String mostrarResumen() {
        String resumen = "id del auto:" + id + "modelo del auto: " + modelo + " precio base " + precioBasePorDia;
        return resumen;

    }
//            Devuelve el ID, modelo y precio base.

}
