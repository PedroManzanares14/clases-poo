/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pedro
 */
public class ClaseHija extends ClasePadre {
    
    //atributos:
    private int atr4;

    public ClaseHija(int atr1, int atr2, int atr3, int atr4) {
        super(atr1, atr2, atr3);
        
        this.atr4=atr4;
    }

    public int getAtr4() {
        return atr4;
    }

    public void setAtr4(int atr4) {
        this.atr4 = atr4;
    }

    
    
    
}
