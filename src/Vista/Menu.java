
package Vista;
import Modelo.Factura;
import javax.swing.JOptionPane;
import Modelo.Prenda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBTCamisa = new javax.swing.JButton();
        jBTPantalon = new javax.swing.JButton();
        jBTChaqueta = new javax.swing.JButton();
        jBTZapato = new javax.swing.JButton();
        jBTSalir = new javax.swing.JButton();
        jBTSalir2 = new javax.swing.JButton();
        jBTSalir3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO DE PRENDAS VENDIDAS");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jBTCamisa.setBackground(new java.awt.Color(153, 153, 153));
        jBTCamisa.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTCamisa.setForeground(new java.awt.Color(0, 0, 0));
        jBTCamisa.setText("CAMISA");
        jBTCamisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTCamisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCamisaActionPerformed(evt);
            }
        });

        jBTPantalon.setBackground(new java.awt.Color(153, 153, 153));
        jBTPantalon.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTPantalon.setForeground(new java.awt.Color(0, 0, 0));
        jBTPantalon.setText("PANTALON");
        jBTPantalon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTPantalonActionPerformed(evt);
            }
        });

        jBTChaqueta.setBackground(new java.awt.Color(153, 153, 153));
        jBTChaqueta.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTChaqueta.setForeground(new java.awt.Color(0, 0, 0));
        jBTChaqueta.setText("CHAQUETA");
        jBTChaqueta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTChaqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTChaquetaActionPerformed(evt);
            }
        });

        jBTZapato.setBackground(new java.awt.Color(153, 153, 153));
        jBTZapato.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTZapato.setForeground(new java.awt.Color(0, 0, 0));
        jBTZapato.setText("ZAPATO");
        jBTZapato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTZapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTZapatoActionPerformed(evt);
            }
        });

        jBTSalir.setBackground(new java.awt.Color(153, 153, 153));
        jBTSalir.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBTSalir.setText("SALIR");
        jBTSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirActionPerformed(evt);
            }
        });

        jBTSalir2.setBackground(new java.awt.Color(153, 153, 153));
        jBTSalir2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTSalir2.setForeground(new java.awt.Color(0, 0, 0));
        jBTSalir2.setText("LISTA DE PRENDAS");
        jBTSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalir2ActionPerformed(evt);
            }
        });

        jBTSalir3.setBackground(new java.awt.Color(153, 153, 153));
        jBTSalir3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTSalir3.setForeground(new java.awt.Color(0, 0, 0));
        jBTSalir3.setText("FACTURA");
        jBTSalir3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBTCamisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTPantalon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTChaqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTZapato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(265, 265, 265))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jBTCamisa)
                .addGap(18, 18, 18)
                .addComponent(jBTPantalon)
                .addGap(18, 18, 18)
                .addComponent(jBTChaqueta)
                .addGap(21, 21, 21)
                .addComponent(jBTZapato)
                .addGap(18, 18, 18)
                .addComponent(jBTSalir2)
                .addGap(18, 18, 18)
                .addComponent(jBTSalir3)
                .addGap(18, 18, 18)
                .addComponent(jBTSalir)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTZapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTZapatoActionPerformed
        VistaZapato vistaZapato  = new VistaZapato();
        vistaZapato.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBTZapatoActionPerformed

    private void jBTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBTSalirActionPerformed

    private void jBTCamisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCamisaActionPerformed
        VistaCamisa vistaCamisa = new VistaCamisa();
        vistaCamisa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBTCamisaActionPerformed

    private void jBTPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTPantalonActionPerformed
        VistaPantalon vistaPantalon = new VistaPantalon();
        vistaPantalon.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBTPantalonActionPerformed

    private void jBTChaquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTChaquetaActionPerformed
        VistaChaqueta vistaChaqueta = new VistaChaqueta();
        vistaChaqueta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBTChaquetaActionPerformed

    private void jBTSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalir2ActionPerformed
        JOptionPane.showMessageDialog(null,Prenda.getPrendas());
        JOptionPane.showMessageDialog(null,"Contador de prendas vendidas= "+Prenda.getContadorPrenda());
    }//GEN-LAST:event_jBTSalir2ActionPerformed

    private void jBTSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalir3ActionPerformed
        VistaFactura vistaFactura = new VistaFactura();
        vistaFactura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBTSalir3ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCamisa;
    private javax.swing.JButton jBTChaqueta;
    private javax.swing.JButton jBTPantalon;
    private javax.swing.JButton jBTSalir;
    private javax.swing.JButton jBTSalir2;
    private javax.swing.JButton jBTSalir3;
    private javax.swing.JButton jBTZapato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
