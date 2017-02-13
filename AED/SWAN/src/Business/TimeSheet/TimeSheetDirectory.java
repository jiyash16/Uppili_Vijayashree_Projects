/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TimeSheet;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class TimeSheetDirectory {
    private ArrayList<TimeSheet> timesheetDirectory;
    
    public TimeSheetDirectory()
    {
        timesheetDirectory = new ArrayList<TimeSheet>();
    }

    public ArrayList<TimeSheet> getTimesheetDirectory() {
        return timesheetDirectory;
    }

    public void setTimesheetDirectory(ArrayList<TimeSheet> timesheetDirectory) {
        this.timesheetDirectory = timesheetDirectory;
    }
    public TimeSheet fillTimesheet()
    {
        TimeSheet ts = new TimeSheet();
        timesheetDirectory.add(ts);
        return ts;
        
    }
    
}
