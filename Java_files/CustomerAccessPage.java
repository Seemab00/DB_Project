package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CustomerAccessPage extends javax.swing.JFrame {

    private Connection connection;

    // Constructor that accepts a database connection
    public CustomerAccessPage(Connection connection) {
        initComponents();
        this.connection = connection;
    }

    // Default constructor that establishes a database connection.
    public CustomerAccessPage() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23"); // Replace with your password
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: Could not connect to the database. The application will now exit.", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        CustomerAccessTxt = new javax.swing.JLabel();
        AddCustomerButton = new javax.swing.JButton();
        ViewCustomerButton = new javax.swing.JButton();
        UpdateCustomerButton = new javax.swing.JButton();
        DeleteCustomerButton = new javax.swing.JButton();
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

        CustomerAccessTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        CustomerAccessTxt.setForeground(new java.awt.Color(204, 204, 204));
        CustomerAccessTxt.setText("Customer Access ");
        getContentPane().add(CustomerAccessTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        AddCustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        AddCustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AddCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        AddCustomerButton.setText("Add Customer");
        AddCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 190, 60));

        ViewCustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        ViewCustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        ViewCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        ViewCustomerButton.setText("View Customer");
        ViewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 190, 60));

        UpdateCustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        UpdateCustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        UpdateCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        UpdateCustomerButton.setText("Update Customer");
        UpdateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 190, 60));

        DeleteCustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        DeleteCustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        DeleteCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        DeleteCustomerButton.setText("Delete Customer");
        DeleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 190, 60));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CustomerBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerButtonActionPerformed
        DeleteCustomerPage deleteCustomerPage = new DeleteCustomerPage(connection);
        deleteCustomerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeleteCustomerButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        AdminModulesPage adminModulesPage = new AdminModulesPage(connection);
        adminModulesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerButtonActionPerformed
        AddCustomerPage addCustomerPage = new AddCustomerPage(connection);
        addCustomerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddCustomerButtonActionPerformed

    private void UpdateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustomerButtonActionPerformed
        UpdateCustomerPage updateCustomerPage = new UpdateCustomerPage(connection);
        updateCustomerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateCustomerButtonActionPerformed

    private void ViewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCustomerButtonActionPerformed
        ViewCustomerPage viewCustomerPage = new ViewCustomerPage(connection);
        viewCustomerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewCustomerButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23"); // Replace with your password
                // Passes the connection to the constructor.
                new CustomerAccessPage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomerButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel CustomerAccessTxt;
    private javax.swing.JButton DeleteCustomerButton;
    private javax.swing.JButton UpdateCustomerButton;
    private javax.swing.JButton ViewCustomerButton;
    // End of variables declaration//GEN-END:variables
}
