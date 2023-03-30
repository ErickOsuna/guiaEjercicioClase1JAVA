/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiaejerciciosclase1;

/**
 *
 * @author Siscop
 */
public class Ejercicio1C {
    public static void main (String[] args){
        /* c.- A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares */
        
        int numeroInicio = 5;
        int numeroFin = 14;
        boolean elegir = false;
        
        while (numeroInicio <= numeroFin){
            
            if (elegir){
                while(numeroInicio%2==0){
                    System.out.println(numeroInicio);
                    numeroInicio++;
                }
            }else if(!elegir){
                while(numeroInicio%2 != 0){
                    System.out.println(numeroInicio);
                    numeroInicio++;
                }
            }
            numeroInicio++;
        }
        
    }
}
