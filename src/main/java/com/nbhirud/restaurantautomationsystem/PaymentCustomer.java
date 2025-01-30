package com.nbhirud.restaurantautomationsystem;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author revanth
 */
public class PaymentCustomer extends javax.swing.JFrame {
  Connection mycon=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form PaymentCustomer
     */
    public PaymentCustomer() {
        initComponents();
         //mycon=MySql.ConnectDB();
        close_payment();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        combo_payment = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        card_number = new javax.swing.JLabel();
        txt_cash_num = new javax.swing.JTextField();
        exp_month = new javax.swing.JLabel();
        exp_year = new javax.swing.JLabel();
        cvv = new javax.swing.JLabel();
        txt_exp_month = new javax.swing.JTextField();
        txt_exp_year = new javax.swing.JTextField();
        txt_cvv = new javax.swing.JTextField();
        payment_button = new javax.swing.JButton();
        enter_cash = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setText("RESTAURANT AUTOMATION SYSTEM");

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("PAYMENT");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        combo_payment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CASH", "CARD", "PAYPAL" }));
        combo_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_paymentActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("PAYMENT OPTIONS");

        card_number.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        card_number.setText("CARD NUMBER");

        exp_month.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exp_month.setText("EXP MONTH");

        exp_year.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exp_year.setText("EXP YEAR");

        cvv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cvv.setText("CVV");

        payment_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        payment_button.setText("PROCEED PAYMENT");
        payment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_buttonActionPerformed(evt);
            }
        });

        enter_cash.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        enter_cash.setText("ENTER CASH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(515, 515, 515)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(combo_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(card_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exp_month)
                                    .addComponent(exp_year)
                                    .addComponent(cvv)
                                    .addComponent(enter_cash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cash_num, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_cvv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(txt_exp_year, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_exp_month, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(payment_button)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combo_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enter_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(card_number)
                            .addComponent(txt_cash_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exp_month)
                            .addComponent(txt_exp_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exp_year)
                            .addComponent(txt_exp_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cvv)
                            .addComponent(txt_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(payment_button)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void payment(){
    
     mycon=MySql.ConnectDB();
        String sql="select card_number,card_month,card_year,card_cvv from payment_cardnum where card_number=? and card_month=? and card_year=? and card_cvv=? ";
        try{
           pst=mycon.prepareStatement(sql);
          pst.setString(1,txt_cash_num.getText());
          pst.setString(2,txt_exp_month.getText());
           pst.setString(3,txt_exp_year.getText());
            pst.setString(4,txt_cvv.getText());
            rs=pst.executeQuery();
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null,"invalid card details","Access Denied",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
             JOptionPane.showMessageDialog(null,"payment done");
               
            }
        }
        catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
}
    public void close_payment(){
    
       enter_cash.setVisible(false);
             card_number.setVisible(false);
              exp_month.setVisible(false);
               exp_year.setVisible(false);
                cvv.setVisible(false);
                 payment_button.setVisible(false);
                  txt_cash.setVisible(false);
                   txt_cash_num.setVisible(false);
                    txt_exp_month.setVisible(false);
                     txt_exp_year.setVisible(false);
                     txt_cvv.setVisible(false);
    
}
    private void combo_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_paymentActionPerformed
        // TODO add your handling code here:
                 

        String value1=combo_payment.getSelectedItem().toString();
        try{
        if("CARD".equals(value1)){
   enter_cash.setVisible(true);
card_number.setVisible(true);
exp_month.setVisible(true);
exp_year.setVisible(true);
cvv.setVisible(true);
payment_button.setVisible(true);
txt_cash.setVisible(true);
txt_cash_num.setVisible(true);
txt_exp_month.setVisible(true);
txt_exp_year.setVisible(true);
txt_cvv.setVisible(true);
 
  
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

   
    }//GEN-LAST:event_combo_paymentActionPerformed

    private void payment_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_buttonActionPerformed
        // TODO add your handling code here:
       payment();
        
    }//GEN-LAST:event_payment_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentCustomer().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel card_number;
    private javax.swing.JComboBox combo_payment;
    private javax.swing.JLabel cvv;
    private javax.swing.JLabel enter_cash;
    private javax.swing.JLabel exp_month;
    private javax.swing.JLabel exp_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton payment_button;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_cash_num;
    private javax.swing.JTextField txt_cvv;
    private javax.swing.JTextField txt_exp_month;
    private javax.swing.JTextField txt_exp_year;
    // End of variables declaration//GEN-END:variables
}
