/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

/**
 *
 * @author User
 */
public class DetalleFactura {
    private int codigoArticulo;
    private int numeroFactura;
    private int cantidad;
    private int precioUnitario;
    private int total;

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
        this.total = calcularTotal();
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.total = calcularTotal();
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    //Metodos
    public int calcularTotal(){
        return cantidad * precioUnitario;
    }
    
    public int calcularImpuesto(int porcentaje){
        return 1;
    }
    
     
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
