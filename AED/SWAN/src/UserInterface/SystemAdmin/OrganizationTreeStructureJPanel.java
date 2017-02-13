/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.ConfigureASystem;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class OrganizationTreeStructureJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public static int nw = 0;
    public static int ent = 0;
    public static int org = 0;
    public OrganizationTreeStructureJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.PAGE_START;
            JButton btnBack = new JButton();
            btnBack.setPreferredSize(new Dimension(50,50));
            try
            {
                Image img = ImageIO.read(getClass().getResource("/Images/Back.png"));
                btnBack.setIcon(new ImageIcon(img));
                    c.weightx = 0.5;
                    c.gridx = 1;
                    c.gridy = 1;
                    btnBack.addActionListener(new java.awt.event.ActionListener()
                     {
                         @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                            backAction();

                         }
                });
                  MainTitlePanel.add(btnBack,c);
              //  System.out.println(system.getNetworkList().size());
                JButton j1 = new JButton();
                j1.setText("Show Organization Structure");
                j1.setPreferredSize(new Dimension(200,50));
                j1.setBackground(Color.decode("#ff9999"));
                j1.addActionListener(new java.awt.event.ActionListener()
                 {
                         @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                                       
                                addNetWork();
                                ((AbstractButton) evt.getSource()).removeActionListener(this);
                           
                         }
                });
                    TitlePanel.add(j1);


                 this.revalidate();
                   this.repaint();
            }
            catch(Exception e)
            {
                
            }
}
    public void backAction()
    {
                    userProcessContainer.remove(this);
                     CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                     layout.previous(userProcessContainer);
    }
public void addNetWork()
{
    int i = 0;
        for(Network n: system.getNetworkList())
        {
            i++;
            JButton j1 = new JButton();
            j1.setText(n.getName());
            j1.setPreferredSize(new Dimension(100,50));
            //j1.setBounds(new Rectangle(getLocation(), getPreferredSize()));
            //j1.setBounds(0,10,200,10);
            //horizontalBox.getLayout().layoutContainer(horizontalBox);
            j1.setBackground(Color.red);
             j1.addActionListener(new java.awt.event.ActionListener()
             {
                 @Override
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    addEnterprise(n);
                    ((AbstractButton) evt.getSource()).removeActionListener(this);
                 }
        });
            networkPanel.add(j1);
            
        }
         this.revalidate();
           this.repaint();

       // populateNetworkTable();
    }
    public void addEnterprise(Network n)
    {
        int j = 0;
       // System.out.println("Add EnterPrise" + n.getEnterpriseDirectory().getEnterpriseList().size());
        for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList())
        {
            
            j++;
             JButton j1 = new JButton();
            j1.setText(n.getName()+" "+e.getName());
            j1.setPreferredSize(new Dimension(175,50));
            //j1.setBounds(new Rectangle(getLocation(), getPreferredSize()));
            //j1.setBounds(0,10,200,10);
            //horizontalBox.getLayout().layoutContainer(horizontalBox);
            j1.setBackground(Color.GREEN);
            
             j1.addActionListener(new java.awt.event.ActionListener()
             {
                 @Override
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    addOrganization(e);
                    ((AbstractButton) evt.getSource()).removeActionListener(this);
                 }
        });
            EnterPrisePanel.add(j1);
        }
          this.revalidate();
           this.repaint();
    }
public void addOrganization(Enterprise e)
    {
        int j = 0;
        for(Organization o : e.getOrganizationDirectory().getOrganizationList())
        {
           // System.out.println("Add Organization" + e.getOrganizationDirectory().getOrganizationList().size());
            j++;
             JButton j1 = new JButton();
            j1.setText(o.getName());
            j1.setPreferredSize(new Dimension(200,50));
            //j1.setBounds(new Rectangle(getLocation(), getPreferredSize()));
            //j1.setBounds(0,10,200,10);
            //horizontalBox.getLayout().layoutContainer(horizontalBox);
            j1.setBackground(Color.YELLOW);
             j1.addActionListener(new java.awt.event.ActionListener()
             {
                 @Override
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    //addOrganization(e);
                 }
        });
            OrganizationPanel.add(j1);
        }
          this.revalidate();
           this.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainTitlePanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        networkPanel = new javax.swing.JPanel();
        EnterPrisePanel = new javax.swing.JPanel();
        OrganizationPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new java.awt.GridLayout(5, 5));

        MainTitlePanel.setOpaque(false);
        MainTitlePanel.setLayout(new java.awt.GridBagLayout());
        add(MainTitlePanel);

        TitlePanel.setBackground(new java.awt.Color(0, 153, 153));
        TitlePanel.setLayout(new java.awt.GridBagLayout());
        add(TitlePanel);

        networkPanel.setBackground(new java.awt.Color(0, 153, 153));
        networkPanel.setLayout(new java.awt.GridBagLayout());
        add(networkPanel);

        EnterPrisePanel.setBackground(new java.awt.Color(0, 153, 153));
        EnterPrisePanel.setLayout(new java.awt.GridBagLayout());
        add(EnterPrisePanel);

        OrganizationPanel.setBackground(new java.awt.Color(0, 153, 153));
        OrganizationPanel.setLayout(new java.awt.GridBagLayout());
        add(OrganizationPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EnterPrisePanel;
    private javax.swing.JPanel MainTitlePanel;
    private javax.swing.JPanel OrganizationPanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel networkPanel;
    // End of variables declaration//GEN-END:variables
}
