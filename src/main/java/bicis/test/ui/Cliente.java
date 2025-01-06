/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.Date;

/**
 * Clase que representa un cliente dentro del sistema.
 * Incluye atributos relacionados con la identificación, contacto y ubicación del cliente.
 * Proporciona métodos para validar datos y gestionar la información del cliente.
 * 
 * @author User
 */
public class Cliente {

    private static int contadorCodigo = 0;

    private int codigo;
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;
    private Provincia provincia;
    private String canton;
    private String distrito;
    private Date fechaNacimiento;

    /**
     * Enum que representa las provincias de Costa Rica.
     */
    public enum Provincia {
        ALAJUELA, CARTAGO, GUANACASTE, HEREDIA, LIMON, PUNTARENAS, SAN_JOSÉ
    }

    /**
     * Constructor que inicializa un cliente con sus atributos.
     * 
     * @param codigo Código único del cliente.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @param telefono Teléfono de contacto.
     * @param correo Correo electrónico del cliente.
     * @param provincia Provincia donde reside el cliente.
     * @param canton Cantón donde reside el cliente.
     * @param distrito Distrito donde reside el cliente.
     * @param fechaNacimiento Fecha de nacimiento del cliente.
     */
    public Cliente(int codigo, String nombre, String apellido, int telefono, String correo, Provincia provincia, String canton, String distrito, Date fechaNacimiento) {
        this.codigo = contadorCodigo++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos Getters

    /**
     * Obtiene el código único del cliente.
     * 
     * @return Código del cliente.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido del cliente.
     * 
     * @return Apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene el teléfono del cliente.
     * 
     * @return Teléfono del cliente.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     * 
     * @return Correo electrónico del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Obtiene la provincia del cliente.
     * 
     * @return Provincia del cliente.
     */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * Obtiene el cantón del cliente.
     * 
     * @return Cantón del cliente.
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Obtiene el distrito del cliente.
     * 
     * @return Distrito del cliente.
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     * 
     * @return Fecha de nacimiento del cliente.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Métodos Setters

    /**
     * Establece un nuevo código para el cliente.
     * 
     * @param codigo Nuevo código del cliente.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Establece un nuevo nombre para el cliente.
     * 
     * @param nombre Nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece un nuevo apellido para el cliente.
     * 
     * @param apellido Nuevo apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Establece un nuevo teléfono para el cliente.
     * 
     * @param telefono Nuevo teléfono del cliente.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Establece un nuevo correo electrónico para el cliente.
     * 
     * @param correo Nuevo correo del cliente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Establece una nueva provincia para el cliente.
     * 
     * @param provincia Nueva provincia del cliente.
     */
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    /**
     * Establece un nuevo cantón para el cliente.
     * 
     * @param canton Nuevo cantón del cliente.
     */
    public void setCanton(String canton) {
        this.canton = canton;
    }

    /**
     * Establece un nuevo distrito para el cliente.
     * 
     * @param distrito Nuevo distrito del cliente.
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * Establece una nueva fecha de nacimiento para el cliente.
     * 
     * @param fechaNacimiento Nueva fecha de nacimiento.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos adicionales

    /**
     * Crea un código único basado en el nombre, apellido y teléfono del cliente.
     * 
     * @return Código generado.
     */
    public int crearCodigo() {
        return (nombre + apellido + telefono).hashCode();
    }

    /**
     * Valida el formato del correo electrónico.
     * 
     * @param correo Correo a validar.
     * @throws IllegalArgumentException Si el correo no tiene un formato válido.
     */
    public void validarCorreo(String correo) {
        if (!correo.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("El correo no es válido");
        }
        this.correo = correo;
    }

    /**
     * Valida que la fecha de nacimiento no sea futura.
     * 
     * @param fechaNacimiento Fecha a validar.
     * @throws IllegalArgumentException Si la fecha de nacimiento es futura.
     */
    public void validarFecha(Date fechaNacimiento) {
        if (fechaNacimiento.after(new Date())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser futura");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el nombre completo del cliente.
     * 
     * @return Nombre completo (nombre y apellido).
     */
    public String getFullNombre() {
        return nombre + " " + apellido;
    }

    /**
     * Devuelve una representación en cadena del objeto Cliente.
     * 
     * @return Representación en cadena del cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nombre=" + nombre +
                ", apellidos=" + apellido +
                ", telefono=" + telefono +
                ", correo=" + correo +
                ", provincia=" + provincia +
                ", canton=" + canton +
                ", distrito=" + distrito +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
