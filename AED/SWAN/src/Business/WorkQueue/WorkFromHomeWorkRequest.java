/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class WorkFromHomeWorkRequest extends WorkRequest{
    
    private Date wfhDate;
    private int duration;
    private String ip;
    private String adminApprovalStatus;
    private String socApprovalStatus;
    private String request;
    private UserAccount adminReceiver;
    private UserAccount socReceiver;
    public Date getWfhDate() {
        return wfhDate;
    }

    public void setWfhDate(Date wfhDate) {
        this.wfhDate = wfhDate;
    }

    public UserAccount getSocReceiver() {
        return socReceiver;
    }

    public void setSocReceiver(UserAccount socReceiver) {
        this.socReceiver = socReceiver;
    }

    public UserAccount getAdminReceiver() {
        return adminReceiver;
    }

    public void setAdminReceiver(UserAccount adminReceiver) {
        this.adminReceiver = adminReceiver;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAdminApprovalStatus() {
        return adminApprovalStatus;
    }

    public void setAdminApprovalStatus(String adminApprovalStatus) {
        this.adminApprovalStatus = adminApprovalStatus;
    }

    public String getSocApprovalStatus() {
        return socApprovalStatus;
    }

    public void setSocApprovalStatus(String socApprovalStatus) {
        this.socApprovalStatus = socApprovalStatus;
    }
    
    
    
}
