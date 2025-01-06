/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui.Servicios;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona los servicios de mantenimiento. Permite realizar
 * operaciones como agregar, buscar, modificar y eliminar servicios.
 * Actúa como un manejador para la lista de servicios.
 * 
 * @author gabob
 */
public class ServicioManager {
    private static final List<ServicioMantenimiento> servicios = new ArrayList<>();
    private static int codigoServicioActual = 1;

    /**
     * Obtiene el código actual que será asignado al siguiente servicio creado.
     * 
     * @return Código del próximo servicio.
     */
    public static int getCodigoServicioActual() {
        return codigoServicioActual;
    }

    /**
     * Incrementa el contador de códigos de servicio al agregar un nuevo servicio.
     */
    public static void incrementarCodigoServicio() {
        codigoServicioActual++;
    }

    /**
     * Agrega un nuevo servicio a la lista de servicios. Asigna un código único
     * al servicio antes de agregarlo.
     * 
     * @param servicio El servicio de mantenimiento a agregar.
     */
    public static void agregarServicio(ServicioMantenimiento servicio) {
        servicios.add(servicio);
        incrementarCodigoServicio(); // Incrementa el código para el próximo servicio
    }

    /**
     * Obtiene la lista completa de servicios registrados.
     * 
     * @return Lista de servicios de mantenimiento.
     */
    public static List<ServicioMantenimiento> getServicios() {
        return servicios;
    }

    /**
     * Busca un servicio en la lista usando su código único.
     * 
     * @param codigoServicio Código del servicio a buscar.
     * @return El servicio de mantenimiento si se encuentra, o {@code null} si no existe.
     */
    public static ServicioMantenimiento buscarPorCodigo(int codigoServicio) {
        for (ServicioMantenimiento servicio : servicios) {
            if (servicio.getCodigoServicio() == codigoServicio) {
                return servicio;
            }
        }
        return null;
    }

    /**
     * Elimina un servicio de la lista si no está cerrado.
     * 
     * @param codigoServicio Código del servicio a eliminar.
     * @return {@code true} si el servicio fue eliminado con éxito, o {@code false} si no se pudo eliminar.
     */
    public static boolean eliminarServicio(int codigoServicio) {
        ServicioMantenimiento servicio = buscarPorCodigo(codigoServicio);
        if (servicio != null && servicio.getEstado() != ServicioMantenimiento.EstadoServicio.CERRADO) {
            return servicios.remove(servicio);
        }
        return false;
    }

    /**
     * Modifica los detalles de un servicio existente, siempre que no esté cerrado.
     * 
     * @param codigoServicio Código del servicio a modificar.
     * @param servicioModificado Servicio con los nuevos detalles para reemplazar el existente.
     * @throws IllegalStateException Si el servicio ya está cerrado.
     */
    public static void modificarServicio(int codigoServicio, ServicioMantenimiento servicioModificado) {
        ServicioMantenimiento servicio = buscarPorCodigo(codigoServicio);
        if (servicio != null && servicio.getEstado() != ServicioMantenimiento.EstadoServicio.CERRADO) {
            servicio.setCodigoCliente(servicioModificado.getCodigoCliente());
            servicio.setMarcaBicicleta(servicioModificado.getMarcaBicicleta());
            servicio.setDescripcionBicicleta(servicioModificado.getDescripcionBicicleta());
            servicio.setPrecio(servicioModificado.getPrecio());
            servicio.setFechaRecibido(servicioModificado.getFechaRecibido());
            servicio.setFechaEntrega(servicioModificado.getFechaEntrega());
            servicio.setObservaciones(servicioModificado.getObservaciones());
        } else {
            throw new IllegalStateException("El servicio no puede modificarse.");
        }
    }
}
