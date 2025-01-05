/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gabob
 */
public class ClienteManager {
    private static final List<Cliente> clientes = new ArrayList<>();

    static {
        // Simula datos en memoria
        clientes.add(new Cliente(1, "Juan", "Pérez", 12345678, "juan@example.com", Cliente.Provincia.SAN_JOSE, "San José", "Catedral", new Date()));
        clientes.add(new Cliente(2, "María", "Gómez", 87654321, "maria@example.com", Cliente.Provincia.CARTAGO, "Cartago", "Oriental", new Date()));
        clientes.add(new Cliente(3, "Carlos", "Ramírez", 11223344, "carlos@example.com", Cliente.Provincia.HEREDIA, "Heredia", "San Francisco", new Date()));
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static Cliente buscarPorNombreCompleto(String nombreCompleto) {
        for (Cliente cliente : clientes) {
            if ((cliente.getNombre() + " " + cliente.getApellido()).equalsIgnoreCase(nombreCompleto)) {
                return cliente;
            }
        }
        return null;
    }
    
    public static Cliente getClientePorNombre(String nombreCompleto) {
    for (Cliente cliente : clientes) { // *Clientes siendo la lista
        if ((cliente.getNombre() + " " + cliente.getApellido()).equalsIgnoreCase(nombreCompleto)) {
            return cliente;
        }
    }
    return null; // Retorna null si no se encuentra el cliente
    }
}