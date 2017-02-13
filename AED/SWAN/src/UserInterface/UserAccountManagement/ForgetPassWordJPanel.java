/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UserAccountManagement;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.HomePageJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class ForgetPassWordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ForgetPassWordJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ForgetPassWordJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        ForgetPWPanel.setVisible(false);
        txtUserName.setBackground(Color.WHITE);
        
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
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnProceed = new javax.swing.JButton();
        ForgetPWPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbSecurityQuestion = new javax.swing.JComboBox<>();
        txtSecurityAnswer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGenerateOTP = new javax.swing.JButton();

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
        lblswan.setText("Forget PassWord");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 0, 142, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 90, 20));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 140, 30));

        btnProceed.setBackground(new java.awt.Color(255, 102, 102));
        btnProceed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProceed.setForeground(new java.awt.Color(255, 255, 255));
        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        ForgetPWPanel.setOpaque(false);
        ForgetPWPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Security Question");
        ForgetPWPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 109, 22));

        cmbSecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<--Select-->", "What is your pet's name?", "What is your favourite color?", "What is your best friend's name?" }));
        ForgetPWPanel.add(cmbSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 262, -1));
        ForgetPWPanel.add(txtSecurityAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 262, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>Answer <font color=red>*</font></html>");
        ForgetPWPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 109, 23));

        btnGenerateOTP.setBackground(new java.awt.Color(255, 102, 102));
        btnGenerateOTP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerateOTP.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateOTP.setText("Generate OTP");
        btnGenerateOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateOTPActionPerformed(evt);
            }
        });
        ForgetPWPanel.add(btnGenerateOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, 30));

        add(ForgetPWPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 460, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGenerateOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateOTPActionPerformed
        // TODO add your handling code here:
        String answer = txtSecurityAnswer.getText().trim();
  
  
            if(answer.equalsIgnoreCase(userAccount.getSecurityAnswer()))
            {
                JOptionPane.showMessageDialog(null,"OTP has been sent to registed mobile and email");
                userAccount.setPassword(generatepassword());
                System.out.println("OTP : " + userAccount.getPassword());
                ForgetPWPanel.setVisible(false);
                userProcessContainer.removeAll();
        
                userProcessContainer.add("blank", new HomePageJPanel(userProcessContainer));
                CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
                crdLyt.next(userProcessContainer);
                dB4OUtil.storeSystem(system);
            }


    }//GEN-LAST:event_btnGenerateOTPActionPerformed
private String generatepassword()
    {
        //String from which characters are picked up by randomizer
         String randomString="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
         Random random=new Random();
        StringBuilder password =new StringBuilder();
        //for loop to generate Id of length of 5
        for (int loop_var = 0; loop_var < 5; loop_var++) 
        {
            int randIndex1=random.nextInt(randomString.length());
            password.append(randomString.charAt(randIndex1));            
        }
        return password.toString();

    }
    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText().trim();
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if(!userName.isEmpty())
        {
            txtUserName.setBackground(Color.WHITE);
            userAccount = system.getUserAccountDirectory().forgetPawword(userName);
            
             if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().forgetPawword(userName);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().forgetPawword(userName);
                           if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                               
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "No user found","information",1);
            txtUserName.setText("");
            return;
        } else {
            ForgetPWPanel.setVisible(true);
            cmbSecurityQuestion.setSelectedIndex(userAccount.getSecurityQuestion());
           cmbSecurityQuestion.setEnabled(false);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Information",1);
            txtUserName.setBackground(Color.red);
           
        }
    }//GEN-LAST:event_btnProceedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ForgetPWPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateOTP;
    private javax.swing.JButton btnProceed;
    private javax.swing.JComboBox<String> cmbSecurityQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblswan;
    private javax.swing.JTextField txtSecurityAnswer;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
