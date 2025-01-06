/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

/**
 * Clase que representa un usuario en el sistema.
 * Contiene el nombre de usuario y la contraseña asociados al usuario.
 * 
 * @author gabob
 */
public class Usuario {
    private String nombreUsuario;
    private String contraseña;

    /**
     * Constructor que inicializa un nuevo usuario con un nombre y una contraseña.
     * 
     * @param nombre Nombre del usuario.
     * @param contraseña Contraseña del usuario.
     */
    public Usuario(String nombre, String contraseña) {
        this.nombreUsuario = nombre;
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombreUsuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return Contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece un nuevo nombre para el usuario.
     * 
     * @param nombre Nuevo nombre para el usuario.
     */
    public void setNombre(String nombre) {
        this.nombreUsuario = nombre;
    }

    /**
     * Establece una nueva contraseña para el usuario.
     * 
     * @param contraseña Nueva contraseña para el usuario.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Devuelve una representación en cadena del objeto Usuario.
     * 
     * @return Cadena que representa al usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombreUsuario +
               ", contraseña=" + contraseña + '}';
    }
}
