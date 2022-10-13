/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_grafica;

import javax.swing.JOptionPane;

/**
 *
 * @author veronica
 */
public class Helpers {
    public static int validarNumero(String numString){
        int num;

        try {
            num = Integer.parseInt(numString);
            return num;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, el input no es un numero");

        }

        return 0;
    }
    
}
