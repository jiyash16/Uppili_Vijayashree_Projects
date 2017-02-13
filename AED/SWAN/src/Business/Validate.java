/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Jiya
 * This class is handles various types of validation like is number is string is double 
 * This class also check the vital sign range based on age of patient
 */
public class Validate {
    //Method to check given number is integer or not
  private static final Logger logger = Logger.getLogger("MyLog");
    public static boolean isNumeric(String num)
    {
        try
        {
            int a = Integer.parseInt(num);
            if(a>0)
            {
                //System.out.println("number valid" +num);
               return true; 
            }
            else
            {
                //System.out.println("number invalid" +num);
                return false;
            }
        }
        catch(NumberFormatException e)
        {
           // System.out.println("number invalid" +num);
            return false;
        }
        
    }
    //method to check given string is alpha
    public static boolean isString(String st)
    {
        return st.matches("[^ 0-9][a-z A-Z]*$");
    }
      //method to check given string is alphanumeric
    public static boolean isalphanumeric(String st)
    {
        return st.matches("[^ ][a-z A-Z 0-9]*$");
    }
  
    //method to check given string is alpha
    public static boolean isEmail(String st)
    {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        //System.out.println("email valid" +st.matches(EMAIL_REGEX));
        return st.matches(EMAIL_REGEX);
    }
    //method to check given string is double
    public static boolean isDouble(String str)
    {
        try
        {
            double a = Double.parseDouble(str);
            if(a>0)
            {
          //      System.out.println("double valid" +str);
               return true; 
            }
            else
            {
            //    System.out.println("double invalid" +str);
                return false;
            }
        }
        catch(NumberFormatException e)
        {
         //   System.out.println("double invalid" +str);
            return false;
        }
       
    }
    //method to check whether given string is long
    public static boolean isLong(String str)
    {
        try
        {
            long a = Long.parseLong(str);
            if(a>0)
            {
          //      System.out.println("double valid" +str);
               return true; 
            }
            else
            {
            //    System.out.println("double invalid" +str);
                return false;
            }
        }
        catch(NumberFormatException e)
        {
         //   System.out.println("double invalid" +str);
            return false;
        }
       
    }
    //method to check whether given string is empty
    public static boolean isEmpty(String str)
    {
        if(str.isEmpty())
        {
            return true;
        }
        return false;
    }
    
    public static boolean isPhone(String Phone)
    {
        try
        {
            long p = Long.parseLong(Phone);
           // System.out.print(Phone.length());
        if(Phone.length()== 10)
        {
           // System.out.println("phone valid" +Phone);
            return true;
        }
        else
        {
           // System.out.println("phone valid" +Phone);
            return false;
        }
        }
        catch(Exception e)
        {
           // System.out.print(Phone.length());
            return false;
        }
    }
     public static boolean isSSN(String ssn)
    {
        if(ssn.contains("-"))
        {
         String SSN_REGEX =  "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";
         
  // System.out.println("ssn valid" +ssn.matches(SSN_REGEX));
        return ssn.matches(SSN_REGEX);
        }
        else
            return false;
    }
      public static boolean isDate(String date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1;
        try
        {
            date1 = sdf.parse(date);
    //        System.out.println("date valid" +date);
            return true;
        }
        catch(Exception e)
        {
      //      System.out.println("date invalid" +date);
          return false;   
        }
                
         
    }
      //method to check ip address is valid of not
    public static boolean isIP(String str)
    {
         String IP_REGEX = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
          return str.matches(IP_REGEX);
    }
       //method to check the patient vital status whether normal or abnormal based on range of vitals given
    public static boolean checkRange(int age,int rr, int hr, int bp, double wt)
    {
        //Validation for Toddler age
        if(age >=1 && age <=3)
        {
            if(rr >=20 && rr <=30 && hr >= 80 && hr <=130 && bp >=80 && bp <= 110 && wt >= 22 && wt <=31)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        //Validation for PreSchooler age
        else if(age >=4 && age <=5)
        {
            if(rr >=20 && rr <=30 && hr >= 80 && hr <=120 && bp >=80 && bp <= 110 && wt >= 31 && wt <=40)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }
        //Validation for School age
        else if(age >=6 && age <=12)
        {
            if(rr >=20 && rr <=30 && hr >= 70 && hr <=110 && bp >=80 && bp <= 120 && wt >= 41 && wt <=92)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        //Validation for Adolescent age
        else
        {
            if(rr >=12 && rr <=20 && hr >= 55 && hr <=105 && bp >=110 && bp <= 120 && wt > 110)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void createLogFile(String userName,String message)
    {
          

        //
        // Create an instance of FileHandler that write log to a file called
        // app.log. Each new message will be appended at the at of the log file.
        //
        try { 
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new Date();
           String date1 = sdf.format(date);
           String newdate = date1.replace("/", "");
        FileHandler fileHandler = new FileHandler("src/LogFiles/Employee_"+userName+"_"+newdate+".txt", true);   
         
        SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter); 
        
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false);
       
       
           logger.info(message);
           fileHandler.close();
        }
       
        catch(Exception e)
        {
            System.out.println("file creation error");
        }
    }

    
}
