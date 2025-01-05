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
    private static final String FILE_PATH = "usuarios.txt";
    private final Map<String, Usuario> usuarios = new HashMap<>();

    public LoginLocal() {
        cargarUsuarios();
    }

    // Se cargan los usuarios desde el archivo txt
    private void cargarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 2) {
                    usuarios.put(partes[0], new Usuario(partes[0], partes[1])); // Crear Usuario
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar usuarios: " + e.getMessage());
        }
    }

    // Autentifica las credenciales
    public boolean autenticar(String username, String password) {
        Usuario usuario = usuarios.get(username);
        if (usuario != null) {
            return Utilidades.verifyPassword(password, usuario.getContraseña());
        }
        return false;
    }

    // Inicializa con estos usuarios de prueba
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

    // Vlida credenciales
    public boolean validarCredenciales(String username, String password) {
        return autenticar(username, password);
    }

    // Obteniene los usuarios como objetos
    public Map<String, Usuario> obtenerUsuarios() {
        return usuarios;
    }

    public static void main(String[] args) {
        inicializarArchivoUsuarios();

        LoginLocal login = new LoginLocal();

        // Prueba
        System.out.println("admin -> 1234: " + login.validarCredenciales("admin", "1234"));
        System.out.println("Gabriel -> 1205: " + login.validarCredenciales("Gabriel", "1205"));
        System.out.println("Felipe -> 0202: " + login.validarCredenciales("Felipe", "0202"));
        System.out.println("Daniela -> 9898: " + login.validarCredenciales("Daniela", "9898"));
    }
}
