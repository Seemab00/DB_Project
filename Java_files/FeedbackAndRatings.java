package cakeordermanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class FeedbackAndRatings extends javax.swing.JFrame {

    private Connection connection;
    private int customer_id; // Add customerId

    public FeedbackAndRatings(Connection connection, int customer_id) { // Modified Constructor
        initComponents();
        this.connection = connection;
        this.customer_id = customer_id; // Initialize
        RatingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select", "1 Star", "2 Stars", "3 Stars", "4 Stars", "5 Stars"
        }));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        BackButton = new javax.swing.JButton();
        FeedbackAndRatingTxt = new javax.swing.JLabel();
        OrderIDTxt = new javax.swing.JLabel();
        RatingTxt = new javax.swing.JLabel();
        Feedbacktxt = new javax.swing.JLabel();
        OrderIDField = new javax.swing.JTextField();
        RatingComboBox = new javax.swing.JComboBox<>();
        feedbackScrollPane = new javax.swing.JScrollPane();
        FeedbackTxtarea = new javax.swing.JTextArea();
        SubmitButton = new javax.swing.JButton();
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

        FeedbackAndRatingTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        FeedbackAndRatingTxt.setForeground(new java.awt.Color(204, 204, 204));
        FeedbackAndRatingTxt.setText("Feedback & Rating");
        getContentPane().add(FeedbackAndRatingTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        OrderIDTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        OrderIDTxt.setForeground(new java.awt.Color(204, 204, 204));
        OrderIDTxt.setText("Order ID");
        getContentPane().add(OrderIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        RatingTxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        RatingTxt.setForeground(new java.awt.Color(204, 204, 204));
        RatingTxt.setText("Rating");
        getContentPane().add(RatingTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        Feedbacktxt.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        Feedbacktxt.setForeground(new java.awt.Color(204, 204, 204));
        Feedbacktxt.setText("Feedback");
        getContentPane().add(Feedbacktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));
        getContentPane().add(OrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, 30));

        RatingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(RatingComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 190, 30));

        FeedbackTxtarea.setColumns(20);
        FeedbackTxtarea.setRows(5);
        feedbackScrollPane.setViewportView(FeedbackTxtarea);

        getContentPane().add(feedbackScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 240, 100));

        SubmitButton.setBackground(new java.awt.Color(102, 51, 0));
        SubmitButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(204, 204, 204));
        SubmitButton.setText("Submit");
        SubmitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 160, 50));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new CustomerModulesPage(connection, customer_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

    String orderId = OrderIDField.getText().trim();
    String feedback = FeedbackTxtarea.getText().trim();
    String rating = (String) RatingComboBox.getSelectedItem();

    // Validate input fields
    if (orderId.isEmpty() || feedback.isEmpty() || "Select".equals(rating)) {
        JOptionPane.showMessageDialog(this, "Fields cannot be empty!");
        return;
    }

    try {
        // Validate order_id is numeric
        int orderIdInt = Integer.parseInt(orderId);
        if (orderIdInt <= 0) {
            JOptionPane.showMessageDialog(this, "Order ID must be a positive number.");
            return;
        }

        // Update feedback and rating in the customerorder table
        PreparedStatement update = connection.prepareStatement(
                "UPDATE customerorder SET rating = ?, feedback = ? WHERE order_id = ?");
        update.setString(1, rating);
        update.setString(2, feedback);
        update.setInt(3, orderIdInt);

        int result = update.executeUpdate();

        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Thank you for your feedback and rating!");
            // Clear fields
            OrderIDField.setText("");
            FeedbackTxtarea.setText("");
            RatingComboBox.setSelectedIndex(0);

            // Navigate to CustomerModulesPage
            new CustomerModulesPage(connection, orderIdInt).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No order found with Order ID " + orderId + ".");
        }
        update.close();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Order ID format. Please enter a numeric value.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                    new FeedbackAndRatings(con, 1).setVisible(true); // Pass connection
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel FeedbackAndRatingTxt;
    private javax.swing.JTextArea FeedbackTxtarea;
    private javax.swing.JLabel Feedbacktxt;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JLabel OrderIDTxt;
    private javax.swing.JComboBox<String> RatingComboBox;
    private javax.swing.JLabel RatingTxt;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JScrollPane feedbackScrollPane;
    private javax.swing.JOptionPane jOptionPane1;
    // End of variables declaration//GEN-END:variables
}
