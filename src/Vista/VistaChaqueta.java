package Vista;
import Modelo.Chaqueta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class VistaChaqueta extends javax.swing.JFrame {
    ArrayList<Chaqueta> chaquetas = new ArrayList();
    
    public VistaChaqueta() {
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
        jLabel1 = new javax.swing.JLabel();
        jBTVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFIdentificador = new javax.swing.JTextField();
        jTFColor = new javax.swing.JTextField();
        jTFTalla = new javax.swing.JTextField();
        jTFTipoLargo = new javax.swing.JTextField();
        jTFTipoChaqueta = new javax.swing.JTextField();
        jTFMaterial = new javax.swing.JTextField();
        jTFCantidad = new javax.swing.JTextField();
        jBTSalir1 = new javax.swing.JButton();
        jBTSalir2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTFEsInvierno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Chaquetas");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBTVolver.setBackground(new java.awt.Color(153, 153, 153));
        jBTVolver.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTVolver.setForeground(new java.awt.Color(0, 0, 0));
        jBTVolver.setText("VOLVER");
        jBTVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTVolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Identificador");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Color");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Talla");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo de Largo");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de Chaqueta");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Material");

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cantidad");

        jTFIdentificador.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jTFColor.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jTFTalla.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jTFTipoLargo.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jTFTipoChaqueta.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jTFMaterial.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jTFCantidad.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jBTSalir1.setBackground(new java.awt.Color(153, 153, 153));
        jBTSalir1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTSalir1.setForeground(new java.awt.Color(0, 0, 0));
        jBTSalir1.setText("GUARDAR");
        jBTSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalir1ActionPerformed(evt);
            }
        });

        jBTSalir2.setBackground(new java.awt.Color(153, 153, 153));
        jBTSalir2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jBTSalir2.setForeground(new java.awt.Color(0, 0, 0));
        jBTSalir2.setText("LISTA");
        jBTSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalir2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ropa de Invierno (SI/NO)");

        jTFEsInvierno.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Precio");

        jTFPrecio.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEsInvierno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFIdentificador)
                        .addComponent(jTFColor)
                        .addComponent(jTFTalla)
                        .addComponent(jTFTipoLargo)
                        .addComponent(jTFTipoChaqueta)
                        .addComponent(jTFMaterial)
                        .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBTVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBTSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBTSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFTipoLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFTipoChaqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFEsInvierno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTVolver)
                    .addComponent(jBTSalir1)
                    .addComponent(jBTSalir2))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTVolverActionPerformed
        Menu volverMenu = new Menu();
        volverMenu.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jBTVolverActionPerformed

    private void jBTSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalir1ActionPerformed

        //guarda los datos  ingresados en los textfield del jframe
        int numeroId = Integer.parseInt(jTFIdentificador.getText());
        String color = jTFColor.getText();
        String talla = jTFTalla.getText();
        String tipoLargo = jTFTipoLargo.getText();
        String tipoChaqueta = jTFTipoChaqueta.getText();
        String material = jTFMaterial.getText();
        double precio = Integer.parseInt(jTFPrecio.getText());
        int cantidad = Integer.parseInt(jTFCantidad.getText());
        String esInvierno = jTFEsInvierno.getText();

        
        //compara cadenas sin importar mayúsculas o minúsculas.
        //En este caso la respuesta si queda siendo true en booleano
        //cualquier otra cadena es false
        //convierte esInvierno de String a booleano esInviernoResp
        boolean esInviernoResp = esInvierno.equalsIgnoreCase("Si");
        
        
        //Manda los parametros al Constructor de chaqueta
        Chaqueta chaqueta = new Chaqueta(tipoLargo,tipoChaqueta,esInviernoResp,numeroId,talla,material,color,cantidad,precio);

        
        chaquetas.add(chaqueta);//Agrega chaqueta al arrayList de chaquetas
        Chaqueta.setContadorPrenda(); //Contador de PrendasCreadas
        Chaqueta.setContadorChaqueta(); //Contador de Chaquetas Creadas
        Chaqueta.agregarPrendas(chaqueta); //Agrega datos de camisa en un arraylist general - Prendas
        
        
        JOptionPane.showMessageDialog(null,"Datos Guardados Correctamente");

        
        
        //borrar el texto escrito
        jTFIdentificador.setText("");
        jTFColor.setText("");
        jTFTalla.setText("");
        jTFTipoLargo.setText("");
        jTFTipoChaqueta.setText("");
        jTFMaterial.setText("");
        jTFCantidad.setText("");
        jTFPrecio.setText("");
        jTFEsInvierno.setText("");
    }//GEN-LAST:event_jBTSalir1ActionPerformed

    private void jBTSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalir2ActionPerformed
        JOptionPane.showMessageDialog(null,chaquetas);
        JOptionPane.showMessageDialog(null,"contador" +Chaqueta.getContadorChaqueta());
    }//GEN-LAST:event_jBTSalir2ActionPerformed

    private void jTFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(VistaChaqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaChaqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaChaqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaChaqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaChaqueta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTSalir1;
    private javax.swing.JButton jBTSalir2;
    private javax.swing.JButton jBTVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCantidad;
    private javax.swing.JTextField jTFColor;
    private javax.swing.JTextField jTFEsInvierno;
    private javax.swing.JTextField jTFIdentificador;
    private javax.swing.JTextField jTFMaterial;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTFTalla;
    private javax.swing.JTextField jTFTipoChaqueta;
    private javax.swing.JTextField jTFTipoLargo;
    // End of variables declaration//GEN-END:variables
}