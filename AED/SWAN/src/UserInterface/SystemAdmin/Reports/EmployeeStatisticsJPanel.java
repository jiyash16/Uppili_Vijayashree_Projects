/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin.Reports;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Locale;
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
public class EmployeeStatisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterprisewiseEmployeeReportJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    DefaultCategoryDataset bChartEnterprise;
    DefaultCategoryDataset bChartOrganization;
    public EmployeeStatisticsJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        bChartEnterprise = new DefaultCategoryDataset();
         bChartOrganization = new DefaultCategoryDataset();
         
         
     
         
    }
    public void calculateEnterpriseEmployees()
    {
         int i = 0;
        int j = 0;
        for(Network nw : system.getNetworkList())
        {
            for(Enterprise e : nw.getEnterpriseDirectory().getEnterpriseList())
            {
                i++;
            }
            
         }
        
         String employeecount[] = new String[i];
         int sum = 0;
        for(Network nw : system.getNetworkList())
        {
            for(Enterprise e : nw.getEnterpriseDirectory().getEnterpriseList())
            {
                
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList())
                    {
                            if(o instanceof PatientOrganization)
                        {
                         
                        }
                        else
                        {
                           sum = sum +o.getEmployeeDirectory().getEmployeeList().size();
                           
                        }
                    }
                    employeecount[j] = e.getName()+"-"+sum;
                    sum = 0;
                    j++;
                    
                }
                
            }
         for(int k =0;k<employeecount.length; k++)
       {
           String split[] = employeecount[k].split("-");
            bChartEnterprise.setValue(Integer.parseInt(split[1]), "Enterprise", split[0]);
       }
       PopulateChart(bChartEnterprise,"Enterprise");
        
    }
    public void calculateOrganizationEmployees()
    {
        int i = 0;
        int j = 0;
        for(Network nw : system.getNetworkList())
        {
            for(Enterprise e : nw.getEnterpriseDirectory().getEnterpriseList())
            {
                 for(Organization o: e.getOrganizationDirectory().getOrganizationList())
                    {
                        i++;
                    }
            }
            
         }
        
         String employeecount[] = new String[i];
        for(Network nw : system.getNetworkList())
        {
            for(Enterprise e : nw.getEnterpriseDirectory().getEnterpriseList())
            {
                
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList())
                    {
                        if(o instanceof PatientOrganization)
                        {
                          employeecount[j] = o.getName()+"-"+o.getPatientDirectory().getpatientList().size();
                        }
                        else
                        {
                            employeecount[j] = o.getName()+"-"+o.getEmployeeDirectory().getEmployeeList().size();
                        }
                        j++;
                        
                    }
                
                
            }
        }
        System.out.println("size" + employeecount.length);
       for(int k =0;k<employeecount.length; k++)
       {
           String split[] = employeecount[k].split("-");
            bChartOrganization.setValue(Integer.parseInt(split[1]), "Organzation", split[0]);
       }
       PopulateChart(bChartOrganization,"Organization");
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
        
        graphStats.removeAll();
        graphStats.add(barPanel,BorderLayout.CENTER);
        graphStats.validate();
       
        
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
        graphStats = new javax.swing.JPanel();
        btnOrganizationWise = new javax.swing.JButton();
        btnEnterpriseWise1 = new javax.swing.JButton();

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
        jLabel1.setText("Employee Statistics");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 170, 40));

        graphStats.setOpaque(false);
        graphStats.setLayout(new java.awt.BorderLayout());
        add(graphStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 490, 340));

        btnOrganizationWise.setBackground(new java.awt.Color(255, 102, 102));
        btnOrganizationWise.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOrganizationWise.setForeground(new java.awt.Color(255, 255, 255));
        btnOrganizationWise.setText("Organization Wise");
        btnOrganizationWise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizationWiseActionPerformed(evt);
            }
        });
        add(btnOrganizationWise, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 160, 30));

        btnEnterpriseWise1.setBackground(new java.awt.Color(255, 102, 102));
        btnEnterpriseWise1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnterpriseWise1.setForeground(new java.awt.Color(255, 255, 255));
        btnEnterpriseWise1.setText("Enterperise Wise");
        btnEnterpriseWise1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseWise1ActionPerformed(evt);
            }
        });
        add(btnEnterpriseWise1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEnterpriseWise1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseWise1ActionPerformed
        // TODO add your handling code here:
        calculateEnterpriseEmployees();
    }//GEN-LAST:event_btnEnterpriseWise1ActionPerformed

    private void btnOrganizationWiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizationWiseActionPerformed
        // TODO add your handling code here:
            
         calculateOrganizationEmployees();
    }//GEN-LAST:event_btnOrganizationWiseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnterpriseWise1;
    private javax.swing.JButton btnOrganizationWise;
    private javax.swing.JPanel graphStats;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
