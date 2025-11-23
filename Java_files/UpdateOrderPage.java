package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateOrderPage extends javax.swing.JFrame {

    private Connection connection;

    public UpdateOrderPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public UpdateOrderPage() {
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
        UpdateOrderTxt = new javax.swing.JLabel();
        UpdateOrderDscrpTxt = new javax.swing.JLabel();
        PreviousOrderIDTxt = new javax.swing.JLabel();
        NewCustomerIDTxt = new javax.swing.JLabel();
        CustomerNameTxt = new javax.swing.JLabel();
        NewOrderStatusTxt = new javax.swing.JLabel();
        PreviousOrderIDField = new javax.swing.JTextField();
        NewCustomerIDField = new javax.swing.JTextField();
        CustomerNameField = new javax.swing.JTextField();
        NewOrderStatusField = new javax.swing.JTextField();
        UpdateOrderButton = new javax.swing.JButton();
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

        UpdateOrderTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        UpdateOrderTxt.setForeground(new java.awt.Color(204, 204, 204));
        UpdateOrderTxt.setText("Update Order");
        getContentPane().add(UpdateOrderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        UpdateOrderDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        UpdateOrderDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        UpdateOrderDscrpTxt.setText("For updating an order, provide the following deatils");
        getContentPane().add(UpdateOrderDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        PreviousOrderIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        PreviousOrderIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        PreviousOrderIDTxt.setText("Previous Order ID");
        getContentPane().add(PreviousOrderIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        NewCustomerIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        NewCustomerIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        NewCustomerIDTxt.setText("New Customer ID");
        getContentPane().add(NewCustomerIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        CustomerNameTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        CustomerNameTxt.setForeground(new java.awt.Color(204, 204, 204));
        CustomerNameTxt.setText("Customer Name");
        getContentPane().add(CustomerNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        NewOrderStatusTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        NewOrderStatusTxt.setForeground(new java.awt.Color(204, 204, 204));
        NewOrderStatusTxt.setText("New Order Status");
        getContentPane().add(NewOrderStatusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));
        getContentPane().add(PreviousOrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 262, 230, 30));
        getContentPane().add(NewCustomerIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 230, 30));
        getContentPane().add(CustomerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 362, 230, 30));
        getContentPane().add(NewOrderStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 230, 30));

        UpdateOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        UpdateOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        UpdateOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        UpdateOrderButton.setText("Update Order");
        UpdateOrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        UpdateOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 510, 180, 50));

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

    private void UpdateOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateOrderButtonActionPerformed
        String orderIdStr = PreviousOrderIDField.getText().trim();
        String customerIdStr = NewCustomerIDField.getText().trim();
        String customerName = CustomerNameField.getText().trim();
        String orderStatus = NewOrderStatusField.getText().trim();

    if (orderIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the Order ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
    int orderId = Integer.parseInt(orderIdStr);

    // Build SQL dynamically
    StringBuilder sql = new StringBuilder("UPDATE adminorder SET ");
    java.util.List<String> fields = new java.util.ArrayList<>();
    java.util.List<Object> values = new java.util.ArrayList<>();

    if (!customerIdStr.isEmpty()) {
        try {
            values.add(Integer.parseInt(customerIdStr));
            fields.add("customer_id = ?");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Customer ID. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    if (!customerName.isEmpty()) {
        fields.add("customer_name = ?");
        values.add(customerName);
    }
    if (!orderStatus.isEmpty()) {
        fields.add("order_status = ?");
        values.add(orderStatus);
    }

    if (fields.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter at least one field to update.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    sql.append(String.join(", ", fields));
    sql.append(" WHERE order_id = ?");
    values.add(orderId);

    PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());

    for (int i = 0; i < values.size(); i++) {
        Object val = values.get(i);
        if (val instanceof String) {
            preparedStatement.setString(i + 1, (String) val);
        } else if (val instanceof Integer) {
            preparedStatement.setInt(i + 1, (Integer) val);
        }
    }

    int rowsUpdated = preparedStatement.executeUpdate();
    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(this, "Order updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        PreviousOrderIDField.setText("");
        NewCustomerIDField.setText("");
        CustomerNameField.setText("");
        NewOrderStatusField.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "No order found with ID " + orderId + ".", "Error", JOptionPane.ERROR_MESSAGE);
    }

    preparedStatement.close();
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Order ID. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        String errorMsg = ex.getMessage();
    if (errorMsg.contains("foreign key constraint fails")) {
        JOptionPane.showMessageDialog(this, "Customer ID does not exist.", "Database Error", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Database error: " + errorMsg, "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    ex.printStackTrace();
    }
    }//GEN-LAST:event_UpdateOrderButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new UpdateOrderPage(conn).setVisible(true);
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
    private javax.swing.JTextField CustomerNameField;
    private javax.swing.JLabel CustomerNameTxt;
    private javax.swing.JTextField NewCustomerIDField;
    private javax.swing.JLabel NewCustomerIDTxt;
    private javax.swing.JTextField NewOrderStatusField;
    private javax.swing.JLabel NewOrderStatusTxt;
    private javax.swing.JTextField PreviousOrderIDField;
    private javax.swing.JLabel PreviousOrderIDTxt;
    private javax.swing.JButton UpdateOrderButton;
    private javax.swing.JLabel UpdateOrderDscrpTxt;
    private javax.swing.JLabel UpdateOrderTxt;
    // End of variables declaration//GEN-END:variables
}
