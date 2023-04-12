/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labo2;

/**
 *
 * @author pedro
 */
public class abuelo {
   //atributos
    private String apellido ;
    private String nacionalidad ;
    
    //constructor

    public abuelo(String apellido, String nacionalidad) {
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }


    
    //metodos

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "abuelo{" + "apellido=" + apellido + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
}
