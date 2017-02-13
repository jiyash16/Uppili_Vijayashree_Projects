/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.OrganizationAdmin.OrganizationAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class OrganizationAdminRole extends Role {

       public OrganizationAdminRole()
    {
        super(RoleType.OrganizationAdmin);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,int wfh) {
       return new OrganizationAdminWorkAreaJPanel( userProcessContainer,  account,  organization,  enterprise,business,wfh);
    }
    
}
