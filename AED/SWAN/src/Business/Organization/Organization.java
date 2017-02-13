/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.EmployeeDirectory;
import Business.Person.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private PatientDirectory patientDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private boolean status=true;
    private Date createdOn;
    private Date modifiedOn;
    private String location;
    private SimpleDateFormat sdf;
    private Type organizationType;
    public enum Type{
        Admin("Admin Organization"),
        SupportAdmin("Support Admin Organization"),
        Doctor("Doctor Organization"), 
        Nurse("Nurse Organization"),
        Receptionist("Receptionist Organization"),
        Patient("Patient Organization") ,
        PatientSupport("Support Organization"),
        IT("IT Organization"),
        Billing("Billing Organization"),
        Policy("Policy Organization"),
        SOC("SOC Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    

    public Organization(String name, Type organizationType ) {
        counter++;
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        this.name = name;
        this.organizationType = organizationType;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        patientDirectory = new PatientDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        
        
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String Location) {
        this.location = Location;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Type getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Type organizationType) {
        this.organizationType = organizationType;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
