/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BillingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Billing.BillingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class BillingRole extends Role{

    public BillingRole()
    {
        super(RoleType.Billing);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,int wfh) {
       return new BillingWorkAreaJPanel(userProcessContainer, account, (BillingOrganization)organization, enterprise,wfh);
    }
    
}
