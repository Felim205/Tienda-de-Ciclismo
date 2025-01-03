/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.ArrayList;
import java.util.Collection;


public class Facturación {
    private int numeroFactura;
    private int codigoCliente;
    private String fechaRecibido;
    private EstadoFacturación estado;
    private int subtotal;
    private int impuesto;
    private int total;
    private Collection<DetalleFactura> factura;
    
    public enum EstadoFacturación {
        VALIDO, ANULADO
    }

    public Facturación(int numeroFactura, int codigoCliente, String fechaRecibido, EstadoFacturación estado, int subtotal, int impuesto, int total, Collection<DetalleFactura> factura) {
        this.numeroFactura = numeroFactura;
        this.codigoCliente = codigoCliente;
        this.fechaRecibido = fechaRecibido;
        this.estado = estado;
        this.subtotal = 0;
        this.impuesto = 0;
        this.total = 0;
        this.factura = new ArrayList<>();
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getFechaRecibido() {
        return fechaRecibido;
    }

    public EstadoFacturación getEstado() {
        return estado;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public int getTotal() {
        return total;
    }

    public Collection<DetalleFactura> getFactura() {
        return factura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public void setEstado(EstadoFacturación estado) {
        this.estado = estado;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setFactura(Collection<DetalleFactura> factura) {
        this.factura = factura;
    }
    
    
    //Metodos
    
    public DetalleFactura buscarFactura(int numeroFactura, String fecha, String nombreCliente) {
        // Lógica para buscar una factura
        return null;
    }
    
    public void agregarFactura(DetalleFactura detalle) {
        factura.add(detalle);
    }
    
    public void anularFactura() {
        factura.clear();
        subtotal = 0;
        impuesto = 0;
        total = 0;
    }
    
    public void mostrarDetalles() {
        factura.forEach(System.out::println);
    }
    
    
    @Override
    public String toString() {
        return "Facturación{" +
                "numeroFactura=" + numeroFactura +
                ", codigoCliente=" + codigoCliente +
                ", fechaRecibido=" + fechaRecibido +
                ", estado=" + estado +
                ", subtotal=" + subtotal +
                ", impuesto=" + impuesto +
                ", total=" + total +
                ", factura=" + factura +
                '}';
    }
}
