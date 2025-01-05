/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author gabob
 */
public class Utilidades {
    
    public static void imageStretcher(JLabel stretcyImage) {
    //Ajusta el tamaño de la imágen para que esta
    //quepa dentro del jLabel
    Icon i = stretcyImage.getIcon();
    ImageIcon icon = (ImageIcon)i;
    Image image = icon.getImage().getScaledInstance(stretcyImage.getWidth(), stretcyImage.getHeight(), Image.SCALE_SMOOTH);
    stretcyImage.setIcon(new ImageIcon(image));
    }
    
    public static void setBackgroundColor (JFrame frame, Color color) {
        //Cambia el color del JFrame principal (El fondo)
        frame.getContentPane().setBackground(color);
    }
    
    public static void setCustomIcon(JFrame frame, String path) {
        //Validación Auxiliar recomendada
        if (frame == null || path == null || path.isEmpty()) {
            throw new IllegalArgumentException("El frame o la ruta del recurso no pueden ser nulos o vacíos.");
        }
        //Agarrar la imagen de res
        frame.setIconImage(
            Toolkit.getDefaultToolkit().getImage(Utilidades.class.getResource("/" + path))
        );
    }
    
    public static String hashPassword(String password) {
        //Hashea las contraseñas
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

    public static boolean verifyPassword(String originalPassword, String hashedPassword) {
        //des-hashea las contraseñas
        return hashPassword(originalPassword).equals(hashedPassword);
    }
    
}
    
