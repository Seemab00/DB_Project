package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class TrackOrderPage extends javax.swing.JFrame {

    private Connection connection;

    public TrackOrderPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public TrackOrderPage() {
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
        TrackOrderTxt = new javax.swing.JLabel();
        TrackOrderDscrpTxt = new javax.swing.JLabel();
        RecentlyAddedOrderbutton = new javax.swing.JButton();
        AllOrdersbutton = new javax.swing.JButton();
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

        TrackOrderTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        TrackOrderTxt.setForeground(new java.awt.Color(204, 204, 204));
        TrackOrderTxt.setText("Track Order");
        getContentPane().add(TrackOrderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        TrackOrderDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        TrackOrderDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        TrackOrderDscrpTxt.setText("For tracking order, choose one option");
        getContentPane().add(TrackOrderDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        RecentlyAddedOrderbutton.setBackground(new java.awt.Color(102, 51, 0));
        RecentlyAddedOrderbutton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        RecentlyAddedOrderbutton.setForeground(new java.awt.Color(204, 204, 204));
        RecentlyAddedOrderbutton.setText("Recently Added Order");
        RecentlyAddedOrderbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        RecentlyAddedOrderbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecentlyAddedOrderbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(RecentlyAddedOrderbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 280, 50));

        AllOrdersbutton.setBackground(new java.awt.Color(102, 51, 0));
        AllOrdersbutton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AllOrdersbutton.setForeground(new java.awt.Color(204, 204, 204));
        AllOrdersbutton.setText("All Orders");
        AllOrdersbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AllOrdersbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllOrdersbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(AllOrdersbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 180, 50));

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

    private void RecentlyAddedOrderbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecentlyAddedOrderbuttonActionPerformed
        try {
    // SQL query to find the most recently added order from adminorder table
    String sql = "SELECT customer_id, customer_name, order_status \n" +
                "FROM adminorder \n" +
                "ORDER BY order_id DESC \n" +
                "LIMIT 1;";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ResultSet resultSet = preparedStatement.executeQuery();

    // Check if there is a result
    if (resultSet.next()) {
        int customerId = resultSet.getInt("customer_id");
        String customerName = resultSet.getString("customer_name");
        String orderStatus = resultSet.getString("order_status");

        // Display the order details using JTextArea
        JTextArea textArea = new JTextArea(10, 30);
        textArea.append("Recently Added Order:\n");
        textArea.append("Customer ID: " + customerId + "\n");
        textArea.append("Customer Name: " + customerName + "\n");
        textArea.append("Order Status: " + orderStatus + "\n");
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(this, scrollPane, "Recently Added Order", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "No orders found.", "No Orders", JOptionPane.INFORMATION_MESSAGE);
    }
    // Close the resources
    resultSet.close();
    preparedStatement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_RecentlyAddedOrderbuttonActionPerformed

    private void AllOrdersbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllOrdersbuttonActionPerformed
        try {
    // SQL query to select all orders from adminorder table
    String sql = "SELECT order_id, customer_id, customer_name, order_status FROM adminorder";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ResultSet resultSet = preparedStatement.executeQuery();

    // Build a string to display all orders
    StringBuilder message = new StringBuilder("All Orders:\n");
    while (resultSet.next()) {
        int orderId = resultSet.getInt("order_id");
        int customerId = resultSet.getInt("customer_id");
        String customerName = resultSet.getString("customer_name");
        String orderStatus = resultSet.getString("order_status");

        message.append("Order ID: ").append(orderId).append("\n");
        message.append("Customer ID: ").append(customerId).append("\n");
        message.append("Customer Name: ").append(customerName).append("\n");
        message.append("Order Status: ").append(orderStatus).append("\n\n");
    }

    // Check if any orders were found
    if (message.toString().equals("All Orders:\n")) {
        JOptionPane.showMessageDialog(this, "No orders found.", "No Orders", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Use JTextArea to display the orders
        JTextArea textArea = new JTextArea(message.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(400, 300)); // Set the size of the JScrollPane
        JOptionPane.showMessageDialog(this, scrollPane, "All Orders", JOptionPane.INFORMATION_MESSAGE);
    }

    // Close the resources
    resultSet.close();
    preparedStatement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_AllOrdersbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new TrackOrderPage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllOrdersbutton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton RecentlyAddedOrderbutton;
    private javax.swing.JLabel TrackOrderDscrpTxt;
    private javax.swing.JLabel TrackOrderTxt;
    // End of variables declaration//GEN-END:variables
}
