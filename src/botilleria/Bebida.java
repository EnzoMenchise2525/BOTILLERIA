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
public final class Bebida extends Liquido {

    private String sabor;

    //sobrecarga
    public Bebida() {
        //super();
    }

    public Bebida(String sabor, int codigo, String nombre, int precio) {
        super(codigo, nombre, precio);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override//sobreescribir
    public String toString() {
        return super.toString() + "Bebida{" + "sabor=" + sabor + '}';
    }

    public void mostrarLiquido() {
        System.out.println("Bebida");
    }

//      public int obtenerTotal(int cant){
//        return this.precio * cant;
//    }
    public void calcularTotal() {

    }
}
