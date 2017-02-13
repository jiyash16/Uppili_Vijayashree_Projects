/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointments;

import Business.Person.Employee;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class Appointment {
    private static int count = 0;
    private int appointmentid;
    private String appointmentReason;
    private Date createdOn;
    private Employee bookingemployee;
    private boolean status= true;
    public Appointment()
    {
        count++;
        appointmentid = count;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(int appointmentid) {
        this.appointmentid = appointmentid;
    }

    public String getAppointmentReason() {
        return appointmentReason;
    }

    public void setAppointmentReason(String appointmentReason) {
        this.appointmentReason = appointmentReason;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Employee getBookingemployee() {
        return bookingemployee;
    }

    public void setBookingemployee(Employee bookingemployee) {
        this.bookingemployee = bookingemployee;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(appointmentid);
    }
}
