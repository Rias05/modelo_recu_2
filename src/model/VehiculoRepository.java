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
public class VehiculoRepository implements Repository<Vehiculo>{
      private final  String ruta;
    private  GestorPersistencia <Vehiculo> persistencia;
    private  List<Vehiculo> vehiculos;

    public VehiculoRepository(String ruta) {
        this.ruta = ruta;
        this.vehiculos = new ArrayList <>();
    }

    @Override
    public void add(Vehiculo entity) {
        vehiculos.add(entity);
        persistencia.guardar(vehiculos);
    }

    @Override
    public Optional<Vehiculo> findById(int id) {
      return vehiculos.stream().filter(r->r.getId()== id).findFirst();

    }

    @Override
    public List<Vehiculo> findAll() {
        return vehiculos;
    }
    
    
    
    
}
