package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdatePersonalPage extends javax.swing.JFrame {

    private Connection connection;

    public UpdatePersonalPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public UpdatePersonalPage() {
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
        UpdatePersonalTxt = new javax.swing.JLabel();
        UpdatePersonalDscrpTxt = new javax.swing.JLabel();
        PreviousPersonalIDTxt = new javax.swing.JLabel();
        NameTxt = new javax.swing.JLabel();
        OrderIDTxt = new javax.swing.JLabel();
        MobileNoTxt = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JLabel();
        StatusTxt = new javax.swing.JLabel();
        PreviousPersonalIDField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        OrderIDField = new javax.swing.JTextField();
        MobileNoField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        StatusField = new javax.swing.JTextField();
        UpdatePersonalButton = new javax.swing.JButton();
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

        UpdatePersonalTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        UpdatePersonalTxt.setForeground(new java.awt.Color(204, 204, 204));
        UpdatePersonalTxt.setText("Update Personal");
        getContentPane().add(UpdatePersonalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        UpdatePersonalDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        UpdatePersonalDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        UpdatePersonalDscrpTxt.setText("For updating the person's detail, provide the following details");
        getContentPane().add(UpdatePersonalDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        PreviousPersonalIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        PreviousPersonalIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        PreviousPersonalIDTxt.setText("Previous Personal ID");
        getContentPane().add(PreviousPersonalIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        NameTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        NameTxt.setForeground(new java.awt.Color(204, 204, 204));
        NameTxt.setText("Name");
        getContentPane().add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        OrderIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        OrderIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderIDTxt.setText("Order ID");
        getContentPane().add(OrderIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        MobileNoTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        MobileNoTxt.setForeground(new java.awt.Color(204, 204, 204));
        MobileNoTxt.setText("Mobile No");
        getContentPane().add(MobileNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        EmailTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        EmailTxt.setForeground(new java.awt.Color(204, 204, 204));
        EmailTxt.setText("Email");
        getContentPane().add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        StatusTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        StatusTxt.setForeground(new java.awt.Color(204, 204, 204));
        StatusTxt.setText("Status");
        getContentPane().add(StatusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));
        getContentPane().add(PreviousPersonalIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 240, -1));
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 240, -1));
        getContentPane().add(OrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 240, -1));
        getContentPane().add(MobileNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 240, -1));
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 240, -1));
        getContentPane().add(StatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 240, -1));

        UpdatePersonalButton.setBackground(new java.awt.Color(102, 51, 0));
        UpdatePersonalButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        UpdatePersonalButton.setForeground(new java.awt.Color(204, 204, 204));
        UpdatePersonalButton.setText("Update Personal");
        UpdatePersonalButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        UpdatePersonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePersonalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdatePersonalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 530, 220, 40));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        DeliveryControlPage deliveryControlPage = new DeliveryControlPage (connection);
        deliveryControlPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void UpdatePersonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePersonalButtonActionPerformed
        try {
    String previousPersonalIdStr = PreviousPersonalIDField.getText().trim();
    String personalName = NameField.getText().trim();
    String orderIdStr = OrderIDField.getText().trim();
    String mobileNo = MobileNoField.getText().trim();
    String email = EmailField.getText().trim();
    String personalStatus = StatusField.getText().trim();

    if (previousPersonalIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the Personal ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int personalId;
    try {
        personalId = Integer.parseInt(previousPersonalIdStr);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Personal ID. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Build the SQL dynamically
    StringBuilder sql = new StringBuilder("UPDATE deliverypersonal SET ");
    java.util.List<String> fields = new java.util.ArrayList<>();
    java.util.List<Object> values = new java.util.ArrayList<>();

    if (!personalName.isEmpty()) {
        fields.add("personal_name = ?");
        values.add(personalName);
    }
    if (!orderIdStr.isEmpty()) {
        try {
            values.add(Integer.parseInt(orderIdStr));
            fields.add("order_id = ?");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Order ID. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    if (!mobileNo.isEmpty()) {
        fields.add("mobile_no = ?");
        values.add(mobileNo);
    }
    if (!email.isEmpty()) {
        fields.add("email = ?");
        values.add(email);
    }
    if (!personalStatus.isEmpty()) {
        fields.add("personal_status = ?");
        values.add(personalStatus);
    }

    if (fields.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter at least one field to update.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    sql.append(String.join(", ", fields));
    sql.append(" WHERE personal_id = ?");
    values.add(personalId); // Add the ID at the end for WHERE clause

    PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());

    // Set parameters
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
        JOptionPane.showMessageDialog(this, "Delivery person updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        PreviousPersonalIDField.setText("");
        NameField.setText("");
        OrderIDField.setText("");
        MobileNoField.setText("");
        EmailField.setText("");
        StatusField.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to update. Check if the Personal ID exists.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    preparedStatement.close();
    } catch (SQLException ex) {
        String errorMsg = ex.getMessage();
    if (errorMsg.contains("foreign key constraint fails")) {
        JOptionPane.showMessageDialog(this, "Invalid Order ID: Order does not exist in adminorder table.", "Database Error", JOptionPane.ERROR_MESSAGE);
    } else if (errorMsg.contains("Duplicate entry") && errorMsg.contains("email")) {
        JOptionPane.showMessageDialog(this, "Email already exists. Please use a unique email.", "Database Error", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Database error: " + errorMsg, "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    ex.printStackTrace();
    }
    }//GEN-LAST:event_UpdatePersonalButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new UpdatePersonalPage(conn).setVisible(true);
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
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailTxt;
    private javax.swing.JTextField MobileNoField;
    private javax.swing.JLabel MobileNoTxt;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameTxt;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JLabel OrderIDTxt;
    private javax.swing.JTextField PreviousPersonalIDField;
    private javax.swing.JLabel PreviousPersonalIDTxt;
    private javax.swing.JTextField StatusField;
    private javax.swing.JLabel StatusTxt;
    private javax.swing.JButton UpdatePersonalButton;
    private javax.swing.JLabel UpdatePersonalDscrpTxt;
    private javax.swing.JLabel UpdatePersonalTxt;
    // End of variables declaration//GEN-END:variables
}
