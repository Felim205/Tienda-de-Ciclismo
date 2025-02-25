/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bicis.test.ui;

import bicis.test.ui.UI.MenuPrincipal;
import javax.swing.JOptionPane;
import java.awt.Color;

/**
 * Clase que implementa la interfaz gráfica de inicio de sesión para la aplicación CicloTEC.
 * Permite a los usuarios autenticarse con un ID y una contraseña para acceder al menú principal
 * o agregar nuevos usuarios mediante el botón "Agregar Usuario".
 * 
 * @author gabob
 */
public class Login extends javax.swing.JFrame {
    private final LoginLocal loginLocal;

    /**
     * Crea una nueva instancia de la ventana de inicio de sesión.
     * Configura los colores de fondo, ajusta las imágenes y establece el ícono de la ventana.
     */
    public Login() {
        initComponents();
        loginLocal = new LoginLocal();
        LoginLocal.inicializarArchivoUsuarios();
        
        //Ponerle color al JLabel del fondo (Gris oscuro)
        Color col = new Color(152, 151, 153);
        getContentPane().setBackground(col);
        
        //Ajustar las imágenes a los JLabels
        Utilidades.imageStretcher(LogoCicloTEC);
        Utilidades.imageStretcher(GIF);
        
        //Activar esta línea hasta el final
        Utilidades.setCustomIcon(this, "images/CicloTEC Logo.png");
    }

    /**
     * Método generado automáticamente para inicializar los componentes gráficos.
     * No modificar el contenido directamente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GIF = new javax.swing.JLabel();
        FondoGIF = new javax.swing.JLabel();
        TextLogin = new javax.swing.JLabel();
        TextoID = new javax.swing.JLabel();
        TextFieldID = new javax.swing.JTextField();
        TextoContraseña = new javax.swing.JLabel();
        PasswordFieldContraseña = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        TextoDummy = new javax.swing.JLabel();
        DummyBtn = new javax.swing.JButton();
        LogoCicloTEC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - CicloTEC");
        setMinimumSize(new java.awt.Dimension(690, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginGIf2.gif"))); // NOI18N
        getContentPane().add(GIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 320));

        FondoGIF.setBackground(new java.awt.Color(38, 38, 38));
        FondoGIF.setForeground(new java.awt.Color(38, 38, 38));
        FondoGIF.setOpaque(true);
        getContentPane().add(FondoGIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 330, 460));

        TextLogin.setFont(new java.awt.Font("Segoe UI Semibold", 2, 38)); // NOI18N
        TextLogin.setForeground(new java.awt.Color(51, 51, 51));
        TextLogin.setText("Login");
        getContentPane().add(TextLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        TextoID.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        TextoID.setForeground(new java.awt.Color(51, 51, 51));
        TextoID.setText("ID:");
        getContentPane().add(TextoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        TextFieldID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        getContentPane().add(TextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 260, 30));

        TextoContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        TextoContraseña.setForeground(new java.awt.Color(51, 51, 51));
        TextoContraseña.setText("Contraseña:");
        getContentPane().add(TextoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        PasswordFieldContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        getContentPane().add(PasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 260, 30));

        LoginButton.setBackground(new java.awt.Color(38, 38, 38));
        LoginButton.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(217, 217, 217));
        LoginButton.setText("Login");
        LoginButton.setBorder(null);
        LoginButton.setBorderPainted(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 80, 30));

        TextoDummy.setFont(new java.awt.Font("Segoe UI Semibold", 2, 10)); // NOI18N
        TextoDummy.setForeground(new java.awt.Color(51, 51, 51));
        TextoDummy.setText("O, alternaticamente podemos:");
        getContentPane().add(TextoDummy, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        DummyBtn.setBackground(new java.awt.Color(217, 217, 217));
        DummyBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        DummyBtn.setForeground(new java.awt.Color(51, 51, 51));
        DummyBtn.setText("Agregar Usuario");
        DummyBtn.setBorderPainted(false);
        DummyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DummyBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DummyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 110, 20));

        LogoCicloTEC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CicloTEC (Tienda).png"))); // NOI18N
        LogoCicloTEC.setText("jLabel4");
        getContentPane().add(LogoCicloTEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción ejecutada al presionar el botón "Agregar".
     * Pregunta si se desea agregar un nuevo usuario, valida los datos y lo registra.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void DummyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DummyBtnActionPerformed
    String username = TextFieldID.getText().trim();
    String password = new String(PasswordFieldContraseña.getPassword()).trim();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete ambos campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (password.length() < 3 || username.contains(",") || password.contains(",") || password.matches(".*[:;\"&%].*")) {
        JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 3 caracteres y no incluir caracteres especiales como , : ; \" & %.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "¿Desea agregar este usuario?", "Confirmar", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            loginLocal.agregarUsuario(username, password); // Usamos la instancia existente
            JOptionPane.showMessageDialog(this, "Usuario agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_DummyBtnActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Login".
     * Valida las credenciales ingresadas y redirige al menú principal si son correctas.
     * Si las credenciales son incorrectas, muestra un mensaje de error.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
    // Agarramos la info de ID y de Contraseña
    String username = TextFieldID.getText().trim();
    String password = new String(PasswordFieldContraseña.getPassword()).trim();

    // Se inicializa LoginLocalGa
    LoginLocal loginLocal = new LoginLocal();

    // Se revisa la información extraida de ID y de Contraseña
    if (loginLocal.validarCredenciales(username, password)) {
        // Si está bien
        javax.swing.JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // Seguimos al menú principal
        MenuPrincipal jfmain = new MenuPrincipal();
        jfmain.show(); //Mostrar MenuPrincipal
        dispose(); //Cerrar Login
    } else {
        // Si está mal, pop up
        javax.swing.JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    /**
     * Método principal para iniciar la aplicación con la ventana de inicio de sesión.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DummyBtn;
    private javax.swing.JLabel FondoGIF;
    private javax.swing.JLabel GIF;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LogoCicloTEC;
    private javax.swing.JPasswordField PasswordFieldContraseña;
    private javax.swing.JTextField TextFieldID;
    private javax.swing.JLabel TextLogin;
    private javax.swing.JLabel TextoContraseña;
    private javax.swing.JLabel TextoDummy;
    private javax.swing.JLabel TextoID;
    // End of variables declaration//GEN-END:variables
}
