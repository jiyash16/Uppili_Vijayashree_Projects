/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ITOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.IT.ITWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class ITRole extends Role {

    public ITRole()
    {
        super(RoleType.IT);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,int wfh) {
       return new ITWorkAreaJPanel(userProcessContainer,account,(ITOrganization)organization,enterprise,wfh);
    }
    
}
