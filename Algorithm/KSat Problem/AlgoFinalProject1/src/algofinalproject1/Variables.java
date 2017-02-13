/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinalproject1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Jiya
 */
public class Variables {
    Map<String,Integer> vars;
    public Variables(int n)
    {
        vars = new TreeMap<String,Integer>();
        for(int i = 0; i< n ; i++)
        {
            vars.put("x"+i, -1);
          //  System.out.println("hashmap:"+vars.get(i));
        }
        
    }

    public Map<String, Integer> getVars() {
        return vars;
    }

    public void setVars(Map<String, Integer> vars) {
        this.vars = vars;
    }
    
}
