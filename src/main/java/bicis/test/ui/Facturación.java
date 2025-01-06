/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Clase que representa el proceso de facturación en el sistema.
 * Gestiona información como número de factura, cliente, detalles, estado, subtotal, impuestos y total.
 * Permite agregar, buscar y anular facturas, además de mostrar los detalles.
 * 
 * @author User
 */
public class Facturación {
    private int numeroFactura;
    private int codigoCliente;
    private String fechaRecibido;
    private EstadoFacturación estado;
    private int subtotal;
    private int impuesto;
    private int total;
    private Collection<DetalleFactura> factura;

    /**
     * Enum que representa los estados posibles de una factura.
     */
    public enum EstadoFacturación {
        VALIDO, ANULADO
    }

    /**
     * Constructor para inicializar una instancia de facturación.
     * 
     * @param numeroFactura Número de la factura.
     * @param codigoCliente Código del cliente asociado a la factura.
     * @param fechaRecibido Fecha en que se recibió la factura.
     * @param estado Estado de la facturación (VALOR o ANULADO).
     * @param subtotal Subtotal de la factura.
     * @param impuesto Impuesto aplicado.
     * @param total Total de la factura.
     * @param factura Colección de detalles de la factura.
     */
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

    // Métodos Getters y Setters

    /**
     * Obtiene el número de la factura.
     * 
     * @return Número de la factura.
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Obtiene el código del cliente asociado a la factura.
     * 
     * @return Código del cliente.
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Obtiene la fecha en que se recibió la factura.
     * 
     * @return Fecha de recepción de la factura.
     */
    public String getFechaRecibido() {
        return fechaRecibido;
    }

    /**
     * Obtiene el estado de la facturación.
     * 
     * @return Estado de la facturación.
     */
    public EstadoFacturación getEstado() {
        return estado;
    }

    /**
     * Obtiene el subtotal de la factura.
     * 
     * @return Subtotal de la factura.
     */
    public int getSubtotal() {
        return subtotal;
    }

    /**
     * Obtiene el impuesto aplicado a la factura.
     * 
     * @return Impuesto de la factura.
     */
    public int getImpuesto() {
        return impuesto;
    }

    /**
     * Obtiene el total de la factura.
     * 
     * @return Total de la factura.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Obtiene la colección de detalles de la factura.
     * 
     * @return Colección de detalles de la factura.
     */
    public Collection<DetalleFactura> getFactura() {
        return factura;
    }

    /**
     * Establece el número de la factura.
     * 
     * @param numeroFactura Nuevo número de la factura.
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * Establece el código del cliente asociado a la factura.
     * 
     * @param codigoCliente Nuevo código del cliente.
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Establece la fecha de recepción de la factura.
     * 
     * @param fechaRecibido Nueva fecha de recepción de la factura.
     */
    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    /**
     * Establece el estado de la facturación.
     * 
     * @param estado Nuevo estado de la facturación.
     */
    public void setEstado(EstadoFacturación estado) {
        this.estado = estado;
    }

    /**
     * Establece el subtotal de la factura.
     * 
     * @param subtotal Nuevo subtotal de la factura.
     */
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Establece el impuesto aplicado a la factura.
     * 
     * @param impuesto Nuevo impuesto de la factura.
     */
    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * Establece el total de la factura.
     * 
     * @param total Nuevo total de la factura.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Establece la colección de detalles de la factura.
     * 
     * @param factura Nueva colección de detalles.
     */
    public void setFactura(Collection<DetalleFactura> factura) {
        this.factura = factura;
    }

    // Métodos de gestión

    /**
     * Busca una factura por número, fecha o nombre del cliente.
     * 
     * @param numeroFactura Número de la factura.
     * @param fecha Fecha de la factura.
     * @param nombreCliente Nombre del cliente asociado.
     * @return Detalle de la factura encontrada o {@code null} si no existe.
     */
    public DetalleFactura buscarFactura(int numeroFactura, String fecha, String nombreCliente) {
        return null; // Lógica para buscar una factura
    }

    /**
     * Agrega un detalle a la colección de facturas.
     * 
     * @param detalle Detalle de factura a agregar.
     */
    public void agregarFactura(DetalleFactura detalle) {
        factura.add(detalle);
    }

    /**
     * Anula la factura, eliminando todos sus detalles y reiniciando los valores.
     */
    public void anularFactura() {
        factura.clear();
        subtotal = 0;
        impuesto = 0;
        total = 0;
    }

    /**
     * Muestra los detalles de la factura en la salida estándar.
     */
    public void mostrarDetalles() {
        factura.forEach(System.out::println);
    }

    /**
     * Devuelve una representación en cadena del objeto Facturación.
     * 
     * @return Representación en cadena de la facturación.
     */
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
