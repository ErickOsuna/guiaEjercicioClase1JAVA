/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiaejerciciosclase1;

/**
 *
 * @author Siscop
 */
public class Ejercicio1D {
    public static void main (String[] args) {
        /* d.- Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden. */
        
        int numeroInicio = 5;
        int numeroFin = 14;
        
        while (numeroFin >= numeroInicio){
            
            if(numeroFin%2==0){
                System.out.println(numeroFin);
            }
            
            numeroFin--;
        }
    }
}
