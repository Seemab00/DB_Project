package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddPersonalPage extends javax.swing.JFrame {

    private Connection connection;

    public AddPersonalPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public AddPersonalPage() {
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
        AddPersonalTxt = new javax.swing.JLabel();
        AddPersonalDscrpTxt = new javax.swing.JLabel();
        NameTxt = new javax.swing.JLabel();
        OrderIDTxt = new javax.swing.JLabel();
        MobileNoTxt = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JLabel();
        PersonalStatusTxt = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        OrderIDField = new javax.swing.JTextField();
        MobileNoField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        PersonalStatusField = new javax.swing.JTextField();
        AddPersonalButton = new javax.swing.JButton();
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

        AddPersonalTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        AddPersonalTxt.setForeground(new java.awt.Color(204, 204, 204));
        AddPersonalTxt.setText("Add Personal");
        getContentPane().add(AddPersonalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        AddPersonalDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        AddPersonalDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        AddPersonalDscrpTxt.setText("For adding a person, provide the following details");
        getContentPane().add(AddPersonalDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        NameTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        NameTxt.setForeground(new java.awt.Color(204, 204, 204));
        NameTxt.setText("Name");
        getContentPane().add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

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
        getContentPane().add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        PersonalStatusTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        PersonalStatusTxt.setForeground(new java.awt.Color(204, 204, 204));
        PersonalStatusTxt.setText("Personal Status");
        getContentPane().add(PersonalStatusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 240, -1));
        getContentPane().add(OrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 240, -1));
        getContentPane().add(MobileNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 240, -1));
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 240, -1));
        getContentPane().add(PersonalStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 240, -1));

        AddPersonalButton.setBackground(new java.awt.Color(102, 51, 0));
        AddPersonalButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AddPersonalButton.setForeground(new java.awt.Color(204, 204, 204));
        AddPersonalButton.setText("Add Personal");
        AddPersonalButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AddPersonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddPersonalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 190, 50));

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

    private void AddPersonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonalButtonActionPerformed
        try {
    // Get the data from the text fields
    String personalName = NameField.getText().trim();
    String orderIdStr = OrderIDField.getText().trim();
    String mobileNo = MobileNoField.getText().trim();
    String email = EmailField.getText().trim();
    String personalStatus = PersonalStatusField.getText().trim();

    // Validate the data
    if (personalName.isEmpty() || orderIdStr.isEmpty() || mobileNo.isEmpty() || email.isEmpty() || personalStatus.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop the process if any field is empty
    }

    // Validate order_id as an integer
    int orderId;
    try {
        orderId = Integer.parseInt(orderIdStr);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Order ID. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // SQL query to insert data into the deliverypersonal table
    String sql = "INSERT INTO deliverypersonal (personal_name, order_id, mobile_no, email, personal_status) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, personalName);
    preparedStatement.setInt(2, orderId);
    preparedStatement.setString(3, mobileNo);
    preparedStatement.setString(4, email);
    preparedStatement.setString(5, personalStatus);

    // Execute the query
    int rowsInserted = preparedStatement.executeUpdate();
    if (rowsInserted > 0) {
        JOptionPane.showMessageDialog(this, "Delivery person added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        // Clear the text fields after successful insertion
        NameField.setText("");
        OrderIDField.setText("");
        MobileNoField.setText("");
        EmailField.setText("");
        PersonalStatusField.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to add delivery person.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Close the prepared statement
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
    ex.printStackTrace(); // Print stack trace for debugging
    }
    }//GEN-LAST:event_AddPersonalButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new AddPersonalPage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPersonalButton;
    private javax.swing.JLabel AddPersonalDscrpTxt;
    private javax.swing.JLabel AddPersonalTxt;
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
    private javax.swing.JTextField PersonalStatusField;
    private javax.swing.JLabel PersonalStatusTxt;
    // End of variables declaration//GEN-END:variables
}
