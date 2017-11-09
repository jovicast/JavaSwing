/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaJavaSwing;
//PASO 1 - IMPORTAR LAS LIBRERIAS
import java.awt.Color;
import static javafx.scene.input.KeyCode.J;
import javax.swing.*;//Importamos TODO de swing


/**
 *
 * @author LAB07
 */
//PASO 2 - HEREDAN LA CLASE DESDE  JFRAME
public class ventana extends JFrame
{
 //PASO 3 - DECLARAR ELEMENTOS A UTILIZAR
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton; 
    JCheckBox verificacion;
    JRadioButton presionar;
    // PASO 4 - DEFINIR EL CONSTRUCTOR 
    public ventana()
    {
    //PASO 5 - CREAR E INICIALIZAR LOS OBJETOS
        panel = new JPanel();//Creo un objeto Tipo JPanel
        label = new JLabel();
        text = new JTextField(15);//15 es la cantidad de caracteres
        boton = new JButton();  
        verificacion = new JCheckBox();
        presionar = new JRadioButton();
        
         //PASO 6 - AGREGAR LOS ELEMENTOS AL JFRAME
       this.add(panel);//Recomendable el JPanel
       panel.add(label);
       panel.add(text);
       panel.add(boton);
       panel.add(verificacion);
       panel.add(presionar);
       
       //PASO 7 - PROPIEDADES DE LOS OBJETOS
       label.setText("Nombre");
       boton.setText("Enviar");
       panel.setBackground(Color.pink);//Color de fondo de JPanel
        
    }
}
