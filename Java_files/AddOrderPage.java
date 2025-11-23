package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddOrderPage extends javax.swing.JFrame {

    private Connection connection;

    public AddOrderPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public AddOrderPage() {
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
        AddOrderTxt = new javax.swing.JLabel();
        AddOrderDscrpTxt = new javax.swing.JLabel();
        CustomerIDTxt = new javax.swing.JLabel();
        CustomerNameTxt = new javax.swing.JLabel();
        OrderStatusTxt = new javax.swing.JLabel();
        CutomerIDField = new javax.swing.JTextField();
        CustomerNameField = new javax.swing.JTextField();
        OrderStatusField = new javax.swing.JTextField();
        AddOrderButton = new javax.swing.JButton();
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

        AddOrderTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        AddOrderTxt.setForeground(new java.awt.Color(204, 204, 204));
        AddOrderTxt.setText("Add Order");
        getContentPane().add(AddOrderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        AddOrderDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        AddOrderDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        AddOrderDscrpTxt.setText("For adding new order, provide the following deatils");
        getContentPane().add(AddOrderDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        CustomerIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        CustomerIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        CustomerIDTxt.setText("Customer ID");
        getContentPane().add(CustomerIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        CustomerNameTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        CustomerNameTxt.setForeground(new java.awt.Color(204, 204, 204));
        CustomerNameTxt.setText("Cutomer Name");
        getContentPane().add(CustomerNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        OrderStatusTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        OrderStatusTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderStatusTxt.setText("Order Status");
        getContentPane().add(OrderStatusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));
        getContentPane().add(CutomerIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 230, 30));
        getContentPane().add(CustomerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 230, 30));
        getContentPane().add(OrderStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 230, 30));

        AddOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        AddOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AddOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        AddOrderButton.setText("Add Order");
        AddOrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AddOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 170, 50));

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

    private void AddOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrderButtonActionPerformed

    String customerIdStr = CutomerIDField.getText().trim();
    String customerName = CustomerNameField.getText().trim();
    String orderStatus = OrderStatusField.getText().trim();

    // Validate fields
    if (customerIdStr.isEmpty() || customerName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in Customer ID and Customer Name.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int customerId = Integer.parseInt(customerIdStr);

        String sql = "INSERT INTO adminorder (customer_id, customer_name, order_status) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, customerId);
        preparedStatement.setString(2, customerName);
        preparedStatement.setString(3, orderStatus.isEmpty() ? "In Progress" : orderStatus);

        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Order added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            CutomerIDField.setText("");
            CustomerNameField.setText("");
            OrderStatusField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add order.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        preparedStatement.close();
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Customer ID. Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        String errorMsg = ex.getMessage();
        if (errorMsg.contains("foreign key constraint fails")) {
            JOptionPane.showMessageDialog(this, "Customer ID does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Database error: " + errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_AddOrderButtonActionPerformed

    public static void main(String args[]) {

         java.awt.EventQueue.invokeLater(() -> {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                new AddOrderPage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrderButton;
    private javax.swing.JLabel AddOrderDscrpTxt;
    private javax.swing.JLabel AddOrderTxt;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel CustomerIDTxt;
    private javax.swing.JTextField CustomerNameField;
    private javax.swing.JLabel CustomerNameTxt;
    private javax.swing.JTextField CutomerIDField;
    private javax.swing.JTextField OrderStatusField;
    private javax.swing.JLabel OrderStatusTxt;
    // End of variables declaration//GEN-END:variables
}
