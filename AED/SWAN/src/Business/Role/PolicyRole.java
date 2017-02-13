/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PolicyOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Policy.PolicyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class PolicyRole extends Role{

    public PolicyRole()
    {
        super(RoleType.Policy);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,int wfh) {
        return new PolicyWorkAreaJPanel(userProcessContainer,account, (PolicyOrganization) organization, enterprise,wfh);
    }
    
}
