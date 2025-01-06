/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import bicis.test.ui.Servicios.ServicioMantenimiento;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una tienda de bicicletas. 
 * Permite la gestión de usuarios, clientes, productos y servicios.
 * Incluye métodos para registrar, buscar, editar y eliminar elementos asociados a la tienda.
 * 
 * @author gabob
 */
public class TiendaBicicletas {
    private String nombreTienda;
    private Collection<Usuario> usuario;
    private Collection<Producto> producto;
    private Collection<ServicioMantenimiento> servicio;
    private List<Cliente> clientes;

    /**
     * Constructor por defecto que inicializa las colecciones de la tienda.
     */
    public TiendaBicicletas() {
        this.usuario = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.producto = new ArrayList<>();
        this.servicio = new ArrayList<>();
    }
    
    /**
     * Constructor que inicializa la tienda con un nombre.
     * 
     * @param nombreTienda Nombre de la tienda.
     */
    public TiendaBicicletas(String nombreTienda) {
        this();
        this.nombreTienda = nombreTienda;
    }
    
    // Métodos Getters y Setters
    
    /**
     * Obtiene la lista de clientes registrados en la tienda.
     * 
     * @return Lista de clientes.
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Obtiene el nombre de la tienda.
     * 
     * @return Nombre de la tienda.
     */
    public String getNombreTienda() {
        return nombreTienda;
    }

    /**
     * Obtiene la colección de usuarios registrados.
     * 
     * @return Colección de usuarios.
     */
    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    /**
     * Obtiene la colección de productos registrados.
     * 
     * @return Colección de productos.
     */
    public Collection<Producto> getProducto() {
        return producto;
    }

    /**
     * Obtiene la colección de servicios de mantenimiento registrados.
     * 
     * @return Colección de servicios.
     */
    public Collection<ServicioMantenimiento> getServicio() {
        return servicio;
    }
    
    /**
     * Establece el nombre de la tienda.
     * 
     * @param nombreTienda Nombre de la tienda.
     */
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    /**
     * Establece la colección de usuarios.
     * 
     * @param usuario Colección de usuarios.
     */
    public void setUsuario(Collection<Usuario> usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Establece la colección de clientes.
     * 
     * @param cliente Colección de clientes.
     */
    public void setCliente(Collection<Cliente> cliente) {
        this.clientes = clientes;
    }

    /**
     * Establece la colección de productos.
     * 
     * @param producto Colección de productos.
     */
    public void setProducto(Collection<Producto> producto) {
        this.producto = producto;
    }

    /**
     * Establece la colección de servicios.
     * 
     * @param servicio Colección de servicios.
     */
    public void setServicio(Collection<ServicioMantenimiento> servicio) {
        this.servicio = servicio;
    }
    
    // Métodos para Usuarios
    
    /**
     * Registra un nuevo usuario en la tienda.
     * 
     * @param nuevoUsuario Usuario a registrar.
     */
    public void registrarUsuario(Usuario nuevoUsuario) {
        if (nuevoUsuario == null) {
            System.out.println("El usuario no puede ser nulo.");
            return;
        }

        for (Usuario u : this.usuario) {
            if (u.getNombre().equalsIgnoreCase(nuevoUsuario.getNombre())) {
                System.out.println("Ya existe un usuario con el nombre: " + nuevoUsuario.getNombre());
                return;
            }
        }

        this.usuario.add(nuevoUsuario);
        System.out.println("Usuario registrado exitosamente: " + nuevoUsuario);
    }
    
    // Métodos para Clientes

    /**
     * Registra un nuevo cliente en la tienda.
     * 
     * @param nuevoCliente Cliente a registrar.
     */
    public void registrarCliente(Cliente nuevoCliente) {
        if (nuevoCliente != null) {
            this.clientes.add(nuevoCliente);
            System.out.println("Cliente registrado exitosamente: " + nuevoCliente);
        } else {
            System.out.println("El cliente no puede ser nulo.");
        }
    }
    
    /**
     * Busca un cliente en la tienda por código, nombre o apellido.
     * 
     * @param codigo Código del cliente.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @return Cliente encontrado o {@code null} si no existe.
     */
    public Cliente buscarCliente(int codigo, String nombre, String apellido) {
        for (Cliente c : this.clientes) {
            if (c.getCodigo() == codigo || 
                c.getNombre().equalsIgnoreCase(nombre) || 
                c.getApellido().equalsIgnoreCase(apellido)) {
                return c;
            }
        }
        System.out.println("Cliente no encontrado.");
        return null;
    }
    
    /**
     * Edita los datos de un cliente existente.
     * 
     * @param clienteEditado Cliente con los datos actualizados.
     */
    public void editarCliente(Cliente clienteEditado) {
        if (clienteEditado != null) {
            for (Cliente c : this.clientes) {
                if (c.getCodigo() == clienteEditado.getCodigo()) {
                    c.setNombre(clienteEditado.getNombre());
                    c.setApellido(clienteEditado.getApellido());
                    c.setTelefono(clienteEditado.getTelefono());
                    c.setCorreo(clienteEditado.getCorreo());
                    c.setProvincia(clienteEditado.getProvincia());
                    c.setCanton(clienteEditado.getCanton());
                    c.setDistrito(clienteEditado.getDistrito());
                    c.setFechaNacimiento(clienteEditado.getFechaNacimiento());
                    System.out.println("Cliente editado exitosamente: " + c);
                    return;
                }
            }
            System.out.println("Cliente no encontrado para editar.");
        } else {
            System.out.println("El cliente editado no puede ser nulo.");
        }
    }
    
    /**
     * Elimina un cliente de la tienda por su código.
     * 
     * @param codigo Código del cliente a eliminar.
     */
    public void eliminarCliente(int codigo) {
        Cliente clienteAEliminar = null;
        for (Cliente c : this.clientes) {
            if (c.getCodigo() == codigo) {
                clienteAEliminar = c;
                break;
            }
        }
        if (clienteAEliminar != null) {
            this.clientes.remove(clienteAEliminar);
            System.out.println("Cliente eliminado exitosamente: " + clienteAEliminar);
        } else {
            System.out.println("Cliente no encontrado para eliminar.");
        }
    }
    
    @Override
    public String toString() {
        return "TiendaBicicletas{" +
                "nombreTienda=" + nombreTienda +
                ", usuario=" + usuario +
                ", cliente=" + clientes +
                ", producto=" + producto +
                ", servicio=" + servicio +
                '}';
    }
}
