/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Patient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Jiya
 */
public class SupportWorkRequest extends WorkRequest {
    
    
   
    String comments;
    private Patient patient;
    private int queryType;
    private String organization;
    private UserAccount assignedby;
    private UserAccount employeeReceiver;
    private String swrReturnStatus;
    private String swrReturnBillStatus;
    private String swrReturnPolStatus;

    public String getSwrReturnBillStatus() {
        return swrReturnBillStatus;
    }

    public void setSwrReturnBillStatus(String swrReturnBillStatus) {
        this.swrReturnBillStatus = swrReturnBillStatus;
    }

    public String getSwrReturnPolStatus() {
        return swrReturnPolStatus;
    }

    public void setSwrReturnPolStatus(String swrReturnPolStatus) {
        this.swrReturnPolStatus = swrReturnPolStatus;
    }
    
    
    public Patient getPatient() {
        return patient;
    }

    public String getSwrReturnStatus() {
        return swrReturnStatus;
    }

    public void setSwrReturnStatus(String swrReturnStatus) {
        this.swrReturnStatus = swrReturnStatus;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public UserAccount getEmployeeReceiver() {
        return employeeReceiver;
    }

    public void setEmployeeReceiver(UserAccount employeeReceiver) {
        this.employeeReceiver = employeeReceiver;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getQueryType() {
        return queryType;
    }

    public void setQueryType(int queryType) {
        this.queryType = queryType;
    }

    public UserAccount getAssignedby() {
        return assignedby;
    }

    public void setAssignedby(UserAccount assignedby) {
        this.assignedby = assignedby;
    }

    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
}
