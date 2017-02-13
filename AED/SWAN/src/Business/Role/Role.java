/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public abstract class Role {
    
    private RoleType roleType;
    
    public enum RoleType{
        Admin("Admin"),
        SupportAdmin("Support Admin"),
        Doctor("Doctor"),
        IT("IT"),
        Billing("Billing"),
        Patient("Patient"),
        Policy("Policy"),
        Receptionist("Receptionist"),
        SOC("Security Team"),
        Support("Patient Support"),
        SystemAdmin("System Admin"),
        Nurse("Nurse"),
        OrganizationAdmin("Organization Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public Role(RoleType type)
    {
        this.roleType = type;
        
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            int wfh);

    @Override
    public String toString() {
        return this.roleType.getValue();
    }
    
    
}