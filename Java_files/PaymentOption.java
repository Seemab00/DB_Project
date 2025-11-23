package cakeordermanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class PaymentOption extends javax.swing.JFrame {

    private Connection connection;
    private int customer_id; // Add customerId field

    public PaymentOption(Connection connection, int customer_id) { // Modified constructor
        initComponents();
        this.connection = connection;
        this.customer_id = customer_id; // Initialize customerId
        PaymentOptionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select", "EasyPaisa", "JazzCash"
        }));
    }

    public PaymentOption() {
        initComponents();
        PaymentOptionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select", "EasyPaisa", "JazzCash"
        }));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        OnlinePaymentTxt = new javax.swing.JLabel();
        PaymentStatementTxt = new javax.swing.JLabel();
        ProvideDetailsTxt = new javax.swing.JLabel();
        OrderIDTxt = new javax.swing.JLabel();
        MobileNoTxt = new javax.swing.JLabel();
        PaymentTypeTxt = new javax.swing.JLabel();
        OrderIDField = new javax.swing.JTextField();
        MobileNoField = new javax.swing.JTextField();
        PaymentOptionComboBox = new javax.swing.JComboBox<>();
        ConfirmPaymentButton = new javax.swing.JButton();
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

        OnlinePaymentTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        OnlinePaymentTxt.setForeground(new java.awt.Color(204, 204, 204));
        OnlinePaymentTxt.setText("Online Payment ");
        getContentPane().add(OnlinePaymentTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        PaymentStatementTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        PaymentStatementTxt.setForeground(new java.awt.Color(204, 204, 204));
        PaymentStatementTxt.setText("As Cake Bliss only accept online payment");
        getContentPane().add(PaymentStatementTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        ProvideDetailsTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        ProvideDetailsTxt.setForeground(new java.awt.Color(204, 204, 204));
        ProvideDetailsTxt.setText("So, please provide the following details");
        getContentPane().add(ProvideDetailsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        OrderIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        OrderIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderIDTxt.setText("Enter your Order ID");
        getContentPane().add(OrderIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        MobileNoTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        MobileNoTxt.setForeground(new java.awt.Color(204, 204, 204));
        MobileNoTxt.setText("Enter your Mobile No");
        getContentPane().add(MobileNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        PaymentTypeTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        PaymentTypeTxt.setForeground(new java.awt.Color(204, 204, 204));
        PaymentTypeTxt.setText("Choose Payment type");
        getContentPane().add(PaymentTypeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));
        getContentPane().add(OrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 190, -1));
        getContentPane().add(MobileNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 190, -1));

        PaymentOptionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(PaymentOptionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 190, -1));

        ConfirmPaymentButton.setBackground(new java.awt.Color(102, 51, 0));
        ConfirmPaymentButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        ConfirmPaymentButton.setForeground(new java.awt.Color(204, 204, 204));
        ConfirmPaymentButton.setText("Confirm Payment");
        ConfirmPaymentButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        ConfirmPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPaymentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmPaymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 200, 50));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new CustomerModulesPage(connection, customer_id).setVisible(true); // Pass connection and customerId
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ConfirmPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPaymentButtonActionPerformed

    String orderId = OrderIDField.getText().trim();
    String mobileNo = MobileNoField.getText().trim();
    String paymentType = (String) PaymentOptionComboBox.getSelectedItem();

    // Validate input fields
    if (orderId.isEmpty() || mobileNo.isEmpty() || "Select".equals(paymentType)) {
        JOptionPane.showMessageDialog(this, "Fields cannot be empty!");
        return;
    }

    try {
        // Validate order_id is numeric
        int orderIdInt = Integer.parseInt(orderId);
        if (orderIdInt <= 0) {
            JOptionPane.showMessageDialog(this, "Order ID must be a positive number.");
            return;
        }

        // Insert payment data into the customerpayment table
        PreparedStatement insert = connection.prepareStatement(
                "INSERT INTO customerpayment (order_id, mobile_no, payment_type, payment_status) VALUES (?, ?, ?, ?)");
        insert.setInt(1, orderIdInt);
        insert.setString(2, mobileNo);
        insert.setString(3, paymentType);
        insert.setString(4, "Confirmed"); // Set payment_status to 'Confirmed' on successful payment

        int result = insert.executeUpdate();

        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Thank you for the payment. We are proceeding with your order.");
            // Clear fields
            OrderIDField.setText("");
            MobileNoField.setText("");
            PaymentOptionComboBox.setSelectedIndex(0);

            // Navigate to CustomerModulesPage
            new CustomerModulesPage(connection, orderIdInt).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Payment failed. Please try again.");
        }
        insert.close();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Order ID format. Please enter a numeric value.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_ConfirmPaymentButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                    new PaymentOption(con, 1).setVisible(true); // Pass the connection and customer ID.
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton ConfirmPaymentButton;
    private javax.swing.JTextField MobileNoField;
    private javax.swing.JLabel MobileNoTxt;
    private javax.swing.JLabel OnlinePaymentTxt;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JLabel OrderIDTxt;
    private javax.swing.JComboBox<String> PaymentOptionComboBox;
    private javax.swing.JLabel PaymentStatementTxt;
    private javax.swing.JLabel PaymentTypeTxt;
    private javax.swing.JLabel ProvideDetailsTxt;
    // End of variables declaration//GEN-END:variables
}
