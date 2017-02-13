/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.OrganizationAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class AdminOrganization extends Organization{

    public AdminOrganization(String name) {
        super(name,Type.Admin);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OrganizationAdminRole());
        return roles;
    }
     
}
