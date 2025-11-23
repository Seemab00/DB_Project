package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DeleteOrderPage extends javax.swing.JFrame {

    private Connection connection;

    public DeleteOrderPage(Connection connection) {
        this.connection = connection;
        initComponents();
        setLocationRelativeTo(null); // Center the form
    }

    public DeleteOrderPage() {
        this(initializeDatabaseConnection());
    }

    private static Connection initializeDatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Could not connect to the database. The application will now exit.", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        DeleteOrderTxt = new javax.swing.JLabel();
        DeleteOrderDscrpTxt = new javax.swing.JLabel();
        OrderIDTxt = new javax.swing.JLabel();
        OrderIDField = new javax.swing.JTextField();
        DeleteOrderButton = new javax.swing.JButton();
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        DeleteOrderTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        DeleteOrderTxt.setForeground(new java.awt.Color(204, 204, 204));
        DeleteOrderTxt.setText("Delete Order");
        getContentPane().add(DeleteOrderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        DeleteOrderDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        DeleteOrderDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        DeleteOrderDscrpTxt.setText("For deleting an order, provide the following details");
        getContentPane().add(DeleteOrderDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        OrderIDTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        OrderIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderIDTxt.setText("Order ID");
        getContentPane().add(OrderIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));
        getContentPane().add(OrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 190, 30));

        DeleteOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        DeleteOrderButton.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        DeleteOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        DeleteOrderButton.setText("Delete Order");
        DeleteOrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        DeleteOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 170, 50));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        OrderManagementPage orderManagementPage = new OrderManagementPage (connection);
        orderManagementPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOrderButtonActionPerformed

    String orderIdStr = OrderIDField.getText().trim();
    if (orderIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an Order ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int orderId = Integer.parseInt(orderIdStr);

        // Step 1: Delete from customerdeliveryadress
        PreparedStatement ps1 = connection.prepareStatement("DELETE FROM customerdeliveryadress WHERE order_id = ?");
        ps1.setInt(1, orderId);
        ps1.executeUpdate();
        ps1.close();

        // Step 2: Delete from deliverypersonal
        PreparedStatement ps2 = connection.prepareStatement("DELETE FROM deliverypersonal WHERE order_id = ?");
        ps2.setInt(1, orderId);
        ps2.executeUpdate();
        ps2.close();

        // Step 3: Delete from customerorder
        PreparedStatement ps3 = connection.prepareStatement("DELETE FROM customerorder WHERE order_id = ?");
        ps3.setInt(1, orderId);
        ps3.executeUpdate();
        ps3.close();

        // Step 4: Delete from adminorder
        PreparedStatement ps4 = connection.prepareStatement("DELETE FROM adminorder WHERE order_id = ?");
        ps4.setInt(1, orderId);
        int rowsDeleted = ps4.executeUpdate();
        ps4.close();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Order deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            OrderIDField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No order found with ID " + orderId + ".", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Order ID. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_DeleteOrderButtonActionPerformed

    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(() -> new DeleteOrderPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton DeleteOrderButton;
    private javax.swing.JLabel DeleteOrderDscrpTxt;
    private javax.swing.JLabel DeleteOrderTxt;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JLabel OrderIDTxt;
    // End of variables declaration//GEN-END:variables
}
