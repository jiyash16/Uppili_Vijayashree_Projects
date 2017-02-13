/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonInsurance;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class InsurancePolicyDirectory {
    
    private ArrayList<InsurancePolicy> insurancePolicyDirectory;
    
    public InsurancePolicyDirectory()
    {
        insurancePolicyDirectory = new ArrayList<InsurancePolicy>();
    }

    public ArrayList<InsurancePolicy> getInsurancePolicyDirectory() {
        return insurancePolicyDirectory;
    }

    public InsurancePolicy createPolicy()
    {
        InsurancePolicy ip = new InsurancePolicy();
        insurancePolicyDirectory.add(ip);
        return ip;
    }
    public void deleteInsurance(InsurancePolicy ip)
    {
        insurancePolicyDirectory.remove(ip);
    }
    
}
