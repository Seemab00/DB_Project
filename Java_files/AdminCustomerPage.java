package cakeordermanagementsystem;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdminCustomerPage extends javax.swing.JFrame 
{
    private Connection connection;

    public AdminCustomerPage() {
        createConnection();
        initComponents();
    }

    public AdminCustomerPage(Connection connection) {
        this.connection = connection;
        initComponents();
    }
    
    private void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Connection Failed: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CakeBlissLogoTxt = new javax.swing.JLabel();
        LoginAsTxt = new javax.swing.JLabel();
        AdminButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();
        BackgroundPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CakeBlissLogoTxt.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        CakeBlissLogoTxt.setForeground(new java.awt.Color(204, 204, 204));
        CakeBlissLogoTxt.setText("Cake Bliss");
        getContentPane().add(CakeBlissLogoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        LoginAsTxt.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        LoginAsTxt.setForeground(new java.awt.Color(204, 204, 204));
        LoginAsTxt.setText("Login As ");
        getContentPane().add(LoginAsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        AdminButton.setBackground(new java.awt.Color(102, 51, 0));
        AdminButton.setFont(new java.awt.Font("Vivaldi", 1, 22)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(204, 204, 204));
        AdminButton.setText("Admin");
        AdminButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 60));

        CustomerButton.setBackground(new java.awt.Color(102, 51, 0));
        CustomerButton.setFont(new java.awt.Font("Vivaldi", 1, 22)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        CustomerButton.setText("Customer");
        CustomerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 160, 60));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome.jpg"))); // NOI18N
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        new SignupPage(connection).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        new LoginPage(connection).setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_AdminButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCustomerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel CakeBlissLogoTxt;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JLabel LoginAsTxt;
    // End of variables declaration//GEN-END:variables
}
