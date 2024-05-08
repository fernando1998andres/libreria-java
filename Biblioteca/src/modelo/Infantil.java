/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Informatica
 */
public class Infantil extends Libro {

    private int edadMinima;
    private int edadMaxima;

    public Infantil() {
    }

    public Infantil(int edadMinima, int edadMaxima, String titulo, int numeroPaginas, int precio) {
        super(titulo, numeroPaginas, precio);
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }
    
  
     public void mostrarLibro(){
          System.out.println("El libro " + super.getTitulo()+ " cuesta " + super.getPrecio() + " y es " + "para menores de "+ getEdadMinima() + " a " + getEdadMaxima()+ " años"); 
     
    
   
}

    @Override
    public double obtenerTotalCompra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double descontar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}