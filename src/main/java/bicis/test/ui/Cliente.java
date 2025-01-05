/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.Date;

public class Cliente {
    private int codigo;
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;
    private Provincia provincia;
    private String canton;
    private String distrito;
    private Date fechaNacimiento;
    
    public enum Provincia {
        ALAJUELA, CARTAGO, GUANACASTE, HEREDIA, LIMON, PUNTARENAS, SAN_JOSE
    }

    public Cliente(int codigo, String nombre, String apellido, int telefono, String correo, Provincia provincia, String canton, String distrito, Date fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public String getCanton() {
        return canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int crearCodigo(){
        return (nombre + apellido + telefono).hashCode();
    }
    
    public void validarCorreo(String correo){
        if (!correo.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
            throw new IllegalArgumentException("El correo no es valido");
        }
        this.correo = correo;
    }
    
    public void validarFecha(Date fechaNacimiento){
        if (fechaNacimiento.after(new Date())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser futura");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    // Validar teléfono
    public void validarTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String getFullNombre(){
    return nombre + " " + apellido;
    }
    
    // Método toString
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
