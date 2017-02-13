/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ITRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class ITOrganization extends Organization {
    
       public ITOrganization(String name) {
        super(name, Type.IT);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ITRole());
        return roles;
    }
}
