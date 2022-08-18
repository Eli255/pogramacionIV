/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.claselll;

/**
 *
 * @author Jorge Espinola
 */
public class Celular {
    //Atributos de la clase
    private String marca;
    private String modelo;
    private String color;
    
    //Contructor Vacio
    public Celular(){
        
    }
    
    //Contructor con parametro
    public Celular(String mar, String mod, String color){
        this.marca = mar;
        this.modelo = mod;
        this.color = color;
    }
    
    //Metodo realizar llamadas
    public void llamar(String nombre){
        System.out.println("Llamando a " + nombre );
    }
    
    //Metodo finalizar llamas
    public void cortarLlamadas(){
        System.out.println("Llamada finalizada");
    }
    
    //Informar caracteristicas del celular
    public void informarcaracteristicas(){
        System.out.println(String.format("Celular Marca: %s",marca));
        System.out.println(String.format("Celular Modelo: %s",modelo));
        System.out.println(String.format("Celular Color: %s",color));
    }
    //getters y setters
    public String getmarca(){
        return marca;
    }
    public void setmarca(String mar){
        this.marca = mar;
    }
    public String getModelo(){
        return modelo;
    }
    public void setmodelo(String mod){
        this.modelo = mod;
    }
    public String getColor(){
        return color;
    }
    public void setcolor(String color){
        this.color = color;
    }
}
