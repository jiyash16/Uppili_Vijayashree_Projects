/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.UserAccountManagement.TimesheetJPanel;
import UserInterface.UserAccountManagement.ViewUpdatePersonDetailsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    DoctorOrganization organization;
    Enterprise enterprise;
    int wfh;
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise,int wfh) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.wfh=wfh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnServeMyWorkRequest = new javax.swing.JButton();
        btnTmeSheet = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnServeWorkRequest1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor WorkArea");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 170, 40));

        btnServeMyWorkRequest.setBackground(new java.awt.Color(255, 153, 0));
        btnServeMyWorkRequest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnServeMyWorkRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnServeMyWorkRequest.setText("<html><Center><h3>Serve</h3><h3>My WorkRequest</h3><Center><html>");
        btnServeMyWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeMyWorkRequestActionPerformed(evt);
            }
        });
        add(btnServeMyWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 140, 110));

        btnTmeSheet.setBackground(new java.awt.Color(255, 153, 153));
        btnTmeSheet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTmeSheet.setForeground(new java.awt.Color(255, 255, 255));
        btnTmeSheet.setText("<html><Center><h3>Timesheet</h3><Center><html>");
        btnTmeSheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTmeSheetActionPerformed(evt);
            }
        });
        add(btnTmeSheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 140, 220));

        btnProfile.setBackground(new java.awt.Color(0, 51, 204));
        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("<html><Center><h3>Update</h3><h3>Profile</h3><Center><html>");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 280, 110));

        btnServeWorkRequest1.setBackground(new java.awt.Color(0, 204, 51));
        btnServeWorkRequest1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnServeWorkRequest1.setForeground(new java.awt.Color(255, 255, 255));
        btnServeWorkRequest1.setText("<html><Center><h3>Serve</h3><h3>WorkRequest</h3><Center><html>");
        btnServeWorkRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeWorkRequest1ActionPerformed(evt);
            }
        });
        add(btnServeWorkRequest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void btnServeMyWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServeMyWorkRequestActionPerformed
        // TODO add your handling code here:
        ServeMyWorkRequestJPanel doctorMyWorkRequestJPanel = new ServeMyWorkRequestJPanel(userProcessContainer, userAccount,organization);
        userProcessContainer.add("ServeMyWorkRequestJPanel",doctorMyWorkRequestJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnServeMyWorkRequestActionPerformed

    private void btnTmeSheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTmeSheetActionPerformed
        // TODO add your handling code here:
         TimesheetJPanel timesheetDoctorJPanel = new TimesheetJPanel(userProcessContainer,userAccount,0);
        userProcessContainer.add("TimesheetDoctorJPanel",timesheetDoctorJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);

    }//GEN-LAST:event_btnTmeSheetActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        ViewUpdatePersonDetailsJPanel viewUpdateNurse = new ViewUpdatePersonDetailsJPanel(userProcessContainer,userAccount.getEmployee(),userAccount, "employee","edit",wfh);
        userProcessContainer.add("ViewUpdatePersonDetailsJPanel",viewUpdateNurse);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnServeWorkRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServeWorkRequest1ActionPerformed
        // TODO add your handling code here:
            DoctorWorkRequestJPanel doctorWorkRequestJPanel = new DoctorWorkRequestJPanel(userProcessContainer, userAccount,organization);
        userProcessContainer.add("DoctorWorkRequestJPanel",doctorWorkRequestJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
        
    }//GEN-LAST:event_btnServeWorkRequest1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnServeMyWorkRequest;
    private javax.swing.JButton btnServeWorkRequest1;
    private javax.swing.JButton btnTmeSheet;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
