/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Appointments.AppointmentDirectory;
import Business.Claims.ClaimDirectory;
import Business.PersonInsurance.InsurancePolicyDirectory;
import Business.Vitals.VitalHistory;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class Patient extends Person{
    
    private int patientId;
    private VitalHistory vitalSignHistory;
    private InsurancePolicyDirectory insurancePolicyDirectory;
    private ClaimDirectory claimDirectory;
    private boolean isSurveyTaken = false;
    private static int count = 100;
    private boolean status=true;
    private boolean patientSurveyTaken = false;
    private String surveyQ1;
    private String surveyQ2;
    private String surveyQ3;
    private String surveyQ4;
    private Date createdOn;
    private AppointmentDirectory appoitmentDirectory;
    public Patient()
    {
        count++;
        patientId = count;
        vitalSignHistory = new VitalHistory();
        insurancePolicyDirectory = new InsurancePolicyDirectory();
        claimDirectory = new ClaimDirectory();
        appoitmentDirectory = new AppointmentDirectory();
    }

    public int getPatientId() {
        return patientId;
    }

    public AppointmentDirectory getAppoitmentDirectory() {
        return appoitmentDirectory;
    }

    public void setAppoitmentDirectory(AppointmentDirectory appoitmentDirectory) {
        this.appoitmentDirectory = appoitmentDirectory;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public boolean isIsSurveyTaken() {
        return isSurveyTaken;
    }

    public void setIsSurveyTaken(boolean isSurveyTaken) {
        this.isSurveyTaken = isSurveyTaken;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public VitalHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public boolean isPatientSurveyTaken() {
        return patientSurveyTaken;
    }

    public void setPatientSurveyTaken(boolean patientSurveyTaken) {
        this.patientSurveyTaken = patientSurveyTaken;
    }

    public String getSurveyQ1() {
        return surveyQ1;
    }

    public void setSurveyQ1(String surveyQ1) {
        this.surveyQ1 = surveyQ1;
    }

    public String getSurveyQ2() {
        return surveyQ2;
    }

    public void setSurveyQ2(String surveyQ2) {
        this.surveyQ2 = surveyQ2;
    }

    public String getSurveyQ3() {
        return surveyQ3;
    }

    public void setSurveyQ3(String surveyQ3) {
        this.surveyQ3 = surveyQ3;
    }

    public String getSurveyQ4() {
        return surveyQ4;
    }

    public void setSurveyQ4(String surveyQ4) {
        this.surveyQ4 = surveyQ4;
    }
    

    public InsurancePolicyDirectory getInsurancePolicyDirectory() {
        return insurancePolicyDirectory;
    }

    public void setInsurancePolicyDirectory(InsurancePolicyDirectory insurancePolicyDirectory) {
        this.insurancePolicyDirectory = insurancePolicyDirectory;
    }

    public ClaimDirectory getClaimDirectory() {
        return claimDirectory;
    }

    public void setClaimDirectory(ClaimDirectory claimDirectory) {
        this.claimDirectory = claimDirectory;
    }

  

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString()
    {
        return this.getFirstName() + " " + this.getLastName();
    }
    
    
}
