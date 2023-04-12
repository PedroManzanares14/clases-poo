/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*1. Escribir un programa que contenga:
a. La clase Abuelo, con atributos:
i. apellido y nacionalidad.
b. Debe heredarle los atributos y métodos al hijo e imprimir los datos.

c. Luego el hijo debe heredar los atributos del hijo del abuelo e imprimir los
datos. Es decir, el nieto heredará los atributos del padre y del abuelo.
*/
package labo2;
/**
 *
 * @author pedro
 */


public class Labo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        abuelo ob1 = new abuelo ("manzanares", "sv");
        System.out.println(ob1.toString());
        System.out.println("  ");
        hijo ob2 = new hijo("manzanares","sv");
        System.out.println(ob2.toString());
        
    }
    
    
}
