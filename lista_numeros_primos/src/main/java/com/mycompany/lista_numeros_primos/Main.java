/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_numeros_primos;

import java.io.IOException;

/**
 *
 * @author veronica
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String result = "";

        int contador = 0;
        int number = 1;

        while(contador < 100) {
            if(esPrimo(number)){
                result += number + ", ";
                contador++;
            }
            number++;
            
        }
        System.out.println("Los primeros 100 números primosn son: " + result);
    }

    private static Boolean esPrimo(Integer number){

        Boolean esUnNumeroPrimo = true;
        if (number == 2){
            esUnNumeroPrimo = false;
        }

        for (int i = 2; i < number; i++){

            if (number % i == 0){
                esUnNumeroPrimo = false;
            }

        }

        return esUnNumeroPrimo;

    }
    
}
