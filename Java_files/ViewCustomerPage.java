package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ViewCustomerPage extends javax.swing.JFrame {

    private Connection connection;

    public ViewCustomerPage(Connection connection) {
        initComponents();
        this.connection = connection;
        setLocationRelativeTo(null);
    }

    public ViewCustomerPage() {
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
        ViewCustomerTxt = new javax.swing.JLabel();
        ViewCustomerDscrpTxt = new javax.swing.JLabel();
        RecentlyAddedCustomerButton = new javax.swing.JButton();
        AllCustomersButton = new javax.swing.JButton();
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

        ViewCustomerTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        ViewCustomerTxt.setForeground(new java.awt.Color(204, 204, 204));
        ViewCustomerTxt.setText("View Customer");
        getContentPane().add(ViewCustomerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        ViewCustomerDscrpTxt.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        ViewCustomerDscrpTxt.setForeground(new java.awt.Color(204, 204, 204));
        ViewCustomerDscrpTxt.setText("For Viewing the customer's information, choose one option");
        getContentPane().add(ViewCustomerDscrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        RecentlyAddedCustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        RecentlyAddedCustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        RecentlyAddedCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        RecentlyAddedCustomerButton.setText("Recently Added Customer");
        RecentlyAddedCustomerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        RecentlyAddedCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecentlyAddedCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RecentlyAddedCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 270, 50));

        AllCustomersButton.setBackground(new java.awt.Color(102, 51, 0));
        AllCustomersButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        AllCustomersButton.setForeground(new java.awt.Color(204, 204, 204));
        AllCustomersButton.setText("All Customers");
        AllCustomersButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AllCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllCustomersButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AllCustomersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 150, 50));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminBackground.png"))); // NOI18N
        BackgroundPic.setText("jLabel1");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        CustomerAccessPage customerAccessPage = new CustomerAccessPage(connection);
        customerAccessPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void RecentlyAddedCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecentlyAddedCustomerButtonActionPerformed

    try {
        String sql = "SELECT * FROM customer ORDER BY customer_id DESC LIMIT 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String customerDetails = "Recently Added Customer Details:\n"
                    + "Customer ID: " + resultSet.getInt("customer_id") + "\n"
                    + "Name: " + resultSet.getString("name") + "\n"
                    + "Username: " + resultSet.getString("username") + "\n"
                    + "Email: " + resultSet.getString("email") + "\n"
                    + "Mobile No: " + resultSet.getString("mobile_no");

            JTextArea textArea = new JTextArea(customerDetails);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            JOptionPane.showMessageDialog(this, scrollPane, "Recently Added Customer", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No customers found.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

        resultSet.close();
        preparedStatement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_RecentlyAddedCustomerButtonActionPerformed

    private void AllCustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllCustomersButtonActionPerformed

    try {
        String sql = "SELECT * FROM customer";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        StringBuilder allCustomers = new StringBuilder("All Customers Details:\n\n");
        while (resultSet.next()) {
            allCustomers.append("Customer ID: ").append(resultSet.getInt("customer_id")).append("\n");
            allCustomers.append("Name: ").append(resultSet.getString("name")).append("\n");
            allCustomers.append("Username: ").append(resultSet.getString("username")).append("\n");
            allCustomers.append("Email: ").append(resultSet.getString("email")).append("\n");
            allCustomers.append("Mobile No: ").append(resultSet.getString("mobile_no")).append("\n\n");
        }

        if (allCustomers.toString().equals("All Customers Details:\n\n")) {
            JOptionPane.showMessageDialog(this, "No customers found.", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JTextArea textArea = new JTextArea(allCustomers.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            JOptionPane.showMessageDialog(this, scrollPane, "All Customers", JOptionPane.INFORMATION_MESSAGE);
        }

        resultSet.close();
        preparedStatement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_AllCustomersButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establishes the database connection.
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
                // Passes the connection to the constructor.
                new ViewCustomerPage(conn).setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
                System.exit(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllCustomersButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JButton RecentlyAddedCustomerButton;
    private javax.swing.JLabel ViewCustomerDscrpTxt;
    private javax.swing.JLabel ViewCustomerTxt;
    // End of variables declaration//GEN-END:variables
}
