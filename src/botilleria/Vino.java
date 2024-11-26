/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botilleria;

/**
 *
 * @author USRVI-LC2
 */
public class Vino extends Liquido {

    private double grados;

    //sobrecarga
    public Vino() {
    }

    public Vino(double grados, int codigo, String nombre, int precio) {
        super(codigo, nombre, precio);
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    @Override//sobreescribir
    public String toString() {
        return super.toString() + "Vino{" + "grados=" + grados + '}';
    }

    @Override//sobreescribir
    public int obtenerImpuesto() {
        return (int) (super.obtenerImpuesto() + super.precio * 0.205);
    }

    public void mostrarLiquido() {
        System.out.println("Vino");
    }

    public void calcularTotal() {

    }
}
