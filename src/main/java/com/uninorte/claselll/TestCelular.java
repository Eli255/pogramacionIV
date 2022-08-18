/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.claselll;

/**
 *
 * @author Jorge Espinola
 */
public class TestCelular {
    public static void main(String[] args){
        //Creamos un nuevo contructor 
        Celular cel = new Celular();
                
        //Asignamos marca modelo y color
        cel.setmarca("Samsung");
        cel.setmodelo("S20 FE");
        cel.setcolor("Negro");
        
        // Llamar y cortar y caracteristicas
        cel.llamar("Jorge");
        cel.cortarLlamadas();
        System.out.println();
        cel.informarcaracteristicas();
        
    }
    
}
