/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase encargada de gestionar la lista de clientes en el sistema.
 * Proporciona métodos para obtener clientes, buscar clientes por nombre completo y realizar operaciones relacionadas.
 * 
 * Simula una base de datos en memoria con una lista de clientes predefinidos.
 * 
 * @author gabob
 */
public class ClienteManager {
    private static final List<Cliente> clientes = new ArrayList<>();

    static {
        // Simula datos en memoria para pruebas.
        clientes.add(new Cliente(1, "Juan", "Pérez", 12345678, "juan@example.com", Cliente.Provincia.SAN_JOSÉ, "San José", "Catedral", new Date()));
        clientes.add(new Cliente(2, "María", "Gómez", 87654321, "maria@example.com", Cliente.Provincia.CARTAGO, "Cartago", "Oriental", new Date()));
        clientes.add(new Cliente(3, "Carlos", "Ramírez", 11223344, "carlos@example.com", Cliente.Provincia.HEREDIA, "Heredia", "San Francisco", new Date()));
    }

    /**
     * Obtiene la lista completa de clientes registrados.
     * 
     * @return Lista de clientes.
     */
    public static List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Busca un cliente en la lista utilizando su nombre completo.
     * 
     * @param nombreCompleto Nombre completo del cliente (nombre y apellido).
     * @return El cliente encontrado, o {@code null} si no existe.
     */
    public static Cliente buscarPorNombreCompleto(String nombreCompleto) {
        for (Cliente cliente : clientes) {
            if ((cliente.getNombre() + " " + cliente.getApellido()).equalsIgnoreCase(nombreCompleto)) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Busca y obtiene un cliente por su nombre completo.
     * 
     * @param nombreCompleto Nombre completo del cliente.
     * @return Cliente encontrado o {@code null} si no se encuentra.
     */
    public static Cliente getClientePorNombre(String nombreCompleto) {
        for (Cliente cliente : clientes) { 
            if ((cliente.getNombre() + " " + cliente.getApellido()).equalsIgnoreCase(nombreCompleto)) {
                return cliente;
            }
        }
        return null; 
    }
}
