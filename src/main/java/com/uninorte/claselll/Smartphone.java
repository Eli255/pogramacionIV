/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.claselll;

/**
 *
 * @author Elian
 */
public class Smartphone extends Celular {
    //atributos
    private float pixelesCamara;
    private float tamanoMemoriaInterna;
    private float tamanoMemoriaExterna;
    //constructor por defeecto
    public Smartphone(){
    }
    //constructor con los atributos de la clase,
    //ademas de los heredados
    public Smartphone (String marca, String modelo, String color,
            float pixamara,
            float memInterna,
            float memExterna  ){
        super (marca, modelo, color);
        this.pixelesCamara = pixamara;
        this.tamanoMemoriaInterna = memInterna;
        this.tamanoMemoriaExterna = memExterna;
    }
   public void informarCaracteristicas(){
   
       super.informarcaracteristicas();
       System.out.println(String.format("Smartphone calidad camara:%s pixeles", pixelesCamara));
        System.out.println(String.format("Smartphone tamano memoria interna:%s gigabyte", tamanoMemoriaInterna));
         System.out.println(String.format("Smartphone tamano memoria externa:%s gigabyte",tamanoMemoriaExterna));
       
   }
   //getters y setters
   public float getPixelesCamara(){
   return pixelesCamara;
   }
   public void setPixelesCamara (float pixCamara){
   this.pixelesCamara = pixCamara;
   }
   public float getTamanoMemoriaInterna(){
   return tamanoMemoriaInterna;}
   public void setTamanoMemoriaInterna(float tamMemInterna){
   this.tamanoMemoriaInterna = tamMemInterna;
   }
   public float getTamanoMemoriaExterna(){
   return tamanoMemoriaExterna;
           }
   public void setTamanoMemoriaExterna(float tamMemExterna){
   this.tamanoMemoriaExterna =tamMemExterna;
   }
    
}
