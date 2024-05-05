/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import java.awt.Color;
/**
 *
 * @author javie
 */
public class PrincipalCliente extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalCliente
     */
    public PrincipalCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        buscaLabel = new javax.swing.JLabel();
        reservasBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botomPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        destinoTxt = new javax.swing.JTextField();
        salidaLabel = new javax.swing.JLabel();
        destinoLabel = new javax.swing.JLabel();
        entradaLabel = new javax.swing.JLabel();
        salidaTxt = new javax.swing.JFormattedTextField();
        entradaTxt = new javax.swing.JFormattedTextField();
        buscarBtn = new javax.swing.JButton();
        fechacorrectaLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 236, 217));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(255, 158, 0));

        buscaLabel.setFont(new java.awt.Font("Noto Sans Medium", 0, 18)); // NOI18N
        buscaLabel.setText("Busque alojamiento con JavaBnB:");

        reservasBtn.setBackground(new java.awt.Color(255, 204, 0));
        reservasBtn.setFont(new java.awt.Font("Noto Sans SemiBold", 0, 14)); // NOI18N
        reservasBtn.setText("Mis Reservas");
        reservasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Noto Sans SemiBold", 0, 14)); // NOI18N
        jButton1.setText("Mi Cuenta");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(buscaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(reservasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buscaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        jPanel1.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        botomPanel.setBackground(new java.awt.Color(255, 158, 0));

        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Copyright © 2024 JavaBnB, Inc. All rights deserved.");

        javax.swing.GroupLayout botomPanelLayout = new javax.swing.GroupLayout(botomPanel);
        botomPanel.setLayout(botomPanelLayout);
        botomPanelLayout.setHorizontalGroup(
            botomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botomPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(692, Short.MAX_VALUE))
        );
        botomPanelLayout.setVerticalGroup(
            botomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botomPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jPanel1.add(botomPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 980, 50));

        destinoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoTxtActionPerformed(evt);
            }
        });
        jPanel1.add(destinoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 320, 30));

        salidaLabel.setFont(new java.awt.Font("Noto Sans SemiBold", 0, 14)); // NOI18N
        salidaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salidaLabel.setText("Fecha de salida:");
        jPanel1.add(salidaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 140, 140, -1));

        destinoLabel.setFont(new java.awt.Font("Noto Sans SemiBold", 0, 14)); // NOI18N
        destinoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        destinoLabel.setText("Destino:");
        jPanel1.add(destinoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, -1));

        entradaLabel.setFont(new java.awt.Font("Noto Sans SemiBold", 0, 14)); // NOI18N
        entradaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entradaLabel.setText("Fecha de entrada:");
        jPanel1.add(entradaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, -1));

        salidaTxt.setForeground(new java.awt.Color(153, 153, 153));
        salidaTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        salidaTxt.setText("ej: 10 may 2024");
        salidaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salidaTxtMousePressed(evt);
            }
        });
        salidaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaTxtActionPerformed(evt);
            }
        });
        jPanel1.add(salidaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 140, 30));

        entradaTxt.setForeground(new java.awt.Color(153, 153, 153));
        entradaTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        entradaTxt.setText("ej: 5 may 2024");
        entradaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entradaTxtMousePressed(evt);
            }
        });
        jPanel1.add(entradaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 30));

        buscarBtn.setBackground(new java.awt.Color(255, 153, 102));
        buscarBtn.setFont(new java.awt.Font("Noto Sans SemiBold", 0, 18)); // NOI18N
        buscarBtn.setText("Buscar!");
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, 40));

        fechacorrectaLabel.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        fechacorrectaLabel.setForeground(new java.awt.Color(153, 153, 153));
        fechacorrectaLabel.setText("(*) Introduce correctamente las fechas o serán borradas");
        jPanel1.add(fechacorrectaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Inmueble", "Precio", "Valoración"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 320, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 600, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salidaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaTxtActionPerformed

    private void destinoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinoTxtActionPerformed

    private void entradaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaTxtMousePressed
        if(entradaTxt.getText().equals("ej: 5 may 2024")){
            entradaTxt.setText("");
            entradaTxt.setForeground(Color.black);
        }
        if(salidaTxt.getText().isEmpty()){
            salidaTxt.setText("ej: 10 may 2024");
            salidaTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_entradaTxtMousePressed

    private void salidaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaTxtMousePressed
        if(salidaTxt.getText().equals("ej: 10 may 2024")){
            salidaTxt.setText("");
            salidaTxt.setForeground(Color.black);
        }
        if(entradaTxt.getText().isEmpty()){
            entradaTxt.setText("ej: 5 may 2024");
            entradaTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_salidaTxtMousePressed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void reservasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservasBtnActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        PerfilCliente abrir = new PerfilCliente();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botomPanel;
    private javax.swing.JLabel buscaLabel;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JTextField destinoTxt;
    private javax.swing.JLabel entradaLabel;
    private javax.swing.JFormattedTextField entradaTxt;
    private javax.swing.JLabel fechacorrectaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reservasBtn;
    private javax.swing.JLabel salidaLabel;
    private javax.swing.JFormattedTextField salidaTxt;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
