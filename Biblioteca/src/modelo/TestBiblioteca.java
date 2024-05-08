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
public class TestBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Infantil infantito = new Infantil(6, 12, "El principito", 40, 2850);
        Tecnico tecnico = new Tecnico(false,"aprende java en 21 dias", 400, 29990);
        
        infantito.mostrarLibro();  
        tecnico.mostrarLibro();
    }
}
