/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema08;

/**
 *
 * @author Leo
 */
public class Avion {

    // Atributos
    private String identificador;
    private String modelo;
    private int cantidadDeAsientos;
    private double kmRecorridos;
    private double velocidadPromedio;

    // Constructoras
    public Avion(String elIdentificador, String elModelo, int laCantidadDeAsientos, double loskmRecorridos,
            double laVelocidadPromedio) {

        this.identificador = elIdentificador;
        this.modelo = elModelo;
        this.cantidadDeAsientos = laCantidadDeAsientos;
        this.kmRecorridos = loskmRecorridos;
        this.velocidadPromedio = laVelocidadPromedio;

    }

    // Contructor seteado con valores default.
    public Avion(String elIdentificador) {
        this.identificador = elIdentificador;
        this.modelo = "";
        this.cantidadDeAsientos = 0;
        this.kmRecorridos = 0;
        this.velocidadPromedio = 0;
    }

    // Observadores
    public String getIdentificador() {
        return this.identificador;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getCantidadDeAsientos() {
        return this.cantidadDeAsientos;
    }

    public double getKmRecorridos() {
        return this.kmRecorridos;
    }

    public double getVelocidadPromedio() {
        return this.velocidadPromedio;
    }

    // Modificadores
    public void setKmRecorridos(double losKmRecorridos) {
        this.kmRecorridos = losKmRecorridos;
    }

    // Propias del tipo
    public boolean equals(Avion otroId) {
        return (identificador.equalsIgnoreCase(otroId.getIdentificador()));
    }

    public String toString() {
        String cadena = "Modelo: " + this.getModelo() + "\nIdentificador: " + this.getIdentificador()
                + "\nCantidad de asientos: " + this.getCantidadDeAsientos() + "\nKm recorridos: "
                + this.getKmRecorridos() + "\nVelocidad Promedio: " + this.getVelocidadPromedio();
        return cadena;
    }
}
