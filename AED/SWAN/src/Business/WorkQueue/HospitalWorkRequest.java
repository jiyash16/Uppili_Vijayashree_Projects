/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Patient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class HospitalWorkRequest extends WorkRequest{
    
    
    private String roomNumber;
       private String diagonosis;
    private Patient patient;
 private UserAccount repsender;
    private UserAccount nursereceiver;
    private UserAccount nurseSender;
    private UserAccount docreceiver;
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

     public String getDiagonosis() {
        return diagonosis;
    }

    public void setDiagonosis(String diagonosis) {
        this.diagonosis = diagonosis;
    }

    public UserAccount getRepsender() {
        return repsender;
    }

    public void setRepsender(UserAccount repsender) {
        this.repsender = repsender;
    }

    public UserAccount getNursereceiver() {
        return nursereceiver;
    }

    public void setNursereceiver(UserAccount nursereceiver) {
        this.nursereceiver = nursereceiver;
    }

    public UserAccount getNurseSender() {
        return nurseSender;
    }

    public void setNurseSender(UserAccount nurseSender) {
        this.nurseSender = nurseSender;
    }

    public UserAccount getDocreceiver() {
        return docreceiver;
    }

    public void setDocreceiver(UserAccount docreceiver) {
        this.docreceiver = docreceiver;
    }
    
    
    
}
