/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcarereportsystem;

import static healthcarereportsystem.HealthCareReportSystem.goKlickedPage;
<<<<<<< HEAD
import javax.swing.JLabel;
=======
import static healthcarereportsystem.HealthCareReportSystem.profileName;
>>>>>>> parent of 98b575a... fetch part in DoctorSignIn to DoctorProfile Showed

/**
 *
 * @author pc
 */
public class DoctorProfile extends javax.swing.JFrame{

    /**
     * Creates new form DoctorProfile
     */
    public DoctorProfile() {
        initComponents();
        doctorNameShow.setText(profileName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorNameShow = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sendTest = new javax.swing.JButton();
        sendPrescription = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        doctorNameShow.setText("Doctor Name");

        jButton1.setText("Details");

        sendTest.setText("Send Test");
        sendTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendTestActionPerformed(evt);
            }
        });

        sendPrescription.setText("Send Prescription");
        sendPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPrescriptionActionPerformed(evt);
            }
        });

        jButton4.setText("Back");

        home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendPrescription)
                    .addComponent(sendTest))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(doctorNameShow, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(doctorNameShow)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(57, 57, 57)
                .addComponent(sendTest)
                .addGap(35, 35, 35)
                .addComponent(sendPrescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(home))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        StartPage st = new StartPage();
        goKlickedPage(this,st);
    }//GEN-LAST:event_homeActionPerformed

    private void sendTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendTestActionPerformed
        // TODO add your handling code here:
          SendTest field = new SendTest();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sendTestActionPerformed

    private void sendPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPrescriptionActionPerformed
        // TODO add your handling code here:
         SendPrescription field = new SendPrescription();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sendPrescriptionActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doctorNameShow;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton sendPrescription;
    private javax.swing.JButton sendTest;
    // End of variables declaration//GEN-END:variables
}
