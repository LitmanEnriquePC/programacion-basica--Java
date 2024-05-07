import javax.script.ScriptEngineManager;
public class Calcu extends javax.swing.JFrame {
    String expesion;
    

    /**
     * Creates new form Calcu
     */
    public Calcu() {
        initComponents();
    }
    private void gg(){
        expesion = "4*5*3*2*3-5";
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manage.getEngineByName("Java");
        System.out.println("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfResultado = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btnsiete = new javax.swing.JButton();
        btncuatro = new javax.swing.JButton();
        btnuno = new javax.swing.JButton();
        btnocho = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnmenos = new javax.swing.JButton();
        btnnueve = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        btncinco = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        btntres = new javax.swing.JButton();
        btndos = new javax.swing.JButton();
        btnseis = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btnmasmenos = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btncero = new javax.swing.JButton();

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tfResultado.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        tfResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfResultado.setText("0");

        btneliminar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btneliminar.setText("C");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsiete.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnsiete.setText("7");
        btnsiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsieteActionPerformed(evt);
            }
        });

        btncuatro.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btncuatro.setText("4");
        btncuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuatroActionPerformed(evt);
            }
        });

        btnuno.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnuno.setText("1");
        btnuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnunoActionPerformed(evt);
            }
        });

        btnocho.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnocho.setText("8");
        btnocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnochoActionPerformed(evt);
            }
        });

        btnborrar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnborrar.setText("<=");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnmenos.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnmenos.setText("-");
        btnmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenosActionPerformed(evt);
            }
        });

        btnnueve.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnnueve.setText("9");
        btnnueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnueveActionPerformed(evt);
            }
        });

        btndividir.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btndividir.setText("/");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });

        btncinco.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btncinco.setText("5");
        btncinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncincoActionPerformed(evt);
            }
        });

        btnmas.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnmas.setText("+");
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });

        btntres.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btntres.setText("3");
        btntres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntresActionPerformed(evt);
            }
        });

        btndos.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btndos.setText("2");
        btndos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndosActionPerformed(evt);
            }
        });

        btnseis.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnseis.setText("6");
        btnseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseisActionPerformed(evt);
            }
        });

        btnpunto.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });

        btnmasmenos.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnmasmenos.setText("+- ");
        btnmasmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasmenosActionPerformed(evt);
            }
        });

        btnmultiplicar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnmultiplicar.setText("X");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });

        btnigual.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnlimpiar.setText("CE");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btncero.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btncero.setText("0");
        btncero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnsiete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnocho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnnueve, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btncuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btncinco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnuno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btntres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnseis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btndividir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnmasmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnborrar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnigual, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsiete, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnocho, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnnueve, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnmultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btndividir, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btncinco, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnseis, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmenos, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnuno, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addComponent(btntres, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addComponent(btndos, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmas, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnpunto, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnmasmenos, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btncero, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsieteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsieteActionPerformed

    private void btncuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncuatroActionPerformed

    private void btnunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnunoActionPerformed

    private void btnochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnochoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnochoActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmenosActionPerformed

    private void btnnueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnueveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnueveActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndividirActionPerformed

    private void btncincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncincoActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmasActionPerformed

    private void btntresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntresActionPerformed

    private void btndosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndosActionPerformed

    private void btnseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnseisActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btnmasmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasmenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmasmenosActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmultiplicarActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnceroActionPerformed

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
            java.util.logging.Logger.getLogger(Calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btncero;
    private javax.swing.JButton btncinco;
    private javax.swing.JButton btncuatro;
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btndos;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnmasmenos;
    private javax.swing.JButton btnmenos;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnnueve;
    private javax.swing.JButton btnocho;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnseis;
    private javax.swing.JButton btnsiete;
    private javax.swing.JButton btntres;
    private javax.swing.JButton btnuno;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfResultado;
    // End of variables declaration//GEN-END:variables
}
