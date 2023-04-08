/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libro;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;
    
    //constructores

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    //metodos
    
    @Override
    public String toString() {
        return "Libro{" + "el libro: " + titulo +" con el ISBN: " + ISBN + " creado por el autor " + autor + " tiene " + numPag +" paginas"+ '}';
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    
    
    public static void main(String[] args) {
        Libro libro1= new Libro(1234, "Si", "Juan", 500);
        Libro libro2= new Libro(5678, "no", "Jose", 100);
        
        JOptionPane.showMessageDialog(null, libro1.toString());
        JOptionPane.showMessageDialog(null, libro2.toString());
        
        if (libro1.getNumPag()>libro2.getNumPag()){
            
             JOptionPane.showMessageDialog(null, "el libro : "+ libro1.getTitulo()+" con numero de paginas: "+libro1.getNumPag()+ " tienes mas paginas");
            
        }
        else {
            JOptionPane.showMessageDialog(null, "el libro 2: "+ libro2.getTitulo()+" con numero de paginas: "+libro2.getNumPag()+ " tienes mas paginas");
        }
    }
}
