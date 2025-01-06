/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase que representa un producto dentro del sistema de la tienda.
 * Permite la gestión de productos como bicicletas, accesorios y suplementos.
 * Contiene métodos para agregar, buscar, modificar y eliminar productos.
 * 
 * @author gabob
 */
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
    
    /**
     * Enum que representa los diferentes tipos de productos disponibles.
     */
    public enum TipoProducto {
        BICICLETA, ACCESORIOS, SUPLEMENTOS
    }

    /**
     * Constructor para inicializar un producto.
     * 
     * @param codigoProducto Código único del producto.
     * @param nombreProducto Nombre del producto.
     * @param codigoArticulo Código del artículo asociado.
     * @param nombreArticulo Nombre del artículo asociado.
     * @param marcaProducto Marca del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible del producto.
     * @param tipoProducto Tipo de producto.
     */
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

    // Métodos Getters y Setters

    /**
     * Obtiene el código del producto.
     * 
     * @return Código del producto.
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return Nombre del producto.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Obtiene el código del artículo asociado.
     * 
     * @return Código del artículo.
     */
    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    /**
     * Obtiene el nombre del artículo asociado.
     * 
     * @return Nombre del artículo.
     */
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    /**
     * Obtiene la marca del producto.
     * 
     * @return Marca del producto.
     */
    public String getMarcaProducto() {
        return marcaProducto;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return Precio del producto.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene la cantidad disponible del producto.
     * 
     * @return Cantidad del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Obtiene el tipo del producto.
     * 
     * @return Tipo del producto.
     */
    public TipoProducto getTipoproducto() {
        return tipoProducto;
    }

    /**
     * Establece un nuevo código para el producto.
     * 
     * @param codigoProducto Nuevo código del producto.
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * Establece un nuevo nombre para el producto.
     * 
     * @param nombreProducto Nuevo nombre del producto.
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Establece un nuevo código para el artículo asociado.
     * 
     * @param codigoArticulo Nuevo código del artículo.
     */
    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    /**
     * Establece un nuevo nombre para el artículo asociado.
     * 
     * @param nombreArticulo Nuevo nombre del artículo.
     */
    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    /**
     * Establece una nueva marca para el producto.
     * 
     * @param marcaProducto Nueva marca del producto.
     */
    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    /**
     * Establece un nuevo precio para el producto.
     * 
     * @param precio Nuevo precio del producto.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Establece una nueva cantidad disponible para el producto.
     * 
     * @param cantidad Nueva cantidad del producto.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Establece un nuevo tipo para el producto.
     * 
     * @param tipoProducto Nuevo tipo del producto.
     */
    public void setTipoproducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    // Métodos de gestión

    /**
     * Agrega un producto a la lista de productos.
     * 
     * @param nuevoProducto Producto a agregar.
     */
    public static void agregarProducto(Producto nuevoProducto) {
        listaProductos.add(nuevoProducto);
    }

    /**
     * Busca un producto por su código o nombre.
     * 
     * @param codigo Código del producto.
     * @param nombre Nombre del producto.
     * @return Producto encontrado o {@code null} si no existe.
     */
    public static Producto buscarProducto(int codigo, String nombre) {
        for (Producto producto : listaProductos) {
            if (producto.codigoProducto == codigo || producto.nombreProducto.equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Modifica los datos de un producto existente.
     * 
     * @param codigo Código del producto a modificar.
     * @param nuevoNombre Nuevo nombre del producto.
     * @param nuevoCodigoArticulo Nuevo código del artículo asociado.
     * @param nuevoNombreArticulo Nuevo nombre del artículo asociado.
     * @param nuevaMarca Nueva marca del producto.
     * @param nuevoPrecio Nuevo precio del producto.
     * @param nuevaCantidad Nueva cantidad del producto.
     * @param nuevoTipo Nuevo tipo del producto.
     */
    public static void modificarProducto(int codigo, String nuevoNombre, int nuevoCodigoArticulo, String nuevoNombreArticulo, String nuevaMarca, int nuevoPrecio, int nuevaCantidad, Producto.TipoProducto nuevoTipo) {
        for (Producto producto : listaProductos) {
            if (producto.codigoProducto == codigo) {
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
        }
        System.out.println("Producto no encontrado. No se puede modificar.");
    }

    /**
     * Elimina un producto por su código.
     * 
     * @param codigo Código del producto a eliminar.
     */
    public static void eliminarProducto(int codigo) {
        listaProductos.removeIf(producto -> producto.codigoProducto == codigo);
    }

    /**
     * Genera un código único para un nuevo producto.
     * 
     * @return Código generado para el producto.
     */
    public static int generarCodigoProducto() {
        if (listaProductos.isEmpty()) {
            return 1;
        } else {
            return listaProductos.get(listaProductos.size() - 1).getCodigoProducto() + 1;
        }
    }

    /**
     * Devuelve una representación en cadena del objeto Producto.
     * 
     * @return Representación en cadena del producto.
     */
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
