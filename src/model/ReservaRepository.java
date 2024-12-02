/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Noxie
 */
public class ReservaRepository implements Repository<Reserva> {
    private String ruta;
    private  GestorPersistencia <Reserva> persistencia;
    private  List<Reserva> reservas;

    public ReservaRepository(String ruta) {
        this.ruta = ruta;
        this.reservas = new ArrayList <> ();
    }
    

    @Override
    public void add(Reserva entity) {
        reservas.add(entity);
        persistencia.guardar(reservas);
        
        
    }

    public GestorPersistencia<Reserva> getPersistencia() {
        return persistencia;
    }

    public void setPersistencia(GestorPersistencia<Reserva> persistencia) {
        this.persistencia = persistencia;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public Optional<Reserva> findById(int id) {
       return reservas.stream().filter(r->r.getIdReserva()== id).findFirst();

    }

    @Override
    public List<Reserva> findAll() {
        return reservas;
    }
    
    
}
