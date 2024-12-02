/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Noxie
 */
public class GestorAlquileres {

    private Repository<Vehiculo> vehiculoRepository;
    private Repository<Reserva> reservaRepository;

    public GestorAlquileres(Repository<Vehiculo> vehiculoRepository, Repository<Reserva> reservaRepository) {
        this.vehiculoRepository = vehiculoRepository;
        this.reservaRepository = reservaRepository;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {

        vehiculoRepository.add(vehiculo);

    }

    public Optional<Vehiculo> buscarVehiculoPorId(int id) {
        return vehiculoRepository.findById(id);

    }

    public void realizarReserva(Reserva reserva, int dias) {
        boolean validacion = reservaRepository.findAll().stream().anyMatch(r -> r.getIdReserva() == reserva.getIdReserva());

        //Registra una reserva, validando la disponibilidad de los vehículos.
        if (validacion) {
            throw new IllegalArgumentException("El vehículo con ID " + reserva.getIdReserva() + " ya está reservado para esos días.");

        }
        reserva.calcularTotal(dias);

    }

    public double calcularIngresos() {
        double total = reservaRepository.findAll().stream().mapToDouble(r -> r.getTotal()).sum();
        return total;

        //Calcula los ingresos totales usandostream().
    }

    public List<Vehiculo> filtrarVehiculos(Predicate<Vehiculo> criterio) {
        return vehiculoRepository.findAll().stream().filter(criterio).toList();

    }

    public void aplicarDescuento(Function<Vehiculo, Double> descuento) {
        for (Vehiculo vehiculo : vehiculoRepository.findAll()) {
            Double porcentajeDescuento = descuento.apply(vehiculo);

            double nuevoPrecio = vehiculo.getPrecioBasePorDia() * (1 - porcentajeDescuento);
            vehiculo.setPrecioBasePorDia(nuevoPrecio);

            //Aplica un descuento dinámico a los vehículos según una función proporcionada.
        }

    }
}
