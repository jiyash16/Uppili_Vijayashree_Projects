/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.OrganizationAdminRole;
import Business.Role.Role;
import Business.Role.SupportAdminRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SupportAdminOrganization extends Organization{

    public SupportAdminOrganization(String name) {
        super(name,Type.SupportAdmin);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupportAdminRole());
        return roles;
    }
     
}
