/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole()
    {
        super(RoleType.SystemAdmin);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,int wfh) {
        
        return new SystemAdminWorkAreaJPanel(userProcessContainer,account, organization, enterprise, system,0);
        //return null;
    }
    
}
