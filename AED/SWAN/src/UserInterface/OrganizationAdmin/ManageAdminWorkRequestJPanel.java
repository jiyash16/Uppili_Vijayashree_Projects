/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganizationAdmin;

import UserInterface.EnterpriseAdmin.*;
import UserInterface.SystemAdmin.*;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class ManageAdminWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkRequestJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    public ManageAdminWorkRequestJPanel(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
       // System.out.println("Organization name" + organization.getName());
       populateTable();
    }
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel)tblAdminWorkrequest.getModel();
        
        model.setRowCount(0);
       //  System.out.println("organization wr" + organization.getWorkQueue().getWorkRequestList().size());
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
          if(request.getStatus().equalsIgnoreCase("Pending Approval"))
          {
            Object[] row = new Object[5];
          
            row[1] = request;
            if(request.getSender() == null)
            {
                row[2] = "Patient";
            }
            else
            {
                 row[2] = request.getSender().getEmployee();
            }
            row[3] = request.getMessage();
            row[4] = request.getStatus();
            
            model.addRow(row);
          }
        }
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdminWorkrequest = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnview = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage WorkRequest");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 170, 40));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        tblAdminWorkrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Action", "Request", "Sender", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAdminWorkrequest);
        if (tblAdminWorkrequest.getColumnModel().getColumnCount() > 0) {
            tblAdminWorkrequest.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 580, 260));

        btnReject.setBackground(new java.awt.Color(255, 102, 102));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 100, -1));

        btnApprove.setBackground(new java.awt.Color(255, 102, 102));
        btnApprove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        btnview.setBackground(new java.awt.Color(255, 102, 102));
        btnview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("View Request Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm = (DefaultTableModel) tblAdminWorkrequest.getModel();
        int rowcount = dtm.getRowCount();
        try
        {
        
        for(int i = 0; i <= rowcount ; i++)
        {
          //  System.out.println("row"+i +" selected value" + tblAdminWorkrequest.getValueAt(i, 0));
            WorkRequest wr =(WorkRequest) tblAdminWorkrequest.getValueAt(i, 1);
             String status = (String)tblAdminWorkrequest.getValueAt(i, 4);
          //  Component c = tblAdminWorkrequest.findComponentAt(i, 1);
           Object chkbox = tblAdminWorkrequest.getValueAt(i, 0);
             
            if(chkbox != null && chkbox.equals(true) && status.equalsIgnoreCase("Pending Approval"))
            {
           
              //  c.setEnabled(true);
                 wr.setStatus("Rejected");
            }
         
        }
        }
        catch(Exception e)
        {
            
        }
      //  JOptionPane.showMessageDialog(null,"WorkRequest Rejected");
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblAdminWorkrequest.getSelectedRow();
        if(selectedrow <0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row","Information",1);
            return;
        }
        WorkRequest request = (WorkRequest) tblAdminWorkrequest.getValueAt(selectedrow, 1);
          ViewRequestDetailsJPanel viewRequestDetails = new ViewRequestDetailsJPanel(userProcessContainer, request,"patient");
        userProcessContainer.add("ViewRequestDetailsJPanel", viewRequestDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) tblAdminWorkrequest.getModel();
        int rowcount = dtm.getRowCount();
      //  System.out.println("rowcount"+rowcount);
        try
        {
        
        for(int i = 0; i < rowcount ; i++)
        {
         //   System.out.println("row"+i +" selected value" + tblAdminWorkrequest.getValueAt(i, 0));
            WorkRequest wr =(WorkRequest) tblAdminWorkrequest.getValueAt(i, 1);
             //Component c = tblAdminWorkrequest.findComponentAt(i, 1);
             String status = (String)tblAdminWorkrequest.getValueAt(i, 4);
             Object chkbox = tblAdminWorkrequest.getValueAt(i, 0);
             
            if(chkbox != null && chkbox.equals(true) && status.equalsIgnoreCase("Pending Approval"))
            {
                if(wr instanceof PatientWorkRequest)
                {
                    for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
                    {
                        if(org instanceof PatientOrganization)
                        {
                            wr.setStatus("Approved");
                             Patient patient = org.getPatientDirectory().createPatient();
                            patient.setDOB(((PatientWorkRequest) wr).getDOB());
                            patient.setFirstName(((PatientWorkRequest) wr).getFirstName());
                            patient.setLastName(((PatientWorkRequest) wr).getLastName());
                            patient.setIsPatient(true);
                            patient.setPhone(((PatientWorkRequest) wr).getPhone());
                            patient.setSsn(((PatientWorkRequest) wr).getSsn());
                        }
                    } 
                   //  tblAdminWorkrequest.setCellSelectionEnabled(false);
                    
                    // c.setEnabled(false);
                     
                }
            }
            else
            {
               // System.out.println("in else");
            }
         
        }
        }
        catch(Exception exp)
         {
                
         }
        
        //JOptionPane.showMessageDialog(null,"WorkRequest Approved");
        populateTable();
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdminWorkrequest;
    // End of variables declaration//GEN-END:variables
}
