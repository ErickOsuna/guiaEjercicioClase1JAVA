/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiaejerciciosclase1;

/**
 *
 * @author Siscop
 */
public class Ejercicio2D {
    public static void main (String[] args) {
        /*
        d.- Finalmente, vea si puede resolver el problema utilizando código Java.               
        */
        
        String nombre = "Pepito Pérez"; // Nombre Aleatorio
        double sueldoBasicoMensual = 189248.12; // Monto aleatorio
        boolean poseeVehiculo = true; // Valor aleatorio
        int cantidadVehiculos = 1; // Valor aleatorio
        int antiguedadVehiculosEnAños = 2;
        boolean poseeInmuebles = false; // Valor aleatorio
        int cantidadInmuebles = 0; // Valor aleatorio
        boolean poseeEmbarcacion = false; // Valor aleatorio
        boolean poseeAeronave = false; // Valor aleatorio
        boolean esTitularActivoSocietario = false; // Valor aleatorio  
        
        if (sueldoBasicoMensual >= 489083){
            System.out.println("Usted PERTENECE al Segmento de Ingresos Altos");
            
            
            
        }else if(poseeVehiculo){
            if (cantidadVehiculos >= 3){
                if (antiguedadVehiculosEnAños <= 5){
                    System.out.println("Usted PERTENECE al Segmento de Ingresos Altos");
                }else {
                    System.out.println("Usted NO pertenece al Segmento de Ingresos Altos");
                }
            }else {
                System.out.println("Usted NO pertenece al Segmento de Ingresos Altos");
            }
            
            
            
        }else if(poseeInmuebles){
            if(cantidadInmuebles >=3){
                System.out.println("Usted PERTENECE al Segmento de Ingresos Altos");
            }else{
                System.out.println("Usted NO pertenece al Segmento de Ingresos Altos");
            }
            
            
            
        }else if(poseeEmbarcacion){
            System.out.println("Usted PERTENECE al Segmento de Ingresos Altos");
            
            
            
        }else if(poseeAeronave){
            System.out.println("Usted PERTENECE al Segmento de Ingresos Altos");
            
            
            
        }else if(esTitularActivoSocietario){
            System.out.println("Usted PERTENECE al Segmento de Ingresos Altos");
            
            
            
        }else{
            System.out.println("Usted NO pertenece al Segmento de Ingresos Altos");
        }
        
        
        
    }
}
