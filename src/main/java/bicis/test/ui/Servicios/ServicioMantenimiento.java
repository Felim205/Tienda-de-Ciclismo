/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui.Servicios;

import java.time.LocalDate;
import java.util.Collection;

public class ServicioMantenimiento {
    // Variables
    private final int codigoServicio;
    private int codigoCliente;
    private String marcaBicicleta;
    private String descripcionBicicleta;
    private int precio;
    private LocalDate fechaRecibido;
    private LocalDate fechaEntrega;
    private String observaciones;
    private EstadoServicio estado;
    
    public enum EstadoServicio{
        ABIERTO, CERRADO
    }

   // El Métrodo Constructor
    public ServicioMantenimiento(int codigoServicio, int codigoCliente, 
            String marcaBicicleta, String descripcionBicicleta, int precio, 
            LocalDate fechaRecibido, LocalDate fechaEntrega, String observaciones, 
            EstadoServicio estado) {
        this.codigoServicio = codigoServicio;
        this.codigoCliente = codigoCliente;
        this.marcaBicicleta = marcaBicicleta.trim();
        this.descripcionBicicleta = descripcionBicicleta.trim();
        this.precio = precio;
        this.fechaRecibido = fechaRecibido;
        this.fechaEntrega = fechaEntrega;
        this.observaciones = observaciones.trim();
        this.estado = estado;
    }

    // Getters y Setters
    // -------------------------------------------------------------------------
    public int getCodigoServicio() {
        return codigoServicio;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getMarcaBicicleta() {
        return marcaBicicleta;
    }

    public void setMarcaBicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta.trim();
    }

    public String getDescripcionBicicleta() {
        return descripcionBicicleta;
    }

    public void setDescripcionBicicleta(String descripcionBicicleta) {
        this.descripcionBicicleta = descripcionBicicleta.trim();
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDate getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(LocalDate fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones.trim();
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }
    // -------------------------------------------------------------------------
    
    
    // Los otros métodos del UML que no son getters y setters
    public static Collection<ServicioMantenimiento> listarServicios() {
        return ServicioManager.getServicios();
    }

    public void cerrarServicio() {
        if (this.estado == EstadoServicio.ABIERTO) {
            this.estado = EstadoServicio.CERRADO;
        } else {
            throw new IllegalStateException("El servicio ya está cerrado.");
        }
    }
    
    //El toString
    @Override
    public String toString() {
        return "ServicioMantenimiento{" +
                "codigoServicio=" + codigoServicio +
                ", codigoCliente=" + codigoCliente +
                ", marcaBicicleta='" + marcaBicicleta + '\'' +
                ", descripcionBicicleta='" + descripcionBicicleta + '\'' +
                ", precio=" + precio +
                ", fechaRecibido=" + fechaRecibido +
                ", fechaEntrega=" + fechaEntrega +
                ", observaciones='" + observaciones + '\'' +
                ", estado=" + estado +
                '}';
    }
}
