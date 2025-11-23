package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame 
{
    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cakebliss";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "(simaabmalik)@23"; 

    private Connection connection;  // Class-level connection

    public LoginPage(Connection connection) {
        this.connection = connection;
        initComponents();
    }

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        LoginTxt = new javax.swing.JLabel();
        CredentialsTxt = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JLabel();
        UsernameFeild = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
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

        LoginTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        LoginTxt.setForeground(new java.awt.Color(204, 204, 204));
        LoginTxt.setText("Login");
        getContentPane().add(LoginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        CredentialsTxt.setFont(new java.awt.Font("Gabriola", 3, 36)); // NOI18N
        CredentialsTxt.setForeground(new java.awt.Color(204, 204, 204));
        CredentialsTxt.setText("Please provide your credentials.");
        getContentPane().add(CredentialsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        UsernameTxt.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        UsernameTxt.setForeground(new java.awt.Color(204, 204, 204));
        UsernameTxt.setText("Username");
        getContentPane().add(UsernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, 30));

        PasswordTxt.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(204, 204, 204));
        PasswordTxt.setText("Password");
        getContentPane().add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));
        getContentPane().add(UsernameFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 190, 30));

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 372, 190, 30));

        LoginButton.setBackground(new java.awt.Color(102, 51, 0));
        LoginButton.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(204, 204, 204));
        LoginButton.setText("Login");
        LoginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 140, 40));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome.jpg"))); // NOI18N
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String username = UsernameFeild.getText().trim();
        String password = new String(PasswordField.getPassword()).trim();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both username and password.");
        return;
    }

    try {
    // Check for admin login first (hardcoded credentials)
    if (username.equalsIgnoreCase("admin") && password.equals("admin123")) {
        JOptionPane.showMessageDialog(this, "Admin Login successful!");
        AdminModulesPage adminModulesPage = new AdminModulesPage(connection);
        adminModulesPage.setVisible(true);
        this.dispose();
        return; // Stop further processing after admin login
    }

    String sql = "SELECT * FROM customer WHERE username = ? AND password = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, username);
    preparedStatement.setString(2, password);
    ResultSet resultSet = preparedStatement.executeQuery();

    if (resultSet.next()) {
        int customer_id = resultSet.getInt("customer_id");
        String role = resultSet.getString("role");

        JOptionPane.showMessageDialog(this, "Login successful!");

        if (role.equalsIgnoreCase("customer")) {
            CustomerModulesPage customerModulesPage = new CustomerModulesPage(connection, customer_id);
            customerModulesPage.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Unknown user role.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "User not found. Please sign up.");
    }

    resultSet.close();
    preparedStatement.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_LoginButtonActionPerformed

    
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        LoginButton.doClick();
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new AdminCustomerPage().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_BackButtonActionPerformed

    public static void main(String args[]) 
    {java.awt.EventQueue.invokeLater(() -> {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                new LoginPage(conn).setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel CredentialsTxt;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginTxt;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordTxt;
    private javax.swing.JTextField UsernameFeild;
    private javax.swing.JLabel UsernameTxt;
    // End of variables declaration//GEN-END:variables
}
