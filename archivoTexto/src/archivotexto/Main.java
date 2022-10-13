/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivotexto;

import java.io.IOException;

/**
 *
 * @author veronica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        funciones func = new funciones();
        listaSimple clientes = new listaSimple();
        clientes.agregarAlFinal("Andrea", 27475439);
        clientes.agregarAlFinal("Miguel", 28356743);
        clientes.agregarAlFinal("Juan", 26543875);
        clientes.agregarAlFinal("Maria", 29057463);
        clientes.agregarAlFinal("Luis", 30744394);
        func.escribirTxt(clientes);

        listaSimple clientes2 = func.leerTxt();
        clientes2.imprimir();
    }
    
}
