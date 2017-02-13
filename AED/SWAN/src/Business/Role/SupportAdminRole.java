/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import UserInterface.SupportOrganizationAdmin.SupportOrganizationAdminWorkAreaJPanel;
//import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SupportAdminRole extends Role{

    public SupportAdminRole()
    {
        super(RoleType.SupportAdmin);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,int wfh) {
       return new SupportOrganizationAdminWorkAreaJPanel(userProcessContainer, account,  organization,enterprise,business,0);
    
    }

    
    
}
