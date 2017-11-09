/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
//PASO 8 - IMPORTAR LA CLASE CON LA VENTANA
import ventanaJavaSwing.ventana;//importar paquete.ventana
import javax.swing.JFrame;

/**
 *
 * @author LAB07
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PASO 9 - LLAMADA A LA CLASE JFRAME
        ventana  ventana = new ventana();//Creo un objeto tipo 
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 600, 600);
        //La siguiente inst. le pone titulo a la ventana 
        ventana.SetTitle("Mi primera interfaz JavaSwing");
        //La siguiente sentencia es para finalizar el proyecto el cerrea la ventana
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
