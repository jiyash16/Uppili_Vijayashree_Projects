/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Nurse;

import Business.Claims.Claim;
import Business.Person.Patient;
import Business.PersonInsurance.InsurancePolicy;
import Business.PersonInsurance.InsurancePolicy.InsuranceType;
import Business.Validate;
import UserInterface.UserAccountManagement.ObservingTextField;
import com.qt.datapicker.DatePicker;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class ViewInsuranceDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewInsuranceDetailsJPanel
     */
     JPanel userProcessContainer;
    Patient patient;
    SimpleDateFormat sdf;
    public ViewInsuranceDetailsJPanel(JPanel userProcessContainer, Patient p) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.patient = p;
        populateTable();
        AddInsurancePanel.setVisible(false);
    }
    public void populateTable()
    {
         DefaultTableModel model = (DefaultTableModel) tblInsurance.getModel();
       
        model.setRowCount(0);
        for(InsurancePolicy ip : patient.getInsurancePolicyDirectory().getInsurancePolicyDirectory())
        {
           
                Object[] row = new Object[4];
                row[0] = ip;
                 row[1] = ip.getPolicyName();
                 row[2] = sdf.format(ip.getEffectiveDate());
                 if(ip.isIsActive())
                 {
                    row[3] = "Active";
                 }
                 else
                    row[3] = "InActive"; 

                    model.addRow(row);
            }
        
    }
public void populateInsuranceType()
{
    cmbInsuranceType.removeAllItems();
    
    for(InsuranceType type: InsuranceType.values())
    {
        cmbInsuranceType.addItem(type);
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
        lblswan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInsurance = new javax.swing.JTable();
        btnAddInsurance = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        AddInsurancePanel = new javax.swing.JPanel();
        lblAddOrganization2 = new javax.swing.JLabel();
        btnSave2 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnUpdateSave = new javax.swing.JButton();
        lblPolicyName = new javax.swing.JLabel();
        txtPolicyName = new javax.swing.JTextField();
        lblInsuranceId = new javax.swing.JLabel();
        lblGroupNumber = new javax.swing.JLabel();
        txtGroupNumber = new javax.swing.JTextField();
        lblPolicyNumber = new javax.swing.JLabel();
        txtInsuranceID = new javax.swing.JTextField();
        lblOrganizationType1 = new javax.swing.JLabel();
        cmbInsuranceType = new javax.swing.JComboBox();
        txtPolicyNumber = new javax.swing.JTextField();
        txtEffectiveDate = new ObservingTextField();
        btnDatePicker = new javax.swing.JButton();
        lblEffectiveDate = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        lblswan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblswan.setForeground(new java.awt.Color(255, 255, 255));
        lblswan.setText("Insurance Details");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 230, 50));

        tblInsurance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Policy Number", "Policy Name", "Effective Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInsurance);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 80, 620, 130));

        btnAddInsurance.setBackground(new java.awt.Color(255, 102, 102));
        btnAddInsurance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddInsurance.setForeground(new java.awt.Color(255, 255, 255));
        btnAddInsurance.setText("Add Insurance");
        btnAddInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInsuranceActionPerformed(evt);
            }
        });
        add(btnAddInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, -1));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Insurance");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 150, -1));

        btnView.setBackground(new java.awt.Color(255, 102, 102));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View Insurance");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, -1));

        AddInsurancePanel.setOpaque(false);
        AddInsurancePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddOrganization2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddOrganization2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddOrganization2.setText("Insurance Details");
        AddInsurancePanel.add(lblAddOrganization2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, -1));

        btnSave2.setBackground(new java.awt.Color(255, 102, 102));
        btnSave2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave2.setForeground(new java.awt.Color(255, 255, 255));
        btnSave2.setText("Save");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });
        AddInsurancePanel.add(btnSave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        AddInsurancePanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 60, -1));

        btnUpdateSave.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdateSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateSave.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSave.setText("Save");
        btnUpdateSave.setEnabled(false);
        btnUpdateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSaveActionPerformed(evt);
            }
        });
        AddInsurancePanel.add(btnUpdateSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        lblPolicyName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPolicyName.setForeground(new java.awt.Color(255, 255, 255));
        lblPolicyName.setText("<html>Policy Name <font color = red>*</font></html>");
        AddInsurancePanel.add(lblPolicyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        txtPolicyName.setEnabled(false);
        AddInsurancePanel.add(txtPolicyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 160, 30));

        lblInsuranceId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInsuranceId.setForeground(new java.awt.Color(255, 255, 255));
        lblInsuranceId.setText("<html>Insurance ID <font color = red>*</font></html>");
        AddInsurancePanel.add(lblInsuranceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblGroupNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGroupNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblGroupNumber.setText("<html>Group Number <font color = red>*</font></html>");
        AddInsurancePanel.add(lblGroupNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 30));

        txtGroupNumber.setEnabled(false);
        AddInsurancePanel.add(txtGroupNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 30));

        lblPolicyNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPolicyNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPolicyNumber.setText("<html>Policy Number <font color = red>*</font></html>");
        AddInsurancePanel.add(lblPolicyNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 30));

        txtInsuranceID.setEnabled(false);
        AddInsurancePanel.add(txtInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 160, 30));

        lblOrganizationType1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationType1.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationType1.setText("<html>Policy Type  <font color = red>*</font></html>");
        AddInsurancePanel.add(lblOrganizationType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        cmbInsuranceType.setEnabled(false);
        cmbInsuranceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInsuranceTypeActionPerformed(evt);
            }
        });
        AddInsurancePanel.add(cmbInsuranceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, 30));

        txtPolicyNumber.setEnabled(false);
        AddInsurancePanel.add(txtPolicyNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, 30));

        txtEffectiveDate.setEnabled(false);
        AddInsurancePanel.add(txtEffectiveDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 160, 30));

        btnDatePicker.setBackground(new java.awt.Color(255, 102, 102));
        btnDatePicker.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDatePicker.setForeground(new java.awt.Color(255, 255, 255));
        btnDatePicker.setText("Pick Date");
        btnDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatePickerActionPerformed(evt);
            }
        });
        AddInsurancePanel.add(btnDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, 30));

        lblEffectiveDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEffectiveDate.setForeground(new java.awt.Color(255, 255, 255));
        lblEffectiveDate.setText("<html>Effective Date <font color = red>*</font></html>");
        AddInsurancePanel.add(lblEffectiveDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        add(AddInsurancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 500, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cl = (CardLayout) userProcessContainer.getLayout();
        cl.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInsuranceActionPerformed
        // TODO add your handling code here:

        AddInsurancePanel.setVisible(true);
        populateInsuranceType();
        btnSave2.setVisible(true);
        btnUpdate.setVisible(false);
        btnDatePicker.setVisible(true);
        btnUpdateSave.setVisible(false);
        txtPolicyNumber.setEnabled(true);
        
        cmbInsuranceType.setEnabled(true);
        
        txtGroupNumber.setEnabled(true);
        txtInsuranceID.setEnabled(true);
        txtPolicyName.setEnabled(true);
        txtEffectiveDate.setEnabled(false);
        txtPolicyName.setText("");
                txtEffectiveDate.setText("");
                txtGroupNumber.setText("");
                txtInsuranceID.setText("");
                txtPolicyNumber.setText("");
        

    }//GEN-LAST:event_btnAddInsuranceActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int selectedRow = tblInsurance.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row","Information",1);
            return;
        }
        InsurancePolicy ip = (InsurancePolicy) tblInsurance.getValueAt(selectedRow, 0);
        AddInsurancePanel.setVisible(true);
        btnSave2.setVisible(false);
        btnUpdate.setVisible(true);
        btnUpdateSave.setVisible(true);
        btnUpdate.setEnabled(true);
        btnUpdateSave.setEnabled(false);
        populateInsuranceType();
        txtGroupNumber.setEnabled(false);
        txtPolicyName.setEnabled(false);
        txtInsuranceID.setEnabled(false);
        cmbInsuranceType.setEnabled(false);
        txtInsuranceID.setEnabled(false);
        txtPolicyNumber.setEnabled(false);
        txtPolicyNumber.setText(ip.getPolicyNumber());
        txtInsuranceID.setText(String.valueOf(ip.getInsuranceId()));
        txtGroupNumber.setText(ip.getGroupNumber());
        txtPolicyName.setText(ip.getPolicyName());
        cmbInsuranceType.setSelectedItem(ip.getInsuranceType());
        btnDatePicker.setEnabled(false);
        txtEffectiveDate.setText(sdf.format(ip.getEffectiveDate()));

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
try
{
        String groupNumber = txtGroupNumber.getText().trim();
        String policyNumber = txtPolicyNumber.getText().trim();
        String policyName = txtPolicyName.getText().trim();
        String insuranceId = txtInsuranceID.getText().trim();
        String effectiveDate = txtEffectiveDate.getText().trim();
        InsuranceType it = (InsuranceType) cmbInsuranceType.getSelectedItem();
        //boolean boolcopay = Validate.isNumeric(organizationLoc);
        boolean boolgroupNumber = Validate.isalphanumeric(groupNumber);
        boolean boolpolicyNumber = Validate.isalphanumeric(policyNumber);
        boolean boolpolicyName = Validate.isString(policyName);
        boolean boolinsuranceId = Validate.isLong(insuranceId);
        boolean booleffectiveDate = Validate.isDate(effectiveDate);
        if( !groupNumber.isEmpty() && !policyNumber.isEmpty() && !policyName.isEmpty() && !insuranceId.isEmpty() && !effectiveDate.isEmpty() && cmbInsuranceType.getSelectedItem() !=null )
        {
            if(boolgroupNumber && boolpolicyNumber && boolpolicyName && boolinsuranceId && booleffectiveDate )
            {
                
                txtGroupNumber.setBackground(Color.WHITE);
                txtPolicyNumber.setBackground(Color.WHITE);
                txtPolicyName.setBackground(Color.WHITE);
                txtInsuranceID.setBackground(Color.WHITE);
                
                InsurancePolicy ip = patient.getInsurancePolicyDirectory().createPolicy();
                ip.setEffectiveDate(sdf.parse(effectiveDate));
                ip.setGroupNumber(groupNumber);
                ip.setInsuranceId(Long.parseLong(insuranceId));
                ip.setInsuranceType((InsuranceType)cmbInsuranceType.getSelectedItem());
                ip.setIsActive(true);
                ip.setPolicyName(policyName);
                ip.setPolicyNumber(policyNumber);

                JOptionPane.showMessageDialog(null,"Insurance added succesfully","Success",1);
                //   txtOrganizationName1.setText("");
                txtPolicyName.setText("");
                txtEffectiveDate.setText("");
                txtGroupNumber.setText("");
                txtInsuranceID.setText("");
                txtPolicyNumber.setText("");
                
                populateTable();
                AddInsurancePanel.setVisible(false);
            }
            else
            {

                if(!boolgroupNumber)
                {
                    txtGroupNumber.setBackground(Color.red);
                }
                else
                txtGroupNumber.setBackground(Color.WHITE);
                if(!boolpolicyNumber)
                {
                    txtPolicyNumber.setBackground(Color.red);
                }
                else
                txtPolicyNumber.setBackground(Color.WHITE);
                if(!boolinsuranceId)
                {
                    txtInsuranceID.setBackground(Color.red);
                }
                else
                txtInsuranceID.setBackground(Color.WHITE);
                if(!boolpolicyName)
                {
                    txtPolicyName.setBackground(Color.red);
                }
                else
                txtPolicyName.setBackground(Color.WHITE);
                
                
                JOptionPane.showMessageDialog(null,"Invalid data","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Information",JOptionPane.INFORMATION_MESSAGE);

        }
}
catch(Exception e)
{
    System.out.println("Date parsing caught");
}
    }//GEN-LAST:event_btnSave2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        btnUpdateSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        txtPolicyNumber.setEnabled(false);
        txtPolicyName.setEnabled(true);
        txtGroupNumber.setEnabled(false);
        cmbInsuranceType.setEnabled(false);
        txtInsuranceID.setEnabled(false);
        btnDatePicker.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSaveActionPerformed
        // TODO add your handling code here:
       try
{
    int selectedRow = tblInsurance.getSelectedRow();
    InsurancePolicy ip = (InsurancePolicy) tblInsurance.getValueAt(selectedRow, 0);
    String policyName = txtPolicyName.getText().trim();
        
        String effectiveDate = txtEffectiveDate.getText().trim();
        
        //boolean boolcopay = Validate.isNumeric(organizationLoc);
        boolean boolpolicyName = Validate.isString(policyName);
        
        boolean booleffectiveDate = Validate.isDate(effectiveDate);
        if(!policyName.isEmpty() && !effectiveDate.isEmpty())
        {
            if(boolpolicyName && booleffectiveDate )
            {
                
                txtPolicyName.setBackground(Color.WHITE);
                
               
                ip.setEffectiveDate(sdf.parse(effectiveDate));
                
                
                ip.setPolicyName(policyName);
                

                JOptionPane.showMessageDialog(null,"Insurance updated succesfully","Success",1);
                //   txtOrganizationName1.setText("");
                
                populateTable();
                AddInsurancePanel.setVisible(false);
            }
            else
            {

                if(!boolpolicyName)
                {
                    txtPolicyName.setBackground(Color.red);
                }
                else
                txtPolicyName.setBackground(Color.WHITE);
                
                
                JOptionPane.showMessageDialog(null,"Invalid data","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Information",JOptionPane.INFORMATION_MESSAGE);

        }
}
catch(Exception e)
{
    System.out.println("Date parsing caught");
}
    }//GEN-LAST:event_btnUpdateSaveActionPerformed

    private void cmbInsuranceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInsuranceTypeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbInsuranceTypeActionPerformed

    private void btnDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatePickerActionPerformed
        String lang = null;
        final Locale locale = getLocale(lang);
        DatePicker dp = new DatePicker(txtEffectiveDate, locale);
        //DatePicker.getDatePicker().setMaxDate(new Date());
        Date selectedDate = dp.parseDate(txtEffectiveDate.getText().trim());
        dp.setSelectedDate(selectedDate);
        dp.start(txtEffectiveDate);

    }//GEN-LAST:event_btnDatePickerActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblInsurance.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row","Information",1);
            return;
        }
        InsurancePolicy ip = (InsurancePolicy) tblInsurance.getValueAt(selectedRow, 0);
        ip.setIsActive(false);
        JOptionPane.showMessageDialog(null,"Insurance policy deleted successfully","Success",1);
        populateTable();
        AddInsurancePanel.setVisible(false);
    }//GEN-LAST:event_btnDeleteActionPerformed
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
    private javax.swing.JPanel AddInsurancePanel;
    private javax.swing.JButton btnAddInsurance;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDatePicker;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave2;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateSave;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox cmbInsuranceType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddOrganization2;
    private javax.swing.JLabel lblEffectiveDate;
    private javax.swing.JLabel lblGroupNumber;
    private javax.swing.JLabel lblInsuranceId;
    private javax.swing.JLabel lblOrganizationType1;
    private javax.swing.JLabel lblPolicyName;
    private javax.swing.JLabel lblPolicyNumber;
    private javax.swing.JLabel lblswan;
    private javax.swing.JTable tblInsurance;
    private ObservingTextField txtEffectiveDate;
    /*
    private javax.swing.JTextField txtEffectiveDate;
    */
    private javax.swing.JTextField txtGroupNumber;
    private javax.swing.JTextField txtInsuranceID;
    private javax.swing.JTextField txtPolicyName;
    private javax.swing.JTextField txtPolicyNumber;
    // End of variables declaration//GEN-END:variables
}
