/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import java.security.MessageDigest;
import java.time.format.DateTimeFormatter;
import java.security.NoSuchAlgorithmException;
import java.time.format.DateTimeParseException;

/**
 * Clase de utilidades para realizar tareas comunes en la aplicación CicloTEC.
 * Proporciona métodos para manejar imágenes, colores de fondo, íconos personalizados,
 * manejo de fechas y gestión de contraseñas.
 * 
 * @author gabob
 */
public class Utilidades {

    /**
     * Ajusta el tamaño de la imagen para que se adapte al JLabel proporcionado.
     * 
     * @param stretcyImage JLabel al que se ajustará la imagen.
     */
    public static void imageStretcher(JLabel stretcyImage) {
        Icon i = stretcyImage.getIcon();
        ImageIcon icon = (ImageIcon) i;
        Image image = icon.getImage().getScaledInstance(stretcyImage.getWidth(), stretcyImage.getHeight(), Image.SCALE_SMOOTH);
        stretcyImage.setIcon(new ImageIcon(image));
    }

    /**
     * Cambia el color de fondo del JFrame principal.
     * 
     * @param frame JFrame cuyo fondo se desea cambiar.
     * @param color Color que se aplicará como fondo.
     */
    public static void setBackgroundColor(JFrame frame, Color color) {
        frame.getContentPane().setBackground(color);
    }

    /**
     * Establece un ícono personalizado en un JFrame utilizando un recurso en la ruta especificada.
     * 
     * @param frame JFrame al que se le asignará el ícono.
     * @param path Ruta del recurso de la imagen del ícono.
     * @throws IllegalArgumentException Si el frame o la ruta son nulos o vacíos.
     */
    public static void setCustomIcon(JFrame frame, String path) {
        if (frame == null || path == null || path.isEmpty()) {
            throw new IllegalArgumentException("El frame o la ruta del recurso no pueden ser nulos o vacíos.");
        }
        frame.setIconImage(
            Toolkit.getDefaultToolkit().getImage(Utilidades.class.getResource("/" + path))
        );
    }

    /**
     * Convierte una cadena de texto que representa una fecha en formato "dd-MM-yyyy"
     * a un objeto {@link LocalDate}.
     * 
     * @param fecha Cadena que representa la fecha.
     * @return Objeto {@link LocalDate} o {@code null} si ocurre un error en el parseo.
     */
    public static LocalDate convertirFecha(String fecha) {
        try {
            return LocalDate.parse(fecha.trim(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            System.err.println("Error al convertir fecha: " + e.getMessage());
            return null;
        }
    }

    /**
     * Convierte un objeto {@link LocalDate} a una cadena en formato "dd-MM-yyyy".
     * 
     * @param fecha Objeto {@link LocalDate} que se desea convertir.
     * @return Cadena que representa la fecha o {@code null} si el objeto es nulo.
     */
    public static String convertirFechaAString(LocalDate fecha) {
        if (fecha == null) {
            return null;
        }
        return fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    /**
     * Genera un hash de una contraseña utilizando el algoritmo SHA-256.
     * 
     * @param password Contraseña en texto plano.
     * @return Cadena que representa el hash de la contraseña.
     * @throws RuntimeException Si ocurre un error al generar el hash.
     */
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al generar el hash de la contraseña", e);
        }
    }

    /**
     * Verifica si una contraseña original coincide con su hash utilizando SHA-256.
     * 
     * @param originalPassword Contraseña original en texto plano.
     * @param hashedPassword Hash de la contraseña para verificar.
     * @return {@code true} si la contraseña coincide, {@code false} en caso contrario.
     */
    public static boolean verifyPassword(String originalPassword, String hashedPassword) {
        return hashPassword(originalPassword).equals(hashedPassword);
    }
}
