/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noxie
 */
public class Reserva implements Serializable {

    private int idReserva;// ID único de la reserva.
    private String cliente;// Nombre del cliente.
    private List<Vehiculo> vehiculos;// Lista de vehículos reservados.
    private double total;// Costo total de la reserva
    private static int contadorId = 1;

    public Reserva(String cliente, double total) {
        this.cliente = cliente;
        this.total = total;
        this.vehiculos = new ArrayList<>();
        this.idReserva = contadorId++;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);

    }

    public void calcularTotal(int dias) {
        double sumaTotal = 0;
        for (Vehiculo vehiculo : vehiculos) {
            sumaTotal += vehiculo.calcularCostoAlquiler(dias);
        }
        this.total = sumaTotal;
        // Calcula el total sumando los costos de alquiler de los vehículos para los días indicados

    }

    public String mostrarDetalle() {
        String detalle = "nombre del cliente" + cliente + " id del cliente" + idReserva + "total ";
        return detalle;

    }

}
