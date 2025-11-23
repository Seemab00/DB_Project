package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DeleteCustomerPage extends javax.swing.JFrame {

    private Connection connection;

    public DeleteCustomerPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public DeleteCustomerPage() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23"); // Replace with your password
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: Could not connect to the database. The application will now exit.", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        DeleteCutomerTxt = new javax.swing.JLabel();
        DeleteCutomerDscrpTxt = new javax.swing.JLabel();
        IDTxt = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        DeleteCustomerButton = new javax.swing.JButton();
        BackgroundPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(102, 51, 0));
        BackButton.setFont(new java.awt.Font("Vivaldi", 1, 22)); // NOI18N
        BackButton.setForeground(new java.awt.Color(204, 204, 204));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arrows.png"))); // NOI18N
        BackButton.setText("Back ");
        BackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        DeleteCutomerTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        DeleteCutomerTxt.setForeground(new java.awt.Color(204, 204, 204));
        DeleteCutomerTxt.setText("Delete Customer");
        getContentPane().add(DeleteCutomerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        DeleteCutomerDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        DeleteCutomerDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        DeleteCutomerDscrpTxt.setText("For deleting a customer, Please provide the following details");
        getContentPane().add(DeleteCutomerDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        IDTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        IDTxt.setForeground(new java.awt.Color(204, 204, 204));
        IDTxt.setText("Customer ID");
        getContentPane().add(IDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));
        getContentPane().add(IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 220, 30));

        DeleteCustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        DeleteCustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        DeleteCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        DeleteCustomerButton.setText("Delete Customer");
        DeleteCustomerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        DeleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 190, 60));

        BackgroundPic.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        CustomerAccessPage customerAccessPage = new CustomerAccessPage(connection);
        customerAccessPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerButtonActionPerformed


    String customerIdStr = IDField.getText().trim();
    if (customerIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Customer ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this customer?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    try {
        int customerId = Integer.parseInt(customerIdStr);

        connection.setAutoCommit(false); // Start transaction

        // Step 1: Delete from deliverypersonal
        PreparedStatement ps0 = connection.prepareStatement(
            "DELETE FROM deliverypersonal WHERE order_id IN (SELECT order_id FROM adminorder WHERE customer_id = ?)");
        ps0.setInt(1, customerId);
        ps0.executeUpdate();
        ps0.close();

        // Step 2: Delete from adminorder
        PreparedStatement ps00 = connection.prepareStatement("DELETE FROM adminorder WHERE customer_id = ?");
        ps00.setInt(1, customerId);
        ps00.executeUpdate();
        ps00.close();

        // Step 3: Delete from customerdeliveryadress
        PreparedStatement ps1 = connection.prepareStatement("DELETE FROM customerdeliveryadress WHERE customer_id = ?");
        ps1.setInt(1, customerId);
        ps1.executeUpdate();
        ps1.close();

        // Step 4: Delete from customerpayment
        PreparedStatement ps2 = connection.prepareStatement("DELETE FROM customerpayment WHERE customer_id = ?");
        ps2.setInt(1, customerId);
        ps2.executeUpdate();
        ps2.close();

        // Step 5: Delete from customerorder
        PreparedStatement ps3 = connection.prepareStatement("DELETE FROM customerorder WHERE customer_id = ?");
        ps3.setInt(1, customerId);
        ps3.executeUpdate();
        ps3.close();

        // Step 6: Delete from customer
        PreparedStatement ps4 = connection.prepareStatement("DELETE FROM customer WHERE customer_id = ?");
        ps4.setInt(1, customerId);
        int rowsDeleted = ps4.executeUpdate();
        ps4.close();

        if (rowsDeleted > 0) {
            connection.commit(); // Commit if everything succeeded
            JOptionPane.showMessageDialog(this, "Customer deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            IDField.setText("");
        } else {
            connection.rollback(); // Rollback if no customer found
            JOptionPane.showMessageDialog(this, "No customer found with ID " + customerId + ".", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Customer ID. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        try {
            connection.rollback(); // Rollback if error occurs
        } catch (SQLException rollbackEx) {
            rollbackEx.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            connection.setAutoCommit(true); // Restore default
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_DeleteCustomerButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new DeleteCustomerPage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton DeleteCustomerButton;
    private javax.swing.JLabel DeleteCutomerDscrpTxt;
    private javax.swing.JLabel DeleteCutomerTxt;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDTxt;
    // End of variables declaration//GEN-END:variables
}
