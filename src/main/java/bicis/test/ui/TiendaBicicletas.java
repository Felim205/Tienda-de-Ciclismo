/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import bicis.test.ui.Servicios.ServicioMantenimiento;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class TiendaBicicletas {
    private String nombreTienda;
    private Collection<Usuario> usuario;
    private Collection<Producto> producto;
    private Collection<ServicioMantenimiento> servicio;
    private List<Cliente> clientes;

    public TiendaBicicletas() {
        this.usuario = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.producto = new ArrayList<>();
        this.servicio = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    public TiendaBicicletas(String nombreTienda) {
        this();
        this.nombreTienda = nombreTienda;
    }
   

    public List<Cliente> getClientes() {
        return clientes; // Método para obtener la lista de clientes
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    public Collection<Cliente> getCliente() {
        return clientes;
    }

    public Collection<Producto> getProducto() {
        return producto;
    }

    public Collection<ServicioMantenimiento> getServicio() {
        return servicio;
    }
    
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public void setUsuario(Collection<Usuario> usuario) {
        this.usuario = usuario;
    }
    
    public void setCliente(Collection<Cliente> cliente) {
        this.clientes = clientes;
    }

    public void setProducto(Collection<Producto> producto) {
        this.producto = producto;
    }

    public void setServicio(Collection<ServicioMantenimiento> servicio) {
        this.servicio = servicio;
    }
    
//Metodo Usuario
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
    
    //Metodos Cliente
    public void registrarCliente(Cliente nuevoCliente) {
        if (nuevoCliente != null) {
            this.clientes.add(nuevoCliente);
            System.out.println("Cliente registrado exitosamente: " + nuevoCliente);
        } else {
            System.out.println("El cliente no puede ser nulo.");
        }
    }
    
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
    
    public void editarCliente(Cliente clienteEditado){
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
    
    public void eliminarCliente(int Codigo){
        Cliente clienteAEliminar = null;
        for (Cliente c : this.clientes) {
            if (c.getCodigo() == Codigo) {
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
    
    
    public void agregarProducto(Producto nuevoPoroducto){

    }
    
    public Producto buscarProducto(int codigo, String nombre) {
        return null;
    }
    
    public void modificarProducto(Producto productoEditado) {

    }

    public void eliminarProducto(int codigo) {

    }
    
    public void registrarServicio(ServicioMantenimiento nuevoServicio) {

    }
    
    public ServicioMantenimiento buscarServicio(int codigo, String nombre) {
        return null;
    }
    
    public void modificarServicio(ServicioMantenimiento servicioEditado) {

    }
    
    public void eliminarServicio(int codigo) {

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
