/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit 
this template
 */
package com.mycompany.guiaejerciciosclase1;

/**
 *
 * @author Siscop
 */
public class Ejercicio1A {
    public static void main (String[] args){
        /* 1.- Vamos a practicar operaciones básicas con números */
        /* a.- Utilizando la sentencia while, imprima todos los números entre 2 
        variables "a" y "b". Su código puede arrancar (por ejemplo): 
        int numeroInicio = 5;
        int numeroFin = 14;
        // 5,6,7,8,9,10,11,12,13,14;
        */
        
        int numeroInicio = 5;
        int numeroFin = 14;
      
        while (numeroInicio <= numeroFin) {

            System.out.println(numeroInicio);
            
            numeroInicio++;
        }
    }
}
