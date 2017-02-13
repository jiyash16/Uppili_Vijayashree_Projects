/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Jiya
 */
public class Person {
    
    private int personId;
    private String firstName;
    private String lastName;
    private static int i =1000;
    private Date DOB;
    private String email;
    private long phone;
    private String address;
    private String location;
    private String title;
    private String gender;
    private boolean maritalStatus;
    private String ssn;
    private File personPicture;
    private boolean isPatient;
    private File picture;
    SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");;
    public Person()
    {
        
        personId = i++;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
     public File getPersonPicture() {
        return personPicture;
    }

    public void setPersonPicture(File personPicture) {
        this.personPicture = personPicture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public boolean isIsPatient() {
        return isPatient;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }

   public int calculateAge(String dob)
   {
       int age = 0;
       try
       {
           System.out.println("age" + dob);
      //  String text = sdf.format(DOB);
           
          Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
          Calendar c1 = Calendar.getInstance();
          c1.setTime(date);
          
          Calendar c2 = Calendar.getInstance();
          c2.setTime(new Date());
           age = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
           System.out.println("age " +age);
        
       }
       catch(Exception e)
       {
           System.out.println("age exception");
       }
          return age;
   }
    
}
