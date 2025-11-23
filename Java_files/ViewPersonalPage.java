package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ViewPersonalPage extends javax.swing.JFrame {

    private Connection connection;

    public ViewPersonalPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null); // Center the form
    }

    public ViewPersonalPage() {
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
        ViewPersonalTxt = new javax.swing.JLabel();
        ViewPersonalDscrpTxt = new javax.swing.JLabel();
        RecentlyAddedPersonalButton = new javax.swing.JButton();
        AllPersonalsButton = new javax.swing.JButton();
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

        ViewPersonalTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        ViewPersonalTxt.setForeground(new java.awt.Color(204, 204, 204));
        ViewPersonalTxt.setText("View Personal");
        getContentPane().add(ViewPersonalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        ViewPersonalDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        ViewPersonalDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        ViewPersonalDscrpTxt.setText("To view the personal details, choose one option");
        getContentPane().add(ViewPersonalDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        RecentlyAddedPersonalButton.setBackground(new java.awt.Color(102, 51, 0));
        RecentlyAddedPersonalButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        RecentlyAddedPersonalButton.setForeground(new java.awt.Color(204, 204, 204));
        RecentlyAddedPersonalButton.setText("Recently Added Personal");
        RecentlyAddedPersonalButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        RecentlyAddedPersonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecentlyAddedPersonalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RecentlyAddedPersonalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 290, 50));

        AllPersonalsButton.setBackground(new java.awt.Color(102, 51, 0));
        AllPersonalsButton.setFont(new java.awt.Font("Vivaldi", 1, 26)); // NOI18N
        AllPersonalsButton.setForeground(new java.awt.Color(204, 204, 204));
        AllPersonalsButton.setText("All Personals");
        AllPersonalsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AllPersonalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllPersonalsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AllPersonalsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 170, 50));

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

    private void AllPersonalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllPersonalsButtonActionPerformed
                                                 
    try {
        String sql = "SELECT * FROM deliverypersonal";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        StringBuilder message = new StringBuilder("All Delivery Personnel:\n\n");

        while (resultSet.next()) {
            message.append("ID: ").append(resultSet.getInt("id")).append("\n");
            message.append("Name: ").append(resultSet.getString("personal_name")).append("\n");
            message.append("Order ID: ").append(resultSet.getInt("order_id")).append("\n");
            message.append("Mobile No: ").append(resultSet.getString("mobile_no")).append("\n");
            message.append("Email: ").append(resultSet.getString("email")).append("\n");
            message.append("Status: ").append(resultSet.getString("personal_status")).append("\n");
            message.append("------------------------------\n");
        }

        if (message.toString().equals("All Delivery Personnel:\n\n")) {
            JOptionPane.showMessageDialog(this, "No delivery personnel found.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JTextArea textArea = new JTextArea(message.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new java.awt.Dimension(400, 300));
            JOptionPane.showMessageDialog(this, scrollPane, "All Personals", JOptionPane.INFORMATION_MESSAGE);
        }

        resultSet.close();
        preparedStatement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_AllPersonalsButtonActionPerformed

    private void RecentlyAddedPersonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecentlyAddedPersonalButtonActionPerformed
                                                            
    try {
        String sql = "SELECT * FROM deliverypersonal ORDER BY id DESC LIMIT 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            StringBuilder message = new StringBuilder("Most Recent Delivery Personal:\n");
            message.append("ID: ").append(resultSet.getInt("id")).append("\n");
            message.append("Name: ").append(resultSet.getString("personal_name")).append("\n");
            message.append("Order ID: ").append(resultSet.getInt("order_id")).append("\n");
            message.append("Mobile No: ").append(resultSet.getString("mobile_no")).append("\n");
            message.append("Email: ").append(resultSet.getString("email")).append("\n");
            message.append("Status: ").append(resultSet.getString("personal_status")).append("\n");

            JTextArea textArea = new JTextArea(message.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new java.awt.Dimension(400, 200));
            JOptionPane.showMessageDialog(this, scrollPane, "Most Recent Personal", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No delivery personnel found.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

        resultSet.close();
        preparedStatement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_RecentlyAddedPersonalButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new TrackOrderPage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllPersonalsButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton RecentlyAddedPersonalButton;
    private javax.swing.JLabel ViewPersonalDscrpTxt;
    private javax.swing.JLabel ViewPersonalTxt;
    // End of variables declaration//GEN-END:variables
}
