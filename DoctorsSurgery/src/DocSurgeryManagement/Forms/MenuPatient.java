/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocSurgeryManagement.Forms;

import javax.swing.JOptionPane;

/**
 *
 * @author C-bre
 */
public class MenuPatient extends javax.swing.JFrame {

    /**
     * Creates new form UserDetails
     */
    public MenuPatient() {
        initComponents();
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
        T_Role = new javax.swing.JTextField();
        T_Name1 = new javax.swing.JTextField();
        T_Address = new javax.swing.JTextField();
        T_Age = new javax.swing.JTextField();
        T_Sex = new javax.swing.JTextField();
        B_BookAppointment = new javax.swing.JButton();
        B_ViewAppointment = new javax.swing.JButton();
        B_ViewPrescriptions = new javax.swing.JButton();
        B_ViewHistory = new javax.swing.JButton();
        B_ViewDoctors = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        B_TerminateAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        T_UserID.setEditable(false);
        T_UserID.setBackground(new java.awt.Color(255, 255, 255));
        T_UserID.setText("UserID");
        T_UserID.setName("T_UserID"); // NOI18N
        T_UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_UserIDActionPerformed(evt);
            }
        });

        T_Role.setEditable(false);
        T_Role.setBackground(new java.awt.Color(255, 255, 255));
        T_Role.setText("Role");
        T_Role.setName("T_Role"); // NOI18N
        T_Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_RoleActionPerformed(evt);
            }
        });

        T_Name1.setEditable(false);
        T_Name1.setBackground(new java.awt.Color(255, 255, 255));
        T_Name1.setText("Name");
        T_Name1.setName("T_Name"); // NOI18N
        T_Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_Name1ActionPerformed(evt);
            }
        });

        T_Address.setEditable(false);
        T_Address.setBackground(new java.awt.Color(255, 255, 255));
        T_Address.setText("Address");
        T_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_AddressActionPerformed(evt);
            }
        });

        T_Age.setEditable(false);
        T_Age.setBackground(new java.awt.Color(255, 255, 255));
        T_Age.setText("Age");

        T_Sex.setEditable(false);
        T_Sex.setBackground(new java.awt.Color(255, 255, 255));
        T_Sex.setText("Sex");
        T_Sex.setToolTipText("");

        B_BookAppointment.setText("Book Appointment");
        B_BookAppointment.setToolTipText("");
        B_BookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BookAppointmentActionPerformed(evt);
            }
        });

        B_ViewAppointment.setText("View Appointments");
        B_ViewAppointment.setToolTipText("");
        B_ViewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ViewAppointmentActionPerformed(evt);
            }
        });

        B_ViewPrescriptions.setText("View Prescriptions");
        B_ViewPrescriptions.setToolTipText("");
        B_ViewPrescriptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ViewPrescriptionsActionPerformed(evt);
            }
        });

        B_ViewHistory.setText("View History");
        B_ViewHistory.setToolTipText("");
        B_ViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ViewHistoryActionPerformed(evt);
            }
        });

        B_ViewDoctors.setText("View Doctors");
        B_ViewDoctors.setToolTipText("");
        B_ViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ViewDoctorsActionPerformed(evt);
            }
        });

        B_Logout.setText("Logout");
        B_Logout.setToolTipText("");
        B_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LogoutActionPerformed(evt);
            }
        });

        B_TerminateAccount.setText("Terminate Account");
        B_TerminateAccount.setToolTipText("");
        B_TerminateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_TerminateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(T_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T_UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(T_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_BookAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_ViewAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_ViewPrescriptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_ViewHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_TerminateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(B_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_ViewDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_BookAppointment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_ViewAppointment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_ViewPrescriptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_ViewHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_ViewDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47)
                        .addComponent(B_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_TerminateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T_UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(T_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(T_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(T_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(T_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(T_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_UserIDActionPerformed

    private void T_Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_Name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_Name1ActionPerformed

    private void T_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_AddressActionPerformed

    private void T_RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_RoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_RoleActionPerformed

    private void B_ViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ViewHistoryActionPerformed
        dispose();
        PatientHistory c = new PatientHistory();
        c.setVisible(true);
    }//GEN-LAST:event_B_ViewHistoryActionPerformed

    private void B_TerminateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_TerminateAccountActionPerformed
        JOptionPane.showMessageDialog(null, "Your Account will be deleted within 24 hours", null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_B_TerminateAccountActionPerformed

    private void B_ViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ViewDoctorsActionPerformed
        dispose();
        ViewDoctors c = new ViewDoctors();
        c.setVisible(true);
    }//GEN-LAST:event_B_ViewDoctorsActionPerformed

    private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LogoutActionPerformed
        dispose();
        Login c = new Login();
        c.setVisible(true);
    }//GEN-LAST:event_B_LogoutActionPerformed

    private void B_BookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BookAppointmentActionPerformed
        dispose();
        BookAppointment c = new BookAppointment();
        c.setVisible(true);
    }//GEN-LAST:event_B_BookAppointmentActionPerformed

    private void B_ViewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ViewAppointmentActionPerformed
        dispose();
        ViewAppointments c = new ViewAppointments();
        c.setVisible(true);
    }//GEN-LAST:event_B_ViewAppointmentActionPerformed

    private void B_ViewPrescriptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ViewPrescriptionsActionPerformed
        dispose();
        Prescriptions c = new Prescriptions();
        c.setVisible(true);
    }//GEN-LAST:event_B_ViewPrescriptionsActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_BookAppointment;
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton B_TerminateAccount;
    private javax.swing.JButton B_ViewAppointment;
    private javax.swing.JButton B_ViewDoctors;
    private javax.swing.JButton B_ViewHistory;
    private javax.swing.JButton B_ViewPrescriptions;
    private javax.swing.JTextField T_Address;
    private javax.swing.JTextField T_Age;
    private javax.swing.JTextField T_Name1;
    private javax.swing.JTextField T_Role;
    private javax.swing.JTextField T_Sex;
    private javax.swing.JTextField T_UserID;
    // End of variables declaration//GEN-END:variables
}