package cakeordermanagementsystem;

import java.sql.Connection;

public class AdminModulesPage extends javax.swing.JFrame {

    private Connection connection;
    
    public AdminModulesPage(Connection connection) {
        this.connection = connection;  // store connection
        initComponents();
    }
    
    public AdminModulesPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        WelcomeTxt = new javax.swing.JLabel();
        WhatToDoTxt = new javax.swing.JLabel();
        CustomerAccessButton = new javax.swing.JButton();
        CakeCatalogButton = new javax.swing.JButton();
        OrderManagementButton = new javax.swing.JButton();
        DeliveryControlButton = new javax.swing.JButton();
        BackgroundPic = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        WelcomeTxt.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        WelcomeTxt.setForeground(new java.awt.Color(204, 204, 204));
        WelcomeTxt.setText("Welcome to Admin's Module");
        getContentPane().add(WelcomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        WhatToDoTxt.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        WhatToDoTxt.setForeground(new java.awt.Color(204, 204, 204));
        WhatToDoTxt.setText("What do you want to do");
        getContentPane().add(WhatToDoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        CustomerAccessButton.setBackground(new java.awt.Color(102, 51, 0));
        CustomerAccessButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        CustomerAccessButton.setForeground(new java.awt.Color(204, 204, 204));
        CustomerAccessButton.setText("Customer Access");
        CustomerAccessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerAccessButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerAccessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 190, 60));

        CakeCatalogButton.setBackground(new java.awt.Color(102, 51, 0));
        CakeCatalogButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        CakeCatalogButton.setForeground(new java.awt.Color(204, 204, 204));
        CakeCatalogButton.setText("Cake Catalog");
        CakeCatalogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CakeCatalogButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CakeCatalogButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 190, 60));

        OrderManagementButton.setBackground(new java.awt.Color(102, 51, 0));
        OrderManagementButton.setFont(new java.awt.Font("Vivaldi", 1, 20)); // NOI18N
        OrderManagementButton.setForeground(new java.awt.Color(204, 204, 204));
        OrderManagementButton.setText("Order Management");
        OrderManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderManagementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OrderManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 190, 60));

        DeliveryControlButton.setBackground(new java.awt.Color(102, 51, 0));
        DeliveryControlButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        DeliveryControlButton.setForeground(new java.awt.Color(204, 204, 204));
        DeliveryControlButton.setText("Delivery control");
        DeliveryControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryControlButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeliveryControlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 190, 60));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CustomerBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel2");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new AdminCustomerPage(connection).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CustomerAccessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerAccessButtonActionPerformed
        CustomerAccessPage customerAccessPage = new CustomerAccessPage(connection);
        customerAccessPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerAccessButtonActionPerformed

    private void CakeCatalogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CakeCatalogButtonActionPerformed
        CakeCatalogPage cakeCatalogPage = new CakeCatalogPage(connection);
        cakeCatalogPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CakeCatalogButtonActionPerformed

    private void OrderManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderManagementButtonActionPerformed
        OrderManagementPage orderManagementPage = new OrderManagementPage (connection);
        orderManagementPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OrderManagementButtonActionPerformed

    private void DeliveryControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryControlButtonActionPerformed
        DeliveryControlPage deliveryControlPage = new DeliveryControlPage (connection);
        deliveryControlPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeliveryControlButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminModulesPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton CakeCatalogButton;
    private javax.swing.JButton CustomerAccessButton;
    private javax.swing.JButton DeliveryControlButton;
    private javax.swing.JButton OrderManagementButton;
    private javax.swing.JLabel WelcomeTxt;
    private javax.swing.JLabel WhatToDoTxt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
