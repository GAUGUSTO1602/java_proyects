/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author veronica
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listaArray list = new listaArray(10);

        list.addAtTheStar("Andres");
        list.addAtTheStar("Luis");
        list.addAtTheStar("Gabriel");
        System.out.println(list.printList());
    }
    
}
