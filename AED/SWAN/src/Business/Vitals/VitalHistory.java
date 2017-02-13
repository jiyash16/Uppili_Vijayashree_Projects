/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vitals;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class VitalHistory {
      //Declaring variables for array list and patient object
    private ArrayList<Vital> vitalSignHistory;
    
    
    //initialising arraylist and patient object inside constructor
    public VitalHistory()
    {
        vitalSignHistory = new ArrayList<Vital>();
        
    }
    //getter of ArrayList
    public ArrayList<Vital> getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    //Create method used to add vital reports of a patient
     public Vital createVitals()
    {
        //Initializing vitals object
        Vital vs = new Vital();
        
        //Adding newly created vital object into arraylist
        vitalSignHistory.add(vs);
        
        return vs;
    }
     public void deleteVital(Vital v)
     {
         vitalSignHistory.remove(v);
     }
     
}
