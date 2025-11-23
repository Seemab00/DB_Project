package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DeliveryControlPage extends javax.swing.JFrame {

    private Connection connection;

    // Constructor that accepts a database connection
    public DeliveryControlPage(Connection connection) {
        initComponents();
        this.connection = connection;
    }

    // Default constructor that establishes a database connection.
    public DeliveryControlPage() {
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
        DeliveryControlTxt = new javax.swing.JLabel();
        AddPersonalButton = new javax.swing.JButton();
        UpdatePersonalButton = new javax.swing.JButton();
        ViewPersonalButton = new javax.swing.JButton();
        RemovePersonalButton = new javax.swing.JButton();
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

        DeliveryControlTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        DeliveryControlTxt.setForeground(new java.awt.Color(204, 204, 204));
        DeliveryControlTxt.setText("Delivery Control");
        getContentPane().add(DeliveryControlTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        AddPersonalButton.setBackground(new java.awt.Color(102, 51, 0));
        AddPersonalButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AddPersonalButton.setForeground(new java.awt.Color(204, 204, 204));
        AddPersonalButton.setText("Add Personal");
        AddPersonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddPersonalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 190, 60));

        UpdatePersonalButton.setBackground(new java.awt.Color(102, 51, 0));
        UpdatePersonalButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        UpdatePersonalButton.setForeground(new java.awt.Color(204, 204, 204));
        UpdatePersonalButton.setText("Update Personal");
        UpdatePersonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePersonalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdatePersonalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, 60));

        ViewPersonalButton.setBackground(new java.awt.Color(102, 51, 0));
        ViewPersonalButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        ViewPersonalButton.setForeground(new java.awt.Color(204, 204, 204));
        ViewPersonalButton.setText("View Personal");
        ViewPersonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPersonalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewPersonalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 190, 60));

        RemovePersonalButton.setBackground(new java.awt.Color(102, 51, 0));
        RemovePersonalButton.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        RemovePersonalButton.setForeground(new java.awt.Color(204, 204, 204));
        RemovePersonalButton.setText("Remove Personal");
        RemovePersonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovePersonalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RemovePersonalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, 60));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CustomerBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        AdminModulesPage adminModulesPage = new AdminModulesPage(connection);
        adminModulesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddPersonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonalButtonActionPerformed
        AddPersonalPage addDeliveryPerson = new AddPersonalPage(connection);  // Corrected line
        addDeliveryPerson.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddPersonalButtonActionPerformed

    private void UpdatePersonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePersonalButtonActionPerformed
        UpdatePersonalPage updateDeliveryPerson = new UpdatePersonalPage(connection); // Corrected line
        updateDeliveryPerson.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdatePersonalButtonActionPerformed

    private void ViewPersonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPersonalButtonActionPerformed
        ViewPersonalPage viewDeliveryPerson = new ViewPersonalPage(connection);    // Corrected line
        viewDeliveryPerson.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewPersonalButtonActionPerformed

    private void RemovePersonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovePersonalButtonActionPerformed
        RemovePersonalPage removeDeliveryPerson = new RemovePersonalPage(connection); // Corrected line
        removeDeliveryPerson.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RemovePersonalButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryControlPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPersonalButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel DeliveryControlTxt;
    private javax.swing.JButton RemovePersonalButton;
    private javax.swing.JButton UpdatePersonalButton;
    private javax.swing.JButton ViewPersonalButton;
    // End of variables declaration//GEN-END:variables
}
