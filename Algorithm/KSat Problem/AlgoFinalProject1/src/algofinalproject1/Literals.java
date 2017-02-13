/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinalproject1;

import java.util.Random;

/**
 *
 * @author Jiya
 */
public class Literals {

    private Variables v;
    private int n;
    Random rand = new Random();
    public Literals(int n)
    {
        v = new Variables(n);
        this.n = n;
    }
    public String getLit() {
       int lit = getRandom(n);
    //  System.out.println("Random literal:"+lit);
//        if(lit == n)
//        lit = 0; 
        if(v.getVars().containsKey("x"+lit))
        {
           /// System.out.println("got lit");
        return "x"+lit;
        }
        else
        {
            int diff = Math.abs(lit-n);
            if(diff == n)
                diff = 0;
           // System.out.println("Didnt get"+diff);
            
            return "-x"+diff; 
        }
    }   

    public int getRandom(int n)
    {
        return rand.nextInt(2*n);
    }

    public Variables getV() {
        return v;
    }

    public void setV(Variables v) {
        this.v = v;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}
