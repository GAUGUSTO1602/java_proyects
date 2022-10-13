/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author veronica
 */
public class Main {
    
    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese el primer número: ");
        Integer firstNumber = cargarNumero();
        System.out.println("");

        System.out.println("Ingrese el segundo número: ");
        Integer secondNumber = cargarNumero();
        System.out.println("");

        System.out.println("Ingrese el tercer número: ");
        Integer thirdNumber = cargarNumero();
        System.out.println("");

        calcularNumeroMayor(firstNumber,secondNumber, thirdNumber);
        calcularNumeroMenor(firstNumber,secondNumber, thirdNumber);
        calcularPromedio(firstNumber,secondNumber, thirdNumber);
        identificarParImpar(firstNumber,secondNumber, thirdNumber);

    }

    private static Integer cargarNumero() throws IOException {

        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(capturarTeclado);
        String strNumber = reader.readLine();
        Integer number = Integer.parseInt(strNumber);
        return number;

    }

    private static void calcularNumeroMayor(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

        Integer mayor = firstNumber;

        if (secondNumber > mayor) {
            mayor = secondNumber;
        }
        if (thirdNumber > mayor) {
            mayor = thirdNumber;
        }
        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("");
        

    }

    private static void calcularNumeroMenor(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

        
        Integer menor = firstNumber;

        if (secondNumber < menor) {
            menor = secondNumber;
        }
        if (thirdNumber < menor) {
            menor = thirdNumber;
        }

        System.out.println("El número menor es: " + menor);
        System.out.println("");

    }  

        private static void calcularPromedio(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

        
            Integer sumatoria = firstNumber + secondNumber + thirdNumber;
            Double numeroPromedio = Double.valueOf(sumatoria)/3;

            System.out.println("El promedio es: " + numeroPromedio);
            System.out.println("");

    }

        private static void identificarParImpar(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

            if (firstNumber%2 == 0){
                System.out.println("El númnero " + firstNumber + " es par");

            } else {
                System.out.println("El númnero " + firstNumber + " es impar");

            }
            System.out.println("");

            if (secondNumber%2 == 0){
                System.out.println("El númnero " + secondNumber + " es par");

            } else {
                System.out.println("El númnero " + secondNumber + " es impar");

            }
            System.out.println("");

            if (thirdNumber%2 == 0){
                System.out.println("El númnero " + thirdNumber + " es par");

            } else {
                System.out.println("El númnero " + thirdNumber + " es impar");

            }
            System.out.println("");

    } 

    }


