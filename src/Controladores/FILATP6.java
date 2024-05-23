/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

import fila.tp6.ADTFILA;

/**
 *
 * @author tomascabrerabellomo
 */
public class FILATP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ADTFILA fila = ADTFILA.FilaVacia();
        
        System.out.println(fila.EsVacia());
        fila.MostrarFila();
        int item1 = 1;
        int item2 = 2;
        int item3 = 67;
        int item4 = 99;
        
        fila.enfila(item1);
        fila.enfila(item2);
        fila.enfila(item3);
        fila.enfila(item4);
        System.out.println("LOS elementos de la Fila son: \n ");
        
        fila.MostrarFila();
        
        System.out.println("Frente: " + fila.Frente());
        
        System.out.println("Borro el primer elemento \n ");
        fila.defila();
        
        System.out.println(fila.Frente());
        
        System.out.println("Frente: " + fila.Frente());
        
        System.out.println(fila.EsVacia());
        
                
    }
    
}
