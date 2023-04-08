/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pedro
 */
public class ClasePadre {
    private int atr1;
    protected int atr2;
    public int atr3;

    public ClasePadre(int atr1, int atr2, int atr3) {
        this.atr1 = atr1;
        this.atr2 = atr2;
        this.atr3 = atr3;
    }

    public int getAtr1() {
        return atr1;
    }

    public int getAtr2() {
        return atr2;
    }

    public int getAtr3() {
        return atr3;
    }

    public void setAtr1(int atr1) {
        this.atr1 = atr1;
    }

    public void setAtr2(int atr2) {
        this.atr2 = atr2;
    }

    public void setAtr3(int atr3) {
        this.atr3 = atr3;
    }
    
    


    public String mostrar() {
        return "ClasePadre{" + "atr1=" + atr1 + ", atr2=" + atr2 + ", atr3=" + atr3 + '}';
    }
    
    
}
