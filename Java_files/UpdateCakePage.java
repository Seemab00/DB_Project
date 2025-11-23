package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateCakePage extends javax.swing.JFrame {

    private Connection connection;

    public UpdateCakePage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public UpdateCakePage() {
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
        UpdateCakeTxt = new javax.swing.JLabel();
        UpdateCakeDscrpTxt = new javax.swing.JLabel();
        PreviousCakeFlavorTxt = new javax.swing.JLabel();
        NewCakePrice = new javax.swing.JLabel();
        NewCakeSize = new javax.swing.JLabel();
        PreviousCakeFlovorField = new javax.swing.JTextField();
        NewCakePriceField = new javax.swing.JTextField();
        NewCakeFSizeField = new javax.swing.JTextField();
        UpdateCakeButton = new javax.swing.JButton();
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

        UpdateCakeTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        UpdateCakeTxt.setForeground(new java.awt.Color(204, 204, 204));
        UpdateCakeTxt.setText("Update Cake");
        getContentPane().add(UpdateCakeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        UpdateCakeDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        UpdateCakeDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        UpdateCakeDscrpTxt.setText("For updating the cake, provide the following deatils");
        getContentPane().add(UpdateCakeDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        PreviousCakeFlavorTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        PreviousCakeFlavorTxt.setForeground(new java.awt.Color(204, 204, 204));
        PreviousCakeFlavorTxt.setText("Previous Cake Flavor");
        getContentPane().add(PreviousCakeFlavorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        NewCakePrice.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        NewCakePrice.setForeground(new java.awt.Color(204, 204, 204));
        NewCakePrice.setText("New Cake Price");
        getContentPane().add(NewCakePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        NewCakeSize.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        NewCakeSize.setForeground(new java.awt.Color(204, 204, 204));
        NewCakeSize.setText("New Cake Size");
        getContentPane().add(NewCakeSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));
        getContentPane().add(PreviousCakeFlovorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 220, 30));
        getContentPane().add(NewCakePriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 220, 30));
        getContentPane().add(NewCakeFSizeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 220, 30));

        UpdateCakeButton.setBackground(new java.awt.Color(102, 51, 0));
        UpdateCakeButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        UpdateCakeButton.setForeground(new java.awt.Color(204, 204, 204));
        UpdateCakeButton.setText("Update Cake");
        UpdateCakeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        UpdateCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCakeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateCakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 180, 50));

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

    private void UpdateCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCakeButtonActionPerformed
        String flavor = PreviousCakeFlovorField.getText().trim();
        String priceStr = NewCakePriceField.getText().trim();
        String size = NewCakeFSizeField.getText().trim();

    // Validate required field
    if (flavor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the Cake Flavor to update.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
    // Build SQL dynamically
    StringBuilder sql = new StringBuilder("UPDATE cake SET ");
    java.util.List<String> fields = new java.util.ArrayList<>();
    java.util.List<Object> values = new java.util.ArrayList<>();

    if (!priceStr.isEmpty()) {
        try {
            int price = Integer.parseInt(priceStr);
            if (price <= 0) {
                JOptionPane.showMessageDialog(this, "Price must be a positive number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            fields.add("price = ?");
            values.add(price);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    if (!size.isEmpty()) {
        fields.add("size = ?");
        values.add(size);
    }

    if (fields.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter at least one field (Price or Size) to update.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    sql.append(String.join(", ", fields));
    sql.append(" WHERE cake_flavor = ?");
    values.add(flavor);

    PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());

    for (int i = 0; i < values.size(); i++) {
        Object val = values.get(i);
        if (val instanceof String) {
            preparedStatement.setString(i + 1, (String) val);
        } else if (val instanceof Integer) {
            preparedStatement.setInt(i + 1, (Integer) val);
        }
    }

    int rowsUpdated = preparedStatement.executeUpdate();
    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(this, "Cake updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        PreviousCakeFlovorField.setText("");
        NewCakePriceField.setText("");
        NewCakeFSizeField.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "No cake found with flavor " + flavor + ".", "Error", JOptionPane.ERROR_MESSAGE);
    }

    preparedStatement.close();
    } catch (SQLException ex) {
        String errorMsg = ex.getMessage();
        JOptionPane.showMessageDialog(this, "Database error: " + errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_UpdateCakeButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new UpdateCakePage(conn).setVisible(true);
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
    private javax.swing.JTextField NewCakeFSizeField;
    private javax.swing.JLabel NewCakePrice;
    private javax.swing.JTextField NewCakePriceField;
    private javax.swing.JLabel NewCakeSize;
    private javax.swing.JLabel PreviousCakeFlavorTxt;
    private javax.swing.JTextField PreviousCakeFlovorField;
    private javax.swing.JButton UpdateCakeButton;
    private javax.swing.JLabel UpdateCakeDscrpTxt;
    private javax.swing.JLabel UpdateCakeTxt;
    // End of variables declaration//GEN-END:variables
}
