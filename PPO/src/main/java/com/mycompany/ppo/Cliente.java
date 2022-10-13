/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ppo;

/**
 *
 * @author veronica
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public String getNombre() {
        return nombre;
    }    

    public void setNombre(String valor) {
        nombre = valor;
    }

    public String getApellido() {
        return apellido;
    }    

    public void setApellido(String valor) {
        apellido = valor;
    }

    public String getEmail() {
        return email;
    }    

    public void setEmail(String valor) {
        email = valor;
    }

    public String getTelefono() {
        return telefono;
    }    

    public void setTelefono(String valor) {
        telefono = valor;
    }

    public String getNombreCompleto(){
        return nombre +" "+ apellido;
    }
    
}
