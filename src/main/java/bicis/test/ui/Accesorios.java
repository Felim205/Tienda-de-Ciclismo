/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

/**
 * Clase que representa accesorios como subcategoría de productos.
 * Extiende la clase {@link Producto} e incluye información adicional como el tamaño del accesorio.
 * 
 * @author User
 */
public class Accesorios extends Producto {
    private int tamaño;

    /**
     * Constructor para inicializar un accesorio con sus atributos.
     * 
     * @param tamaño Tamaño del accesorio (en unidades específicas, como centímetros o milímetros).
     * @param codigoProducto Código único del producto.
     * @param nombreProducto Nombre del producto.
     * @param codigoArticulo Código del artículo asociado.
     * @param nombreArticulo Nombre del artículo asociado.
     * @param marcaProducto Marca del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible del producto.
     * @param tipoProducto Tipo de producto (debe ser ACCESORIOS para esta clase).
     */
    public Accesorios(int tamaño, int codigoProducto, String nombreProducto, int codigoArticulo, String nombreArticulo, String marcaProducto, int precio, int cantidad, TipoProducto tipoProducto) {
        super(codigoProducto, nombreProducto, codigoArticulo, nombreArticulo, marcaProducto, precio, cantidad, tipoProducto);
        this.tamaño = tamaño;
    }

    /**
     * Obtiene el tamaño del accesorio.
     * 
     * @return Tamaño del accesorio.
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Establece un nuevo tamaño para el accesorio.
     * 
     * @param tamaño Nuevo tamaño del accesorio.
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Devuelve una representación en cadena del objeto Accesorios,
     * incluyendo los atributos de la clase base y el tamaño del accesorio.
     * 
     * @return Representación en cadena del accesorio.
     */
    @Override
    public String toString() {
        return super.toString() + ", tamaño=" + tamaño + "}";
    }
}
