package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddNewCakePage extends javax.swing.JFrame {

    private Connection connection;

    public AddNewCakePage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public AddNewCakePage() {
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
        AddNewCakeTxt = new javax.swing.JLabel();
        AddNewCakeDscrpTxt = new javax.swing.JLabel();
        CakeFlavorTxt = new javax.swing.JLabel();
        CakePriceTxt = new javax.swing.JLabel();
        CakeSizeTxt = new javax.swing.JLabel();
        CakeFlavorField = new javax.swing.JTextField();
        CakePriceField = new javax.swing.JTextField();
        CakeSizeField = new javax.swing.JTextField();
        AddCakeButton = new javax.swing.JButton();
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

        AddNewCakeTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        AddNewCakeTxt.setForeground(new java.awt.Color(204, 204, 204));
        AddNewCakeTxt.setText("Add New Cake");
        getContentPane().add(AddNewCakeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        AddNewCakeDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        AddNewCakeDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        AddNewCakeDscrpTxt.setText("For adding a new cake, provide the following deatils");
        getContentPane().add(AddNewCakeDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        CakeFlavorTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        CakeFlavorTxt.setForeground(new java.awt.Color(204, 204, 204));
        CakeFlavorTxt.setText("Cake Flavor");
        getContentPane().add(CakeFlavorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        CakePriceTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        CakePriceTxt.setForeground(new java.awt.Color(204, 204, 204));
        CakePriceTxt.setText("Cake Price");
        getContentPane().add(CakePriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        CakeSizeTxt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        CakeSizeTxt.setForeground(new java.awt.Color(204, 204, 204));
        CakeSizeTxt.setText("Cake Size");
        getContentPane().add(CakeSizeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        CakeFlavorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CakeFlavorFieldActionPerformed(evt);
            }
        });
        getContentPane().add(CakeFlavorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 220, 30));
        getContentPane().add(CakePriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 220, 30));
        getContentPane().add(CakeSizeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 220, 30));

        AddCakeButton.setBackground(new java.awt.Color(102, 51, 0));
        AddCakeButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AddCakeButton.setForeground(new java.awt.Color(204, 204, 204));
        AddCakeButton.setText("Add Cake");
        AddCakeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AddCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCakeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddCakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 170, 50));

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

    private void AddCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCakeButtonActionPerformed
        String flavor = CakeFlavorField.getText().trim();
        String priceStr = CakePriceField.getText().trim();
        String size = CakeSizeField.getText().trim();

        // Validate fields
        if (flavor.isEmpty() || priceStr.isEmpty() || size.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int price = Integer.parseInt(priceStr);
            if (price <= 0) {
                JOptionPane.showMessageDialog(this, "Price must be a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "INSERT INTO cake (cake_flavor, price, size) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, flavor);
            preparedStatement.setInt(2, price);
            preparedStatement.setString(3, size);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Cake added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                CakeFlavorField.setText("");
                CakePriceField.setText("");
                CakeSizeField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add cake.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            preparedStatement.close();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            String errorMsg = ex.getMessage();
            if (errorMsg.contains("Duplicate entry") && errorMsg.contains("cake_flavor")) {
                JOptionPane.showMessageDialog(this, "Cake flavor already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Database error: " + errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddCakeButtonActionPerformed

    private void CakeFlavorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CakeFlavorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CakeFlavorFieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new AddNewCakePage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCakeButton;
    private javax.swing.JLabel AddNewCakeDscrpTxt;
    private javax.swing.JLabel AddNewCakeTxt;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JTextField CakeFlavorField;
    private javax.swing.JLabel CakeFlavorTxt;
    private javax.swing.JTextField CakePriceField;
    private javax.swing.JLabel CakePriceTxt;
    private javax.swing.JTextField CakeSizeField;
    private javax.swing.JLabel CakeSizeTxt;
    // End of variables declaration//GEN-END:variables
}
