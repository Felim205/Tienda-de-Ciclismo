/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui.Servicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabob
 */

//Funciones de los botones y generador de lista (Me imagino que tenemos que
//poner todo en un tipo de base de datos)
public class ServicioManager {
    private static final List<ServicioMantenimiento> servicios = new ArrayList<>();
    private static int codigoServicioActual = 1;

    public static int getCodigoServicioActual() {
    return codigoServicioActual;
    }
    
    public static void agregarServicio(ServicioMantenimiento servicio) {
        servicio.setCodigoCliente(codigoServicioActual++);
        servicios.add(servicio);
    }

    public static List<ServicioMantenimiento> getServicios() {
        return servicios;
    }

    public static ServicioMantenimiento buscarPorCodigo(int codigoServicio) {
        for (ServicioMantenimiento servicio : servicios) {
            if (servicio.getCodigoServicio() == codigoServicio) {
                return servicio;
            }
        }
        return null;
    }

    public static boolean eliminarServicio(int codigoServicio) {
        ServicioMantenimiento servicio = buscarPorCodigo(codigoServicio);
        if (servicio != null && servicio.getEstado() != ServicioMantenimiento.EstadoServicio.CERRADO) {
            return servicios.remove(servicio);
        }
        return false;
    }

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
