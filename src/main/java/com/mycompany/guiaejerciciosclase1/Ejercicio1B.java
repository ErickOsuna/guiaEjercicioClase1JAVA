/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiaejerciciosclase1;

/**
 *
 * @author Siscop
 */
public class Ejercicio1B {
    public static void main (String [] args){
        /* b.- A lo anterior, solo muestre los números pares */
        
        int numeroInicio = 5;
        int numeroFin = 14;
        
        while (numeroInicio <= numeroFin) {
            
            if ((numeroInicio%2 == 0)) {
                System.out.println(numeroInicio);
            }             
            numeroInicio++;
        }
    }
}
