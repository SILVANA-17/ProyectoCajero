package cajeroelectronico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
//descargar librería JDBC en https://www.mysql.com/products/connector/
import java.sql.*;
import java.util.HashMap;
/**
 *
 * @author DELL
 */
public class interfaz4 extends javax.swing.JFrame {
    public HashMap<Integer, Integer> billete;
    public DefaultTableModel modeloTabla;
    
    public interfaz4(){
        
        initComponents();
        txtPantalla.setText("Digite el valor que va retirar: \n\n");
        this.billete=new java.util.HashMap<>();
        this.billete.put(10000, 100);
        this.billete.put(20000, 100);
        this.billete.put(50000, 100);
        this.billete.put(100000, 100);
        cargarDatos();
   }
    public Connection conectar(){
       String usuario="silvana";
       String contrasena="#3Programacion3"; 
       String url="jdbc:mysql://72.167.84.254:3306/banco";//localhost:3306/agenda"; 
       Connection con=null;
       try{         
          con= DriverManager.getConnection(url,usuario,contrasena);
          txtPantalla.setText("Conexión correcta");
          return con;
       }catch (Exception e){
          txtPantalla.setText("Conexión incorrecta: " + e.getMessage()); 
          return null;
       }
    }
    public void setInventario(java.util.HashMap<Integer, Integer> billete){
        this.billete=billete;
        cargarDatos();
    }
    public void cargarDatos(){
        javax.swing.table.DefaultTableModel modelo=(javax.swing.table.DefaultTableModel) tablaBilletes.getModel();
        modelo.setRowCount(0);
        
        int[] denominaciones={10000, 20000, 50000, 100000};
        
        for(int denominacion : denominaciones){
            if(billete !=null && billete.containsKey(denominacion)){
                int cantidad = billete.get(denominacion);
                int total = denominacion * cantidad;
                modelo.addRow(new Object [] {denominacion, cantidad, total});
            }
        }
    }
    public void agregarNum(String numero) {
        String textoActual = txtPantalla.getText();
        if (textoActual.contains(" ")) {
            txtPantalla.setText(numero);
        } else {
            txtPantalla.setText(textoActual + numero);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton14 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPantalla = new javax.swing.JTextArea();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnBorrarNum = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBilletes = new javax.swing.JTable();

        jButton14.setText("jButton14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPantalla.setEditable(false);
        txtPantalla.setColumns(20);
        txtPantalla.setRows(5);
        txtPantalla.setText("Digita el valor que quieres retirar: ");
        jScrollPane1.setViewportView(txtPantalla);

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnBorrarNum.setText("<----");
        btnBorrarNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarNumActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(139, 0, 0));
        btnBorrar.setForeground(new java.awt.Color(244, 244, 244));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 232, 124));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(105, 191, 100));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        tablaBilletes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "BILLETES", "DISPONIBLES ", "CANTIDAD TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tablaBilletes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnBorrarNum, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOcho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btnOcho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSiete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCuatro)
                            .addComponent(btnCinco)
                            .addComponent(btnSeis))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUno)
                            .addComponent(btnDos)
                            .addComponent(btnTres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCero)
                            .addComponent(btnBorrarNum))))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        agregarNum("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed

        agregarNum("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed

        agregarNum("0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnBorrarNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarNumActionPerformed
        String text = txtPantalla.getText();
        if (text.length()>0){
            txtPantalla.setText(text.substring(0, text.length()-1));
        }
    }//GEN-LAST:event_btnBorrarNumActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        agregarNum("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        agregarNum("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        agregarNum("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        agregarNum("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        agregarNum("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        agregarNum("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        agregarNum("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
      txtPantalla.setText(" ");
      txtPantalla.setText("Digite el valor que va retirar: \n\n");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       txtPantalla.setText("");
       txtPantalla.setText("Haz cancelado tu transaccion :D"+"\n Dale a borrar para empezar de nuevo.");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       try {
        String cantidad = txtPantalla.getText();
        if (cantidad.isEmpty()) {
            txtPantalla.setText("Por favor digite un monto ");
            return;
        }
        int valor = Integer.parseInt(cantidad);
        if (valor % 10 != 0) {
            txtPantalla.setText("El monto debe ser múltiplo de 10 ");
            return;
        }
        if (valor % 10000 != 0 ){
            txtPantalla.setText("Ingresar monto valido ");
            return;
        }
        if (valor < 10000 || valor > 1000000) {
            txtPantalla.setText("El Monto esta fuera de rango ");
            return;
        }
        
        int cienk = 0, cincuentak = 0, veintek = 0, diesk = 0;
        int temp = valor;
        
        if (valor == 50000){
            veintek = 2;
            diesk = 1;
        }else if (valor == 100000){
            cincuentak = 1;
            veintek = 2;
            diesk = 1;
        } else {
            if (valor > 100000) {
            cincuentak += 1;
            veintek += 2;
            diesk += 1;
            temp -= 100000;
            }
        
        if (temp >= 100000) {
            cienk += temp / 100000;
            temp %= 100000;
        }
        if (temp >= 50000) {
            cincuentak += temp / 50000;
            temp %= 50000;
        }
        if (temp >= 20000) {
            veintek += temp / 20000;
            temp %= 20000;
        }
        if (temp >= 10000) {
            diesk += temp / 10000;
            temp %= 10000;
        }
        
        }
        
        int dispensar100 = billete.getOrDefault(100000, 0);
        int dispensar50 = billete.getOrDefault(50000, 0);
        int dispensar20 = billete.getOrDefault(20000, 0);
        int dispensar10 = billete.getOrDefault(10000, 0);
        
        if (dispensar100 < cienk || dispensar50 < cincuentak || dispensar20 < veintek || dispensar10 < diesk) {
            txtPantalla.setText("No hay fondo de billete en el cajero");
            return;
        }
        
        billete.put(100000, dispensar100 - cienk);
        billete.put(50000, dispensar50 - cincuentak);
        billete.put(20000, dispensar20 - veintek);
        billete.put(10000, dispensar10 - diesk);
        
        String mensaje = "Su transacción fue realizada con éxito.\nEl retiro fue de un valor de $" + valor + "\nBilletes entregados:";

        if (cienk > 0) {
            mensaje += "\n 100k: " + cienk;
        }
        if (cincuentak > 0) {
            mensaje += "\n 50k: " + cincuentak;
        }
        if (veintek > 0) {
            mensaje += "\n 20k: " + veintek;
        }
        if (diesk > 0) {
            mensaje += "\n 10k: " + diesk;
        }
        txtPantalla.setText(mensaje);
        
        cargarDatos();
        }catch (NumberFormatException e) {
            txtPantalla.setText("Ingrese solo números válidos");
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarNum;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton jButton14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaBilletes;
    private javax.swing.JTextArea txtPantalla;
    // End of variables declaration//GEN-END:variables
}
