/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP01DA;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este algoritmo sirve para cargar y determinar la nota de un alumno.
        Scanner sc = new Scanner(System.in);
        double [] arregloDeNotas = new double [10];
        cargarNotas(arregloDeNotas);
        if(evaluarNotas(arregloDeNotas)){
            System.out.println("El alumno aprobo el cuatrimestre");
        }else{
            System.out.println("El alumno reprobo el cuatrimestre");
        }
    }
    
    public static void cargarNotas(double [] arregloDeNotas){
        //Este módulo se encarga de cargar las notas de un alumno a un arreglo.
        Scanner sc = new Scanner(System.in);
        int i=0;
        double nota=0;
        do{
            System.out.println("Ingrese la " + (i+1) + "° nota de la materia: ");
            nota=sc.nextDouble();
            if(nota>0 && nota<11){
                arregloDeNotas[i]=nota;
                i=i+1;
            }else{
                System.out.println("Nota invalida, ingreselo neuvamente");
            }
        }while(i!=10);
    }
    
    public static boolean evaluarNotas(double [] arregloDeNotas){
        //Evalúa si un estudiante aprobó devolviento Verdadero o Falso. Criterio 6 o más.
        boolean aprobado=true;
        int i=0;
        do{
            if(arregloDeNotas[i]<6){
                aprobado=false;
            }
            i=i+1;
        }while(aprobado && i<10);
        return aprobado;
    }
}
