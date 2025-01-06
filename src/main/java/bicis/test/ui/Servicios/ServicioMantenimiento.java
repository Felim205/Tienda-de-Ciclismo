/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui.Servicios;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Clase que representa un servicio de mantenimiento para bicicletas.
 * Contiene información detallada sobre el servicio, como cliente, bicicleta,
 * fechas, precio y estado.
 * 
 * @author gabob
 */
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

    /**
     * Enum que representa los posibles estados del servicio.
     */
    public enum EstadoServicio {
        ABIERTO, CERRADO
    }

    // El Método Constructor
    /**
     * Constructor para inicializar un servicio de mantenimiento.
     *
     * @param codigoServicio    Código único del servicio.
     * @param codigoCliente     Código del cliente asociado al servicio.
     * @param marcaBicicleta    Marca de la bicicleta.
     * @param descripcionBicicleta Descripción de la bicicleta.
     * @param precio            Precio del servicio.
     * @param fechaRecibido     Fecha en que se recibió la bicicleta.
     * @param fechaEntrega      Fecha estimada para la entrega.
     * @param observaciones     Observaciones generales del servicio.
     * @param estado            Estado del servicio (ABIERTO o CERRADO).
     */
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

    /**
     * Obtiene el código del servicio.
     *
     * @return Código único del servicio.
     */
    public int getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Obtiene el código del cliente asociado al servicio.
     *
     * @return Código del cliente.
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Establece el código del cliente asociado al servicio.
     *
     * @param codigoCliente Código del cliente.
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Obtiene la marca de la bicicleta.
     *
     * @return Marca de la bicicleta.
     */
    public String getMarcaBicicleta() {
        return marcaBicicleta;
    }

    /**
     * Establece la marca de la bicicleta.
     *
     * @param marcaBicicleta Marca de la bicicleta.
     */
    public void setMarcaBicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta.trim();
    }

    /**
     * Obtiene la descripción de la bicicleta.
     *
     * @return Descripción de la bicicleta.
     */
    public String getDescripcionBicicleta() {
        return descripcionBicicleta;
    }

    /**
     * Establece la descripción de la bicicleta.
     *
     * @param descripcionBicicleta Descripción de la bicicleta.
     */
    public void setDescripcionBicicleta(String descripcionBicicleta) {
        this.descripcionBicicleta = descripcionBicicleta.trim();
    }

    /**
     * Obtiene el precio del servicio.
     *
     * @return Precio del servicio.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del servicio.
     *
     * @param precio Precio del servicio.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la fecha en que se recibió la bicicleta.
     *
     * @return Fecha de recepción.
     */
    public LocalDate getFechaRecibido() {
        return fechaRecibido;
    }

    /**
     * Establece la fecha en que se recibió la bicicleta.
     *
     * @param fechaRecibido Fecha de recepción.
     */
    public void setFechaRecibido(LocalDate fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    /**
     * Obtiene la fecha estimada de entrega.
     *
     * @return Fecha de entrega.
     */
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Establece la fecha estimada de entrega.
     *
     * @param fechaEntrega Fecha de entrega.
     */
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Obtiene las observaciones del servicio.
     *
     * @return Observaciones del servicio.
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Establece las observaciones del servicio.
     *
     * @param observaciones Observaciones del servicio.
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones.trim();
    }

    /**
     * Obtiene el estado actual del servicio.
     *
     * @return Estado del servicio.
     */
    public EstadoServicio getEstado() {
        return estado;
    }

    /**
     * Establece el estado del servicio.
     *
     * @param estado Estado del servicio.
     */
    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }

    // -------------------------------------------------------------------------

    // Los otros métodos del UML que no son getters y setters

    /**
     * Lista todos los servicios de mantenimiento disponibles.
     *
     * @return Colección de servicios de mantenimiento.
     */
    public static Collection<ServicioMantenimiento> listarServicios() {
        return ServicioManager.getServicios();
    }

    /**
     * Cierra el servicio si está en estado ABIERTO.
     *
     * @throws IllegalStateException Si el servicio ya está cerrado.
     */
    public void cerrarServicio() {
        if (this.estado == EstadoServicio.ABIERTO) {
            this.estado = EstadoServicio.CERRADO;
        } else {
            throw new IllegalStateException("El servicio ya está cerrado.");
        }
    }

    // El toString

    /**
     * Devuelve una representación en cadena del servicio de mantenimiento.
     *
     * @return Representación en cadena del objeto.
     */
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
