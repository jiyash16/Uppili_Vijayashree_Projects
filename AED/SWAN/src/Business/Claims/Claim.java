/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Claims;

import Business.PersonInsurance.InsurancePolicy;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class Claim {
    
    private static int count=0;
    private int claimId;
    private InsurancePolicy insurancePolicy;
    private double claimAmount;
    private int coPay;
    private Date createdOn;
    private String diagonosis;
    private Date modifiedOn;
    public Claim()
    {
        count++;
        claimId = count;
       
        
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getDiagonosis() {
        return diagonosis;
    }

    public void setDiagonosis(String diagonosis) {
        this.diagonosis = diagonosis;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public int getCoPay() {
        return coPay;
    }

    public void setCoPay(int coPay) {
        this.coPay = coPay;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(claimId);
    }
}
