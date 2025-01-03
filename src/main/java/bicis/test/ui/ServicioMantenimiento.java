/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.Date;

public class ServicioMantenimiento {
    private int codigoServicio;
    private int codigoCliente;
    private String marcaBicicleta;
    private String descripcionBicicleta;
    private int precio;
    private Date fechaRecibido;
    private Date fechaEntrega;
    private String observaciones;
    private EstadoServicio estado;
    
    public enum EstadoServicio{
        ABIERTO, CERRADO
    }

    public ServicioMantenimiento(int codigoServicio, int codigoCliente, String marcaBicicleta, String descripcionBicicleta, int precio, Date fechaRecibido, Date fechaEntrega, String observaciones, EstadoServicio estado) {
        this.codigoServicio = codigoServicio;
        this.codigoCliente = codigoCliente;
        this.marcaBicicleta = marcaBicicleta;
        this.descripcionBicicleta = descripcionBicicleta;
        this.precio = precio;
        this.fechaRecibido = fechaRecibido;
        this.fechaEntrega = fechaEntrega;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getMarcaBicicleta() {
        return marcaBicicleta;
    }

    public String getDescripcionBicicleta() {
        return descripcionBicicleta;
    }

    public int getPrecio() {
        return precio;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setMarcaBicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta;
    }

    public void setDescripcionBicicleta(String descripcionBicicleta) {
        this.descripcionBicicleta = descripcionBicicleta;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ServicioMantenimiento{" + 
                "codigoServicio=" + codigoServicio + 
                ", codigoCliente=" + codigoCliente + 
                ", marcaBicicleta=" + marcaBicicleta + 
                ", descripcionBicicleta=" + descripcionBicicleta + 
                ", precio=" + precio + 
                ", fechaRecibido=" + fechaRecibido + 
                ", fechaEntrega=" + fechaEntrega + 
                ", observaciones=" + observaciones + 
                ", estado=" + estado + 
                '}';
    }
    
    
}
