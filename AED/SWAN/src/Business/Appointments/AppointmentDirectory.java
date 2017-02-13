/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointments;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class AppointmentDirectory {
    
    private ArrayList<Appointment> appointmentlist;
    
    public AppointmentDirectory()
    {
        appointmentlist = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppointmentlist() {
        return appointmentlist;
    }

    public void setAppointmentlist(ArrayList<Appointment> appointmentlist) {
        this.appointmentlist = appointmentlist;
    }
    
    public Appointment createAppointment()
    {
        Appointment ap = new Appointment();
        appointmentlist.add(ap);
        return ap;
    }
}
