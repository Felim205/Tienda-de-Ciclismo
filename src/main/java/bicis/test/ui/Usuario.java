/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;


public class Usuario {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombre, String contraseña) {
        this.nombreUsuario = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombreUsuario = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString(){
        return "Usuario{" + "nombre=" + nombreUsuario +
               ", contraseña=" + contraseña + '}';
        
    }
    
}
