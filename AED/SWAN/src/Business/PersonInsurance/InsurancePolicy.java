/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonInsurance;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class InsurancePolicy {
    
    private String policyNumber;
    private String groupNumber;
    private long insuranceId;
    private Date effectiveDate;
    private String policyName;
    private boolean isActive;
    private InsuranceType insuranceType;
    private SimpleDateFormat sdf;
    public InsurancePolicy()
    {
        sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        
    }
        
    public enum InsuranceType{
        Medicare("Medicare"),
        Medicaid("Medicaid");
        
        private String value;

        private InsuranceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        
        @Override
        public String toString() {
            return value;
        }
    }

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString()
    {
        return policyNumber;
    }
    
}
