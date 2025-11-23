package cakeordermanagementsystem;

import javax.swing.*;
import java.sql.*;

public class SignupPage extends javax.swing.JFrame {
    
    private Connection connection;
    
    public SignupPage(Connection connection) {
        initComponents();
        this.connection = connection;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        SignUpTxt = new javax.swing.JLabel();
        EnterDetailsTxt = new javax.swing.JLabel();
        NameTxt = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JLabel();
        MobileNoTxt = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        MobileNoField = new javax.swing.JTextField();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();
        LoginTxt = new javax.swing.JLabel();
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 50));

        SignUpTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        SignUpTxt.setForeground(new java.awt.Color(204, 204, 204));
        SignUpTxt.setText("Sign Up");
        getContentPane().add(SignUpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        EnterDetailsTxt.setFont(new java.awt.Font("Gabriola", 1, 32)); // NOI18N
        EnterDetailsTxt.setForeground(new java.awt.Color(204, 204, 204));
        EnterDetailsTxt.setText("Please Enter Your Details ");
        getContentPane().add(EnterDetailsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        NameTxt.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        NameTxt.setForeground(new java.awt.Color(204, 204, 204));
        NameTxt.setText("Name");
        getContentPane().add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        EmailTxt.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        EmailTxt.setForeground(new java.awt.Color(204, 204, 204));
        EmailTxt.setText("Email");
        getContentPane().add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        MobileNoTxt.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        MobileNoTxt.setForeground(new java.awt.Color(204, 204, 204));
        MobileNoTxt.setText("Mobile No.");
        getContentPane().add(MobileNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        UsernameTxt.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        UsernameTxt.setForeground(new java.awt.Color(204, 204, 204));
        UsernameTxt.setText("Username");
        getContentPane().add(UsernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        PasswordTxt.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(204, 204, 204));
        PasswordTxt.setText("Password");
        getContentPane().add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, 30));
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 170, 30));

        MobileNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNoFieldActionPerformed(evt);
            }
        });
        getContentPane().add(MobileNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 170, 30));
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 170, 30));

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 170, 30));

        SignUpButton.setBackground(new java.awt.Color(102, 51, 0));
        SignUpButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(204, 204, 204));
        SignUpButton.setText("Sign-up");
        SignUpButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 170, 40));

        LoginTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        LoginTxt.setForeground(new java.awt.Color(204, 204, 204));
        LoginTxt.setText("If you already have an account");
        getContentPane().add(LoginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

        LoginButton.setBackground(new java.awt.Color(102, 51, 0));
        LoginButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(204, 204, 204));
        LoginButton.setText("Login");
        LoginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 170, 40));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome.jpg"))); // NOI18N
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        String name = NameField.getText();
        String email = EmailField.getText();
        String mobile_no = MobileNoField.getText();
        String username = UsernameField.getText();
        String password = new String(PasswordField.getPassword());

    if (name.isEmpty() || email.isEmpty() || mobile_no.isEmpty() || username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields.");
        return;
    }

    try {
    // Check if username already exists
    String checkQuery = "SELECT * FROM customer WHERE username = ?";
    PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
    checkStmt.setString(1, username);
    ResultSet rs = checkStmt.executeQuery();

    if (rs.next()) {
        JOptionPane.showMessageDialog(this, "Username already exists.");
        rs.close();
        checkStmt.close();
        return;
    }
    rs.close();
    checkStmt.close();

    // Insert new customer with 'customer' role
    String insertQuery = "INSERT INTO customer (username, password, name, email, mobile_no, role) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
    insertStmt.setString(1, username);
    insertStmt.setString(2, password);
    insertStmt.setString(3, name);
    insertStmt.setString(4, email);
    insertStmt.setString(5, mobile_no);
    insertStmt.setString(6, "customer");  // fixed role value

    int rowsInserted = insertStmt.executeUpdate();
    if (rowsInserted > 0) {
        JOptionPane.showMessageDialog(this, "Signup successful! Please login.");
        new LoginPage(connection).setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Signup failed. Please try again.");
    }
    insertStmt.close();

    } catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    e.printStackTrace();
    }
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void MobileNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileNoFieldActionPerformed

    }//GEN-LAST:event_MobileNoFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new AdminCustomerPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        new LoginPage(connection).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
            new SignupPage(conn).setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage());
        }
    });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailTxt;
    private javax.swing.JLabel EnterDetailsTxt;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginTxt;
    private javax.swing.JTextField MobileNoField;
    private javax.swing.JLabel MobileNoTxt;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameTxt;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordTxt;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SignUpTxt;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameTxt;
    // End of variables declaration//GEN-END:variables
}
