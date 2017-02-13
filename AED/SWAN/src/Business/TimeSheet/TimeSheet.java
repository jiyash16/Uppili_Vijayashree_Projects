/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TimeSheet;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class TimeSheet {
    
    private Date today;
    private boolean present=false;
    private boolean WFH = false;
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    private int duration;
    public TimeSheet()
    {
     
        
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public boolean isWFH() {
        return WFH;
    }

    public void setWFH(boolean WFH) {
        this.WFH = WFH;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(duration);
    }
}
