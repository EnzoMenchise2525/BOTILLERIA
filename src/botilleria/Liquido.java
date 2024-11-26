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
public abstract class Liquido implements Calculable{

    protected int codigo;
    protected String nombre;
    protected int precio;
    protected final double descuento10 = 0.1; //final : constante

    //sobrecarga
    public Liquido() {
    }

    public Liquido(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override //sobreescribir
    public String toString() {
        return "Liquido{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    public int obtenerImpuesto() {
        return (int) (this.precio * 0.19); //casteo, casting: convirtiendo un double en int
    }

    //método abstracto
    public abstract void mostrarLiquido();

    //método final
    public final int obtenerTotal(int cant) {
        return this.precio * cant;
    }
    
//    public void calcularTotal(){
//        
//    }

}
