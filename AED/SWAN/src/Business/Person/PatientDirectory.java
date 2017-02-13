/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getpatientList() {
        return patientList;
    }
    
    public Patient createPatient(){
        Patient patient = new Patient();
        //employee.setFirstName(name);
        patientList.add(patient);
        return patient;
    }
    public void deletePatient(Patient p)
    {
        patientList.remove(p);
    }
    public Patient searchPatient(int patientId)
    {
        for(Patient p : patientList)
        {
            if(p.getPatientId() == patientId)
            {
                return p;
            }
        }
        return null;
    }
}
