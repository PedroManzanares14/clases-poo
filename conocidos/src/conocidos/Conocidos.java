/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocidos;

/**
 *
 * @author pedro
 */
public class Conocidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        conocidoss x = conocidoss.Mary;
        
        System.out.println("nombre: "+x.getNombre());
        System.out.println("edad: "+x.getEdad());
        System.out.println("universidad: "+ x.getUniv());
        System.out.println("de carino le decimos: "+ x);
        
        x.setEdad(16);
        
        for(conocidoss c: conocidoss.values()){
        
            System.out.printf("%-20s %-6s &-2d %-10s%n, ",
            c.getNombre(),
            c.getUniv(),
            c.getEdad(),
            c);
        }
            
    }
    
    
}
