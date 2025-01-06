/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bicis.test.ui.UI;

import java.awt.Color;
import javax.swing.JLabel;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import bicis.test.ui.Utilidades;
import bicis.test.ui.Servicios.ServicioManager;
import bicis.test.ui.Servicios.ServicioMantenimiento;
import bicis.test.ui.ClienteManager;
import bicis.test.ui.Cliente;
import bicis.test.ui.Bicicleta;
import bicis.test.ui.TiendaBicicletas;
import java.time.format.DateTimeFormatter;

/**
 * Clase que implementa la interfaz gráfica para el registro de servicios de
 * mantenimiento en CicloTEC. Permite agregar, modificar, buscar y eliminar
 * servicios, así como manejar los datos relacionados con los clientes y las bicicletas.
 * 
 * @author gabob
 */
public class RegistroDeServicios extends javax.swing.JFrame {
    private final TiendaBicicletas tienda = new TiendaBicicletas();
    /**
     * Constructor que inicializa la ventana de registro de servicios.
     * Configura los componentes gráficos y carga los datos necesarios
     * para la interfaz, como clientes y estados.
     */
    public RegistroDeServicios() {
        initComponents();
        
        //El array de los JLabels
        JLabel[] labels = {LogoCicloTEC, ServiciosLogo,FondoCodigoServicio,
        FondoMarcaBici,FondoFechaRecibido,FondoPrecio,
        FondoFechaEntrega, FondoObservaciones};
        
        //Ponerle color JLabel del fondo (Gris Oscuro)
        Color col = new Color(152, 151, 153);
        getContentPane().setBackground(col);
        
        //Nuevo código para ajustar muchos JLabels usando arrays!
        for (JLabel label : labels){
            Utilidades.imageStretcher(label);
        }
        
        //Activar esta línea hasta el final
        Utilidades.setCustomIcon(this, "images/CicloTEC Logo.png");
    
        //Actualizar el JLabel del código de servicio
        TextoCodigoServicio.setText(String.valueOf(ServicioManager.getCodigoServicioActual()));
        cargarEstadosEnComboBox();
        cargarClientesEnComboBox();
        
        // Llenar el ComboBoxCliente con los clientes
        for (Cliente cliente : ClienteManager.getClientes()) {
            ComboBoxCliente.addItem(cliente.getFullNombre());
        }
    }
    /**
     * Carga los estados posibles de los servicios en el ComboBoxEstado.
     */
    private void cargarEstadosEnComboBox() {
    ComboBoxEstado.removeAllItems();//Se limpia
    for (ServicioMantenimiento.EstadoServicio estado : ServicioMantenimiento.EstadoServicio.values()) {
        ComboBoxEstado.addItem(estado.name()); //Se agregan los valores
        }
    }
    
    /**
    * Carga los clientes registrados en la TiendaBicicletas al ComboBoxCliente.
    */
    private void cargarClientesEnComboBox() {
        ComboBoxCliente.removeAllItems(); // Limpiar items existentes    
        // Cargar clientes en el ComboBox
        for (Cliente cliente : tienda.getClientes()) {
            ComboBoxCliente.addItem(cliente.getFullNombre());
        }
    }

    /**
     * Limpia los campos del formulario de registro de servicios.
     */
    private void limpiarCampos() {
    TextFieldMarcaBici.setText("");
    jTextArea1.setText("");
    TextFieldPrecio.setText("");
    TextFieldFechaRecibido.setText("");
    TextFieldFechaEntrega.setText("");
    TextFieldObservacion.setText("");
    ComboBoxEstado.setSelectedIndex(0);
    TextoCodigoServicio.setText(String.valueOf(ServicioManager.getCodigoServicioActual())); // Establecer el código actual por defecto
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
        Servicios = new javax.swing.JLabel();
        ServiciosLogo = new javax.swing.JLabel();
        Linea = new javax.swing.JLabel();
        LineaHorizontal1 = new javax.swing.JLabel();
        LineaHorizontal2 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        CodigoServicio = new javax.swing.JLabel();
        CodigoCliente = new javax.swing.JLabel();
        MarcaBicicleta = new javax.swing.JLabel();
        Descripción = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        FechaRecibido = new javax.swing.JLabel();
        FechaEntrega = new javax.swing.JLabel();
        Observaciones = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        TextoCodigoServicio = new javax.swing.JLabel();
        ComboBoxCliente = new javax.swing.JComboBox<>();
        TextFieldMarcaBici = new javax.swing.JTextField();
        jScrollPaneDescripcion = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TextFieldPrecio = new javax.swing.JTextField();
        TextFieldFechaRecibido = new javax.swing.JTextField();
        TextFieldFechaEntrega = new javax.swing.JTextField();
        TextFieldObservacion = new javax.swing.JTextField();
        ComboBoxEstado = new javax.swing.JComboBox<>();
        FondoCodigoServicio = new javax.swing.JLabel();
        FondoMarcaBici = new javax.swing.JLabel();
        FondoPrecio = new javax.swing.JLabel();
        FondoFechaRecibido = new javax.swing.JLabel();
        FondoFechaEntrega = new javax.swing.JLabel();
        FondoObservaciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Servicios - CicloTEC");
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

        Servicios.setFont(new java.awt.Font("Segoe UI Semibold", 1, 32)); // NOI18N
        Servicios.setForeground(new java.awt.Color(51, 51, 51));
        Servicios.setText("Servicios");
        getContentPane().add(Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        ServiciosLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Servicios.png"))); // NOI18N
        getContentPane().add(ServiciosLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 60, 60));

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

        CodigoServicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        CodigoServicio.setForeground(new java.awt.Color(51, 51, 51));
        CodigoServicio.setText("Código del Servicio:");
        getContentPane().add(CodigoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        CodigoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        CodigoCliente.setForeground(new java.awt.Color(51, 51, 51));
        CodigoCliente.setText("Código del Cliente:");
        getContentPane().add(CodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        MarcaBicicleta.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        MarcaBicicleta.setForeground(new java.awt.Color(51, 51, 51));
        MarcaBicicleta.setText("Marca de la Bicicleta:");
        getContentPane().add(MarcaBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        Descripción.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        Descripción.setForeground(new java.awt.Color(51, 51, 51));
        Descripción.setText("Descripción:");
        getContentPane().add(Descripción, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        Precio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        Precio.setForeground(new java.awt.Color(51, 51, 51));
        Precio.setText("Precio:");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        FechaRecibido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        FechaRecibido.setForeground(new java.awt.Color(51, 51, 51));
        FechaRecibido.setText("Fecha de Recibido:");
        getContentPane().add(FechaRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        FechaEntrega.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        FechaEntrega.setForeground(new java.awt.Color(51, 51, 51));
        FechaEntrega.setText("Fecha de Entrega:");
        getContentPane().add(FechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        Observaciones.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        Observaciones.setForeground(new java.awt.Color(51, 51, 51));
        Observaciones.setText("Observaciones:");
        getContentPane().add(Observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        Estado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        Estado.setForeground(new java.awt.Color(51, 51, 51));
        Estado.setText("Estado:");
        getContentPane().add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        TextoCodigoServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextoCodigoServicio.setText("...");
        getContentPane().add(TextoCodigoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        ComboBoxCliente.setBackground(new java.awt.Color(217, 217, 217));
        ComboBoxCliente.setForeground(new java.awt.Color(51, 51, 51));
        ComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Búsqueda por Nombre-" }));
        getContentPane().add(ComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 280, -1));

        TextFieldMarcaBici.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldMarcaBici.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextFieldMarcaBici.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldMarcaBici.setBorder(null);
        TextFieldMarcaBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMarcaBiciActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldMarcaBici, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 250, 20));

        jTextArea1.setBackground(new java.awt.Color(217, 217, 217));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPaneDescripcion.setViewportView(jTextArea1);

        getContentPane().add(jScrollPaneDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 330, -1));

        TextFieldPrecio.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldPrecio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldPrecio.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldPrecio.setBorder(null);
        getContentPane().add(TextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 360, 20));

        TextFieldFechaRecibido.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldFechaRecibido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldFechaRecibido.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldFechaRecibido.setBorder(null);
        getContentPane().add(TextFieldFechaRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 270, 20));

        TextFieldFechaEntrega.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldFechaEntrega.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldFechaEntrega.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldFechaEntrega.setBorder(null);
        getContentPane().add(TextFieldFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 280, 20));

        TextFieldObservacion.setBackground(new java.awt.Color(217, 217, 217));
        TextFieldObservacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TextFieldObservacion.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldObservacion.setBorder(null);
        getContentPane().add(TextFieldObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 300, 20));

        ComboBoxEstado.setBackground(new java.awt.Color(217, 217, 217));
        ComboBoxEstado.setForeground(new java.awt.Color(51, 51, 51));
        ComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abierto", "Cerrado" }));
        ComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 360, -1));

        FondoCodigoServicio.setForeground(new java.awt.Color(51, 51, 51));
        FondoCodigoServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoCodigoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 280, 30));

        FondoMarcaBici.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoMarcaBici, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 270, 30));

        FondoPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 380, 30));

        FondoFechaRecibido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoFechaRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 290, 30));

        FondoFechaEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 300, 30));

        FondoObservaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campo a llenar.png"))); // NOI18N
        getContentPane().add(FondoObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 320, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Métodos de acción de los botones
    /**
     * Acción ejecutada al presionar el botón "Atrás". 
     * Regresa al menú principal.
     * 
     * @param evt Evento de acción.
     */
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MenuPrincipal jfmain = new MenuPrincipal();
        jfmain.show(); //Mostrar MenuPrincipal
        dispose(); //Cerrar RegistroDeServicios
    }//GEN-LAST:event_BackActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Eliminar". 
     * Elimina un servicio si cumple con las condiciones necesarias.
     * 
     * @param evt Evento de acción.
     */
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    try {
        String codigoStr = JOptionPane.showInputDialog(this, "Ingrese el código del servicio a eliminar:");
        if (codigoStr == null || codigoStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido.");
            return;
        }

        int codigo = Integer.parseInt(codigoStr.trim());
        ServicioMantenimiento servicio = ServicioManager.buscarPorCodigo(codigo);

        if (servicio == null) {
            JOptionPane.showMessageDialog(this, "No se encontró un servicio con el código ingresado.");
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this, 
            "¿Está seguro de que desea eliminar este servicio?", 
            "Confirmar eliminación", 
            JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            ServicioManager.eliminarServicio(codigo);
            JOptionPane.showMessageDialog(this, "Servicio eliminado correctamente.");
            limpiarCampos();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Modificar". 
     * Permite modificar un servicio existente si cumple con las condiciones.
     * 
     * @param evt Evento de acción.
     */
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
    try {
        String codigoStr = JOptionPane.showInputDialog(this, "Ingrese el código del servicio a modificar:");
        if (codigoStr == null || codigoStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido.");
            return;
        }

        int codigo = Integer.parseInt(codigoStr.trim());
        ServicioMantenimiento servicio = ServicioManager.buscarPorCodigo(codigo);

        if (servicio == null) {
            JOptionPane.showMessageDialog(this, "No se encontró un servicio con el código ingresado.");
            return;
        }

        // Modificaciones...
        servicio.setMarcaBicicleta(TextFieldMarcaBici.getText().trim());
        servicio.setPrecio(Integer.parseInt(TextFieldPrecio.getText().trim()));
        servicio.setFechaRecibido(Utilidades.convertirFecha(TextFieldFechaRecibido.getText().trim()));
        servicio.setFechaEntrega(Utilidades.convertirFecha(TextFieldFechaEntrega.getText().trim()));
        servicio.setObservaciones(TextFieldObservacion.getText().trim());
        servicio.setEstado(ServicioMantenimiento.EstadoServicio.valueOf(((String) ComboBoxEstado.getSelectedItem()).toUpperCase()));

        JOptionPane.showMessageDialog(this, "Servicio modificado correctamente.");
        limpiarCampos();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, "Seleccione un estado válido.", "Error de Estado", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ModificarActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Agregar". 
     * Agrega un nuevo servicio si los campos están correctamente llenados.
     * 
     * @param evt Evento de acción.
     */
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
    try {
        if (TextFieldMarcaBici.getText().trim().isEmpty() || 
            jTextArea1.getText().trim().isEmpty() || 
            TextFieldPrecio.getText().trim().isEmpty() || 
            TextFieldFechaRecibido.getText().trim().isEmpty() || 
            TextFieldFechaEntrega.getText().trim().isEmpty() || 
            TextFieldObservacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.");
            return;
        }

        String seleccionEstado = (String) ComboBoxEstado.getSelectedItem();
        if (seleccionEstado == null || seleccionEstado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione un estado válido.");
            return;
        }

        ServicioMantenimiento.EstadoServicio estadoSeleccionado = ServicioMantenimiento.EstadoServicio.valueOf(seleccionEstado.toUpperCase());
        LocalDate fechaRecibido = Utilidades.convertirFecha(TextFieldFechaRecibido.getText().trim());
        LocalDate fechaEntrega = Utilidades.convertirFecha(TextFieldFechaEntrega.getText().trim());

        if (fechaRecibido == null || fechaEntrega == null) {
            JOptionPane.showMessageDialog(this, "Las fechas deben estar en formato 'dd-MM-yyyy'.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente clienteSeleccionado = ClienteManager.getClientePorNombre((String) ComboBoxCliente.getSelectedItem());
        if (clienteSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "El cliente seleccionado no es válido.", "Error de Cliente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String textoTamaño = TextFieldMarcaBici.getText().trim();
        try {
            Bicicleta.TamañoBicicleta.valueOf(textoTamaño.toUpperCase());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, 
                "El tamaño ingresado no es válido. Los tamaños permitidos son: T12, T16, T22, T26, T27, T27_5, T29.", 
                "Error de Tamaño", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ServicioMantenimiento nuevoServicio = new ServicioMantenimiento(
            ServicioManager.getCodigoServicioActual(), 
            clienteSeleccionado.getCodigo(),
            TextFieldMarcaBici.getText().trim(),
            jTextArea1.getText().trim(),
            Integer.parseInt(TextFieldPrecio.getText().trim()),
            fechaRecibido,
            fechaEntrega,
            TextFieldObservacion.getText().trim(),
            estadoSeleccionado
        );

        ServicioManager.agregarServicio(nuevoServicio);

        JOptionPane.showMessageDialog(this, "Servicio agregado correctamente.");

        TextoCodigoServicio.setText(String.valueOf(ServicioManager.getCodigoServicioActual())); // Actualizar el próximo código
        limpiarCampos();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos para el precio o el código del cliente.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarActionPerformed
    /**
     * Acción ejecutada al presionar el botón "Buscar".
     * Busca un servicio por su código y actualiza los campos en la interfaz gráfica si se encuentra.
     * 
     * @param evt Evento de acción generado por el botón.
     */
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    try {
        String codigoStr = JOptionPane.showInputDialog(this, "Ingrese el código del servicio a buscar:");
        if (codigoStr == null || codigoStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido.");
            return;
        }

        int codigo = Integer.parseInt(codigoStr.trim());
        ServicioMantenimiento servicio = ServicioManager.buscarPorCodigo(codigo);

        if (servicio != null) {
            TextFieldMarcaBici.setText(servicio.getMarcaBicicleta());
            jTextArea1.setText(servicio.getDescripcionBicicleta());
            TextFieldPrecio.setText(String.valueOf(servicio.getPrecio()));
            TextFieldFechaRecibido.setText(servicio.getFechaRecibido().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            TextFieldFechaEntrega.setText(servicio.getFechaEntrega().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            TextFieldObservacion.setText(servicio.getObservaciones());
            ComboBoxEstado.setSelectedItem(servicio.getEstado().name());
            TextoCodigoServicio.setText(String.valueOf(ServicioManager.getCodigoServicioActual())); // Actualizar con el código encontrado
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un servicio con el código ingresado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarActionPerformed
    /**
     * Acción ejecutada al seleccionar un estado en el ComboBoxEstado.
     * Convierte la selección en un valor del enum EstadoServicio y lo imprime en la consola.
     * 
     * @param evt Evento de acción generado por el ComboBox.
     */
    private void ComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEstadoActionPerformed
        String seleccion = (String) ComboBoxEstado.getSelectedItem(); //Se consigue la info en el comboBox
    if (seleccion != null && !seleccion.isEmpty()) {
        ServicioMantenimiento.EstadoServicio estadoSeleccionado = ServicioMantenimiento.EstadoServicio.valueOf(seleccion.toUpperCase()); //Se vuelve enum
        System.out.println("Estado seleccionado: " + estadoSeleccionado);
        }
    }//GEN-LAST:event_ComboBoxEstadoActionPerformed

    private void TextFieldMarcaBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMarcaBiciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMarcaBiciActionPerformed

    /**
     * Método principal que inicia la interfaz gráfica.
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
            java.util.logging.Logger.getLogger(RegistroDeServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroDeServicios().setVisible(true); // Crear y mostrar la ventana de RegistroDeServicios
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Back;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel CodigoCliente;
    private javax.swing.JLabel CodigoServicio;
    private javax.swing.JComboBox<String> ComboBoxCliente;
    private javax.swing.JComboBox<String> ComboBoxEstado;
    private javax.swing.JLabel Descripción;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel FechaEntrega;
    private javax.swing.JLabel FechaRecibido;
    private javax.swing.JLabel FondoCodigoServicio;
    private javax.swing.JLabel FondoFechaEntrega;
    private javax.swing.JLabel FondoFechaRecibido;
    private javax.swing.JLabel FondoMarcaBici;
    private javax.swing.JLabel FondoObservaciones;
    private javax.swing.JLabel FondoPrecio;
    private javax.swing.JLabel Linea;
    private javax.swing.JLabel LineaHorizontal1;
    private javax.swing.JLabel LineaHorizontal2;
    private javax.swing.JLabel LogoCicloTEC;
    private javax.swing.JLabel MarcaBicicleta;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel Observaciones;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Registro;
    private javax.swing.JLabel Servicios;
    private javax.swing.JLabel ServiciosLogo;
    private javax.swing.JTextField TextFieldFechaEntrega;
    private javax.swing.JTextField TextFieldFechaRecibido;
    private javax.swing.JTextField TextFieldMarcaBici;
    private javax.swing.JTextField TextFieldObservacion;
    private javax.swing.JTextField TextFieldPrecio;
    private javax.swing.JLabel TextoCodigoServicio;
    private javax.swing.JScrollPane jScrollPaneDescripcion;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
