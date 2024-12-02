/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noxie
 */
public class GestorPersistencia <T>{
    private final  String archivo;

    public GestorPersistencia(String archivo) {
        this.archivo = archivo;
    }
    public  void guardar(List<T> lista){
        // serializacion guarda el objecto en un archivo mediante el try
           try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (archivo)) ){
               oos.writeObject(lista);
               System.out.println("objecto serializado"+ lista);
               
               
               
           }
           catch(IOException e){
               System.out.println("error en la serializacion " + e.getMessage());
               
           }
           // deserializacion: leer el objecto desde ela rchivo
        
      
        }
    
    public List<T> cargar(){
          try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream (archivo)) ){
              //Libro personaDeserializada = (Libro) ois.readObject();
               //System.out.println("objecto DEserializado"+ libros);
               List<T> listaDeserializados = (List<T>) ois.readObject();               
                return listaDeserializados;
           }
          catch(FileNotFoundException e ){
              System.out.println("el archchivo no se encontro" + e.getMessage());
                 return new ArrayList<>();
          }
           catch(IOException |ClassNotFoundException  e){
                System.out.println("Error al cargar los datos" + e.getMessage());
            return new ArrayList<>(); // También devuelve una lista vacía si ocurre otra excepción

           }
          
         
        
    }
    
}
