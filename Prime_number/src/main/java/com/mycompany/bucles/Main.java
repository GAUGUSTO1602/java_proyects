/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author veronica
 */
public class Main {

    public static void main(String[] args) throws IOException {

    System.out.println("Bienvenido a la calculadora de número primo");    
    System.out.println("Ingrese un número: ");    
    Integer number = cargarNumero();
    Integer pruebaPrimo = 2;

    while (pruebaPrimo < number){
        if (number % pruebaPrimo == 0){ 
        System.out.println("El número " + number + " no es un número primo");
        break;
        }
        pruebaPrimo = pruebaPrimo + 1;
    }
    if (number == pruebaPrimo){
    System.out.println("El número " + number + " es un número primo");
    } 



    
    }

    private static Integer cargarNumero() throws IOException {

        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(capturarTeclado);
        String strNumber = reader.readLine();
        Integer number = Integer.parseInt(strNumber);
        return number;

    }
    
}
