/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Employee;
import Business.Person.Patient;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;
    
    public UserAccountDirectory()
    {
        userAccountDirectory = new ArrayList<UserAccount>();
    }
     public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
       userAccount.setEmployee(employee);
       userAccount.setRole(role);
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
     public UserAccount createUserAccountPatient(String username, String password, Patient patient, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
       userAccount.setPatient(patient);
       userAccount.setRole(role);
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
    public void deleteUserAccount(UserAccount ua)
    {
        userAccountDirectory.remove(ua);
    }
    public boolean searchUserAccount(String UserId)
    {
        for(UserAccount ua : userAccountDirectory)
        {
            if(ua.getUsername().equalsIgnoreCase(UserId))
            {
                return true;
            }
        }
        return false;
    }
    public UserAccount searchUserAccountpresent(String UserId)
    {
        for(UserAccount ua : userAccountDirectory)
        {
            if(ua.getUsername().equalsIgnoreCase(UserId))
            {
                return ua;
            }
        }
        return null;
    }
    
        public UserAccount forgetPawword(String UserId)
    {
        for(UserAccount ua : userAccountDirectory)
        {
            if(ua.getUsername().equalsIgnoreCase(UserId))
            {
                return ua;
            }
        }
        return null;
    }
     public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountDirectory){

            if (ua.getUsername().equalsIgnoreCase(username) && ua.getPassword().equals(password) && ua.isStatus()){
                return ua;
            }
        }   return null;
    }
     

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(ArrayList<UserAccount> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
   
    
    
}
