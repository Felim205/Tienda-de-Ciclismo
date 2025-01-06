package bicis.test.ui;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase que implementa la gestión de usuarios y el proceso de autenticación local
 * basado en un archivo binario (.acc). Los usuarios se cargan desde el archivo y se
 * validan sus credenciales en el sistema.
 * También permite agregar nuevos usuarios dinámicamente.
 * 
 * @author gabob
 */
public class LoginLocal {
    private static final String FILE_PATH = "usuarios.acc";
    private final Map<String, Usuario> usuarios = new HashMap<>();

    /**
     * Constructor que inicializa la instancia de LoginLocal cargando los usuarios
     * desde el archivo binario.
     */
    public LoginLocal() {
        cargarUsuarios();
    }

    /**
     * Carga los usuarios desde un archivo binario y los almacena en un mapa.
     * Cada línea del archivo debe tener el formato "username, contraseña".
     */
    private void cargarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    usuarios.put(partes[0].trim(), new Usuario(partes[0].trim(), partes[1].trim())); // Crear Usuario
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de usuarios no encontrado. Se creará uno nuevo.");
        } catch (IOException e) {
            System.out.println("Error al cargar usuarios: " + e.getMessage());
        }
    }

    /**
     * Autentica las credenciales de un usuario comparando el nombre de usuario
     * y la contraseña proporcionados contra los datos almacenados.
     * 
     * @param username Nombre de usuario.
     * @param password Contraseña en texto plano.
     * @return {@code true} si las credenciales son válidas, {@code false} en caso contrario.
     */
    public boolean autenticar(String username, String password) {
        Usuario usuario = usuarios.get(username);
        if (usuario != null) {
            return Utilidades.verifyPassword(password, usuario.getContraseña());
        }
        return false;
    }

    /**
     * Inicializa el archivo de usuarios con una lista de usuarios de prueba.
     * Cada usuario tendrá un nombre y una contraseña predefinida.
     */
    public static void inicializarArchivoUsuarios() {
        File archivoUsuarios = new File("usuarios.acc");
        if (!archivoUsuarios.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoUsuarios))) {
                String[] usuariosIniciales = {
                    "admin, " + Utilidades.hashPassword("1234"),
                    "Gabriel, " + Utilidades.hashPassword("1205"),
                    "Felipe, " + Utilidades.hashPassword("0202"),
                    "Daniela, " + Utilidades.hashPassword("9898"), 
                    "pperez, " + Utilidades.hashPassword("12345"),
                    "ccastro, " + Utilidades.hashPassword("castro123")
                };

                for (String usuario : usuariosIniciales) {
                    bw.write(usuario);
                    bw.newLine();
                }
                System.out.println("Archivo de usuarios creado correctamente.");
            } catch (IOException e) {
                System.err.println("Error al crear el archivo de usuarios: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo de usuarios ya existe.");
        }
    }

    /**
     * Agrega un nuevo usuario al archivo de usuarios y lo registra en el mapa.
     * 
     * @param username Nombre de usuario a agregar.
     * @param password Contraseña del usuario en texto plano.
     * @throws IllegalArgumentException Si el usuario ya existe o los datos son inválidos.
     */
    public void agregarUsuario(String username, String password) {
        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario y la contraseña no pueden estar vacíos.");
        }

        if (usuarios.containsKey(username)) {
            throw new IllegalArgumentException("El usuario ya existe.");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            // Encriptar la contraseña antes de escribirla
            String hashedPassword = Utilidades.hashPassword(password);

            // Escribir en el archivo
            bw.write(username + ", " + hashedPassword);
            bw.newLine();

            // Actualizar el mapa en memoria
            usuarios.put(username, new Usuario(username, hashedPassword));
            System.out.println("Usuario agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar el usuario: " + e.getMessage());
        }
    }

    /**
     * Valida las credenciales del usuario llamando al método {@link #autenticar}.
     * 
     * @param username Nombre de usuario.
     * @param password Contraseña en texto plano.
     * @return {@code true} si las credenciales son válidas, {@code false} en caso contrario.
     */
    public boolean validarCredenciales(String username, String password) {
        return autenticar(username, password);
    }

    /**
     * Obtiene el mapa de usuarios registrados en el sistema como objetos {@link Usuario}.
     * 
     * @return Mapa que contiene los usuarios, donde la clave es el nombre de usuario.
     */
    public Map<String, Usuario> obtenerUsuarios() {
        return usuarios;
    }

    /**
     * Método principal para probar la funcionalidad del sistema de autenticación local.
     * Inicializa el archivo de usuarios y realiza pruebas de inicio de sesión.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        inicializarArchivoUsuarios();

        LoginLocal login = new LoginLocal();

        // Pruebas
        System.out.println("admin -> 1234: " + login.validarCredenciales("admin", "1234"));
        System.out.println("Gabriel -> 1205: " + login.validarCredenciales("Gabriel", "1205"));
        System.out.println("Felipe -> 0202: " + login.validarCredenciales("Felipe", "0202"));
        System.out.println("Daniela -> 9898: " + login.validarCredenciales("Daniela", "9898"));

        // Agregar nuevo usuario
        login.agregarUsuario("nuevoUsuario", "nuevaContraseña");
        System.out.println("nuevoUsuario -> nuevaContraseña: " + login.validarCredenciales("nuevoUsuario", "nuevaContraseña"));
    }
}
