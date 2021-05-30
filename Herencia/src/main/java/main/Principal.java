package main;

import operaciones.Hija_Resta;
import operaciones.Hija_Suma;

public class Principal {
    
    public static void main(String[] args) {
        
        Hija_Suma sumador = new Hija_Suma();
        
        sumador.pedirDatos();
        sumador.sumar();
        System.out.println("Resultado:");
        sumador.mostrarResultado();
        
        Hija_Resta restador  = new Hija_Resta();
        
        restador.pedirDatos();
        restador.restar();
        System.out.println("Resultado:");
        restador.mostrarResultado();
    }
}
