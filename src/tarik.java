
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wafiq
 */
public class tarik extends javax.swing.JFrame {

    /**

     */
    public tarik(String saldo) {
        initComponents();
        jTextField2.setText(saldo);
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setText("SELAMAT DATANG DI BANK KRUPT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 340, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tarik");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 70, 60, 30);

        jLabel3.setText("Rp");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 70, 40, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 70, 140, 30);

        jButton2.setText("Tarik");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 70, 60, 30);

        jButton3.setText("Transaksi lain");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(140, 220, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Saldo Awal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 160, 90, 30);

        jLabel5.setText("Rp");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 160, 40, 30);

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 160, 140, 30);

        setBounds(0, 0, 421, 305);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    
    int tab;
    int t = Integer.parseInt(jTextField1.getText().toString());
    int saldo = Integer.parseInt(jTextField2.getText().toString());;
    
    {
        if(t%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulagi Lagi", "Transaksi Gagal",0);
        else{
            if(t>saldo)
            JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi \nSilahkan melakukan penyetoran", "Transaksi Gagal",0); 
            else if(t<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal pengambilan tunai adalah Rp.50.000,00", "Transaksi Gagal",0);
            else{
                saldo = saldo-t;
                JOptionPane.showMessageDialog(null, "Saldo anda saat ini sebesar " + saldo);
                if (saldo<=50000)
                {
                    JOptionPane.showMessageDialog(null,"Saldo minimal harus RP 50000,00 , Segera melakukan penyetoran untuk menghindari penutupan akun", "CAUTION", 2);
                }
            }
        }
    } 
    

      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String saldo = "100000000";
        new main(saldo).setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(tarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String saldo = "100000000";
                new tarik(saldo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
