package cakeordermanagementsystem;

import java.sql.*;
import javax.swing.*;

public class CancelOrder extends javax.swing.JFrame {

    private Connection connection;
    private int customer_id;

    public CancelOrder(Connection connection, int customer_id) {
        initComponents();
        this.connection = connection;
        this.customer_id = customer_id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        OrderCancelationTxt = new javax.swing.JLabel();
        Statement1Txt = new javax.swing.JLabel();
        Statement2Txt = new javax.swing.JLabel();
        OrderIDTxt = new javax.swing.JLabel();
        OrderIDField = new javax.swing.JTextField();
        CancelOrderButton = new javax.swing.JButton();
        BackgroundPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(102, 51, 0));
        BackButton.setFont(new java.awt.Font("Vivaldi", 1, 22)); // NOI18N
        BackButton.setForeground(new java.awt.Color(204, 204, 204));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arrows.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        OrderCancelationTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        OrderCancelationTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderCancelationTxt.setText("Cancel Order");
        getContentPane().add(OrderCancelationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        Statement1Txt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        Statement1Txt.setForeground(new java.awt.Color(204, 204, 204));
        Statement1Txt.setText("Please provide your Order ID, If you want ");
        getContentPane().add(Statement1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 350, 50));

        Statement2Txt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        Statement2Txt.setForeground(new java.awt.Color(204, 204, 204));
        Statement2Txt.setText("to Cancel Your Order");
        getContentPane().add(Statement2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        OrderIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        OrderIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderIDTxt.setText("Order ID");
        getContentPane().add(OrderIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        OrderIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIDFieldActionPerformed(evt);
            }
        });
        getContentPane().add(OrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 230, 30));

        CancelOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        CancelOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        CancelOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        CancelOrderButton.setText("Cancel Order");
        CancelOrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        CancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 220, 60));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new CustomerModulesPage(connection, customer_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderButtonActionPerformed

    String orderId = OrderIDField.getText().trim();
    if (orderId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an Order ID.");
        return;
    }

    try {
        int parsedOrderId = Integer.parseInt(orderId); // safely parsed once

        // 1. Delete from customerdeliveryaddress
        PreparedStatement deleteAddress = connection.prepareStatement(
            "DELETE FROM customerdeliveryadress WHERE order_id = ?"
        );
        deleteAddress.setInt(1, parsedOrderId);
        deleteAddress.executeUpdate();
        deleteAddress.close();

        // 2. Delete from customerpayment
        PreparedStatement deletePayment = connection.prepareStatement(
            "DELETE FROM customerpayment WHERE order_id = ?"
        );
        deletePayment.setInt(1, parsedOrderId);
        deletePayment.executeUpdate();
        deletePayment.close();

        // 3. Delete from adminorder
        PreparedStatement deleteAdminOrder = connection.prepareStatement(
            "DELETE FROM adminorder WHERE order_id = ?"
        );
        deleteAdminOrder.setInt(1, parsedOrderId);
        deleteAdminOrder.executeUpdate();
        deleteAdminOrder.close();

        // 4. Delete from customerorder (final step)
        PreparedStatement ps = connection.prepareStatement(
            "DELETE FROM customerorder WHERE order_id = ? AND customer_id = ?"
        );
        ps.setInt(1, parsedOrderId);
        ps.setInt(2, customer_id);
        int rowsAffected = ps.executeUpdate();
        ps.close();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Order ID " + orderId + " cancelled successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No order found with Order ID " + orderId + ".");
        }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Order ID format. Please enter a valid number.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
        }
    }//GEN-LAST:event_CancelOrderButtonActionPerformed

    private void OrderIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIDFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                new CancelOrder(con, 1).setVisible(true); // Example customer ID
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton CancelOrderButton;
    private javax.swing.JLabel OrderCancelationTxt;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JLabel OrderIDTxt;
    private javax.swing.JLabel Statement1Txt;
    private javax.swing.JLabel Statement2Txt;
    // End of variables declaration//GEN-END:variables
}
