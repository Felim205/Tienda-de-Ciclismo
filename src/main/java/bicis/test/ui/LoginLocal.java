/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gabob
 */

public class LoginLocal {
    // Ruta al txt
    private static final String FILE_PATH = "usuarios.txt";
    private Map<String, String> usuarios = new HashMap<>();

    public LoginLocal() {
        cargarUsuarios();
    }

    // Método que carga los usuarios
    private void cargarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 2) {
                    usuarios.put(partes[0], partes[1]); // username|password_hash
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar usuarios: " + e.getMessage());
        }
    }

    // Verificador del usuario
    public boolean autenticar(String username, String password) {
        if (usuarios.containsKey(username)) {
            String hashAlmacenado = usuarios.get(username);
            return Utilidades.verifyPassword(password, hashAlmacenado);
        }
        return false;
    }

    // Creador del txt (Mejor dejarlo por si se elimina en algún momento)
    public static void inicializarArchivoUsuarios() {
        String[] usuariosIniciales = {
            "admin|" + Utilidades.hashPassword("1234"),
            "Gabriel|" + Utilidades.hashPassword("1205"),
            "Felipe|" + Utilidades.hashPassword("0202"),
            "Daniela|" + Utilidades.hashPassword("9898")
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String usuario : usuariosIniciales) {
                bw.write(usuario);
                bw.newLine();
            }
            System.out.println("Archivo de usuarios inicializado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al inicializar el archivo de usuarios: " + e.getMessage());
        }
    }

    
    
    
    // Los métodos para la gui
    public boolean validarCredenciales(String username, String password) {
        return autenticar(username, password);
    }

    public Map<String, String> obtenerUsuarios() {
        return usuarios;
    }

    // El main vuelve a crear el txt de ser necesario y nos recuerda las 
    //contraseñas
    public static void main(String[] args) {
        // Inicializar archivo de usuarios
        inicializarArchivoUsuarios();

        // Crear instancia de LoginLocal
        LoginLocal login = new LoginLocal();

        // Prueba de autenticación
        System.out.println("Recordar usuarios y contraseñas:");
        System.out.println("admin -> 1234: " + login.validarCredenciales("admin", "1234")); // true
        System.out.println("Gabriel -> 1205: " + login.validarCredenciales("Gabriel", "1205")); // true
        System.out.println("Felipe -> 0202: " + login.validarCredenciales("Felipe", "0202")); // true
        System.out.println("Daniela -> 9999: " + login.validarCredenciales("Daniela", "9898")); // true
    }
}
