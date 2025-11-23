package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OrderManagementPage extends javax.swing.JFrame {

    private Connection connection;

    // Constructor that accepts a database connection
    public OrderManagementPage(Connection connection) {
        initComponents();
        this.connection = connection;
    }

    // Default constructor that establishes a database connection.
    public OrderManagementPage() {
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
        OrderManagementTxt = new javax.swing.JLabel();
        AddOrderButton = new javax.swing.JButton();
        TrackOrderButton = new javax.swing.JButton();
        UpdateOrderButton = new javax.swing.JButton();
        DeleteOrderButton = new javax.swing.JButton();
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

        OrderManagementTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        OrderManagementTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderManagementTxt.setText("Order Management");
        getContentPane().add(OrderManagementTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        AddOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        AddOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AddOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        AddOrderButton.setText("Add Order");
        AddOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 180, 60));

        TrackOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        TrackOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        TrackOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        TrackOrderButton.setText("Track Order");
        TrackOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TrackOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 190, 60));

        UpdateOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        UpdateOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        UpdateOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        UpdateOrderButton.setText("Update Order");
        UpdateOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 180, 60));

        DeleteOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        DeleteOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        DeleteOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        DeleteOrderButton.setText("Delete Orders");
        DeleteOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 190, 60));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CustomerBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrackOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackOrderButtonActionPerformed
        TrackOrderPage trackOrderPage = new TrackOrderPage(connection); // Assuming you have a TrackOrderPage class
        trackOrderPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TrackOrderButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        AdminModulesPage adminModulesPage = new AdminModulesPage(connection);
        adminModulesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrderButtonActionPerformed
        AddOrderPage addOrderPage = new AddOrderPage(connection);
        addOrderPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddOrderButtonActionPerformed

    private void UpdateOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateOrderButtonActionPerformed
        UpdateOrderPage updateOrderPage = new UpdateOrderPage(connection);
        updateOrderPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateOrderButtonActionPerformed

    private void DeleteOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOrderButtonActionPerformed
        DeleteOrderPage deleteOrderPage = new DeleteOrderPage(connection);
        deleteOrderPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeleteOrderButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderManagementPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrderButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton DeleteOrderButton;
    private javax.swing.JLabel OrderManagementTxt;
    private javax.swing.JButton TrackOrderButton;
    private javax.swing.JButton UpdateOrderButton;
    // End of variables declaration//GEN-END:variables
}
