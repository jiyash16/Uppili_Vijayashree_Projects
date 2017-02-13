/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SOCRole;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class SOCOrganization extends Organization{

     public SOCOrganization(String name) {
        super(name, Type.SOC);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SOCRole());
        return roles;
    }
    
}
