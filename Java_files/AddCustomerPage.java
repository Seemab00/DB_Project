package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddCustomerPage extends javax.swing.JFrame {

    private Connection connection;

    // Constructor that accepts a database connection
    public AddCustomerPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    // Default constructor that establishes a database connection.
     public AddCustomerPage() {
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
        AddCustomerTxt = new javax.swing.JLabel();
        AddingCustomerDscrpTxt = new javax.swing.JLabel();
        FirstNametxt = new javax.swing.JLabel();
        Usernametxt = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JLabel();
        MobileNotxt = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        UsernameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        MobileNoField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();
        AddCustomerButton = new javax.swing.JButton();
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

        AddCustomerTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        AddCustomerTxt.setForeground(new java.awt.Color(204, 204, 204));
        AddCustomerTxt.setText("Add Customer ");
        getContentPane().add(AddCustomerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        AddingCustomerDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 28)); // NOI18N
        AddingCustomerDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        AddingCustomerDscrpTxt.setText("For adding a new customer, provide the following details");
        getContentPane().add(AddingCustomerDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        FirstNametxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        FirstNametxt.setForeground(new java.awt.Color(204, 204, 204));
        FirstNametxt.setText("Name");
        getContentPane().add(FirstNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        Usernametxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        Usernametxt.setForeground(new java.awt.Color(204, 204, 204));
        Usernametxt.setText("Username");
        getContentPane().add(Usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        Emailtxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        Emailtxt.setForeground(new java.awt.Color(204, 204, 204));
        Emailtxt.setText("Email");
        getContentPane().add(Emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        MobileNotxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        MobileNotxt.setForeground(new java.awt.Color(204, 204, 204));
        MobileNotxt.setText("Mobile No");
        getContentPane().add(MobileNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        PasswordTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(204, 204, 204));
        PasswordTxt.setText("Password");
        getContentPane().add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 230, -1));
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 230, -1));
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 230, -1));
        getContentPane().add(MobileNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 230, -1));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 230, -1));

        AddCustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        AddCustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AddCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        AddCustomerButton.setText("Add Customer");
        AddCustomerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AddCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 160, 50));

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

    private void AddCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerButtonActionPerformed

    // Get data from text fields
    String name = NameField.getText().trim();
    String username = UsernameField.getText().trim();
    String email = EmailField.getText().trim();
    String mobileNo = MobileNoField.getText().trim();
    String password = PasswordField.getText().trim();

    // Validate fields
    if (name.isEmpty() || username.isEmpty() || email.isEmpty() || mobileNo.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Insert data into customer table
        String sql = "INSERT INTO customer (username, password, name, email, mobile_no, role) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password); // TODO: Hash password in production
        preparedStatement.setString(3, name);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, mobileNo);
        preparedStatement.setString(6, "customer");

        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Customer added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Clear fields
            NameField.setText("");
            UsernameField.setText("");
            EmailField.setText("");
            MobileNoField.setText("");
            PasswordField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add customer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        preparedStatement.close();
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

    }//GEN-LAST:event_AddCustomerButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new AddCustomerPage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomerButton;
    private javax.swing.JLabel AddCustomerTxt;
    private javax.swing.JLabel AddingCustomerDscrpTxt;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel Emailtxt;
    private javax.swing.JLabel FirstNametxt;
    private javax.swing.JTextField MobileNoField;
    private javax.swing.JLabel MobileNotxt;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JLabel PasswordTxt;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel Usernametxt;
    // End of variables declaration//GEN-END:variables
}
