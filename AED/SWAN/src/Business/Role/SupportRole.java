/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SupportOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PatientSupport.PatientSupportWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class SupportRole extends Role{

    public SupportRole()
    {
        super(RoleType.Support);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,int wfh) {
        return new PatientSupportWorkAreaJPanel(userProcessContainer,(SupportOrganization)organization,account,enterprise,wfh);
    }
    
}
