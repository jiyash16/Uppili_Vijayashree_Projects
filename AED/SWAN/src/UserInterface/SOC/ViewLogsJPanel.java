/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SOC;

import Business.EcoSystem;
import Business.IPConfig;
import Business.WorkQueue.WorkFromHomeWorkRequest;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiya
 */
public class ViewLogsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewLogsJPanel
     */
    JPanel userProcessContainer;
    WorkFromHomeWorkRequest request;
    EcoSystem system;
    SimpleDateFormat sdf;
    public ViewLogsJPanel(JPanel userProcessContainer,WorkFromHomeWorkRequest request, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.system = system;
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        populateTable();
    }
    public void populateTable()
    {
        String date = sdf.format(request.getWfhDate());
        String newdate = date.replace("/", "");
         DefaultTableModel model = (DefaultTableModel) tbllog.getModel();
        
        model.setRowCount(0);
       
            Object[] row = new Object[1];
            
           
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("src/LogFiles/Employee_"+request.getSender().getUsername()+"_"+newdate+".txt"));
            String line = reader.readLine();
            while (line != null) {
                // do something
                
                line = reader.readLine();
                
                 row[0] = line.replace("Business.Validate createLogFile", "");
              
                model.addRow(row);
            }
        }
        catch(Exception e)
        {
            //e.printStackTrace();
           // JOptionPane.showMessageDialog(null,"No logs found");
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
        tbllog = new javax.swing.JTable();
        btnDisable = new javax.swing.JButton();

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
        jLabel1.setText("View Logs");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 170, 40));

        tbllog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Activity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbllog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 500, 270));

        btnDisable.setBackground(new java.awt.Color(255, 102, 102));
        btnDisable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDisable.setForeground(new java.awt.Color(255, 255, 255));
        btnDisable.setText("Disable IP");
        btnDisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisableActionPerformed(evt);
            }
        });
        add(btnDisable, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 370, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisableActionPerformed
        // TODO add your handling code here:
        
        String ip = request.getIp();
        system.getRmap().deleteIP(ip);
       
        JOptionPane.showMessageDialog(null,"IP deleted from network");
    }//GEN-LAST:event_btnDisableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDisable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbllog;
    // End of variables declaration//GEN-END:variables
}