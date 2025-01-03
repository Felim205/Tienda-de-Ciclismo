/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

public class Producto {
    private int codigoProducto;
    private String nombreProducto;
    private int codigoArticulo;
    private String nombreArticulo;
    private String marcaProducto;
    private int precio;
    private int cantidad;
    private TipoProducto tipoProducto;
    
    public enum TipoProducto {
        BICICLETA, ACCESORIOS, SUPLEMENTOS
    }

    public Producto(int codigoProducto, String nombreProducto, int codigoArticulo, String nombreArticulo, String marcaProducto, int precio, int cantidad, TipoProducto tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.codigoArticulo = codigoArticulo;
        this.nombreArticulo = nombreArticulo;
        this.marcaProducto = marcaProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipoProducto = tipoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public TipoProducto getTipoproducto() {
        return tipoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipoproducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    @Override
    public String toString() {
        return "Producto{" +
                "codigoProducto=" + codigoProducto +
                ", nombreProducto=" + nombreProducto +
                ", codigoArticulo=" + codigoArticulo +
                ", nombreArticulo=" + nombreArticulo +
                ", marcaProducto=" + marcaProducto +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", tipoProducto=" + tipoProducto +
                '}';
    }
    
    
}


