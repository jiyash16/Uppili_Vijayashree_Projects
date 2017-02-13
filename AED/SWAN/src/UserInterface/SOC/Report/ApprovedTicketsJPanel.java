/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SOC.Report;

import Business.Organization.SOCOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkFromHomeWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Jiya
 */
public class ApprovedTicketsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApprovedTicketsJPanel
     */
    JPanel userProcessContainer;
    SOCOrganization organization;
    UserAccount userAccount;
     DefaultCategoryDataset bChartTicket;
      DefaultCategoryDataset bChartMyTicket;
    public ApprovedTicketsJPanel(JPanel userProcessContainer, SOCOrganization organization,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.organization=organization;
        this.userAccount = userAccount;
         bChartTicket = new DefaultCategoryDataset();
          bChartMyTicket = new DefaultCategoryDataset();
    }
public void populateOverallTicketstatus()
{
     int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        
                    for(WorkRequest wr : organization.getWorkQueue().getWorkRequestList())
                    {
                        if(wr instanceof WorkFromHomeWorkRequest)
                        {
                          if(wr.getStatus().equalsIgnoreCase("Pending"))
                          {
                              i++;
                          }
                          else if(wr.getStatus().equalsIgnoreCase("Approved Admin"))
                          {
                              j++;
                          }
                          else if(wr.getStatus().equalsIgnoreCase("Rejected Admin") || ((WorkFromHomeWorkRequest) wr).getAdminApprovalStatus().equalsIgnoreCase("Rejected") )
                          {
                              k++;
                          }
                          else if(wr.getStatus().equalsIgnoreCase("Approved SOC"))
                          {
                              l++;
                          }
                          else if(wr.getStatus().equalsIgnoreCase("Rejected SOC") || ((WorkFromHomeWorkRequest) wr).getSocApprovalStatus().equalsIgnoreCase("Rejected"))
                          {
                              m++;
                          }
                       }
                    }
            
        bChartTicket.setValue(i, "Tickets", "Pending");
         bChartTicket.setValue(j, "Tickets", "Approved Admin");
         bChartTicket.setValue(k, "Tickets", "Rejected Admin");
         bChartTicket.setValue(l, "Tickets", "Approved SOC");
         bChartTicket.setValue(m, "Tickets", "Rejected SOC");
         
         PopulateChart(bChartTicket,"Tickets");
         
}
public void populateMyTicketstatus()
{

        int j = 0;
 
        int l = 0;
        int m = 0;
        
                    for(WorkRequest wr : organization.getWorkQueue().getWorkRequestList())
                    {
                        if(wr instanceof WorkFromHomeWorkRequest)
                        {
                          
                           if(wr.getStatus().equalsIgnoreCase("Approved Admin"))
                          {
                              j++;
                          }
                        
                          else if(wr.getStatus().equalsIgnoreCase("Approved SOC"))
                          {
                              l++;
                          }
                          else if(wr.getStatus().equalsIgnoreCase("Rejected SOC") || ((WorkFromHomeWorkRequest) wr).getSocApprovalStatus().equalsIgnoreCase("Rejected"))
                          {
                              m++;
                          }
                       }
                    }
            
        bChartMyTicket.setValue(l, "Tickets", "Approved");
         bChartMyTicket.setValue(m, "Tickets", "Rejected");
         bChartMyTicket.setValue(j, "Tickets", "Pending Approval");
         
         PopulateChart(bChartMyTicket,"Tickets");
}
public void PopulateChart(DefaultCategoryDataset bChart ,String yaxis)
    {
        
        
        JFreeChart barChart = ChartFactory.createBarChart(yaxis,"","", bChart,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot catChart = barChart.getCategoryPlot();
        CategoryAxis xaxis = (CategoryAxis) catChart.getDomainAxis();
        xaxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        BarRenderer b = (BarRenderer)catChart.getRenderer();
       // ItemLabelPosition(ItemLabelAnchor.OUTSIDE3, TextAnchor.CENTER, TextAnchor.CENTER, 90);
        b.setMaximumBarWidth(0.10);
        
        catChart.setRangeGridlinePaint(Color.WHITE);
        ChartPanel barPanel = new ChartPanel(barChart);
        
        ticketJPanel.removeAll();
        ticketJPanel.add(barPanel,BorderLayout.CENTER);
        ticketJPanel.validate();
       
        
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
        ticketJPanel = new javax.swing.JPanel();
        btnOverall = new javax.swing.JButton();
        btnOverall1 = new javax.swing.JButton();

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
        jLabel1.setText("Tickets Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 40));

        ticketJPanel.setBackground(new java.awt.Color(0, 153, 153));
        ticketJPanel.setLayout(new java.awt.BorderLayout());
        add(ticketJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 470, 340));

        btnOverall.setBackground(new java.awt.Color(255, 102, 102));
        btnOverall.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOverall.setForeground(new java.awt.Color(255, 255, 255));
        btnOverall.setText("My Ticket Status");
        btnOverall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverallActionPerformed(evt);
            }
        });
        add(btnOverall, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 160, -1));

        btnOverall1.setBackground(new java.awt.Color(255, 102, 102));
        btnOverall1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOverall1.setForeground(new java.awt.Color(255, 255, 255));
        btnOverall1.setText("Overall Ticket Status");
        btnOverall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverall1ActionPerformed(evt);
            }
        });
        add(btnOverall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOverall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverall1ActionPerformed
        // TODO add your handling code here:
        
        populateOverallTicketstatus();
    }//GEN-LAST:event_btnOverall1ActionPerformed

    private void btnOverallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverallActionPerformed
        // TODO add your handling code here:
        populateMyTicketstatus();
    }//GEN-LAST:event_btnOverallActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOverall;
    private javax.swing.JButton btnOverall1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel ticketJPanel;
    // End of variables declaration//GEN-END:variables
}
