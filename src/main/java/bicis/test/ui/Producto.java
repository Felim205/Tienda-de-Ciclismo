/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.List;
import java.util.ArrayList;

public class Producto {
    private static List<Producto> listaProductos = new ArrayList<>();
    
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
    
    //Metodos
    public static void agregarProducto(Producto nuevoProducto){
        listaProductos.add(nuevoProducto);
    }
    
    public static Producto buscarProducto(int codigo, String nombre) {
        //por cada producto en la lista de productos
        for (Producto producto : listaProductos) {
            //si el codigo del producto es igual al codigo proporcionado o el nombre es igual (usando la funcion de abajo que compara dos cadenas de texto igorando mayusculas o minusculas)al nombre proporcionado
            if (producto.codigoProducto == codigo || producto.nombreProducto.equalsIgnoreCase(nombre)){
                return producto; // retorna ese producto
            }
        }
        return null; //sino null
    }
    
    public static void modificarProducto(int codigo, String nuevoNombre, int nuevoCodigoArticulo, String nuevoNombreArticulo, String nuevaMarca, int nuevoPrecio, int nuevaCantidad, Producto.TipoProducto nuevoTipo) {
        // misma logica de buscar un elemento que el metodo de buscar
        for (Producto producto : listaProductos) {
            if (producto.codigoProducto == codigo){
                // Si se encuentra el producto se actualizan los datos
                producto.setNombreProducto(nuevoNombre);
                producto.setCodigoArticulo(nuevoCodigoArticulo);
                producto.setNombreArticulo(nuevoNombreArticulo);
                producto.setMarcaProducto(nuevaMarca);
                producto.setPrecio(nuevoPrecio);
                producto.setCantidad(nuevaCantidad);
                producto.setTipoproducto(nuevoTipo);

                System.out.println("Producto modificado correctamente.");
                return;
            }
            System.out.println("El producto no ha podido ser modificado.");
        }
        // Si no se encuentra el producto, mostramos un mensaje
        System.out.println("Producto no encontrado. No se puede modificar.");
    }

    public static void eliminarProducto(int codigo) {
        listaProductos.removeIf(producto -> producto.codigoProducto == codigo);
    }
    
    public static int generarCodigoProducto() {
        if (listaProductos.isEmpty()) {
            return 1; // Si la lista esta vacia el primer codigo es 1
        } else {
            // Devuelve el codigo mas 1
            return listaProductos.get(listaProductos.size() - 1).getCodigoProducto() + 1;
        }
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
