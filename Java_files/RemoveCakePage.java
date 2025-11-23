package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RemoveCakePage extends javax.swing.JFrame {

    private Connection connection;

    public RemoveCakePage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public RemoveCakePage() {
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
        RemoveCakeTxt = new javax.swing.JLabel();
        RemoveCakeDscrpTxt = new javax.swing.JLabel();
        CakeFlavorTxt = new javax.swing.JLabel();
        CakeFlavorField = new javax.swing.JTextField();
        RemoveCakeButton = new javax.swing.JButton();
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

        RemoveCakeTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        RemoveCakeTxt.setForeground(new java.awt.Color(204, 204, 204));
        RemoveCakeTxt.setText("Remove Cake");
        getContentPane().add(RemoveCakeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        RemoveCakeDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        RemoveCakeDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        RemoveCakeDscrpTxt.setText("For deleting the cake, provide the following deatils");
        getContentPane().add(RemoveCakeDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        CakeFlavorTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        CakeFlavorTxt.setForeground(new java.awt.Color(204, 204, 204));
        CakeFlavorTxt.setText("Cake Flavor");
        getContentPane().add(CakeFlavorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));
        getContentPane().add(CakeFlavorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 240, 30));

        RemoveCakeButton.setBackground(new java.awt.Color(102, 51, 0));
        RemoveCakeButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        RemoveCakeButton.setForeground(new java.awt.Color(204, 204, 204));
        RemoveCakeButton.setText("Remove Cake");
        RemoveCakeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        RemoveCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCakeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveCakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 490, 180, 50));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        CakeCatalogPage cakeCatalogPage = new CakeCatalogPage(connection);
        cakeCatalogPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void RemoveCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveCakeButtonActionPerformed

    String flavor = CakeFlavorField.getText().trim();

    // Validate input
    if (flavor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the cake flavor.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        String sql = "DELETE FROM cake WHERE cake_flavor = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, flavor);

        int rowsDeleted = preparedStatement.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Cake deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            CakeFlavorField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No cake found with flavor " + flavor + ".", "Error", JOptionPane.ERROR_MESSAGE);
        }
        preparedStatement.close();
    } catch (SQLException ex) {
        String errorMsg = ex.getMessage();
        JOptionPane.showMessageDialog(this, "Database error: " + errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_RemoveCakeButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new RemoveCakePage(conn).setVisible(true);
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
    private javax.swing.JTextField CakeFlavorField;
    private javax.swing.JLabel CakeFlavorTxt;
    private javax.swing.JButton RemoveCakeButton;
    private javax.swing.JLabel RemoveCakeDscrpTxt;
    private javax.swing.JLabel RemoveCakeTxt;
    // End of variables declaration//GEN-END:variables
}
