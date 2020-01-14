/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocSurgeryManagement.Forms;

import DocSurgeryManagement.DataManager;
import static DocSurgeryManagement.DataManager.initializeDataManager;
import DocSurgeryManagement.Patient;
import DocSurgeryManagement.UserInfo;
import javax.swing.JOptionPane;

/**
 *
 * @author C-bre
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        // start data manager
        initializeDataManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T_UserID = new javax.swing.JTextField();
        B_Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        B_Register = new javax.swing.JButton();
        T_UserPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        T_UserID.setText("Enter User ID");

        B_Login.setText("Login");
        B_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LoginActionPerformed(evt);
            }
        });

        jLabel1.setText("User ID");

        B_Register.setText("Register");
        B_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RegisterActionPerformed(evt);
            }
        });

        T_UserPassword.setText("Enter Password ID");

        jLabel2.setText("User Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(T_UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(B_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(T_UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(T_UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Login)
                    .addComponent(B_Register))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LoginActionPerformed
        String UserID = T_UserID.getText();
        String UserPassword = T_UserPassword.getText();
        
        //Check password length
        if (!(UserID.length() >= 4 && UserID.length() <= 16)) {
            JOptionPane.showMessageDialog(null, 
                "Password should be between 4 and 16 characters long.", 
                "Register Error", 
                JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        UserInfo userFound = DataManager.UserFindByID(UserID);
        
        //Go to relevent page dependent on user info e.g. "PATIENT"
        if (userFound != null && userFound.getPassword().equals(UserPassword)) {
                
            switch (userFound.getType())
            {
                case "ADMIN":
                {
                    MenuAdmin c = new MenuAdmin();
                    c.setVisible(true);
                }
                break;
                case "SECRETARY":
                {
                    MenuSecretary c = new MenuSecretary();
                    c.setVisible(true);
                }
                break;
                case "DOCTOR":
                {
                    MenuDoctor c = new MenuDoctor();
                    c.setVisible(true);
                }
                break;
                case "PATIENT":
                {
                    MenuPatient c = new MenuPatient();
                    c.setVisible(true);
                }
                break;
            }
            
            this.dispose();
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Message: You have entered either the wrong username or password. Please try again", "MESSAGE TITLE", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_B_LoginActionPerformed
 
    private void B_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RegisterActionPerformed
        dispose();
        CreateAccount c = new CreateAccount();
        c.setVisible(true);
    }//GEN-LAST:event_B_RegisterActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Login;
    private javax.swing.JButton B_Register;
    private javax.swing.JTextField T_UserID;
    private javax.swing.JTextField T_UserPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
