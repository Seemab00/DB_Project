package cakeordermanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class PlaceOrder extends javax.swing.JFrame {

    private Connection connection; 
    private int customer_id;

    public PlaceOrder(Connection connection, int customer_id) {
        initComponents();
        this.connection = connection;  // Store the connection
        this.customer_id = customer_id;

        //  CakeComboBox with cake options
        CakeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select", "Chocolate Cake", "Vanilla Cake", "Red-Velvet Cake",
            "Cheese Cake", "Strawberry Cake", "Butter Cake"
        }));

        //  SizeComboBox with sizes
        SizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select", "Small", "Medium", "Large"
        }));

        //  QuantityComboBox with values from 1 to 10
        String[] quantities = new String[10];
        for (int i = 0; i < 10; i++) {
            quantities[i] = String.valueOf(i + 1);
        }

        QuantityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(quantities));
    }

    public PlaceOrder() {
        initComponents();
        //  CakeComboBox with cake options
        CakeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select", "Chocolate Cake", "Vanilla Cake", "Red-Velvet Cake",
            "Cheese Cake", "Strawberry Cake", "Butter Cake"
        }));

        //  SizeComboBox with sizes
        SizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select", "Small", "Medium", "Large"
        }));

        //  QuantityComboBox with values from 1 to 10
        String[] quantities = new String[10];
        for (int i = 0; i < 10; i++) {
            quantities[i] = String.valueOf(i + 1);
        }

        QuantityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(quantities));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        PlaceOrderTxt = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JLabel();
        CakeTxt = new javax.swing.JLabel();
        SizeTxt = new javax.swing.JLabel();
        QuantityTxt = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        CakeComboBox = new javax.swing.JComboBox<>();
        SizeComboBox = new javax.swing.JComboBox<>();
        QuantityComboBox = new javax.swing.JComboBox<>();
        ConfirmOrderButton = new javax.swing.JButton();
        OrderIDTxt = new javax.swing.JLabel();
        OrderIDField = new javax.swing.JTextField();
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        PlaceOrderTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        PlaceOrderTxt.setForeground(new java.awt.Color(204, 204, 204));
        PlaceOrderTxt.setText("Place your Order");
        getContentPane().add(PlaceOrderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        UsernameTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        UsernameTxt.setForeground(new java.awt.Color(204, 204, 204));
        UsernameTxt.setText("Enter your username");
        getContentPane().add(UsernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        CakeTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        CakeTxt.setForeground(new java.awt.Color(204, 204, 204));
        CakeTxt.setText("Choose your cake");
        getContentPane().add(CakeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        SizeTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        SizeTxt.setForeground(new java.awt.Color(204, 204, 204));
        SizeTxt.setText("Select the size");
        getContentPane().add(SizeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        QuantityTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        QuantityTxt.setForeground(new java.awt.Color(204, 204, 204));
        QuantityTxt.setText("Enter quantity");
        getContentPane().add(QuantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 220, 30));

        CakeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CakeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CakeComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CakeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 302, 220, 30));

        SizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SizeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 352, 220, 30));

        QuantityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        QuantityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(QuantityComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 402, 220, 30));

        ConfirmOrderButton.setBackground(new java.awt.Color(102, 51, 0));
        ConfirmOrderButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        ConfirmOrderButton.setForeground(new java.awt.Color(204, 204, 204));
        ConfirmOrderButton.setText("Confirm Order");
        ConfirmOrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        ConfirmOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 200, 50));

        OrderIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        OrderIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderIDTxt.setText("Enter your Order ID");
        getContentPane().add(OrderIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));
        getContentPane().add(OrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 220, 30));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed

    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new CustomerModulesPage(connection, customer_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ConfirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmOrderButtonActionPerformed
        String username = UsernameField.getText().trim();
        String orderIdStr = OrderIDField.getText().trim();  // user-provided order ID
        String cake = (String) CakeComboBox.getSelectedItem();
        String size = (String) SizeComboBox.getSelectedItem();
        String quantityStr = (String) QuantityComboBox.getSelectedItem();

    if (username.isEmpty() || orderIdStr.isEmpty() || "Select".equals(cake) || "Select".equals(size) || quantityStr == null) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields and make proper selections.");
        return;
    }

    int order_id = Integer.parseInt(orderIdStr);
    int quantity = Integer.parseInt(quantityStr);

    // Determine base price per cake
    int pricePerCake = 0;
    switch (cake) {
        case "Chocolate Cake":
        case "Red-Velvet Cake":
        case "Vanilla Cake":
        case "Butter Cake":
        case "Cheese Cake":
        case "Strawberry Cake":
        pricePerCake = size.equals("Small") ? 700
                       : size.equals("Medium") ? 1500
                       : 2100;
        break;
    }
    
    int totalPrice = pricePerCake * quantity;

    try {
    // Get customer_id using the provided username
    String query = "SELECT customer_id FROM customer WHERE username = ?";
    PreparedStatement stmt = connection.prepareStatement(query);
    stmt.setString(1, username);
    ResultSet rs = stmt.executeQuery();

    if (rs.next()) {
        int customer_id = rs.getInt("customer_id");
        rs.close();
        stmt.close();

        // Insert into customerorder table
        PreparedStatement insert = connection.prepareStatement(
            "INSERT INTO customerorder (order_id, customer_id, cake_type, size, quantity, price, rating, feedback) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

        insert.setInt(1, order_id);
        insert.setInt(2, customer_id);
        insert.setString(3, cake);
        insert.setString(4, size);
        insert.setInt(5, quantity);
        insert.setInt(6, totalPrice);
        insert.setString(7, "Not Rated");  // default rating
        insert.setString(8, "No Feedback");  // default feedback

        int result = insert.executeUpdate();
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Order placed successfully! \n\nTotal Price : Rs. " + totalPrice);

            // Optional: reset fields
            UsernameField.setText("");
            OrderIDField.setText("");
            CakeComboBox.setSelectedIndex(0);
            SizeComboBox.setSelectedIndex(0);
            QuantityComboBox.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to place order. Please try again.");
        }
        insert.close();
    } else {
        JOptionPane.showMessageDialog(this, "Username not found.");
    }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        e.printStackTrace();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid number input.");
    }
    }//GEN-LAST:event_ConfirmOrderButtonActionPerformed

    private void CakeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CakeComboBoxActionPerformed
        
    }//GEN-LAST:event_CakeComboBoxActionPerformed

    private void SizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeComboBoxActionPerformed
        
    }//GEN-LAST:event_SizeComboBoxActionPerformed

    private void QuantityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityComboBoxActionPerformed
        
    }//GEN-LAST:event_QuantityComboBoxActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                    new PlaceOrder(con, 1).setVisible(true);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JComboBox<String> CakeComboBox;
    private javax.swing.JLabel CakeTxt;
    private javax.swing.JButton ConfirmOrderButton;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JLabel OrderIDTxt;
    private javax.swing.JLabel PlaceOrderTxt;
    private javax.swing.JComboBox<String> QuantityComboBox;
    private javax.swing.JLabel QuantityTxt;
    private javax.swing.JComboBox<String> SizeComboBox;
    private javax.swing.JLabel SizeTxt;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameTxt;
    // End of variables declaration//GEN-END:variables
}
