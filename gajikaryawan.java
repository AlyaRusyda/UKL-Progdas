/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2.progdas;

/**
 *
 * @author asus
 */
public class gajikaryawan extends javax.swing.JFrame {

    /**
     * Creates new form gajikaryawan
     */
    public gajikaryawan() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbjk = new javax.swing.JComboBox<>();
        cmbjb = new javax.swing.JComboBox<>();
        txtgaji = new javax.swing.JTextField();
        txtlbr = new javax.swing.JTextField();
        cmblbr = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txttg = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        btnout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Penggajian Karyawan");

        jLabel2.setText("NIK");

        txtnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnikActionPerformed(evt);
            }
        });

        jLabel3.setText("Gaji Pokok");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Jabatan");

        jLabel6.setText("Gaji Pokok");

        jLabel7.setText("Jam Lembur");

        jLabel8.setText("Upah Lembur");

        cmbjk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jenis Kelamin--", "Laki-laki", "Perempuan" }));

        cmbjb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jabatan--", "Manajer", "Personalia", "Customer Service", "Security" }));
        cmbjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbjbActionPerformed(evt);
            }
        });

        cmblbr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jam Lembur--", "1 Jam", "2 Jam", "3 Jam", "4 Jam", "5 Jam" }));
        cmblbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblbrActionPerformed(evt);
            }
        });

        jLabel9.setText("Total Gaji");

        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        btnout.setText("Batal");
        btnout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnhitung)
                                .addGap(36, 36, 36)
                                .addComponent(btnout, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtnm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(txtnik, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbjb, 0, 1, Short.MAX_VALUE)
                                    .addComponent(cmbjk, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtgaji, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(cmblbr, 0, 1, Short.MAX_VALUE)
                                    .addComponent(txtlbr)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(txttg, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtgaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmblbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(cmbjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbjb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhitung)
                    .addComponent(btnout))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnikActionPerformed

    private void cmbjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbjbActionPerformed
        if (cmbjb.getSelectedItem().equals("--Pilih Jabatan--")){
             txtgaji.setText("");
        }
         else if (cmbjb.getSelectedItem().equals("Manajer")){
             txtgaji.setText("3000000");
        }
         else if (cmbjb.getSelectedItem().equals("Personalia")){
             txtgaji.setText("2500000");
        }
         else if (cmbjb.getSelectedItem().equals("Customer Service")){
             txtgaji.setText("2000000");
        }
         else if (cmbjb.getSelectedItem().equals("Security")){
             txtgaji.setText("1700000");
        }
    }//GEN-LAST:event_cmbjbActionPerformed

    private void cmblbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblbrActionPerformed
        if (cmblbr.getSelectedItem().equals("--Pilih Jam Lembur--")){
             txtlbr.setText("");
        }
         else if (cmblbr.getSelectedItem().equals("1 Jam")){
             txtlbr.setText("50000");
        }
         else if (cmblbr.getSelectedItem().equals("2 Jam")){
             txtlbr.setText("100000");
        }
         else if (cmblbr.getSelectedItem().equals("3 Jam")){
             txtlbr.setText("150000");
        }
          else if (cmblbr.getSelectedItem().equals("4 Jam")){
             txtlbr.setText("200000");
        }
          else if (cmblbr.getSelectedItem().equals("5 Jam")){
             txtlbr.setText("250000");
        }
    }//GEN-LAST:event_cmblbrActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        int x=Integer.parseInt(txtgaji.getText());
 int y=Integer.parseInt(txtlbr.getText());
 int total=x+y;
 txttg.setText(String.valueOf(total));
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoutActionPerformed
        txtnik.setText (null); 
   txtnm.setText (null);
   txtgaji.setText (null);
   txtlbr.setText (null);
   txttg.setText (null);
    }//GEN-LAST:event_btnoutActionPerformed

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
            java.util.logging.Logger.getLogger(gajikaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gajikaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gajikaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gajikaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gajikaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnout;
    private javax.swing.JComboBox<String> cmbjb;
    private javax.swing.JComboBox<String> cmbjk;
    private javax.swing.JComboBox<String> cmblbr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtgaji;
    private javax.swing.JTextField txtlbr;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txttg;
    // End of variables declaration//GEN-END:variables
}
