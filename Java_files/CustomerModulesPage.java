package cakeordermanagementsystem;

import java.sql.Connection;

public class CustomerModulesPage extends javax.swing.JFrame {

    private Connection connection;
    private int customer_id;

    public CustomerModulesPage(Connection connection, int customer_id) {
        initComponents();
        this.connection = connection;
        this.customer_id = customer_id;
        System.out.println("Logged in Customer ID: " + customer_id);
    }
    
    public CustomerModulesPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        WelcomeTxt = new javax.swing.JLabel();
        WhatToDoTxt = new javax.swing.JLabel();
        BrowseCakeButton = new javax.swing.JButton();
        PlaceOrderButton = new javax.swing.JButton();
        CancelOrderButton = new javax.swing.JButton();
        PaymentOptionButton = new javax.swing.JButton();
        TrackDeliverybutton = new javax.swing.JButton();
        RatingAndFeedbackButton = new javax.swing.JButton();
        BackgroundPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(102, 51, 0));
        BackButton.setFont(new java.awt.Font("Vivaldi", 1, 22)); // NOI18N
        BackButton.setForeground(new java.awt.Color(204, 204, 204));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arrows.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        BackButton.setMaximumSize(new java.awt.Dimension(117, 54));
        BackButton.setMinimumSize(new java.awt.Dimension(117, 54));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        WelcomeTxt.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        WelcomeTxt.setForeground(new java.awt.Color(204, 204, 204));
        WelcomeTxt.setText("Welcome to Customer's Module");
        getContentPane().add(WelcomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        WhatToDoTxt.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        WhatToDoTxt.setForeground(new java.awt.Color(204, 204, 204));
        WhatToDoTxt.setText("What do you want to do");
        getContentPane().add(WhatToDoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        BrowseCakeButton.setBackground(new java.awt.Color(102, 51, 0));
        BrowseCakeButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        BrowseCakeButton.setForeground(new java.awt.Color(204, 204, 204));
        BrowseCakeButton.setText("Browse Cake");
        BrowseCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseCakeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseCakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 220, 50));

        PlaceOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        PlaceOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        PlaceOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        PlaceOrderButton.setText("Place Order");
        PlaceOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PlaceOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 220, 50));

        CancelOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        CancelOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        CancelOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        CancelOrderButton.setText("Cancel Order");
        CancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 220, 50));

        PaymentOptionButton.setBackground(new java.awt.Color(102, 51, 0));
        PaymentOptionButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        PaymentOptionButton.setForeground(new java.awt.Color(204, 204, 204));
        PaymentOptionButton.setText("Payment Option");
        PaymentOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentOptionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PaymentOptionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 220, 50));

        TrackDeliverybutton.setBackground(new java.awt.Color(102, 51, 0));
        TrackDeliverybutton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        TrackDeliverybutton.setForeground(new java.awt.Color(204, 204, 204));
        TrackDeliverybutton.setText("Track Delivery");
        TrackDeliverybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackDeliverybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(TrackDeliverybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 220, 50));

        RatingAndFeedbackButton.setBackground(new java.awt.Color(102, 51, 0));
        RatingAndFeedbackButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        RatingAndFeedbackButton.setForeground(new java.awt.Color(204, 204, 204));
        RatingAndFeedbackButton.setText("Rating & Feedback");
        RatingAndFeedbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatingAndFeedbackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RatingAndFeedbackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, 50));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CustomerBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderButtonActionPerformed
        PlaceOrder placeOrder = new PlaceOrder(connection, customer_id);
        placeOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PlaceOrderButtonActionPerformed

    private void PaymentOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentOptionButtonActionPerformed
        PaymentOption paymentOption = new PaymentOption(connection, customer_id);
        paymentOption.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PaymentOptionButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new AdminCustomerPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BrowseCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseCakeButtonActionPerformed
        new BrowseCake().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BrowseCakeButtonActionPerformed

    private void CancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderButtonActionPerformed
        CancelOrder cancelOrder = new CancelOrder(connection, customer_id);
        cancelOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelOrderButtonActionPerformed

    private void TrackDeliverybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackDeliverybuttonActionPerformed
        new TrackDelivery(connection, customer_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TrackDeliverybuttonActionPerformed

    private void RatingAndFeedbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatingAndFeedbackButtonActionPerformed
        FeedbackAndRatings feedbackAndRatings = new FeedbackAndRatings(connection, customer_id);
        feedbackAndRatings.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RatingAndFeedbackButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerModulesPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton BrowseCakeButton;
    private javax.swing.JButton CancelOrderButton;
    private javax.swing.JButton PaymentOptionButton;
    private javax.swing.JButton PlaceOrderButton;
    private javax.swing.JButton RatingAndFeedbackButton;
    private javax.swing.JButton TrackDeliverybutton;
    private javax.swing.JLabel WelcomeTxt;
    private javax.swing.JLabel WhatToDoTxt;
    // End of variables declaration//GEN-END:variables
}
