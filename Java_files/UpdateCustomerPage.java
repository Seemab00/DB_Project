package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateCustomerPage extends javax.swing.JFrame {

    private Connection connection;

    public UpdateCustomerPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public UpdateCustomerPage() {
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
        UpdateCustomerTxt = new javax.swing.JLabel();
        UpdateCustomerDscrpTxt = new javax.swing.JLabel();
        IDTxt = new javax.swing.JLabel();
        NameTxt = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JLabel();
        MobileNoTxt = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        UsernameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        MobileNoField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();
        UpdateCustomerButton = new javax.swing.JButton();
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        UpdateCustomerTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        UpdateCustomerTxt.setForeground(new java.awt.Color(204, 204, 204));
        UpdateCustomerTxt.setText("Update Customer");
        getContentPane().add(UpdateCustomerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        UpdateCustomerDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        UpdateCustomerDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        UpdateCustomerDscrpTxt.setText("For updating customer's information, provide the following details");
        getContentPane().add(UpdateCustomerDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        IDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        IDTxt.setForeground(new java.awt.Color(204, 204, 204));
        IDTxt.setText("Customer ID");
        getContentPane().add(IDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        NameTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        NameTxt.setForeground(new java.awt.Color(204, 204, 204));
        NameTxt.setText("Name");
        getContentPane().add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        UsernameTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        UsernameTxt.setForeground(new java.awt.Color(204, 204, 204));
        UsernameTxt.setText("Username");
        getContentPane().add(UsernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        EmailTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        EmailTxt.setForeground(new java.awt.Color(204, 204, 204));
        EmailTxt.setText("Email");
        getContentPane().add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        MobileNoTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        MobileNoTxt.setForeground(new java.awt.Color(204, 204, 204));
        MobileNoTxt.setText("Mobile No");
        getContentPane().add(MobileNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        PasswordTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(204, 204, 204));
        PasswordTxt.setText("Password");
        getContentPane().add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));
        getContentPane().add(IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 230, -1));
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 230, -1));
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 230, -1));
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 230, -1));
        getContentPane().add(MobileNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 230, -1));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 230, -1));

        UpdateCustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        UpdateCustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        UpdateCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        UpdateCustomerButton.setText("Update Customer");
        UpdateCustomerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        UpdateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 170, 50));

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

    private void UpdateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustomerButtonActionPerformed

    String customerIdStr = IDField.getText().trim();
    String name = NameField.getText().trim();
    String username = UsernameField.getText().trim();
    String email = EmailField.getText().trim();
    String mobileNo = MobileNoField.getText().trim();
    String password = PasswordField.getText().trim();

    if (customerIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Customer ID is required.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int customerId = Integer.parseInt(customerIdStr);

        // Build query dynamically
        StringBuilder sql = new StringBuilder("UPDATE customer SET ");
        boolean first = true;

        if (!username.isEmpty()) {
            sql.append("username = ?");
            first = false;
        }
        if (!password.isEmpty()) {
            if (!first) sql.append(", ");
            sql.append("password = ?");
            first = false;
        }
        if (!name.isEmpty()) {
            if (!first) sql.append(", ");
            sql.append("name = ?");
            first = false;
        }
        if (!email.isEmpty()) {
            if (!first) sql.append(", ");
            sql.append("email = ?");
            first = false;
        }
        if (!mobileNo.isEmpty()) {
            if (!first) sql.append(", ");
            sql.append("mobile_no = ?");
        }

        sql.append(" WHERE customer_id = ?");

        PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());

        // Set parameters dynamically
        int index = 1;
        if (!username.isEmpty()) preparedStatement.setString(index++, username);
        if (!password.isEmpty()) preparedStatement.setString(index++, password); // Hash in real apps!
        if (!name.isEmpty()) preparedStatement.setString(index++, name);
        if (!email.isEmpty()) preparedStatement.setString(index++, email);
        if (!mobileNo.isEmpty()) preparedStatement.setString(index++, mobileNo);
        preparedStatement.setInt(index, customerId);

        int rowsUpdated = preparedStatement.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Customer information updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No customer found with ID " + customerId + ".", "Error", JOptionPane.ERROR_MESSAGE);
        }

        preparedStatement.close();

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Customer ID. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        String errorMsg = ex.getMessage();
        if (errorMsg.contains("Duplicate entry") && errorMsg.contains("username")) {
            JOptionPane.showMessageDialog(this, "Username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (errorMsg.contains("Duplicate entry") && errorMsg.contains("email")) {
            JOptionPane.showMessageDialog(this, "Email already exists.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Database error: " + errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_UpdateCustomerButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new UpdateCustomerPage(conn).setVisible(true);
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
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDTxt;
    private javax.swing.JTextField MobileNoField;
    private javax.swing.JLabel MobileNoTxt;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameTxt;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JLabel PasswordTxt;
    private javax.swing.JButton UpdateCustomerButton;
    private javax.swing.JLabel UpdateCustomerDscrpTxt;
    private javax.swing.JLabel UpdateCustomerTxt;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameTxt;
    // End of variables declaration//GEN-END:variables
}
