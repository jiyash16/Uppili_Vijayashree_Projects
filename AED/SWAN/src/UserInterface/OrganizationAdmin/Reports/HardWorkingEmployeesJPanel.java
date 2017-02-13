/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganizationAdmin.Reports;

import Business.DateUtils;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Person.Employee;
import Business.TimeSheet.TimeSheet;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class HardWorkingEmployeesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HardWorkingEmployeesJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Organization organization;
    public HardWorkingEmployeesJPanel(JPanel userProcessContainer, Enterprise enterprise,Organization organization) {
        initComponents();
                this.userProcessContainer = userProcessContainer;
                this.enterprise = enterprise;
                this.organization = organization;
                 populateTable();
    }
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblTimesheet.getModel();
        dtm.setRowCount(0);
        Date date = new Date();
         Object[] row = new Object[3];
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(o instanceof PatientOrganization)
            {
                
            }
            else
            {
                for(Employee e: o.getEmployeeDirectory().getEmployeeList())
                {
                    boolean flag = false;
                    int duration = 0;
                    for(TimeSheet ts : e.getTimeSheetDirectory().getTimesheetDirectory())
                    {
                         
                        if(DateUtils.isToday(ts.getToday()))
                        {
                           flag = true;
                           duration = ts.getDuration();
                           break; 
                        }
                    
                    }
                    if(flag)
                    {
                         if(duration <6)
                         {
                             row[0] = e;
                              row[1]= duration;
                             row[2] = "Half Day";
                            dtm.addRow(row);
                         }
                         else if(duration >= 6  && duration <=8)
                         {
                                row[0] = e;
                              row[1]= duration;
                             row[2] = "full Day";
                            dtm.addRow(row);
                         }
                         else
                         {
                                row[0] = e;
                              row[1]= duration;
                             row[2] = "OverTime";
                            dtm.addRow(row);
                         }
                    }
                    else
                    {
                             row[0] = e;
                              row[1]= duration;
                             row[2] = "Absent";
                        dtm.addRow(row);
                    }
                }
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTimesheet = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Efficiency");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 320, 40));

        tblTimesheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Total Hours", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTimesheet);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 110, 510, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTimesheet;
    // End of variables declaration//GEN-END:variables
}
