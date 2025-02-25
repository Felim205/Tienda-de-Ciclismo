/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bicis.test.ui.UI;

import bicis.test.ui.Login;
import bicis.test.ui.TiendaBicicletas;
import bicis.test.ui.Utilidades;
import java.awt.Color;

/**
 * Clase que implementa el menú principal de la aplicación CicloTEC.
 * Proporciona accesos directos a las distintas funcionalidades, como
 * registro de productos, registro de clientes, registro de servicios,
 * y facturación.
 * 
 * @author gabob
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Crea un nuevo formulario para el menú principal.
     * Configura los colores de fondo, las imágenes y los íconos.
     */
    public MenuPrincipal() {
        initComponents();
        
        //Ponerle color al JLabel del fondo (Gris oscuro)
        Color col = new Color(152, 151, 153);
        getContentPane().setBackground(col);
        
        //Ajustar las imágenes a los JLabels
        Utilidades.imageStretcher(LogoCicloTEC);
        Utilidades.imageStretcher(menuLogo);
        
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

        LogoCicloTEC = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Principal = new javax.swing.JLabel();
        menuLogo = new javax.swing.JLabel();
        Linea = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        RegistroProductos = new javax.swing.JButton();
        RegistroClientes = new javax.swing.JButton();
        RegistroServicios = new javax.swing.JButton();
        Facturacion = new javax.swing.JButton();
        LineaHorizontal1 = new javax.swing.JLabel();
        LineaHorizontal2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - CicloTEC");
        setMinimumSize(new java.awt.Dimension(690, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoCicloTEC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CicloTEC (Tienda).png"))); // NOI18N
        LogoCicloTEC.setText("jLabel4");
        getContentPane().add(LogoCicloTEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 100));

        Menu.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Menu.setForeground(new java.awt.Color(51, 51, 51));
        Menu.setText("Menú");
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        Principal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Principal.setForeground(new java.awt.Color(51, 51, 51));
        Principal.setText("Principal");
        getContentPane().add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        menuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Menu.png"))); // NOI18N
        getContentPane().add(menuLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 60, 60));

        Linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Línea Vertical.png"))); // NOI18N
        getContentPane().add(Linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 10, 390));

        Login.setBackground(new java.awt.Color(217, 217, 217));
        Login.setForeground(new java.awt.Color(51, 51, 51));
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon-Login.png"))); // NOI18N
        Login.setBorderPainted(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 50));

        RegistroProductos.setBackground(new java.awt.Color(217, 217, 217));
        RegistroProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro de productos.png"))); // NOI18N
        RegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroProductosActionPerformed(evt);
            }
        });
        getContentPane().add(RegistroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 140, 140));

        RegistroClientes.setBackground(new java.awt.Color(217, 217, 217));
        RegistroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro de clientes.png"))); // NOI18N
        RegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroClientesActionPerformed(evt);
            }
        });
        getContentPane().add(RegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 140, 140));

        RegistroServicios.setBackground(new java.awt.Color(217, 217, 217));
        RegistroServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro de servicios.png"))); // NOI18N
        RegistroServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroServiciosActionPerformed(evt);
            }
        });
        getContentPane().add(RegistroServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 140, 140));

        Facturacion.setBackground(new java.awt.Color(217, 217, 217));
        Facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Facturación.png"))); // NOI18N
        Facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturacionActionPerformed(evt);
            }
        });
        getContentPane().add(Facturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 140, 140));

        LineaHorizontal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Línea Horizontal.png"))); // NOI18N
        getContentPane().add(LineaHorizontal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 160, -1));

        LineaHorizontal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Línea Horizontal.png"))); // NOI18N
        getContentPane().add(LineaHorizontal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /**
     * Acción ejecutada al presionar el botón "Login".
     * Redirige al formulario de inicio de sesión.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Login jflogin = new Login();
        jflogin.show(); //Login
        dispose(); //Cerrar MainMenu
    }//GEN-LAST:event_LoginActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Registro de Productos".
     * Redirige al formulario para registrar productos.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void RegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroProductosActionPerformed
        RegistroDeProductos jfproductos = new RegistroDeProductos();
        jfproductos.show(); //Registro de Productos
        dispose(); //Cerrar MainMenu
    }//GEN-LAST:event_RegistroProductosActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Registro de Clientes".
     * Redirige al formulario para registrar clientes.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void RegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroClientesActionPerformed
        TiendaBicicletas tienda = new TiendaBicicletas();
        RegistroDeClientes jfclientes = new RegistroDeClientes(tienda);
        jfclientes.show(); //Registro de Clientes
        dispose(); //Cerrar MainMenu
    }//GEN-LAST:event_RegistroClientesActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Registro de Servicios".
     * Redirige al formulario para registrar servicios.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void RegistroServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroServiciosActionPerformed
        RegistroDeServicios jfservicios = new RegistroDeServicios();
        jfservicios.show(); //Registro de Servicios
        dispose(); //Cerrar MainMenu
    }//GEN-LAST:event_RegistroServiciosActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Facturación".
     * Redirige al formulario de facturación.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void FacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturacionActionPerformed
        Facturacion jffacturacion = new Facturacion();
        jffacturacion.show(); //Facturacion
        dispose(); //Cerrar MainMenu
    }//GEN-LAST:event_FacturacionActionPerformed

    /**
     * Método principal para ejecutar la aplicación.
     * Crea y muestra el formulario del menú principal.
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Facturacion;
    private javax.swing.JLabel Linea;
    private javax.swing.JLabel LineaHorizontal1;
    private javax.swing.JLabel LineaHorizontal2;
    private javax.swing.JButton Login;
    private javax.swing.JLabel LogoCicloTEC;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Principal;
    private javax.swing.JButton RegistroClientes;
    private javax.swing.JButton RegistroProductos;
    private javax.swing.JButton RegistroServicios;
    private javax.swing.JLabel menuLogo;
    // End of variables declaration//GEN-END:variables
}
