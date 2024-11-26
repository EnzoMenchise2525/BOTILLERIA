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
public class BOTILLERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebida bebida;
        Vino vino;
        Liquido liq;

        //liq = new Liquido(); NO SE PUEDEN CREAR OBJETOS DE LAS CLASES ABSTRACTAS
        bebida = new Bebida("naranja", 1, "fanta", 1000);
        vino = new Vino(14, 2, "gato", 1000);
        System.out.println(bebida.toString());

        System.out.println(bebida.obtenerImpuesto());
        System.out.println(vino.obtenerImpuesto());
    }

}
