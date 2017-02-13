/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String name, Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PatientSupport.getValue())){
            organization = new SupportOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Billing.getValue())){
            organization = new BillingOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.IT.getValue())){
            organization = new ITOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Policy.getValue())){
            organization = new PolicyOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SOC.getValue())){
            organization = new SOCOrganization(name);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.SupportAdmin.getValue())){
            organization = new SupportAdminOrganization(name);
            organizationList.add(organization);
        }
        
        return organization;
    }
     public void deleteEnterprise(Organization o)
    {
        organizationList.remove(o);
    }
}