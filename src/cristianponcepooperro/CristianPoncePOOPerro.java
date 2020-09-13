/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristianponcepooperro;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class CristianPoncePOOPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Perro P1 ;
     P1 = new Perro ("Batuke");
     
     P1.setNombre("Batuke");
     P1.setColor("Negro");
     P1.setEdad(3);
     
     P1.ladrar();
     
     System.out.println("El perro se llama " + P1.getNombre());
     System.out.println("Es de color " + P1.getColor());
     System.out.println("Tiene una Edad de " + P1.getEdad() + " años");
     }
}
