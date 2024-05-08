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
public abstract class Libro implements iCalculable {

    private String titulo;
    private int numeroPaginas;
    private int precio;

    public Libro() {
    }

    public Libro(String titulo, int numeroPaginas, int precio) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", precio=" + precio + ' ';
    }

    public String Clasificacion(String tipo) {
        tipo = "";
        if (tipo.equals("infantil") || tipo.equals("tecnico")) {
            System.out.println("el tipo ingresado es valido");
        } else {
            System.out.println("error el tipo no es valido");
        }
      return tipo;
    }

    public int obtenerTotalCompra(int cantidad) {
        int total = precio * cantidad;

        return total;

    }

    public double descontar(String tipo) {
        double descuento = 0;

        if (tipo == "infantil") {
            descuento = obtenerTotalCompra() * descuentoInfantil;
        } else {
            if (tipo == "tecnico") {
                descuento = obtenerTotalCompra() * 0.05;
            }
        }

        return descuento;

    }
    public double totalFinal() {
        double valor = obtenerTotalCompra() - descontar();
        double totalFinal = valor + (valor * iva);
        return totalFinal;

    }
 public abstract void mostrarLibro();
}
