/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Reports;

import Business.Person.Patient;
import Business.Vitals.Vital;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Jiya
 */
 
public class PatientsVitalReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientsVitalReportJPanel
     */JPanel userProcessContainer;
    private Patient patient;
   
    DefaultCategoryDataset bChartBP;
    DefaultCategoryDataset bChartHR;
    DefaultCategoryDataset bChartRR;
    DefaultCategoryDataset bChartWT;
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
    
    public PatientsVitalReportJPanel(JPanel userProcessContainer,Patient patient) {
        initComponents();
         this.userProcessContainer= userProcessContainer;
        this.patient = patient;
         bChartBP = new DefaultCategoryDataset();
         bChartHR = new DefaultCategoryDataset();
         bChartRR = new DefaultCategoryDataset();
         bChartWT = new DefaultCategoryDataset();
        for(Vital v: patient.getVitalSignHistory().getVitalSignHistory())
        {
            
            bChartBP.setValue(v.getSysBP(), "Vital Sign", sdf.format(v.getCurrDate()));
            bChartHR.setValue(v.getHeartRate(), "Vital Sign", sdf.format(v.getCurrDate()));
            bChartRR.setValue(v.getRespRate(), "Vital Sign", sdf.format(v.getCurrDate()));
            bChartWT.setValue(v.getWeight(), "Vital Sign", sdf.format(v.getCurrDate()));
        }
         PopulateChart(bChartBP,"BP",BPJPanel);
          PopulateChart(bChartHR,"Heart Rate",HRJPanel);
               PopulateChart(bChartWT,"Weight",WTJPanel);
                PopulateChart(bChartRR,"Respiratory Rate",RRJPanel);
    }
 public void PopulateChart(DefaultCategoryDataset bChart ,String yaxis,JPanel graphJPanel)
    {
        
        
        JFreeChart barChart = ChartFactory.createBarChart(yaxis,"TimeStamp --->",yaxis, bChart,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot catChart = barChart.getCategoryPlot();
        BarRenderer b = (BarRenderer)catChart.getRenderer();
        b.setMaximumBarWidth(0.10);
        
        catChart.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel = new ChartPanel(barChart);
        
        graphJPanel.removeAll();
        graphJPanel.add(barPanel,BorderLayout.CENTER);
        graphJPanel.validate();
       
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack1 = new javax.swing.JButton();
        lblVitalDetails = new javax.swing.JLabel();
        BPJPanel = new javax.swing.JPanel();
        RRJPanel = new javax.swing.JPanel();
        HRJPanel = new javax.swing.JPanel();
        WTJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        lblVitalDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVitalDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblVitalDetails.setText("Patient Vital");
        add(lblVitalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 230, 50));

        BPJPanel.setBackground(new java.awt.Color(0, 204, 204));
        BPJPanel.setLayout(new java.awt.BorderLayout());
        add(BPJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 350, 250));

        RRJPanel.setBackground(new java.awt.Color(0, 102, 204));
        RRJPanel.setLayout(new java.awt.BorderLayout());
        add(RRJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 350, 250));

        HRJPanel.setBackground(new java.awt.Color(0, 102, 153));
        HRJPanel.setLayout(new java.awt.BorderLayout());
        add(HRJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 350, 250));

        WTJPanel.setBackground(new java.awt.Color(0, 204, 204));
        WTJPanel.setLayout(new java.awt.BorderLayout());
        add(WTJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 350, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cl = (CardLayout) userProcessContainer.getLayout();
        cl.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BPJPanel;
    private javax.swing.JPanel HRJPanel;
    private javax.swing.JPanel RRJPanel;
    private javax.swing.JPanel WTJPanel;
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel lblVitalDetails;
    // End of variables declaration//GEN-END:variables
}
