
package Graficos;

import java.awt.Color;
import java.awt.Graphics;


public class frmGraficador extends javax.swing.JFrame {

    
    public frmGraficador() {
        initComponents();
    }

   public void paint(Graphics g)
   {
       g.setColor(Color.RED);//DARLE COLOR
       g.drawLine(10, 100, 400, 100);//DIBUJA UNA LINIA
       
       g.setColor(Color.BLUE);
       g.drawRect(150, 150, 100, 100);//PARA DIBUJAR UN CUADRADRO
       
       g.setColor(Color.black);
       g.drawRect(50, 50, 200, 100);//PARA UN RECTANGULO y solo contorno
       
       g.setColor(Color.cyan);
       g.fillRect(10, 10, 150, 50);//para que salga todo rellenado o pintado
       
       g.setColor(Color.DARK_GRAY);
       g.drawOval(200, 200, 100, 150);//para dibujar un circulo
       
       g.setColor(Color.ORANGE);
       g.fillOval(250, 250, 150, 150);//para dibujar un circulo pero pintado
       
       g.setColor(Color.ORANGE);
       g.drawLine(250, 250, 150, 150);//LINIA
       
   
   }       
           
           
           
           
           
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmGraficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGraficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGraficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGraficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGraficador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
