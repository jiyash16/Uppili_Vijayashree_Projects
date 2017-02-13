/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vitals;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class Vital {
     private int respRate;
    private int heartRate;
    private int sysBP;
    private double weight;
    private Date currDate;
    private String vitalStatus;
  //  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
    //declaring getter setter of vital sign attribute
    public String getVitalStatus() {
        return vitalStatus;
    }

    public void setVitalStatus(String vitalStatus) {
        this.vitalStatus = vitalStatus;
    }
    
    public int getRespRate() {
        return respRate;
    }

    public void setRespRate(int respRate) {
        this.respRate = respRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSysBP() {
        return sysBP;
    }

    public void setSysBP(int sysBP) {
        this.sysBP = sysBP;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getCurrDate() {
        return currDate;
    }

    public void setCurrDate(Date currDate) {
        this.currDate = currDate;
    }
    
    //override function returns date for object
    @Override
    public String toString()
    {
        return vitalStatus;
    }
}
