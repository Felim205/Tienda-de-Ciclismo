/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

/**
 * Clase que representa un detalle de factura en el sistema.
 * Incluye información sobre el artículo, factura, cantidad, precio unitario y total.
 * También proporciona métodos para calcular el total y el impuesto asociado.
 * 
 * @author User
 */
public class DetalleFactura {
    private int codigoArticulo;
    private int numeroFactura;
    private int cantidad;
    private int precioUnitario;
    private int total;

    /**
     * Constructor para inicializar un detalle de factura con sus atributos.
     * 
     * @param codigoArticulo Código del artículo asociado al detalle.
     * @param numeroFactura Número de la factura asociada.
     * @param cantidad Cantidad de artículos facturados.
     * @param precioUnitario Precio unitario del artículo.
     * @param total Total calculado del detalle.
     */
    public DetalleFactura(int codigoArticulo, int numeroFactura, int cantidad, int precioUnitario, int total) {
        this.codigoArticulo = codigoArticulo;
        this.numeroFactura = numeroFactura;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = total;
    }

    // Métodos Getters

    /**
     * Obtiene el código del artículo asociado al detalle.
     * 
     * @return Código del artículo.
     */
    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    /**
     * Obtiene el número de la factura asociada al detalle.
     * 
     * @return Número de la factura.
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Obtiene la cantidad de artículos facturados.
     * 
     * @return Cantidad de artículos.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Obtiene el precio unitario del artículo.
     * 
     * @return Precio unitario.
     */
    public int getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Obtiene el total calculado del detalle.
     * 
     * @return Total del detalle.
     */
    public int getTotal() {
        return total;
    }

    // Métodos Setters

    /**
     * Establece un nuevo código para el artículo.
     * 
     * @param codigoArticulo Nuevo código del artículo.
     */
    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    /**
     * Establece un nuevo número de factura.
     * 
     * @param numeroFactura Nuevo número de factura.
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * Establece una nueva cantidad de artículos facturados y recalcula el total.
     * 
     * @param cantidad Nueva cantidad de artículos.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.total = calcularTotal();
    }

    /**
     * Establece un nuevo precio unitario y recalcula el total.
     * 
     * @param precioUnitario Nuevo precio unitario.
     */
    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.total = calcularTotal();
    }

    /**
     * Establece un nuevo total para el detalle.
     * 
     * @param total Nuevo total calculado.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    // Métodos adicionales

    /**
     * Calcula el total del detalle multiplicando la cantidad por el precio unitario.
     * 
     * @return Total calculado.
     */
    public int calcularTotal() {
        return cantidad * precioUnitario;
    }

    /**
     * Calcula el impuesto basado en un porcentaje proporcionado.
     * 
     * @param porcentaje Porcentaje de impuesto a aplicar.
     * @return Valor del impuesto calculado.
     */
    public int calcularImpuesto(int porcentaje) {
        return (calcularTotal() * porcentaje) / 100;
    }

    /**
     * Devuelve una representación en cadena del objeto DetalleFactura.
     * 
     * @return Representación en cadena del detalle de factura.
     */
    @Override
    public String toString() {
        return "DetalleFactura{" +
                "codigoArticulo=" + codigoArticulo +
                ", numeroFactura=" + numeroFactura +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", total=" + total +
                '}';
    }
}
