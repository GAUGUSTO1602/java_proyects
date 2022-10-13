/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivotexto;

/**
 *
 * @author veronica
 */
public class nodoCliente {
    private nodoCliente siguiente;
    private String nombre;
    private int cedula;

    public nodoCliente(String nombre, int cedula) {
        this.siguiente = null;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public nodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoCliente siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
}
