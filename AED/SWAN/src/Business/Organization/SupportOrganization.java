/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SupportRole;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class SupportOrganization extends Organization{
    
      public SupportOrganization(String name) {
        super(name, Type.PatientSupport);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupportRole());
        return roles;
    }
}
