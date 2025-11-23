package cakeordermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class WelcomePage extends javax.swing.JFrame 
{
    private Connection connection;
    
    public WelcomePage() 
    {
        initComponents();
        connectDatabase();
    }
    
     private void connectDatabase() 
    {
        try 
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakebliss", "root", "(simaabmalik)@23"); // Update password if needed
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "Database connection failed: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YourOneStopTxt = new javax.swing.JLabel();
        welcomeTxt = new javax.swing.JLabel();
        CakeBlissTxt = new javax.swing.JLabel();
        IndulgeTxt = new javax.swing.JLabel();
        ExploreTxt = new javax.swing.JLabel();
        ClickcontinueTxt = new javax.swing.JLabel();
        ContinueButton = new javax.swing.JButton();
        BackgroundPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        YourOneStopTxt.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        YourOneStopTxt.setForeground(new java.awt.Color(204, 204, 204));
        YourOneStopTxt.setText("-- Your One-Stop Cake Ordering Solution!");
        getContentPane().add(YourOneStopTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 290, 60));

        welcomeTxt.setFont(new java.awt.Font("Vivaldi", 3, 48)); // NOI18N
        welcomeTxt.setForeground(new java.awt.Color(204, 204, 204));
        welcomeTxt.setText("Welcome To -");
        getContentPane().add(welcomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 280, 60));

        CakeBlissTxt.setFont(new java.awt.Font("Vivaldi", 3, 54)); // NOI18N
        CakeBlissTxt.setForeground(new java.awt.Color(204, 204, 204));
        CakeBlissTxt.setText("Cake Bliss");
        getContentPane().add(CakeBlissTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 240, 80));

        IndulgeTxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        IndulgeTxt.setForeground(new java.awt.Color(204, 204, 204));
        IndulgeTxt.setText("Indulge in a delightful assortment of cakes for every occasion.");
        getContentPane().add(IndulgeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 40));

        ExploreTxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        ExploreTxt.setForeground(new java.awt.Color(204, 204, 204));
        ExploreTxt.setText("Explore out menu, place your orders, and enjoy hassle-free management with");
        getContentPane().add(ExploreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 480, 30));

        ClickcontinueTxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        ClickcontinueTxt.setForeground(new java.awt.Color(204, 204, 204));
        ClickcontinueTxt.setText("Cake Bliss.  Click 'Continue' to get started!");
        getContentPane().add(ClickcontinueTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, 30));

        ContinueButton.setBackground(new java.awt.Color(102, 51, 0));
        ContinueButton.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        ContinueButton.setForeground(new java.awt.Color(204, 204, 204));
        ContinueButton.setText("Continue ");
        ContinueButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ContinueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 180, 50));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome.jpg"))); // NOI18N
        BackgroundPic.setText("jLabel5");
        getContentPane().add(BackgroundPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonActionPerformed
        new AdminCustomerPage(connection).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ContinueButtonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel CakeBlissTxt;
    private javax.swing.JLabel ClickcontinueTxt;
    private javax.swing.JButton ContinueButton;
    private javax.swing.JLabel ExploreTxt;
    private javax.swing.JLabel IndulgeTxt;
    private javax.swing.JLabel YourOneStopTxt;
    private javax.swing.JLabel welcomeTxt;
    // End of variables declaration//GEN-END:variables
}
