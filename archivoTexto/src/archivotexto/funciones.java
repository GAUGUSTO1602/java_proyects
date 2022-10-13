/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivotexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author veronica
 */
public class funciones {

    public void escribirTxt(listaSimple clientes){
        String clientesActuales = "";
        if (!clientes.estaVacia()){
            nodoCliente temp = clientes.getInicio();
            for (int i = 0; i < clientes.getTamanio(); i++) {
                clientesActuales += temp.getNombre() + "," + temp.getCedula() + "\n";
                temp = temp.getSiguiente();
            }



        }
        try {
            PrintWriter pw = new PrintWriter("test\\clientes.txt");
            pw.print(clientesActuales);
            pw.append("Samuel,27483764");
            pw.append("\n");
            pw.append("Antonio,29837463");
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardaddo exitoso");

        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);

        }
    }

    public listaSimple leerTxt() throws FileNotFoundException, IOException{
        listaSimple clientes = new listaSimple();
        String line;
        String clientesTxt = "";
        String path = "test\\clientes.txt";
        File file = new File(path);
        try {
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine()) != null){
                    if(!line.isEmpty()){
                        clientesTxt += line + "\n";
                    }
                }
                if (!"".equals(clientesTxt)){
                    String[] clientesSplit = clientesTxt.split("\n");
                    for (int i = 0; i < clientesSplit.length; i++) {
                        String[] cliente = clientesSplit[i].split(",");
                        clientes.agregarAlFinal(cliente[0], Integer.parseInt(cliente[1]));
                        
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            }
        } catch (Exception err){
            JOptionPane.showMessageDialog(null, "Error");
            }

    return clientes;
    }
    
}
