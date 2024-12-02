/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.function.Function;

/**
 *
 * @author Noxie
 */
public class Main {
        public static void main(String[] args) {
             // Definir una Function que toma un String y devuelve un Integer
        Function<String, Integer> longitud = palabra -> palabra.length();

        // Usar la Function
        String palabra = "Hola";
        int resultado = longitud.apply(palabra); // Aplica la función
        System.out.println("La longitud de '" + palabra + "' es: " + resultado);
        }

    
}
