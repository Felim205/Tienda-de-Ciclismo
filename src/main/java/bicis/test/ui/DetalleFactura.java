/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

/*
 * Clase que representa los Detalles de una factura.
 */
public class DetalleFactura {
    private int codigoArticulo;
    private int numeroFactura;
    private int cantidad;
    private int precioUnitario;
    private int total;

    /*
    * Constructor
    */
    public DetalleFactura(int codigoArticulo, int numeroFactura, int cantidad, int precioUnitario, int total) {
        this.codigoArticulo = codigoArticulo;
        this.numeroFactura = numeroFactura;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = total;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public int getTotal() {
        return total;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
     
    /*
     * Representa los detalles como una cadena de texto.
     *
     * @return una representación en formato String de los detalles.
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
