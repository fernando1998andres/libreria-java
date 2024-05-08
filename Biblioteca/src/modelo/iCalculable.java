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
public interface iCalculable {
    double iva = 0.19;
    double descuentoInfantil = 0.10;
    double descuentoTecnico =0.05;
    
    public double obtenerTotalCompra();
    public double descontar();
    public double totalFinal();
}
