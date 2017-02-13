/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SOCOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.SOC.SOCWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class SOCRole extends Role{

    public SOCRole()
    {
        super(RoleType.SOC);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,int wfh) {
        return new SOCWorkAreaJPanel(userProcessContainer,account, (SOCOrganization) organization, enterprise,business);
    }
    
}
