/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi;

/**
 *
 * @author ADMIN
 */
public class homm extends javax.swing.JFrame {

    /**
     * Creates new form apk_bangundatar
     */
    public homm() {
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

        persegipanjang = new javax.swing.JButton();
        persegi = new javax.swing.JButton();
        segitiga = new javax.swing.JButton();
        lingkaran = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 153));
        setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        setIconImages(null);

        persegipanjang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        persegipanjang.setText("persegi panjang");
        persegipanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persegipanjangActionPerformed(evt);
            }
        });

        persegi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        persegi.setText("persegi");
        persegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persegiActionPerformed(evt);
            }
        });

        segitiga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        segitiga.setText("segitiga");
        segitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segitigaActionPerformed(evt);
            }
        });

        lingkaran.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lingkaran.setText("lingkaran");
        lingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lingkaranActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 0, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("APLIKASI BANGUN DATAR");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(persegipanjang)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lingkaran)
                                    .addComponent(persegi)
                                    .addComponent(segitiga)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(persegipanjang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(persegi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lingkaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segitiga)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void persegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persegiActionPerformed
        // TODO add your handling code here:
        new persegi().setVisible(true);
    }//GEN-LAST:event_persegiActionPerformed

    private void segitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segitigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segitigaActionPerformed

    private void lingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lingkaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lingkaranActionPerformed

    private void persegipanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persegipanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persegipanjangActionPerformed

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
            java.util.logging.Logger.getLogger(homm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lingkaran;
    private javax.swing.JButton persegi;
    private javax.swing.JButton persegipanjang;
    private javax.swing.JButton segitiga;
    // End of variables declaration//GEN-END:variables
}
