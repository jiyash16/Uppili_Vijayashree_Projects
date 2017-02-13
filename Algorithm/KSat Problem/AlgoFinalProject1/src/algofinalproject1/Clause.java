/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinalproject1;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class Clause {
    private String[] cls;
    private Literals lit;
    
    public Clause(int n)
    {
        lit = new Literals(n);
    
       
    }

    public String[] getCls(int k) {
        cls = new String[k];
        for(int i = 0; i<k ; i++)
        { 
            if(i == k-1)
                cls[i] = lit.getLit();
             else
            cls[i] = lit.getLit();    
        } 
        return cls;
    }

    public Literals getLit() {
        return lit;
    }

    public void setLit(Literals lit) {
        this.lit = lit;
    }
   
    @Override
    public String toString()
    {return cls.toString();}
    
}
