/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import bicis.test.ui.Servicios.ServicioMantenimiento;
import java.util.Collection;
import java.util.ArrayList;

public class TiendaBicicletas {
    private String nombreTienda;
    private Collection<Usuario> usuario;
    private Collection<Cliente> cliente;
    private Collection<Producto> producto;
    private Collection<ServicioMantenimiento> servicio;

    public TiendaBicicletas() {
        this.usuario = new ArrayList<>();
        this.cliente = new ArrayList<>();
        this.producto = new ArrayList<>();
        this.servicio = new ArrayList<>();
    }
    
    public TiendaBicicletas(String nombreTienda) {
        this();
        this.nombreTienda = nombreTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    public Collection<Cliente> getCliente() {
        return cliente;
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
        this.cliente = cliente;
    }

    public void setProducto(Collection<Producto> producto) {
        this.producto = producto;
    }

    public void setServicio(Collection<ServicioMantenimiento> servicio) {
        this.servicio = servicio;
    }
    
    //Metodos
    public void registrarUsuario(Usuario nuevoUsuario){
    
    }
    
    public void registrarCliente(Cliente nuevoCliente) {

    }
    
    public Cliente buscarCliente(int codigo, String nombre, String apellido) {
        return null;
    }
    
    public void editarCliente(Cliente clienteEditado){
    
    }
    
    public void eliminarCliente(int Codigo){
    
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
                ", cliente=" + cliente +
                ", producto=" + producto +
                ", servicio=" + servicio +
                '}';
    }
    
    
    
    
}
