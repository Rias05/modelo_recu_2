/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Noxie
 */
public interface Repository<T> {

    void add(T entity);// Agrega una entidad.

    Optional<T> findById(int id); //Busca una entidad por ID.

    List<T> findAll();  //Devuelve todas las entidades.

}
