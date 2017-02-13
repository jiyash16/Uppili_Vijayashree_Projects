/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Jiya
 */
public class IPConfig {
    
    private String ip;
    private String location;
    private int homeip=0;
    private Date wfhDate;

    public Date getWfhDate() {
        return wfhDate;
    }

    public void setWfhDate(Date wfhDate) {
        this.wfhDate = wfhDate;
    }
    
    
    public int getHomeip() {
        return homeip;
    }

    public void setHomeip(int homeip) {
        this.homeip = homeip;
    }
    
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public String toString()
    {
        return ip;
    }
    
}
