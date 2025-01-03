/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;


public class Bicicleta extends Producto {
    private TamañoBicicleta tamaño;
    
    public enum TamañoBicicleta {
        T12, T16, T22, T26, T27, T27_5, T29
    }

    public Bicicleta(int codigoProducto, String nombreProducto, int codigoArticulo, String nombreArticulo,
                     String marcaProducto, int precio, int cantidad, TipoProducto tipoProducto, TamañoBicicleta tamaño) {
        super(codigoProducto, nombreProducto, codigoArticulo, nombreArticulo, marcaProducto, precio, cantidad, tipoProducto);
        this.tamaño = tamaño;
    }

    public TamañoBicicleta getTamaño() {
        return tamaño;
    }

    public void setTamaño(TamañoBicicleta tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString() + ", tamaño=" + tamaño + "}";
    }
}
