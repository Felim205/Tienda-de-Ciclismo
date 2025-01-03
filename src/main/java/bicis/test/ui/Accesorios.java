/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

/**
 *
 * @author User
 */
public class Accesorios extends Producto{
    private int tamaño;

    public Accesorios(int tamaño, int codigoProducto, String nombreProducto, int codigoArticulo, String nombreArticulo, String marcaProducto, int precio, int cantidad, TipoProducto tipoProducto) {
        super(codigoProducto, nombreProducto, codigoArticulo, nombreArticulo, marcaProducto, precio, cantidad, tipoProducto);
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", tamaño=" + tamaño + "}";
    }
}
