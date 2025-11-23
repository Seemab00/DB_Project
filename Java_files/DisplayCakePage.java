package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DisplayCakePage extends javax.swing.JFrame {

    private Connection connection;

    public DisplayCakePage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public DisplayCakePage() {
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
        DisplayCakeTxt = new javax.swing.JLabel();
        DisplayCakeDscrpTxt = new javax.swing.JLabel();
        RecentlyAddedCakebutton = new javax.swing.JButton();
        AllCakesButton = new javax.swing.JButton();
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

        DisplayCakeTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        DisplayCakeTxt.setForeground(new java.awt.Color(204, 204, 204));
        DisplayCakeTxt.setText("Display Cake");
        getContentPane().add(DisplayCakeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        DisplayCakeDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        DisplayCakeDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        DisplayCakeDscrpTxt.setText("For displaying cake's detail, choose one option");
        getContentPane().add(DisplayCakeDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        RecentlyAddedCakebutton.setBackground(new java.awt.Color(102, 51, 0));
        RecentlyAddedCakebutton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        RecentlyAddedCakebutton.setForeground(new java.awt.Color(204, 204, 204));
        RecentlyAddedCakebutton.setText("Recently Added Cake ");
        RecentlyAddedCakebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        RecentlyAddedCakebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecentlyAddedCakebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(RecentlyAddedCakebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 290, 50));

        AllCakesButton.setBackground(new java.awt.Color(102, 51, 0));
        AllCakesButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AllCakesButton.setForeground(new java.awt.Color(204, 204, 204));
        AllCakesButton.setText("All Cakes");
        AllCakesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AllCakesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllCakesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AllCakesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 180, 50));

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

    private void RecentlyAddedCakebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecentlyAddedCakebuttonActionPerformed

    try {
        String sql = "SELECT * FROM cake ORDER BY cake_flavor DESC LIMIT 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String flavor = resultSet.getString("cake_flavor");
            int price = resultSet.getInt("price");
            String size = resultSet.getString("size");

            String message = "Recently Added Cake:\nFlavor: " + flavor + "\nPrice: " + price + "\nSize: " + size;
            JOptionPane.showMessageDialog(this, message, "Recently Added Cake", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No cakes found.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

        resultSet.close();
        preparedStatement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RecentlyAddedCakebuttonActionPerformed

    private void AllCakesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllCakesButtonActionPerformed

    try {
        String sql = "SELECT * FROM cake ORDER BY cake_flavor DESC LIMIT 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String flavor = resultSet.getString("cake_flavor");
            int price = resultSet.getInt("price");
            String size = resultSet.getString("size");

            String message = "Recently Added Cake:\nFlavor: " + flavor + "\nPrice: " + price + "\nSize: " + size;
            JOptionPane.showMessageDialog(this, message, "Recently Added Cake", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No cakes found.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

        resultSet.close();
        preparedStatement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_AllCakesButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new DisplayCakePage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllCakesButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel DisplayCakeDscrpTxt;
    private javax.swing.JLabel DisplayCakeTxt;
    private javax.swing.JButton RecentlyAddedCakebutton;
    // End of variables declaration//GEN-END:variables
}
