/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.TimeSheet.TimeSheetDirectory;
import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class Employee extends Person {
    
   
    private int employeeId;
    private Date hireDate;
    private boolean status=true;
    private SimpleDateFormat sdf;
    private static int count = 1;
    private TimeSheetDirectory timeSheetDirectory;
    
    public Employee() {
        sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        employeeId = count;
        count++;
        timeSheetDirectory = new TimeSheetDirectory();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TimeSheetDirectory getTimeSheetDirectory() {
        return timeSheetDirectory;
    }

    public void setTimeSheetDirectory(TimeSheetDirectory timeSheetDirectory) {
        this.timeSheetDirectory = timeSheetDirectory;
    }

   

   

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
    
    
}
