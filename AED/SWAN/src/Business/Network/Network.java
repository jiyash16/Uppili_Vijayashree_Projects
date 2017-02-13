/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jiya
 */
public class Network {
    
    private static int count=0;
    private int networkId;
    private String name;
    private Date createdOn;
    private Date modifiedOn;
    
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
        count++;
        networkId = count;
        enterpriseDirectory = new EnterpriseDirectory();
    
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetworkId() {
        return networkId;
    }

    public void setNetworkId(int networkId) {
        this.networkId = networkId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
            this.createdOn = createdOn;
       
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        
            this.modifiedOn = modifiedOn;
        
    }

    
    
    @Override
    public String toString() {
        return name;
    }
    
}
