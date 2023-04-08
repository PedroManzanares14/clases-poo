/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conocidos;

/**
 *
 * @author pedro
 */
public enum conocidoss {    

//objetos
    pancho("Francisco Melendez", "UCA", 37),
    Chepe("jose Ordonez", "UTEC", 33),
    Mary("Maria Perez","UDB", 19 ),
    Memo("Guillermo Alas", "UJMD", 24);
    
    private String nombre;
    private String univ;
    private int edad;

    private conocidoss(String nombre, String univ, int edad) {
        this.nombre = nombre;
        this.univ = univ;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
