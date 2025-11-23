package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RemovePersonalPage extends javax.swing.JFrame {

    private Connection connection;

    // Constructor that accepts an existing connection
    public RemovePersonalPage(Connection connection) {
        this.connection = connection;
        initComponents();
        setLocationRelativeTo(null); // Center the window
    }

    public RemovePersonalPage() {
        this(initializeDatabaseConnection());
    }

    // Method to initialize database connection
    private static Connection initializeDatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Could not connect to the database. The application will now exit.", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        RemovePersonalTxt = new javax.swing.JLabel();
        RemovePersonalDscrpTxt = new javax.swing.JLabel();
        PersonalIDTxt = new javax.swing.JLabel();
        PersonalIDField = new javax.swing.JTextField();
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

        RemovePersonalTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        RemovePersonalTxt.setForeground(new java.awt.Color(204, 204, 204));
        RemovePersonalTxt.setText("Remove Personal");
        getContentPane().add(RemovePersonalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        RemovePersonalDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        RemovePersonalDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        RemovePersonalDscrpTxt.setText("For removing a person, provide the following details");
        getContentPane().add(RemovePersonalDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        PersonalIDTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        PersonalIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        PersonalIDTxt.setText("Personal ID");
        getContentPane().add(PersonalIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));
        getContentPane().add(PersonalIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 220, 30));

        RemovePersonalButton.setBackground(new java.awt.Color(102, 51, 0));
        RemovePersonalButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        RemovePersonalButton.setForeground(new java.awt.Color(204, 204, 204));
        RemovePersonalButton.setText("Remove Personal");
        RemovePersonalButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        RemovePersonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovePersonalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RemovePersonalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 220, 50));

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

    private void RemovePersonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovePersonalButtonActionPerformed
                                                     
    if (connection == null) {
            JOptionPane.showMessageDialog(this, "No database connection available.", "Connection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String personalIdStr = PersonalIDField.getText().trim();
        if (personalIdStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the Personal ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int personalId;
        try {
            personalId = Integer.parseInt(personalIdStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Personal ID. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Optional: Confirmation before deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this delivery person?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            String sql = "DELETE FROM deliverypersonal WHERE personal_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, personalId);
            int rowsDeleted = preparedStatement.executeUpdate();
            preparedStatement.close();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Delivery person removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                PersonalIDField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to remove delivery person. Check if the Personal ID exists.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_RemovePersonalButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new RemovePersonalPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JTextField PersonalIDField;
    private javax.swing.JLabel PersonalIDTxt;
    private javax.swing.JButton RemovePersonalButton;
    private javax.swing.JLabel RemovePersonalDscrpTxt;
    private javax.swing.JLabel RemovePersonalTxt;
    // End of variables declaration//GEN-END:variables
}
