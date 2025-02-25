/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bicis.test.ui.UI;

import bicis.test.ui.Utilidades;
import java.awt.Color;
import javax.swing.JLabel;
import bicis.test.ui.Cliente;
import bicis.test.ui.TiendaBicicletas;

/**
 *
 * @author gabob
 */

public class RegistroDeClientes extends javax.swing.JFrame {
    
    /**
     * Creates new form MenuPrincipal
     */
    private final TiendaBicicletas tienda; // Instancia de TiendaBicicletas
    
    /**
     * Constructor que inicializa el formulario de registro de clientes.
     * 
     * @param tienda Instancia de TiendaBicicletas utilizada para gestionar los clientes.
     */
    public RegistroDeClientes(TiendaBicicletas tienda) {
        this.tienda = tienda;
        initComponents();
        
        //El array de los JLabels
        JLabel[] labels = {LogoCicloTEC, ClientesLogo,FondoCodigo,
        FondoNombre,FondoApellidos,FondoEmail,FondoTelefono,
        FondoCanton, FondoDistrito, FondoFechaNac};
        
        //Ponerle color JLabel del fondo (Gris Oscuro)
        Color col = new Color(152, 151, 153);
        getContentPane().setBackground(col);
        
        //Nuevo código para ajustar muchos JLabels usando arrays!
        for (JLabel label : labels){
            Utilidades.imageStretcher(label);
        }
        
        //Activar esta línea hasta el final
        Utilidades.setCustomIcon(this, "images/CicloTEC Logo.png");
    }
    
        
    /**
     * Método generado automáticamente para inicializar los componentes de la interfaz gráfica.
     * No debe ser modificado manualmente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoCicloTEC = new javax.swing.JLabel();
        Registro = new javax.swing.JLabel();
        Clientes = new javax.swing.JLabel();
        ClientesLogo = new javax.swing.JLabel();
        Linea = new javax.swing.JLabel();
        LineaHorizontal1 = new javax.swing.JLabel();
        LineaHorizontal2 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Codigo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Teléfono = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Provincia = new javax.swing.JLabel();
        Cantón = new javax.swing.JLabel();
        Distrito = new javax.swing.JLabel();
        FechaNac = new javax.swing.JLabel();
        TextoCodigo = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldApellidos = new javax.swing.JTextField();
        TextFieldTeléfono = new javax.swing.JTextField();
        TextFieldEmail = new javax.swing.JTextField();
        ComboBoxProvincia = new javax.swing.JComboBox<>();
        TextFieldCanton = new javax.swing.JTextField();
        TextFieldDistrito = new javax.swing.JTextField();
        TextFieldCantidad2 = new javax.swing.JTextField();
        FondoCodigo = new javax.swing.JLabel();
        FondoNombre = new javax.swing.JLabel();
        FondoApellidos = new javax.swing.JLabel();
        FondoTelefono = new javax.swing.JLabel();
        FondoEmail = new javax.swing.JLabel();
        FondoCanton = new javax.swing.JLabel();
        FondoDistrito = new javax.swing.JLabel();
        FondoFechaNac = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Clientes - CicloTEC");
        setMinimumSize(new java.awt.Dimension(690, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoCicloTEC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CicloTEC (Tienda).png"))); // NOI18N
        LogoCicloTEC.setText("jLabel4");
        getContentPane().add(LogoCicloTEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 100));

        Registro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 32)); // NOI18N
        Registro.setForeground(new java.awt.Color(51, 51, 51));
        Registro.setText("Registro de");
        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        Clientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 32)); // NOI18N
        Clientes.setForeground(new java.awt.Color(51, 51, 51));
        Clientes.setText("Clientes");
        getContentPane().add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        ClientesLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Clientes.png"))); // NOI18N
        getContentPane().add(ClientesLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 60, 60));

        Linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Línea Vertical.png"))); // NOI18N
        getContentPane().add(Linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 10, 390));

        LineaHorizontal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Línea Horizontal.png"))); // NOI18N
        getContentPane().add(LineaHorizontal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 160, -1));

        LineaHorizontal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Línea Horizontal.png"))); // NOI18N
        getContentPane().add(LineaHorizontal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        Back.setBackground(new java.awt.Color(217, 217, 217));
        Back.setForeground(new java.awt.Color(51, 51, 51));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow Curved - Left.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 50));

        Agregar.setBackground(new java.awt.Color(217, 217, 217));
        Agregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Agregar.setForeground(new java.awt.Color(51, 51, 51));
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 120, 30));

        Buscar.setBackground(new java.awt.Color(217, 217, 217));
        Buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Buscar.setForeground(new java.awt.Color(51, 51, 51));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 120, 30));

        Modificar.setBackground(new java.awt.Color(217, 217, 217));
        Modificar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Modificar.setForeground(new java.awt.Color(51, 51, 51));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 120, 30));

        Eliminar.setBackground(new java.awt.Color(217, 217, 217));
        Eliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(81, 18, 18));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 120, 30));

        Codigo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Codigo.setForeground(new java.awt.Color(51, 51, 51));
        Codigo.setText("Código:");
        getContentPane().add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        Nombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(51, 51, 51));
        Nombre.setText("Nombre:");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        Apellidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(51, 51, 51));
        Apellidos.setText("Apellidos:");
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        Teléfono.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Teléfono.setForeground(new java.awt.Color(51, 51, 51));
        Teléfono.setText("Teléfono:");
        getContentPane().add(Teléfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        Email.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(51, 51, 51));
        Email.setText("Email:");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        Provincia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Provincia.setForeground(new java.awt.Color(51, 51, 51));
        Provincia.setText("Provincia:");
        getContentPane().add(Provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        Cantón.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Cantón.setForeground(new java.awt.Color(51, 51, 51));
        Cantón.setText("Cantón:");
        getContentPane().add(Cantón, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        Distrito.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Distrito.setForeground(new java.awt.Color(51, 51, 51));
        Distrito.setText("Distrito:");
        getContentPane().add(Distrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        FechaNac.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        FechaNac.setForeground(new java.awt.Color(51, 51, 51));
        FechaNac.setText("Fecha de Nacimiento:");
        getContentPane().add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        TextoCodigo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextoCodigo.setText("...");
        getContentPane().add(TextoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        TextFieldNombre.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextFieldNombre.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldNombre.setBorder(null);
        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 320, 20));

        TextFieldApellidos.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextFieldApellidos.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldApellidos.setBorder(null);
        getContentPane().add(TextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 310, 20));

        TextFieldTeléfono.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldTeléfono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldTeléfono.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldTeléfono.setBorder(null);
        getContentPane().add(TextFieldTeléfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 310, 20));

        TextFieldEmail.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldEmail.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldEmail.setBorder(null);
        getContentPane().add(TextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 340, 20));

        ComboBoxProvincia.setBackground(new java.awt.Color(217, 217, 217));
        ComboBoxProvincia.setForeground(new java.awt.Color(51, 51, 51));
        ComboBoxProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "San_José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón" }));
        ComboBoxProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxProvinciaActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 330, -1));

        TextFieldCanton.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldCanton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldCanton.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldCanton.setBorder(null);
        getContentPane().add(TextFieldCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 330, 20));

        TextFieldDistrito.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldDistrito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldDistrito.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldDistrito.setBorder(null);
        getContentPane().add(TextFieldDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 330, 20));

        TextFieldCantidad2.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldCantidad2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldCantidad2.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldCantidad2.setBorder(null);
        getContentPane().add(TextFieldCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 210, 20));

        FondoCodigo.setForeground(new java.awt.Color(51, 51, 51));
        FondoCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 350, 30));

        FondoNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 340, 30));

        FondoApellidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 330, 30));

        FondoTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 330, 30));

        FondoEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 360, 30));

        FondoCanton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 350, 30));

        FondoDistrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 350, 30));

        FondoFechaNac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 230, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción realizada al presionar el botón "Back".
     * Muestra el menú principal y cierra la ventana actual.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MenuPrincipal jfmain = new MenuPrincipal();
        jfmain.show(); //Mostrar MenuPrincipal
        dispose(); //Cerrar RegistroDeClientes
    }//GEN-LAST:event_BackActionPerformed
    /**
     * Acción realizada al presionar el botón "Eliminar".
     * Permite eliminar un cliente después de confirmar la acción.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    // Mostrar un diálogo de confirmación
    int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
        this, 
        "¿Está seguro de que desea eliminar este cliente?", 
        "Confirmar Eliminación", 
        javax.swing.JOptionPane.YES_NO_OPTION
    );
    
    // Si el usuario confirma (selecciona "Sí")
    if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
        try {
            // Solicitar el código del cliente a eliminar
            String codigoStr = javax.swing.JOptionPane.showInputDialog(
                this, 
                "Ingrese el código del cliente a eliminar:", 
                "Eliminar Cliente", 
                javax.swing.JOptionPane.QUESTION_MESSAGE
            );
            
            // Validar que se ingresó un código
            if (codigoStr != null && !codigoStr.trim().isEmpty()) {
                try {
                    int codigo = Integer.parseInt(codigoStr.trim());
                    
                    // Buscar y eliminar el cliente
                    Cliente clienteAEliminar = tienda.buscarCliente(codigo, null, null);
                    
                    if (clienteAEliminar != null) {
                        tienda.eliminarCliente(codigo);
                        
                        // Mostrar mensaje de éxito
                        javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Cliente eliminado exitosamente", 
                            "Eliminación Exitosa", 
                            javax.swing.JOptionPane.INFORMATION_MESSAGE
                        );
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "No se encontró un cliente con ese código", 
                            "Error", 
                            javax.swing.JOptionPane.ERROR_MESSAGE
                        );
                    }
                } catch (NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Código inválido. Debe ser un número.", 
                        "Error", 
                        javax.swing.JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "Error al eliminar cliente: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
    }       
    }//GEN-LAST:event_EliminarActionPerformed
    /**
     * Acción realizada al presionar el botón "Modificar".
     * Permite modificar los datos de un cliente seleccionado.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // Verificar si hay clientes registrados
        if (tienda.getClientes().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "No hay clientes registrados para modificar.", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Crear un diálogo para seleccionar el cliente a modificar
        String[] opcionesClientes = new String[tienda.getClientes().size()];
        for (int i = 0; i < tienda.getClientes().size(); i++) {
            Cliente cliente = tienda.getClientes().get(i);
            opcionesClientes[i] = "Código: " + cliente.getCodigo() + 
                                   " - Nombre: " + cliente.getNombre() + 
                                   " " + cliente.getApellido();
        }

        // Mostrar diálogo de selección de cliente
        String clienteSeleccionado = (String) javax.swing.JOptionPane.showInputDialog(
            this,
            "Seleccione el cliente a modificar:",
            "Modificar Cliente",
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null,
            opcionesClientes,
            opcionesClientes[0]
        );

        // Si se cancela la selección
        if (clienteSeleccionado == null) {
            return;
        }

        // Extraer el código del cliente seleccionado
        int codigoCliente = Integer.parseInt(clienteSeleccionado.split(" ")[1]);

        // Buscar el cliente
        Cliente cliente = tienda.buscarCliente(codigoCliente, null, null);

        if (cliente == null) {
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "Cliente no encontrado.", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Crear un diálogo de opciones de modificación
        String[] opcionesModificacion = {
            "Nombre", 
            "Apellidos", 
            "Teléfono", 
            "Email", 
            "Provincia", 
            "Cantón", 
            "Distrito", 
            "Fecha de Nacimiento"
        };

        String opcionSeleccionada = (String) javax.swing.JOptionPane.showInputDialog(
            this,
            "Seleccione el campo a modificar:",
            "Modificar Cliente",
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null,
            opcionesModificacion,
            opcionesModificacion[0]
        );

        // Si se cancela la selección
        if (opcionSeleccionada == null) {
            return;
        }

        // Mostrar información actual antes de modificar
        String valorActual = "";
        switch (opcionSeleccionada) {
            case "Nombre":
                valorActual = cliente.getNombre();
                break;
            case "Apellidos":
                valorActual = cliente.getApellido();
                break;
            case "Teléfono":
                valorActual = String.valueOf(cliente.getTelefono());
                break;
            case "Email":
                valorActual = cliente.getCorreo();
                break;
            case "Provincia":
                valorActual = cliente.getProvincia().toString();
                break;
            case "Cantón":
                valorActual = cliente.getCanton();
                break;
            case "Distrito":
                valorActual = cliente.getDistrito();
                break;
            case "Fecha de Nacimiento":
                valorActual = new java.text.SimpleDateFormat("dd/MM/yyyy").format(cliente.getFechaNacimiento());
                break;
        }

        // Solicitar nuevo valor
        String nuevoValor = javax.swing.JOptionPane.showInputDialog(
            this,
            "Valor actual: " + valorActual + "\nIngrese el nuevo valor:",
            "Modificar " + opcionSeleccionada,
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        // Si se cancela la modificación
        if (nuevoValor == null || nuevoValor.trim().isEmpty()) {
            return;
        }

        // Realizar la modificación según la opción seleccionada
        try {
            switch (opcionSeleccionada) {
                case "Nombre":
                    cliente.setNombre(nuevoValor);
                    break;
                case "Apellidos":
                    cliente.setApellido(nuevoValor);
                    break;
                case "Teléfono":
                    cliente.setTelefono(Integer.parseInt(nuevoValor));
                    break;
                case "Email":
                    cliente.validarCorreo(nuevoValor);
                    break;
                case "Provincia":
                    cliente.setProvincia(Cliente.Provincia.valueOf(nuevoValor.toUpperCase().replace(" ", "_")));
                    break;
                case "Cantón":
                    cliente.setCanton(nuevoValor);
                    break;
                case "Distrito":
                    cliente.setDistrito(nuevoValor);
                    break;
                case "Fecha de Nacimiento":
                    java.util.Date fechaNueva = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(nuevoValor);
                    cliente.validarFecha(fechaNueva);
                    break;
            }

            // Actualizar el cliente en la tienda
            tienda.editarCliente(cliente);

            javax.swing.JOptionPane.showMessageDialog(
                this, 
                opcionSeleccionada + " modificado exitosamente.", 
                "Modificación Exitosa", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "Error al modificar: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_ModificarActionPerformed
    /**
     * Acción realizada al ingresar texto en el campo de nombre.
     * (Actualmente no implementado).
     * 
     * @param evt Evento de acción generado por el campo de texto.
     */
    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed
    /**
     * Acción realizada al presionar el botón "Agregar".
     * Registra un nuevo cliente en el sistema si los datos ingresados son válidos.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        try {
            // Obtener los valores de los campos de texto
            String nombre = TextFieldNombre.getText().trim();
            String apellidos = TextFieldApellidos.getText().trim();
            String telefonoStr = TextFieldTeléfono.getText().trim();
            String correo = TextFieldEmail.getText().trim();
            String canton = TextFieldCanton.getText().trim();
            String distrito = TextFieldDistrito.getText().trim();

            // Validar que los campos no estén vacíos
            if (nombre.isEmpty() || apellidos.isEmpty() || telefonoStr.isEmpty() || 
                correo.isEmpty() || canton.isEmpty() || distrito.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Todos los campos son obligatorios", 
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Convertir teléfono a entero
            int telefono;
            try {
                telefono = Integer.parseInt(telefonoStr);
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "El teléfono debe ser un número válido", 
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Obtener la provincia del ComboBox
            String provinciaStr = (String) ComboBoxProvincia.getSelectedItem();
            Cliente.Provincia provincia = Cliente.Provincia.valueOf(provinciaStr.toUpperCase().replace(" ", "_"));

            // Obtener la fecha de nacimiento
            java.util.Date fechaNacimiento;
            try {
                fechaNacimiento = new java.text.SimpleDateFormat("dd/MM/yyyy")
                    .parse(TextFieldCantidad2.getText().trim());
            } catch (java.text.ParseException e) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Formato de fecha inválido. Use dd/MM/yyyy", 
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear nuevo cliente
            Cliente nuevoCliente = new Cliente(
                0, 
                nombre, 
                apellidos, 
                telefono, 
                correo, 
                provincia, 
                canton, 
                distrito, 
                fechaNacimiento
            );

            // Validar correo
            try {
                nuevoCliente.validarCorreo(correo);
            } catch (IllegalArgumentException e) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Correo electrónico inválido", 
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar fecha de nacimiento
            try {
                nuevoCliente.validarFecha(fechaNacimiento);
            } catch (IllegalArgumentException e) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Fecha de nacimiento inválida", 
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Registrar cliente en la tienda
            tienda.registrarCliente(nuevoCliente);

            // Mostrar mensaje de éxito
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Cliente registrado exitosamente\n Nombre: " + nombre, 
                "Registro Exitoso", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // Limpiar campos después del registro
            limpiarCampos();

        } catch (Exception e) {
            // Manejo de cualquier otra excepción inesperada
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Error al registrar cliente: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
    * Método para limpiar los campos después del registro
    */
    private void limpiarCampos() {
        TextFieldNombre.setText("");
        TextFieldApellidos.setText("");
        TextFieldTeléfono.setText("");
        TextFieldEmail.setText("");
        TextFieldCanton.setText("");
        TextFieldDistrito.setText("");
        TextFieldCantidad2.setText("");
        ComboBoxProvincia.setSelectedIndex(0);
        TextoCodigo.setText("...");
    }//GEN-LAST:event_AgregarActionPerformed
    /**
     * Acción realizada al seleccionar una provincia del ComboBox.
     * (Actualmente no implementado).
     * 
     * @param evt Evento de acción generado por el ComboBox.
     */
    private void ComboBoxProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxProvinciaActionPerformed
    /**
     * Acción realizada al presionar el botón "Buscar".
     * Permite buscar un cliente en el sistema utilizando diferentes criterios.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // Crear un array de opciones de búsqueda
        String[] opcionesBusqueda = {"Código", "Nombre", "Apellidos"};

        // Diálogo de selección para el método de búsqueda
        String metodoBusqueda = (String) javax.swing.JOptionPane.showInputDialog(
            this,
            "Seleccione el método de búsqueda:",
            "Buscar Cliente",
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null,
            opcionesBusqueda,
            opcionesBusqueda[0]
        );

        // Si se cancela la selección, salir del método
        if (metodoBusqueda == null) {
            return;
        }

        // Solicitar el valor de búsqueda según el método seleccionado
        String valorBusqueda = javax.swing.JOptionPane.showInputDialog(
            this,
            "Ingrese " + metodoBusqueda + " del cliente:",
            "Buscar Cliente",
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        // Si se cancela la entrada, salir del método
        if (valorBusqueda == null || valorBusqueda.trim().isEmpty()) {
            return;
        }

        // Realizar la búsqueda según el método seleccionado
        Cliente clienteEncontrado = null;

        try {
            switch (metodoBusqueda) {
                case "Código" -> {
                    int codigo = Integer.parseInt(valorBusqueda.trim());
                    clienteEncontrado = tienda.buscarCliente(codigo, null, null);
                }

                case "Nombre" -> clienteEncontrado = tienda.buscarCliente(-1, valorBusqueda.trim(), null);

                case "Apellidos" -> clienteEncontrado = tienda.buscarCliente(-1, null, valorBusqueda.trim());
            }

            // Mostrar el resultado de la búsqueda
            if (clienteEncontrado != null) {
                // Mostrar los detalles del cliente encontrado
                String detallesCliente = "Código: " + clienteEncontrado.getCodigo() + "\n" +
                                         "Nombre: " + clienteEncontrado.getNombre() + "\n" +
                                         "Apellidos: " + clienteEncontrado.getApellido() + "\n" +
                                         "Teléfono: " + clienteEncontrado.getTelefono() + "\n" +
                                         "Email: " + clienteEncontrado.getCorreo() + "\n" +
                                         "Provincia: " + clienteEncontrado.getProvincia() + "\n" +
                                         "Cantón: " + clienteEncontrado.getCanton() + "\n" +
                                         "Distrito: " + clienteEncontrado.getDistrito() + "\n" +
                                         "Fecha de Nacimiento: " + 
                                         new java.text.SimpleDateFormat("dd/MM/yyyy").format(clienteEncontrado.getFechaNacimiento());

                javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    detallesCliente, 
                    "Cliente Encontrado", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE
                );

            } else {
                javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "No se encontró ningún cliente con " + metodoBusqueda + ": " + valorBusqueda, 
                    "Cliente No Encontrado", 
                    javax.swing.JOptionPane.WARNING_MESSAGE
                );
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "El código debe ser un número válido", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "Error al buscar cliente: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
   
    }//GEN-LAST:event_BuscarActionPerformed

    /**
     * Método principal que crea y muestra el formulario de registro de clientes.
     * 
     * @param args Argumentos de la línea de comandos.
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
            java.util.logging.Logger.getLogger(RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TiendaBicicletas tienda = new TiendaBicicletas(); // Crear instancia de TiendaBicicletas
                new RegistroDeClientes(tienda).setVisible(true); // Pasar la tienda al constructor
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel Apellidos;
    private javax.swing.JButton Back;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Cantón;
    private javax.swing.JLabel Clientes;
    private javax.swing.JLabel ClientesLogo;
    private javax.swing.JLabel Codigo;
    private javax.swing.JComboBox<String> ComboBoxProvincia;
    private javax.swing.JLabel Distrito;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FechaNac;
    private javax.swing.JLabel FondoApellidos;
    private javax.swing.JLabel FondoCanton;
    private javax.swing.JLabel FondoCodigo;
    private javax.swing.JLabel FondoDistrito;
    private javax.swing.JLabel FondoEmail;
    private javax.swing.JLabel FondoFechaNac;
    private javax.swing.JLabel FondoNombre;
    private javax.swing.JLabel FondoTelefono;
    private javax.swing.JLabel Linea;
    private javax.swing.JLabel LineaHorizontal1;
    private javax.swing.JLabel LineaHorizontal2;
    private javax.swing.JLabel LogoCicloTEC;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Provincia;
    private javax.swing.JLabel Registro;
    private javax.swing.JLabel Teléfono;
    private javax.swing.JTextField TextFieldApellidos;
    private javax.swing.JTextField TextFieldCantidad2;
    private javax.swing.JTextField TextFieldCanton;
    private javax.swing.JTextField TextFieldDistrito;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldTeléfono;
    private javax.swing.JLabel TextoCodigo;
    // End of variables declaration//GEN-END:variables
}
