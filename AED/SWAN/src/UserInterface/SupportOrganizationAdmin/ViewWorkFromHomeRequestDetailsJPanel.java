/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupportOrganizationAdmin;


import UserInterface.OrganizationAdmin.*;
import UserInterface.UserAccountManagement.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Validate;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.WorkFromHomeWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.qt.datapicker.DatePicker;
import java.awt.CardLayout;
import java.awt.Color;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import javax.swing.JPanel;



/**
 *
 * @author Jiya
 */
public class ViewWorkFromHomeRequestDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    JPanel userProcessContainer;
    
    SimpleDateFormat sdf;
    WorkFromHomeWorkRequest request;
   
    public ViewWorkFromHomeRequestDetailsJPanel(JPanel userProcessContainer, WorkFromHomeWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        
       sdf = new SimpleDateFormat("dd/MM/yyyy");
       populateForm();
      
    }
    public void populateForm()
    {
        
            
            txtWFHDate.setText(sdf.format(request.getWfhDate()));
            txtFirstName.setText(request.getSender().getEmployee().getFirstName());
            txtLastName.setText(request.getSender().getEmployee().getLastName());
            txtIP.setText(request.getIp());
         
            txtDuration.setText(String.valueOf(request.getDuration()));
            txtReason.setText(request.getMessage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblswan = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        lblFirstName2 = new javax.swing.JLabel();
        lblFirstName4 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtWFHDate = new ObservingTextField();
        txtDuration = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblssn = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        lblssn1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblswan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblswan.setForeground(new java.awt.Color(255, 255, 255));
        lblswan.setText("Request Details");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 230, 50));

        lblDuration.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(255, 255, 255));
        lblDuration.setText("<html>Duration <font color = red>*</font></html>");
        add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, 20));

        lblFirstName1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName1.setText("<html>First Name <font color = red>*</font></html>");
        add(lblFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        lblFirstName2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName2.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName2.setText("<html>Last Name <font color = red>*</font></html>");
        add(lblFirstName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        lblFirstName4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName4.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName4.setText("<html>WorkFromHome Date<font color = red>*</font></html>");
        add(lblFirstName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 20));

        txtFirstName.setEnabled(false);
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 140, 30));

        txtWFHDate.setEnabled(false);
        add(txtWFHDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 140, 30));

        txtDuration.setEnabled(false);
        add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 140, 30));

        txtLastName.setEnabled(false);
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        lblssn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblssn.setForeground(new java.awt.Color(255, 255, 255));
        lblssn.setText("<html>Reason <font color = red>*</font></html>");
        add(lblssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, 30));

        txtReason.setEnabled(false);
        add(txtReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 140, 30));

        txtIP.setEnabled(false);
        add(txtIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 140, 30));

        lblssn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblssn1.setForeground(new java.awt.Color(255, 255, 255));
        lblssn1.setText("<html>IP <font color = red>*</font></html>");
        add(lblssn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 30, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("hours");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
         CardLayout cl = (CardLayout) userProcessContainer.getLayout();
         cl.previous(userProcessContainer);
        

    
    }//GEN-LAST:event_btnBackActionPerformed
    private Locale getLocale(String lang) {
     
     if(lang !=null && lang.length() >0)
     {
         return new Locale(lang);
     }
     else
     {
         
             return Locale.US;
     }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblFirstName2;
    private javax.swing.JLabel lblFirstName4;
    private javax.swing.JLabel lblssn;
    private javax.swing.JLabel lblssn1;
    private javax.swing.JLabel lblswan;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtReason;
    private ObservingTextField txtWFHDate;
    /*
    private javax.swing.JTextField txtWFHDate;
    */
    // End of variables declaration//GEN-END:variables

   
}
