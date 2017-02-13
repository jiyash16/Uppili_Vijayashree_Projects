/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Receptionist.ReceptionistWorkAreaJPanel;
//import UserInterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ReceptionistRole extends Role {

    public ReceptionistRole()
    {
        super(RoleType.Receptionist);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,int wfh) {
        return new ReceptionistWorkAreaJPanel(userProcessContainer,enterprise,account,(ReceptionistOrganization)organization,0);
       
    }
    
}
