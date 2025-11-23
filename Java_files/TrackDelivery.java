package cakeordermanagementsystem;

import java.sql.*;
import javax.swing.*;

public class TrackDelivery extends javax.swing.JFrame {

    private Connection connection;
    private int customer_id;  // Add customerId

    public TrackDelivery(Connection connection, int customer_id) { // Modified constructor
        initComponents();
        this.connection = connection;
        this.customer_id = customer_id; // Initialize

        //  DayComboBox with days of the week
        DayCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        }));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        TrackDeliveryTxt = new javax.swing.JLabel();
        OrderIDTxt = new javax.swing.JLabel();
        HouseTxt = new javax.swing.JLabel();
        StreetTxt = new javax.swing.JLabel();
        CityTxt = new javax.swing.JLabel();
        DateTxt = new javax.swing.JLabel();
        DayTxt = new javax.swing.JLabel();
        TimeTxt = new javax.swing.JLabel();
        OrderIDField = new javax.swing.JTextField();
        HouseField = new javax.swing.JTextField();
        StreetField = new javax.swing.JTextField();
        CityField = new javax.swing.JTextField();
        DateField = new javax.swing.JTextField();
        DayCombobox = new javax.swing.JComboBox<>();
        TimeField = new javax.swing.JTextField();
        DeliveryButton = new javax.swing.JButton();
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 50));

        TrackDeliveryTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        TrackDeliveryTxt.setForeground(new java.awt.Color(204, 204, 204));
        TrackDeliveryTxt.setText("Track Delivery");
        getContentPane().add(TrackDeliveryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        OrderIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        OrderIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderIDTxt.setText("Order ID");
        getContentPane().add(OrderIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        HouseTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        HouseTxt.setForeground(new java.awt.Color(204, 204, 204));
        HouseTxt.setText("Enter your House No");
        getContentPane().add(HouseTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        StreetTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        StreetTxt.setForeground(new java.awt.Color(204, 204, 204));
        StreetTxt.setText("Enter your Street No");
        getContentPane().add(StreetTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        CityTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        CityTxt.setForeground(new java.awt.Color(204, 204, 204));
        CityTxt.setText("Enter your City");
        getContentPane().add(CityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        DateTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        DateTxt.setForeground(new java.awt.Color(204, 204, 204));
        DateTxt.setText("Enter your Date");
        getContentPane().add(DateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        DayTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        DayTxt.setForeground(new java.awt.Color(204, 204, 204));
        DayTxt.setText("Select your Day");
        getContentPane().add(DayTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        TimeTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        TimeTxt.setForeground(new java.awt.Color(204, 204, 204));
        TimeTxt.setText("Select your Time");
        getContentPane().add(TimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        OrderIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIDFieldActionPerformed(evt);
            }
        });
        getContentPane().add(OrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 132, 200, 30));

        HouseField.setFont(new java.awt.Font("Gabriola", 0, 20)); // NOI18N
        getContentPane().add(HouseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 200, 30));
        getContentPane().add(StreetField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 200, 30));

        CityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityFieldActionPerformed(evt);
            }
        });
        getContentPane().add(CityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 200, 30));
        getContentPane().add(DateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 200, 30));

        DayCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(DayCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 200, 30));
        getContentPane().add(TimeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 200, 30));

        DeliveryButton.setBackground(new java.awt.Color(102, 51, 0));
        DeliveryButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        DeliveryButton.setForeground(new java.awt.Color(204, 204, 204));
        DeliveryButton.setText("Confirm Delivery");
        DeliveryButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        DeliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeliveryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 210, 50));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new CustomerModulesPage(connection, customer_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryButtonActionPerformed
    String orderId = OrderIDField.getText().trim();
    String house = HouseField.getText().trim();
    String street = StreetField.getText().trim();
    String city = CityField.getText().trim();
    String date = DateField.getText().trim();
    String day = (String) DayCombobox.getSelectedItem();
    String time = TimeField.getText().trim();

    // Validate input fields
    if (orderId.isEmpty() || house.isEmpty() || street.isEmpty() || city.isEmpty() || 
        date.isEmpty() || "Select".equals(day) || time.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fields cannot be empty.");
        return;
    }


    try {
        // Insert delivery information into the customerdeliveryadress table
        PreparedStatement insert = connection.prepareStatement(
                "INSERT INTO customerdeliveryadress (order_id, house_no, street_no, city, date, day, time) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)");
        insert.setInt(1, Integer.parseInt(orderId)); // Use order_id
        insert.setString(2, house);
        insert.setString(3, street);
        insert.setString(4, city);
        insert.setString(5, date); 
        insert.setString(6, day); // Store day as VARCHAR
        insert.setString(7, time); // Store time as VARCHAR

        int result = insert.executeUpdate();
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Delivery details added successfully!");
            // Clear fields after successful submission
            OrderIDField.setText("");
            HouseField.setText("");
            StreetField.setText("");
            CityField.setText("");
            DateField.setText("");
            DayCombobox.setSelectedIndex(0);
            TimeField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add delivery details.");
        }
        insert.close();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Order ID format. Please enter a valid number.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_DeliveryButtonActionPerformed

    private void OrderIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIDFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                new TrackDelivery(con, 1).setVisible(true); // Example
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + e.getMessage());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityTxt;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DateTxt;
    private javax.swing.JComboBox<String> DayCombobox;
    private javax.swing.JLabel DayTxt;
    private javax.swing.JButton DeliveryButton;
    private javax.swing.JTextField HouseField;
    private javax.swing.JLabel HouseTxt;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JLabel OrderIDTxt;
    private javax.swing.JTextField StreetField;
    private javax.swing.JLabel StreetTxt;
    private javax.swing.JTextField TimeField;
    private javax.swing.JLabel TimeTxt;
    private javax.swing.JLabel TrackDeliveryTxt;
    // End of variables declaration//GEN-END:variables
}
