package Business;

import Business.Person.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
//         system = ConfigureASystem.configure();
//         Network network = system.createAndAddNetwork();
//        network.setName("n1");
//        Enterprise e1 = (Enterprise) network.getEnterpriseDirectory().createAndAddEnterprise("E1", Enterprise.EnterpriseType.Hospital);
//        
//        Enterprise e2 = (Enterprise) network.getEnterpriseDirectory().createAndAddEnterprise("E2", Enterprise.EnterpriseType.SupportCenter);
//        
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Nurse);
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Receptionist);
//        
//        e2.getOrganizationDirectory().createOrganization(Organization.Type.PatientSupport);
//        e2.getOrganizationDirectory().createOrganization(Organization.Type.IT);
//        e2.getOrganizationDirectory().createOrganization(Organization.Type.Billing);
//        e2.getOrganizationDirectory().createOrganization(Organization.Type.Policy);
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        
      
        
        Employee employee = system.getEmployeeDirectory().createEmployee();
        employee.setFirstName("System");
        employee.setLastName("Admin");
        employee.setStatus(true);
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        ua.setStatus(true);
       
        return system;
    }
    
}
