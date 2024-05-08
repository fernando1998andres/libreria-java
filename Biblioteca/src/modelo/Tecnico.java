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
public class Tecnico extends Libro{
    public boolean materialExtra;

    public Tecnico() {
    }

    public Tecnico(boolean materialExtra) {
        this.materialExtra = materialExtra;
    }

    public Tecnico(boolean materialExtra, String titulo, int numeroPaginas, int precio) {
        super(titulo, numeroPaginas, precio);
        this.materialExtra = materialExtra;
    }

    public boolean isMaterialExtra() {
        return materialExtra;
    }

    public void setMaterialExtra(boolean materialExtra) {
        this.materialExtra = materialExtra;
    }

    @Override
    public String toString() {
        return "Tecnico{ " + "materialExtra=" + materialExtra + '}';
    }


    @Override
    public double obtenerTotalCompra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double descontar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarLibro() {
        System.out.println("El libro tecnico " + super.getTitulo()+ ", tiene un valor de "+ super.getPrecio());
    }
}
