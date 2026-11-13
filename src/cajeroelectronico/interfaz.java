package cajeroelectronico;

import javax.swing.table.DefaultTableModel;
//descargar librería JDBC en https://www.mysql.com/products/connector/
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class interfaz extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public interfaz() {
        initComponents();
        
        //inicio el modelo para manipular la tabla
        modelo = (DefaultTableModel) tabla.getModel();
        
        // Mostrar líneas de la tabla
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);

        // Color de las líneas
        tabla.setGridColor(java.awt.Color.BLACK);
    }
    public Connection conectar(){
       String usuario="silvana";
       String contrasena="#3Programacion3"; 
       String url="jdbc:mysql://72.167.84.254:3306/banco";//localhost:3306/agenda"; 
       Connection con=null;
       try{         
          con= DriverManager.getConnection(url,usuario,contrasena);
          salida.setText("Conexión correcta");
          return con;
       }catch (Exception e){
          salida.setText("Conexión incorrecta: " + e.getMessage()); 
          return null;
       }
   }

    public void limpiarCampos() {
        nombres.setText("");
        apellidos.setText("");
        telefono.setText("");
        ciudad.setText("");
        numCuenta.setText("");
        saldo.setText("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        Ciudad = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        numCuenta = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();
        Saldo = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mostCajero = new javax.swing.JButton();
        agregarCaj = new javax.swing.JButton();
        editarCaj = new javax.swing.JButton();
        elmnrCajero = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCajero = new javax.swing.JTable();
        estadistica = new javax.swing.JButton();
        btnConsignar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setText("Administración");

        Nombres.setText("Nombre:");

        Ciudad.setText("Ciudad:");

        ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadActionPerformed(evt);
            }
        });

        Apellidos.setText("Apellidos:");

        Telefono.setText("Telefono:");

        Email.setText("N° Cuenta:");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Teléfono", "Ciudad", "N° Cuenta", "Saldo"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        salida.setColumns(20);
        salida.setRows(5);
        jScrollPane2.setViewportView(salida);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Saldo.setText("Saldo: ");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cajeros");

        mostCajero.setText("Mostrar Cajeros");
        mostCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostCajeroActionPerformed(evt);
            }
        });

        agregarCaj.setText("Agregar");
        agregarCaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCajActionPerformed(evt);
            }
        });

        editarCaj.setText("Editar");
        editarCaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCajActionPerformed(evt);
            }
        });

        elmnrCajero.setText("Eliminar Cajero");
        elmnrCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elmnrCajeroActionPerformed(evt);
            }
        });

        tablaCajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "ndiez", "nveinte", "ncincuenta", "ncien", "estado"
            }
        ));
        jScrollPane3.setViewportView(tablaCajero);

        estadistica.setText("Estadistica Clientes");
        estadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticaActionPerformed(evt);
            }
        });

        btnConsignar.setText("Consignar");
        btnConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignarActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(Nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(nombres))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellidos)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(titulo))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadistica))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(elmnrCajero)
                                        .addComponent(mostCajero))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(editarCaj)
                                            .addComponent(agregarCaj))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnConsignar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRetirar))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombres)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellidos)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ciudad)
                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email)
                    .addComponent(numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Saldo)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(consultar)
                    .addComponent(buscar)
                    .addComponent(editar)
                    .addComponent(salir)
                    .addComponent(eliminar)
                    .addComponent(estadistica))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostCajero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarCaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarCaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(elmnrCajero))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsignar)
                    .addComponent(btnRetirar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
 if (nombres.getText().trim().isEmpty() || 
            apellidos.getText().trim().isEmpty() || 
            telefono.getText().trim().isEmpty() || 
            ciudad.getText().trim().isEmpty() || 
            numCuenta.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Error: No se pueden dejar campos vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Connection con = conectar();
        if (con == null) return;

        String query = "INSERT INTO clientes(nombre, apellido, telefono, ciudad, ncuenta, saldo, estado) VALUES (?, ?, ?, ?, ?, ?, 0)";
        try {
            PreparedStatement preparar = con.prepareStatement(query);
            preparar.setString(1, nombres.getText());
            preparar.setString(2, apellidos.getText());
            preparar.setString(3, telefono.getText());
            preparar.setString(4, ciudad.getText());
            preparar.setInt(5, Integer.parseInt(numCuenta.getText().trim())); 
            preparar.setDouble(6, Double.parseDouble(saldo.getText().trim()));
            
            preparar.executeUpdate();
            salida.setText("¡Cliente agregado correctamente a la nube!");
            limpiarCampos();
            con.close();
            consultarActionPerformed(null); 
        } catch (SQLException ex) {
            salida.setText("Error en la inserción: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            salida.setText("Error: El número de cuenta (Email) debe ser un valor numérico.");
        }                  
    }//GEN-LAST:event_agregarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:                                                                           
        modelo.setRowCount(0); 
        Connection con = conectar();
        if (con == null) return;
    
        String query = "SELECT * FROM clientes;";
        try { 
            PreparedStatement preparar = con.prepareStatement(query);
            ResultSet resultado = preparar.executeQuery();
         
            while(resultado.next()){
                modelo.addRow(new Object[]{
                 resultado.getInt("id"),
                 resultado.getString("nombre"), 
                 resultado.getString("apellido"), 
                 resultado.getString("telefono"), 
                 resultado.getString("ciudad"), 
                 resultado.getInt("ncuenta"), 
                 resultado.getDouble("saldo"),
                 resultado.getInt("estado")
             });
         }
         resultado.close();
         preparar.close();
         con.close();
         salida.setText("Consulta realizada con éxito.");
    } catch (SQLException ex){
         salida.setText("Error en el sql: " + ex.getMessage());
         System.out.println("Error en el sql: " + ex.getMessage());
    }
    }//GEN-LAST:event_consultarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        String sqlLista = "SELECT id, nombre, apellido, ncuenta FROM clientes";
        try (Connection con = conectar();
            Statement st = con != null ? con.createStatement() : null;
            ResultSet rs = st != null ? st.executeQuery(sqlLista) : null) {

            if (con == null || st == null || rs == null) return;

            JComboBox<String> cmbClientes = new JComboBox<>();
            java.util.Map<String, Integer> mapaIds = new java.util.HashMap<>();

            while (rs.next()) {
                int idCliente = rs.getInt("id");
                String itemText = "ID: " + idCliente + " - " + rs.getString("nombre") + " " + rs.getString("apellido") + " (Cuenta: " + rs.getInt("ncuenta") + ")";
                cmbClientes.addItem(itemText);
                mapaIds.put(itemText, idCliente);
            }
            if (cmbClientes.getItemCount() == 0) {
                JOptionPane.showMessageDialog(this, "No hay clientes registrados para editar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int resultado = JOptionPane.showConfirmDialog(
                this, 
                cmbClientes, 
                "Seleccione el cliente a editar", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE
            );
            if (resultado == JOptionPane.OK_OPTION) {
                String seleccionado = (String) cmbClientes.getSelectedItem();
                int idSeleccionado = mapaIds.get(seleccionado);
            // Consultar todos los datos actuales del cliente seleccionado
                String sqlDetalle = "SELECT * FROM clientes WHERE id = ?";
                    try (PreparedStatement pst = con.prepareStatement(sqlDetalle)) {
                    pst.setInt(1, idSeleccionado);
                        try (ResultSet rsDetalle = pst.executeQuery()) {
                            if (rsDetalle.next()) {
                        // Crear campos de texto para editar cada dato en una ventana flotante
                                nombres = new JTextField(rsDetalle.getString("nombre"));
                                apellidos= new JTextField(rsDetalle.getString("apellido"));
                                telefono = new JTextField(rsDetalle.getString("telefono"));
                                ciudad = new JTextField(rsDetalle.getString("ciudad"));
                                numCuenta = new JTextField(String.valueOf(rsDetalle.getInt("ncuenta")));
                                saldo = new JTextField(String.valueOf(rsDetalle.getInt("saldo")));

                                Object[] formulario = {
                                "Nombres:", nombres,
                                "Apellidos:", apellidos,
                                "Teléfono:", telefono,
                                "Ciudad:", ciudad,
                                "N° Cuenta:", numCuenta,
                                "Saldo:", saldo
                            };
                            int opcionEdicion = JOptionPane.showConfirmDialog(this, formulario, "Modificar Datos del Cliente", JOptionPane.OK_CANCEL_OPTION);

                            if (opcionEdicion == JOptionPane.OK_OPTION) {
                            // Guardar los cambios automáticamente en la base de datos
                                String sqlUpdate = "UPDATE clientes SET nombre = ?, apellido = ?, telefono = ?, ciudad = ?, ncuenta = ?, saldo = ? WHERE id = ?";
                                try (PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate)) {
                                    pstUpdate.setString(1, nombres.getText().trim());
                                    pstUpdate.setString(2, apellidos.getText().trim());
                                    pstUpdate.setString(3, telefono.getText().trim());
                                    pstUpdate.setString(4, ciudad.getText().trim());
                                    pstUpdate.setInt(5, Integer.parseInt(numCuenta.getText().trim()));
                                    pstUpdate.setDouble(6, Double.parseDouble(saldo.getText().trim()));
                                    pstUpdate.setInt(7, idSeleccionado);
                                    pstUpdate.executeUpdate();
                                    salida.setText("Cliente con ID " + idSeleccionado + " actualizado correctamente.");
                                    JOptionPane.showMessageDialog(this, "¡Cambios guardados con éxito!");
                                // Refrescar la tabla automáticamente
                                    consultarActionPerformed(null);
                                }
                            }
                        }
                    }
                }
            }

        } catch (NumberFormatException ex) {
            salida.setText("Error de formato: El número de cuenta y el saldo deben ser numéricos.");
            JOptionPane.showMessageDialog(this, "Verifique que la cuenta y el saldo sean valores numéricos válidos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            salida.setText("Error SQL: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al procesar la operación: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:  
        String[] opciones = {"Buscar por ID", "Buscar por Nombre"};
            int seleccion = JOptionPane.showOptionDialog(
            this,
            "¿Cómo desea buscar al cliente?",
            "Seleccionar Criterio de Búsqueda",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        if (seleccion == -1) {
            return; // Si el usuario cancela, no hace nada
        }

        String valorBuscado = "";
        String sql = "";
        String sqlLog = ""; // Para forzar el registro en el historial de cambios

    // 2. Definir la consulta SQL y el log según la selección
        if (seleccion == 0) {
            valorBuscado = JOptionPane.showInputDialog(this, "Ingrese el ID del cliente:");
            if (valorBuscado == null || valorBuscado.trim().isEmpty()) return;
                sql = "SELECT * FROM clientes WHERE id = ?";
                sqlLog = "UPDATE clientes SET estado = 0 WHERE id = ?"; // Fuerza el log en web
            } else if (seleccion == 1) {
                valorBuscado = JOptionPane.showInputDialog(this, "Ingrese el nombre del cliente:");
            if (valorBuscado == null || valorBuscado.trim().isEmpty()) return;
                sql = "SELECT * FROM clientes WHERE nombre LIKE ?";
                sqlLog = "UPDATE clientes SET estado = 0 WHERE nombre LIKE ?"; // Fuerza el log en web
            }

    // 3. Conectar usando tu método 'conectar()' y preparar la sentencia
        try (Connection con = conectar()) {
            if (con == null) {
                return; 
            }

            // PASO EXTRA: Forzamos la actualización para que aparezca en logs.php
            try (PreparedStatement pstLog = con.prepareStatement(sqlLog)) {
                if (seleccion == 0) {
                    pstLog.setInt(1, Integer.parseInt(valorBuscado.trim()));
                } else {
                    pstLog.setString(1, "%" + valorBuscado.trim() + "%");
                }
                pstLog.executeUpdate();
            }

            // Ejecutamos la consulta principal de búsqueda
            try (PreparedStatement pst = con.prepareStatement(sql)) {
                if (seleccion == 0) {
                    pst.setInt(1, Integer.parseInt(valorBuscado.trim()));
                } else {
                // Usamos comodines %% para permitir búsquedas flexibles por nombre
                    pst.setString(1, "%" + valorBuscado.trim() + "%");
                }

                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        salida.setText("ID: "+ rs.getInt("id")+" | Nombre: " + rs.getString("nombre")+" | Apellido: " + rs.getString("apellido")+" | Teléfono: " + rs.getString("telefono")+" | Ciudad: " + rs.getString("ciudad")+" | N° Cuenta: " + rs.getInt("ncuenta")+" | Saldo: $" + rs.getDouble("saldo"));
                        JOptionPane.showMessageDialog(this, "¡Cliente encontrado y registrado en logs!");
                    } else {
                        salida.setText("No se encontró ningún cliente con ese registro.");
                        JOptionPane.showMessageDialog(this, "No se encontró ningún cliente con ese registro.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (NumberFormatException ex) {
            salida.setText("Error de formato: El ID debe ser un número entero.");
            JOptionPane.showMessageDialog(this, "El ID debe ser estrictamente un número entero.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            salida.setText("Error SQL: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:                                       
        String sqlLista = "SELECT id, nombre, apellido, ncuenta FROM clientes";
    
        try (Connection con = conectar();
            Statement st = con != null ? con.createStatement() : null;
            ResultSet rs = st != null ? st.executeQuery(sqlLista) : null) {

            if (con == null || st == null || rs == null) return;

            JComboBox<String> cmbClientes = new JComboBox<>();
            java.util.Map<String, Integer> mapaIds = new java.util.HashMap<>();

            while (rs.next()) {
                int idCliente = rs.getInt("id");
                String itemText = "ID: " + idCliente + " - " + rs.getString("nombre") + " " + rs.getString("apellido") + " (Cuenta: " + rs.getInt("ncuenta") + ")";
                cmbClientes.addItem(itemText);
                mapaIds.put(itemText, idCliente);
            }
            if (cmbClientes.getItemCount() == 0) {
                JOptionPane.showMessageDialog(this, "No hay clientes registrados para eliminar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int resultado = JOptionPane.showConfirmDialog(
                this, 
                cmbClientes, 
                "Seleccione el cliente que desea ELIMINAR", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.WARNING_MESSAGE
            );
            if (resultado == JOptionPane.OK_OPTION) {
                String seleccionado = (String) cmbClientes.getSelectedItem();
                int idSeleccionado = mapaIds.get(seleccionado);
            // Confirmación extra de seguridad antes de borrar de la base de datos
                int confirmacionFinal = JOptionPane.showConfirmDialog(
                    this, 
                    "¿Está seguro de que desea eliminar este cliente?\nEsta acción no se puede deshacer.", 
                    "Confirmar Eliminación", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.ERROR_MESSAGE
                );
                if (confirmacionFinal == JOptionPane.YES_OPTION) {
                    String sqlDelete = "DELETE FROM clientes WHERE id = ?";
                    try (PreparedStatement pstDelete = con.prepareStatement(sqlDelete)) {
                        pstDelete.setInt(1, idSeleccionado);
                        pstDelete.executeUpdate();
                    
                        salida.setText("Cliente con ID " + idSeleccionado + " eliminado correctamente.");
                        JOptionPane.showMessageDialog(this, "¡Cliente eliminado con éxito!");
                    // Refrescar la tabla automáticamente después de borrar
                        consultarActionPerformed(null);
                    }
                }
            }
        } catch (SQLException ex) {
            salida.setText("Error SQL: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al procesar la eliminación: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void estadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticaActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT COUNT(*) AS total_clientes, AVG(saldo) AS promedio_saldo FROM clientes";
    
        try (Connection con = conectar();
            Statement st = con != null ? con.createStatement() : null;
            ResultSet rs = st != null ? st.executeQuery(sql) : null) {

            if (con == null || st == null || rs == null) return;

                if (rs.next()) {
                    int totalClientes = rs.getInt("total_clientes");
                    double dineroPromedio = rs.getDouble("promedio_saldo");
            // Mostrar los resultados en el área de texto 'salida'
                    salida.setText("ESTADÍSTICAS DEL BANCO \n" +
                        "• Número total de clientes: " + totalClientes + "\n" +
                        "• Dinero promedio en cuentas: $" + String.format("%.2f", dineroPromedio));
                        JOptionPane.showMessageDialog(this, "¡Estadísticas calculadas con éxito!");
                } else {
                    salida.setText("No hay datos disponibles para generar estadísticas.");
                }
            } catch (SQLException ex) {
                salida.setText("Error SQL al calcular estadísticas: " + ex.getMessage());
                JOptionPane.showMessageDialog(this, "Error al procesar las estadísticas: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_estadisticaActionPerformed

    private void mostCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostCajeroActionPerformed

        javax.swing.table.DefaultTableModel modeloCajero = (javax.swing.table.DefaultTableModel) tablaCajero.getModel();
        modeloCajero.setRowCount(0); 
    
        Connection con = conectar();
        if (con == null) return;
        String query = "SELECT * FROM cajeros;";
            try { 
                PreparedStatement preparar = con.prepareStatement(query);
                ResultSet resultado = preparar.executeQuery();
     
                while(resultado.next()){
                    modeloCajero.addRow(new Object[]{
                    resultado.getInt("id"),
                    resultado.getInt("ndiez"), 
                    resultado.getInt("nveinte"), 
                    resultado.getInt("ncincuenta"), 
                    resultado.getInt("ncien"), 
                    resultado.getInt("estado")
                });
            }
            resultado.close();
            preparar.close();
            con.close();
            salida.setText("Datos de cajeros consultados con éxito.");
        } catch (SQLException ex){
            salida.setText("Error en el sql: " + ex.getMessage());
            System.out.println("Error en el sql: " + ex.getMessage());
        }
    }//GEN-LAST:event_mostCajeroActionPerformed

    private void agregarCajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCajActionPerformed
    JTextField txtDiez = new JTextField();
    JTextField txtVeinte = new JTextField();
    JTextField txtCincuenta = new JTextField();
    JTextField txtCien = new JTextField();

    Object[] formulario = {
        "Billetes de 10k (ndiez):", txtDiez,
        "Billetes de 20k (nveinte):", txtVeinte,
        "Billetes de 50k (ncincuenta):", txtCincuenta,
        "Billetes de 100k (ncien):", txtCien
    };

    int opcion = JOptionPane.showConfirmDialog(
        this, 
        formulario, 
        "Agregar Nuevo Cajero", 
        JOptionPane.OK_CANCEL_OPTION, 
        JOptionPane.QUESTION_MESSAGE
    );

    if (opcion == JOptionPane.OK_OPTION) {
        // Validar que no queden campos vacíos
        if (txtDiez.getText().trim().isEmpty() ||
            txtVeinte.getText().trim().isEmpty() ||
            txtCincuenta.getText().trim().isEmpty() ||
            txtCien.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Error: No se pueden dejar campos vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection con = conectar()) {
            if (con == null) return;

            // Se omite el campo id en el INSERT para que la base de datos lo asigne automáticamente
            String query = "INSERT INTO cajeros (ndiez, nveinte, ncincuenta, ncien, estado) VALUES (?, ?, ?, ?, 0)";
            try (PreparedStatement preparar = con.prepareStatement(query)) {
                preparar.setInt(1, Integer.parseInt(txtDiez.getText().trim()));
                preparar.setInt(2, Integer.parseInt(txtVeinte.getText().trim()));
                preparar.setInt(3, Integer.parseInt(txtCincuenta.getText().trim()));
                preparar.setInt(4, Integer.parseInt(txtCien.getText().trim()));
                
                preparar.executeUpdate();
                salida.setText("¡Cajero agregado correctamente a la base de datos!");
                JOptionPane.showMessageDialog(this, "¡Cajero agregado con éxito!");
                
                // Actualizar automáticamente la tabla inferior de cajeros
                mostCajeroActionPerformed(null);
            }
        } catch (NumberFormatException ex) {
            salida.setText("Error de formato: Todas las cantidades deben ser números enteros.");
            JOptionPane.showMessageDialog(this, "Las cantidades de billetes deben ser estrictamente números enteros.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            salida.setText("Error SQL al agregar cajero: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al guardar el cajero: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_agregarCajActionPerformed

    private void editarCajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCajActionPerformed
        // TODO add your handling code here:                                        
    String sqlLista = "SELECT id, ndiez, nveinte, ncincuenta, ncien, estado FROM cajeros";
    
    try (Connection con = conectar();
         Statement st = con != null ? con.createStatement() : null;
         ResultSet rs = st != null ? st.executeQuery(sqlLista) : null) {

        if (con == null || st == null || rs == null) return;

        JComboBox<String> cmbCajeros = new JComboBox<>();
        java.util.Map<String, Integer> mapaIds = new java.util.HashMap<>();

        while (rs.next()) {
            int idCajero = rs.getInt("id");
            String itemText = "Cajero ID: " + idCajero + " | 10k: " + rs.getInt("ndiez") + " | 20k: " + rs.getInt("nveinte") + " | 50k: " + rs.getInt("ncincuenta") + " | 100k: " + rs.getInt("ncien");
            cmbCajeros.addItem(itemText);
            mapaIds.put(itemText, idCajero);
        }

        if (cmbCajeros.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay cajeros registrados para editar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int resultado = JOptionPane.showConfirmDialog(
            this, 
            cmbCajeros, 
            "Seleccione el cajero a editar", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (resultado == JOptionPane.OK_OPTION) {
            String seleccionado = (String) cmbCajeros.getSelectedItem();
            int idSeleccionado = mapaIds.get(seleccionado);

            // Consultar los datos actuales del cajero seleccionado
            String sqlDetalle = "SELECT * FROM cajeros WHERE id = ?";
            try (PreparedStatement pst = con.prepareStatement(sqlDetalle)) {
                pst.setInt(1, idSeleccionado);
                try (ResultSet rsDetalle = pst.executeQuery()) {
                    if (rsDetalle.next()) {
                        // Crear campos de texto con los valores actuales para editar cada dato
                        JTextField txtDiez = new JTextField(String.valueOf(rsDetalle.getInt("ndiez")));
                        JTextField txtVeinte = new JTextField(String.valueOf(rsDetalle.getInt("nveinte")));
                        JTextField txtCincuenta = new JTextField(String.valueOf(rsDetalle.getInt("ncincuenta")));
                        JTextField txtCien = new JTextField(String.valueOf(rsDetalle.getInt("ncien")));
                        JTextField txtEstado = new JTextField(String.valueOf(rsDetalle.getInt("estado")));

                        Object[] formulario = {
                            "Billetes de 10k:", txtDiez,
                            "Billetes de 20k:", txtVeinte,
                            "Billetes de 50k:", txtCincuenta,
                            "Billetes de 100k:", txtCien,
                        };

                        int opcionEdicion = JOptionPane.showConfirmDialog(this, formulario, "Modificar Datos del Cajero", JOptionPane.OK_CANCEL_OPTION);

                        if (opcionEdicion == JOptionPane.OK_OPTION) {
                            // Guardar los cambios automáticamente en la base de datos
                            String sqlUpdate = "UPDATE cajeros SET ndiez = ?, nveinte = ?, ncincuenta = ?, ncien = ?, estado = ? WHERE id = ?";
                            try (PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate)) {
                                pstUpdate.setInt(1, Integer.parseInt(txtDiez.getText().trim()));
                                pstUpdate.setInt(2, Integer.parseInt(txtVeinte.getText().trim()));
                                pstUpdate.setInt(3, Integer.parseInt(txtCincuenta.getText().trim()));
                                pstUpdate.setInt(4, Integer.parseInt(txtCien.getText().trim()));
                                pstUpdate.setInt(5, Integer.parseInt(txtEstado.getText().trim()));
                                pstUpdate.setInt(6, idSeleccionado);

                                pstUpdate.executeUpdate();
                                salida.setText("Cajero con ID " + idSeleccionado + " actualizado correctamente.");
                                JOptionPane.showMessageDialog(this, "¡Cajero actualizado con éxito!");
                                
                                // Actualizar automáticamente la tabla inferior de cajeros
                                mostCajeroActionPerformed(null);
                            }
                        }
                    }
                }
            }
        }

    } catch (NumberFormatException ex) {
        salida.setText("Error de formato: Todos los campos del cajero deben ser números enteros.");
        JOptionPane.showMessageDialog(this, "Verifique que los valores ingresados sean números enteros válidos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        salida.setText("Error SQL: " + ex.getMessage());
        JOptionPane.showMessageDialog(this, "Error al procesar la operación: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_editarCajActionPerformed

    private void elmnrCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elmnrCajeroActionPerformed
        String sqlLista = "SELECT id, ndiez, nveinte, ncincuenta, ncien FROM cajeros";
    
        try (Connection con = conectar();
            Statement st = con != null ? con.createStatement() : null;
            ResultSet rs = st != null ? st.executeQuery(sqlLista) : null) {

            if (con == null || st == null || rs == null) return;

            JComboBox<String> cmbCajeros = new JComboBox<>();
            java.util.Map<String, Integer> mapaIds = new java.util.HashMap<>();

            while (rs.next()) {
                int idCajero = rs.getInt("id");
                String itemText = "Cajero ID: " + idCajero + " | 10k: " + rs.getInt("ndiez") + " | 20k: " + rs.getInt("nveinte") + " | 50k: " + rs.getInt("ncincuenta") + " | 100k: " + rs.getInt("ncien");
                cmbCajeros.addItem(itemText);
                mapaIds.put(itemText, idCajero);
            }

            if (cmbCajeros.getItemCount() == 0) {
                JOptionPane.showMessageDialog(this, "No hay cajeros registrados para eliminar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            int resultado = JOptionPane.showConfirmDialog(
                this, 
                cmbCajeros, 
                "Seleccione el cajero que desea ELIMINAR", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.WARNING_MESSAGE
            );

            if (resultado == JOptionPane.OK_OPTION) {
                String seleccionado = (String) cmbCajeros.getSelectedItem();
                int idSeleccionado = mapaIds.get(seleccionado);
            // Confirmación de seguridad antes de borrar de la base de datos
                int confirmacionFinal = JOptionPane.showConfirmDialog(
                    this, 
                    "¿Está seguro de que desea eliminar este cajero?\nEsta acción no se puede deshacer.", 
                    "Confirmar Eliminación de Cajero", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.ERROR_MESSAGE
                );

                if (confirmacionFinal == JOptionPane.YES_OPTION) {
                    String sqlDelete = "DELETE FROM cajeros WHERE id = ?";
                    try (PreparedStatement pstDelete = con.prepareStatement(sqlDelete)) {
                        pstDelete.setInt(1, idSeleccionado);
                        pstDelete.executeUpdate();                    
                        salida.setText("Cajero con ID " + idSeleccionado + " eliminado correctamente.");
                        JOptionPane.showMessageDialog(this, "¡Cajero eliminado con éxito!");
                    // Actualizar automáticamente la tabla inferior de cajeros
                        mostCajeroActionPerformed(null);
                    }
                }
            }

        } catch (SQLException ex) {
            salida.setText("Error SQL al eliminar cajero: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al procesar la eliminación: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_elmnrCajeroActionPerformed

    private void btnConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignarActionPerformed
        // TODO add your handling code here:                                          
        String sqlLista = "SELECT id, nombre, apellido, ncuenta, saldo FROM clientes";
    
        try (Connection con = conectar();
         Statement st = con != null ? con.createStatement() : null;
         ResultSet rs = st != null ? st.executeQuery(sqlLista) : null) {

        if (con == null || st == null || rs == null) return;

        JComboBox<String> cmbClientes = new JComboBox<>();
        java.util.Map<String, Integer> mapaIds = new java.util.HashMap<>();

        while (rs.next()) {
            int idCliente = rs.getInt("id");
            String itemText = "ID: " + idCliente + " - " + rs.getString("nombre") + " " + rs.getString("apellido") + " (Saldo Actual: $" + rs.getDouble("saldo") + ")";
            cmbClientes.addItem(itemText);
            mapaIds.put(itemText, idCliente);
        }

        if (cmbClientes.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay clientes registrados para consignar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int resultado = JOptionPane.showConfirmDialog(
            this, 
            cmbClientes, 
            "Seleccione el cliente para CONSIGNAR", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (resultado == JOptionPane.OK_OPTION) {
            String seleccionado = (String) cmbClientes.getSelectedItem();
            int idSeleccionado = mapaIds.get(seleccionado);

            String inputMonto = JOptionPane.showInputDialog(this, "Ingrese el monto a consignar ($):");
            if (inputMonto == null || inputMonto.trim().isEmpty()) return;

            double montoConsignacion = Double.parseDouble(inputMonto.trim());
            if (montoConsignacion <= 0) {
                JOptionPane.showMessageDialog(this, "El monto debe ser mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Actualizar saldo sumando el monto en la base de datos
            String sqlUpdate = "UPDATE clientes SET saldo = saldo + ? WHERE id = ?";
            try (PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate)) {
                pstUpdate.setDouble(1, montoConsignacion);
                pstUpdate.setInt(2, idSeleccionado);
                pstUpdate.executeUpdate();

                salida.setText("Consignación de $" + montoConsignacion + " realizada con éxito al cliente ID: " + idSeleccionado);
                JOptionPane.showMessageDialog(this, "¡Consignación exitosa!");

                // Refrescar la tabla de clientes automáticamente
                consultarActionPerformed(null);
            }
        }

    } catch (NumberFormatException ex) {
        salida.setText("Error de formato: El monto ingresado debe ser un valor numérico.");
        JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el monto.", "Error de formato", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        salida.setText("Error SQL al consignar: " + ex.getMessage());
        JOptionPane.showMessageDialog(this, "Error al procesar la consignación: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnConsignarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:                                       
    String sqlLista = "SELECT id, nombre, apellido, ncuenta, saldo FROM clientes";
    
    try (Connection con = conectar();
         Statement st = con != null ? con.createStatement() : null;
         ResultSet rs = st != null ? st.executeQuery(sqlLista) : null) {

        if (con == null || st == null || rs == null) return;

        JComboBox<String> cmbClientes = new JComboBox<>();
        java.util.Map<String, Integer> mapaIds = new java.util.HashMap<>();

        while (rs.next()) {
            int idCliente = rs.getInt("id");
            String itemText = "ID: " + idCliente + " - " + rs.getString("nombre") + " " + rs.getString("apellido") + " (Saldo Actual: $" + rs.getDouble("saldo") + ")";
            cmbClientes.addItem(itemText);
            mapaIds.put(itemText, idCliente);
        }

        if (cmbClientes.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay clientes registrados para retirar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int resultado = JOptionPane.showConfirmDialog(
            this, 
            cmbClientes, 
            "Seleccione el cliente para RETIRAR", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (resultado == JOptionPane.OK_OPTION) {
            String seleccionado = (String) cmbClientes.getSelectedItem();
            int idSeleccionado = mapaIds.get(seleccionado);

            // Obtener el saldo actual del cliente seleccionado para validar
            double saldoActual = 0;
            String sqlCheck = "SELECT saldo FROM clientes WHERE id = ?";
            try (PreparedStatement pstCheck = con.prepareStatement(sqlCheck)) {
                pstCheck.setInt(1, idSeleccionado);
                try (ResultSet rsCheck = pstCheck.executeQuery()) {
                    if (rsCheck.next()) {
                        saldoActual = rsCheck.getDouble("saldo");
                    }
                }
            }

            String inputMonto = JOptionPane.showInputDialog(this, "Saldo disponible: $" + saldoActual + "\nIngrese el monto a retirar ($):");
            if (inputMonto == null || inputMonto.trim().isEmpty()) return;

            double montoRetiro = Double.parseDouble(inputMonto.trim());
            if (montoRetiro <= 0) {
                JOptionPane.showMessageDialog(this, "El monto debe ser mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (montoRetiro > saldoActual) {
                JOptionPane.showMessageDialog(this, "Saldo insuficiente para realizar el retiro.", "Fondos Insuficientes", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Actualizar saldo restando el monto en la base de datos
            String sqlUpdate = "UPDATE clientes SET saldo = saldo - ? WHERE id = ?";
            try (PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate)) {
                pstUpdate.setDouble(1, montoRetiro);
                pstUpdate.setInt(2, idSeleccionado);
                pstUpdate.executeUpdate();

                salida.setText("Retiro de $" + montoRetiro + " realizado con éxito al cliente ID: " + idSeleccionado);
                JOptionPane.showMessageDialog(this, "¡Retiro exitoso!");

                // Refrescar la tabla de clientes automáticamente
                consultarActionPerformed(null);
            }
        }

    } catch (NumberFormatException ex) {
        salida.setText("Error de formato: El monto ingresado debe ser un valor numérico.");
        JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el monto.", "Error de formato", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        salida.setText("Error SQL al retirar: " + ex.getMessage());
        JOptionPane.showMessageDialog(this, "Error al procesar el retiro: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnRetirarActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Ciudad;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Nombres;
    private javax.swing.JLabel Saldo;
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregarCaj;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton btnConsignar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField ciudad;
    private javax.swing.JButton consultar;
    private javax.swing.JButton editar;
    private javax.swing.JButton editarCaj;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton elmnrCajero;
    private javax.swing.JButton estadistica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mostCajero;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField numCuenta;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextArea salida;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaCajero;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
