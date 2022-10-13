/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivotexto;

import javax.swing.JOptionPane;

/**
 *
 * @author veronica
 */
public class listaSimple {
    private nodoCliente inicio;
    private nodoCliente fin;
    private int tamanio;

    public listaSimple(){
        inicio = null;
        fin = null;
        tamanio = 0;
    }

    public nodoCliente getInicio() {
        return inicio;
    }

    public void setInicio(nodoCliente inicio) {
        this.inicio = inicio;
    }

    public nodoCliente getFin() {
        return fin;
    }

    public void setFin(nodoCliente fin) {
        this.fin = fin;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void vaciar(){
        setInicio(null);
        setFin(null);
        setTamanio(0);
    }

    public boolean estaVacia(){
        return getInicio() == null;
    }

    public void agregarAlFinal(String data, Integer data2) {

        nodoCliente nuevo = new nodoCliente(data, data2);

        if (estaVacia()) {
            inicio = nuevo;
            fin = nuevo;

        } else {
            nodoCliente aux = fin;
            aux.setSiguiente(nuevo);
            fin = nuevo;
        }

        tamanio += 1;
    }

        public void imprimir(){

            if (!estaVacia()){
                nodoCliente aux = inicio;
                for (int i = 0; i < tamanio; i++) {
                    JOptionPane.showMessageDialog(null, aux.getNombre() + "," + aux.getCedula() + " ");
                    //System.out.println(aux.getNombre() + "," + aux.getCedula() + " ");
                    aux = aux.getSiguiente();
                    
                }
            } else{
                System.out.println("La lista esta vacia");
            }

        }
}



