/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre;
    int edad;
    String correo;
    String carrera;
    
    nombre= JOptionPane.showInputDialog("digite su nombre: ");
    edad= Integer.parseInt(JOptionPane.showInputDialog("digite su eddad"));
    correo= JOptionPane.showInputDialog("digite su correo: ");
    carrera= JOptionPane.showInputDialog("digite el nombre de su carrera: ");
    
    JOptionPane.showMessageDialog(null, "nombre "+ nombre+"\nEdad :"+edad+ "\ncorreo: "+ correo+ "\ncarrera : "+carrera);
    
        // TODO code application logic here
    }

    
    
}
