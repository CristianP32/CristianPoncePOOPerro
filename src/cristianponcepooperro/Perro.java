/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristianponcepooperro;

/**
 *
 * @author Administrator
 */
public class Perro {

    private String Nombre,Color;
    private int Edad;
    
    public Perro (String Nombre){
       if (Nombre != "" ) this.Nombre = Nombre;   
        }
        
    public void setNombre(String Nombre){
       if (Nombre != "" ) this.Nombre = Nombre;           
         }    
    public String getNombre(){
         return Nombre;   
         }     
   
    public void setColor(String Color){
         if (Color != "" ) this.Color = Color;           
         }    
    public String getColor(){
         return Color;   
         }
    
   public void setEdad(int Edad){
         if(Edad>0) this.Edad = Edad;           
         }
    public int getEdad(){
         return Edad;   
         }
    
       
    public void ladrar () {
     
         System.out.println( "Guau,Guau,Guau,Guau,Guau " );
    }
}
