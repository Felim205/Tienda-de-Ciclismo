/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

/**
 * Clase que representa suplementos como una subcategoría de productos.
 * Incluye información adicional como el tamaño del suplemento.
 * Hereda de la clase {@link Producto}.
 * 
 * @author User
 */
public class Suplementos extends Producto {
    private int tamaño;

    /**
     * Constructor para inicializar un suplemento con sus atributos.
     * 
     * @param tamaño Tamaño del suplemento (en unidades específicas, como gramos o mililitros).
     * @param codigoProducto Código único del producto.
     * @param nombreProducto Nombre del producto.
     * @param codigoArticulo Código del artículo asociado.
     * @param nombreArticulo Nombre del artículo asociado.
     * @param marcaProducto Marca del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible del producto.
     * @param tipoProducto Tipo de producto (debe ser SUPLEMENTOS para esta clase).
     */
    public Suplementos(int tamaño, int codigoProducto, String nombreProducto, int codigoArticulo, String nombreArticulo, String marcaProducto, int precio, int cantidad, TipoProducto tipoProducto) {
        super(codigoProducto, nombreProducto, codigoArticulo, nombreArticulo, marcaProducto, precio, cantidad, tipoProducto);
        this.tamaño = tamaño;
    }

    /**
     * Obtiene el tamaño del suplemento.
     * 
     * @return Tamaño del suplemento.
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Establece un nuevo tamaño para el suplemento.
     * 
     * @param tamaño Nuevo tamaño del suplemento.
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Devuelve una representación en cadena del objeto Suplementos,
     * incluyendo los atributos de la clase base y el tamaño del suplemento.
     * 
     * @return Representación en cadena del objeto Suplementos.
     */
    @Override
    public String toString() {
        return super.toString() + ", tamaño=" + tamaño + "}";
    }
}
