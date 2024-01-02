/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema11;

/**
 *
 * @author Leo
 */
public class Auto {

    // Atributos
    String patente;
    String nombrePropietario;
    String telefono;
    String servicioContrato;

    // Constructor
    public Auto(String laPatente, String elNombrePropietario, String elTelefono, String elServicioContrato) {
        this.patente = laPatente;
        this.nombrePropietario = elNombrePropietario;
        this.telefono = elTelefono;
        this.servicioContrato = elServicioContrato;
    }

    public Auto(String laPatente) {
        this.patente = laPatente;
        this.nombrePropietario = " ";
        this.telefono = " ";
        this.servicioContrato = " ";
    }

    // Observadores
    public String getPatente() {
        return this.patente;
    }

    public String getNombrePropietario() {
        return this.nombrePropietario;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getServicioContrato() {
        return this.servicioContrato;
    }

    // Modificadores
    public void setTelefono(String elTelefono) {
        this.telefono = elTelefono;
    }

    public void setServicio(String newServicio) {
        this.servicioContrato = newServicio;
    }

    // Propias del tipo
    public boolean equals(Auto otraPatente) {
        return (patente.equalsIgnoreCase(otraPatente.getPatente()));
    }

    public String toString() {
        String cadena = "Nombre del propietario: " + this.getNombrePropietario() + "\nPatente: " + this.getPatente()
                + "\nTelefono: " + this.getTelefono() + "\nServicio: " + this.getServicioContrato();
        return cadena;
    }

}
