/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

/**
 * Clase que representa una bicicleta como subcategoría de producto.
 * Extiende la clase {@link Producto} e incluye información específica sobre el tamaño de la bicicleta.
 * 
 * @author User
 */
public class Bicicleta extends Producto {
    private TamañoBicicleta tamaño;

    /**
     * Enum que representa los posibles tamaños de las bicicletas.
     */
    public enum TamañoBicicleta {
        T12, T16, T22, T26, T27, T27_5, T29
    }

    /**
     * Constructor para inicializar una bicicleta con sus atributos.
     * 
     * @param codigoProducto Código único del producto.
     * @param nombreProducto Nombre del producto.
     * @param codigoArticulo Código del artículo asociado.
     * @param nombreArticulo Nombre del artículo asociado.
     * @param marcaProducto Marca del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible del producto.
     * @param tipoProducto Tipo de producto (debe ser BICICLETA para esta clase).
     * @param tamaño Tamaño específico de la bicicleta.
     */
    public Bicicleta(int codigoProducto, String nombreProducto, int codigoArticulo, String nombreArticulo,
                     String marcaProducto, int precio, int cantidad, TipoProducto tipoProducto, TamañoBicicleta tamaño) {
        super(codigoProducto, nombreProducto, codigoArticulo, nombreArticulo, marcaProducto, precio, cantidad, tipoProducto);
        this.tamaño = tamaño;
    }

    /**
     * Obtiene el tamaño de la bicicleta.
     * 
     * @return Tamaño de la bicicleta.
     */
    public TamañoBicicleta getTamaño() {
        return tamaño;
    }

    /**
     * Establece un nuevo tamaño para la bicicleta.
     * 
     * @param tamaño Nuevo tamaño de la bicicleta.
     */
    public void setTamaño(TamañoBicicleta tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Devuelve una representación en cadena del objeto Bicicleta,
     * incluyendo los atributos de la clase base y el tamaño de la bicicleta.
     * 
     * @return Representación en cadena de la bicicleta.
     */
    @Override
    public String toString() {
        return super.toString() + ", tamaño=" + tamaño + "}";
    }
}
