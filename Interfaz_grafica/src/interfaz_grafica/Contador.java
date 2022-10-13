/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_grafica;

/**
 *
 * @author veronica
 */
public class Contador {

    private int numero;

    public Contador(int numero) {
        this.numero = numero;
    }

    public Contador(){
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void sumar(int num) {
        numero += num;
    }

    public void restar(int num) {
        numero -= num;
    }

    public void multiplicar(int num) {
        numero = num * numero;
    }

}
