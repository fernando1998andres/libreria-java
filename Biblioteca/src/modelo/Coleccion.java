/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Informatica
 */
public class Coleccion {

    ArrayList<Libro> libro;

    public Coleccion() {
        libro = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro nuevoLibro) {
        if (this.buscarLibro(nuevoLibro.getTitulo()) == false) {
            libro.add(nuevoLibro);
        } else {
            System.out.println("libro ya existe");
        }
    }
    
public void listar() {
   for (Libro tempLibro : libro) 
    {            
        tempLibro.mostrarLibro(); 
   }
}
    
    private boolean buscarLibro(String titulo) {
        boolean valida = false;
        for (Libro tempLibro : libro) {
            if (tempLibro.getTitulo().equals(titulo)) {
                valida = true;
                break;
            } else {
            }
        }
        return valida;
    }
    public String Eliminar(String titulo){
        String mensaje;
        boolean encontrado = false;
        int posicion=-1;
        int i = 0;
        for(Libro tempLibro : libro){
            if(tempLibro.getTitulo().equals(titulo)){
            encontrado = true;
            posicion=i;   
            }
            i++;
        }
        if(encontrado){
            libro.remove(posicion);
            mensaje = "Producto eliminado correctamente";   
        } else {
            mensaje = "Producto no se pudo eliminar";
        }
        return mensaje;
    }
    
}
