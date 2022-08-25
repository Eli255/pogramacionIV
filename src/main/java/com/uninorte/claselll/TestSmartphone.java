/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.claselll;

/**
 *
 * @author Elian
 */
public class TestSmartphone {
    public static void main(String[]args){
    //crea un objeto de tipo Smartphone
    Smartphone smart = new Smartphone();
    //Asignamos marca, modelo, color, pixeles camara,
    //tamano memoria interna y externa
    smart.setmarca("Samsung");
    smart.setmodelo("S9 Plus");
    smart.setcolor("Negro");
    smart.setPixelesCamara(20);
    smart.setTamanoMemoriaInterna(128);
    smart.setTamanoMemoriaExterna(64);
    //Utilizamos los metodos: llamar, cortallamada de la clase celular 
    smart.llamar("Jefe");
    smart.cortarLlamadas();
    
    System.out.println();
    //metodo sobrescrito
    smart.informarCaracteristicas();
    }
    
}
