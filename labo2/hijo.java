/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labo2;

/**
 *
 * @author pedro
 */
public class hijo extends padre{
    
    public hijo(String apellido, String nacionalidad) {
        super(apellido, nacionalidad);
    }

    @Override
    public String toString() {
        return "hijo{" + "apellido=" + this.getApellido() + ", nacionalidad=" + this.getNacionalidad() + '}';
    }
    
    
}
