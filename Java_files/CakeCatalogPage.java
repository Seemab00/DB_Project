package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CakeCatalogPage extends javax.swing.JFrame {

    private Connection connection;

    // Constructor that accepts a database connection
    public CakeCatalogPage(Connection connection) {
        initComponents();
        this.connection = connection;
    }

    // Default constructor that establishes a database connection.
    public CakeCatalogPage() {
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
        CakeCatalogTxt = new javax.swing.JLabel();
        AddCakeButton = new javax.swing.JButton();
        UpdateCakeButton = new javax.swing.JButton();
        RemoveCakeButton = new javax.swing.JButton();
        DisplayCakeButton = new javax.swing.JButton();
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

        CakeCatalogTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        CakeCatalogTxt.setForeground(new java.awt.Color(204, 204, 204));
        CakeCatalogTxt.setText("Cake Catalog");
        getContentPane().add(CakeCatalogTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        AddCakeButton.setBackground(new java.awt.Color(102, 51, 0));
        AddCakeButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AddCakeButton.setForeground(new java.awt.Color(204, 204, 204));
        AddCakeButton.setText("Add New Cake");
        AddCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCakeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddCakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 190, 60));

        UpdateCakeButton.setBackground(new java.awt.Color(102, 51, 0));
        UpdateCakeButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        UpdateCakeButton.setForeground(new java.awt.Color(204, 204, 204));
        UpdateCakeButton.setText("Update Cake");
        UpdateCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCakeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateCakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 190, 60));

        RemoveCakeButton.setBackground(new java.awt.Color(102, 51, 0));
        RemoveCakeButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        RemoveCakeButton.setForeground(new java.awt.Color(204, 204, 204));
        RemoveCakeButton.setText("Remove Cake");
        RemoveCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCakeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveCakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 190, 60));

        DisplayCakeButton.setBackground(new java.awt.Color(102, 51, 0));
        DisplayCakeButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        DisplayCakeButton.setForeground(new java.awt.Color(204, 204, 204));
        DisplayCakeButton.setText("Display Cake");
        DisplayCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayCakeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DisplayCakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 190, 60));

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

    private void AddCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCakeButtonActionPerformed
        AddNewCakePage AddnewCakePage = new AddNewCakePage(connection);
        AddnewCakePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddCakeButtonActionPerformed

    private void UpdateCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCakeButtonActionPerformed
        UpdateCakePage updateCakePage = new UpdateCakePage(connection);
        updateCakePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateCakeButtonActionPerformed

    private void DisplayCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayCakeButtonActionPerformed
        DisplayCakePage displayCakePage = new DisplayCakePage(connection);
        displayCakePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DisplayCakeButtonActionPerformed

    private void RemoveCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveCakeButtonActionPerformed
        RemoveCakePage removeCakePage = new RemoveCakePage(connection);
        removeCakePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RemoveCakeButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CakeCatalogPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCakeButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel CakeCatalogTxt;
    private javax.swing.JButton DisplayCakeButton;
    private javax.swing.JButton RemoveCakeButton;
    private javax.swing.JButton UpdateCakeButton;
    // End of variables declaration//GEN-END:variables
}
