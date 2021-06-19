/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankproject;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usman_Ghani_Mughal
 */
public class MainMenu extends javax.swing.JFrame {
     public static int accountId;
    /**
     * Creates new form MainMenu
     * @param acc
     */
    public MainMenu(int acc) {
        initComponents();
        accountId = acc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deposite = new javax.swing.JButton();
        cashwithd = new javax.swing.JButton();
        fastcash = new javax.swing.JButton();
        onlinetranstion = new javax.swing.JButton();
        pinchange = new javax.swing.JButton();
        blanceenquiry = new javax.swing.JButton();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deposite.setForeground(new java.awt.Color(0, 0, 0));
        deposite.setText("Deposite");
        deposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeActionPerformed(evt);
            }
        });

        cashwithd.setForeground(new java.awt.Color(0, 0, 0));
        cashwithd.setText("Cash WithDrawl");
        cashwithd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashwithdActionPerformed(evt);
            }
        });

        fastcash.setForeground(new java.awt.Color(0, 0, 0));
        fastcash.setText("Fast Cash");
        fastcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastcashActionPerformed(evt);
            }
        });

        onlinetranstion.setText("Online Transaction ");
        onlinetranstion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlinetranstionActionPerformed(evt);
            }
        });

        pinchange.setForeground(new java.awt.Color(0, 0, 0));
        pinchange.setText("PIN Change");
        pinchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinchangeActionPerformed(evt);
            }
        });

        blanceenquiry.setForeground(new java.awt.Color(0, 0, 0));
        blanceenquiry.setText("Blance Enquiry");
        blanceenquiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blanceenquiryActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pinchange, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(fastcash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deposite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cashwithd, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(onlinetranstion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(blanceenquiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposite)
                    .addComponent(cashwithd))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fastcash)
                    .addComponent(onlinetranstion))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinchange)
                    .addComponent(blanceenquiry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(exit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeActionPerformed
        this.setVisible(false);
        new Deposite().setVisible(true);
    }//GEN-LAST:event_depositeActionPerformed

    private void cashwithdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashwithdActionPerformed
       this.setVisible(false);
       new WithDrawl().setVisible(true);
    }//GEN-LAST:event_cashwithdActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.setVisible(false);
       new Login_Form().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void pinchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinchangeActionPerformed
        this.setVisible(false);
        new PINChange().setVisible(true);
    }//GEN-LAST:event_pinchangeActionPerformed

    private void blanceenquiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blanceenquiryActionPerformed
        try {
            Login_Form.statement = Login_Form.coneConnection.createStatement();
            Login_Form.resultSet = Login_Form.statement.executeQuery("Select Amount from banksystem.account where AccountID ="+MainMenu.accountId);
            if(Login_Form.resultSet.next())
            {
                JOptionPane.showMessageDialog(this,"This is Your Current Blance :  "+Login_Form.resultSet.getDouble(1)+"  Rs");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Somethings Goes Wrong Try Again");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
       
      
    }//GEN-LAST:event_blanceenquiryActionPerformed

    private void fastcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastcashActionPerformed
      this.setVisible(false);
      new FastCash().setVisible(true);
    }//GEN-LAST:event_fastcashActionPerformed

    private void onlinetranstionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlinetranstionActionPerformed
       this.setVisible(false);
       new Transfer().setVisible(true);
    }//GEN-LAST:event_onlinetranstionActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton blanceenquiry;
    private javax.swing.JButton cashwithd;
    private javax.swing.JButton deposite;
    private javax.swing.JButton exit;
    private javax.swing.JButton fastcash;
    private javax.swing.JButton onlinetranstion;
    private javax.swing.JButton pinchange;
    // End of variables declaration//GEN-END:variables
}
