/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinalproject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jiya
 */
public class Predicate {
    private String[][] pre;
    private Clause cls;
    private Map<String,Integer> newMap;
    private Map<String,Integer> countChange = new HashMap<String,Integer>();
    public ArrayList<String[]> addclauses = new ArrayList<String[]>();
    public Predicate(int n)
    {
        this.cls = new Clause(n);
        newMap = cls.getLit().getV().getVars();
 
    }

    public String[][] getPre(int t, int k) {
        //System.out.println("k:"+k+"t:"+t);
        pre = new String[t][k];
        for(int i = 0 ; i<t; i++)
        {
            
            if(i==t-1)
                pre[i] = cls.getCls(k);
            else
            pre[i] = cls.getCls(k);    
        }    
        
        return pre;
    }

    public Clause getCls() {
        return cls;
    }

    public void setCls(Clause cls) {
        this.cls = cls;
    }

    public Map<String, Integer> getCountChange() {
        return countChange;
    }

    public void setCountChange(Map<String, Integer> countChange) {
        this.countChange = countChange;
    }

    

//method clears the arraylist consist of clauses added while iterating through all clauses in predicate
    public void clearClauses() {
        addclauses.clear();
    }
    //method updates the count value of changed variables to 0
    public void clearCountMap()
    {
         for(Map.Entry<String,Integer> i : countChange.entrySet())
          {
              countChange.put(i.getKey(), 0);
          }
    }
   // below method calls recursive function to check clause values
   public boolean isClause(String[] clause)
   {
       addclauses.add(clause);
       int size = addclauses.size();
       for(String x : clause)
       {
           //if the hashmap has variable assigned to value -1 than only it replace the value to 0
           if(newMap.get(x.replace("-", "")) == -1)
           {
               newMap.put(x.replace("-", ""),0);
               countChange.put(x.replace("-", ""),0);
           }
        
       }
       //recursive function call to check each clause with variable assignment changes
      if(backTrack(addclauses.get(size-1),size-1))
          return true;
      
       
       return false;
   }
   public boolean backTrack(String[] clause,int j)
   {
       //System.out.println("value of j"+j);
       //terminating contion for recursive call
       if(j == 0)
       {
            //iterating through each variables present in clause and checking whether the clause turn out to be true
            for(String x: clause)
           {
               //System.out.println("Countchange value of x for j==0"+x+":"+countChange.get(x.replace("-", "")));
               //Calling checkclause function which check the clause taking current value of variable assigned above  
               if(checkClause(x))
                 {
                    // System.out.println("inside j==0 check clause true"+x);
                     return true;
                 }
                 else
                 {
                     /*if current value of x is not returning clause as true than updating the value of x
                     incrementing the count of variable changed in hashmap if it is more than twice and still function returns false
                     if count for particular variable reaches to 2 it cannot be updated further we need to procced with other variable
                     */
                     if(countChange.get(x.replace("-", "")) == 0)
                     {
                        if(newMap.get(x.replace("-", "")) == 0)
                        {
                             //System.out.println("replacing value of "+x+" to 1");
                             newMap.put(x.replace("-", ""),1);
                             countChange.put(x.replace("-", ""),countChange.get(x.replace("-", ""))+1);
                        }
                        else
                        {
                            // System.out.println("replacing value of "+x+" to 0");
                             newMap.put(x.replace("-", ""),0);
                             countChange.put(x.replace("-", ""),countChange.get(x.replace("-", ""))+1);
                        }
                        if(!checkClause(x))
                        {
                               
                                newMap.put(x.replace("-", ""),-1);
                          //      System.out.println("inside else of checkclause returning false for "+x);
                                countChange.put(x.replace("-", ""),0);
                        }
                        else
                           return true;
                     }
                 }         
           }
           return false;
       }
       else
       {
          for(String x: clause)
           {
               //System.out.println("Countchange value of "+x+":"+countChange.get(x.replace("-", "")));
               //if the clause with variable x returns true than recursive call with the previous clause
                 if(checkClause(x))
                 {
                        //System.out.println("inside else of j==0 backtracking check clause true"+x);
                        return backTrack(addclauses.get(j-1),j-1);
                 }
                 else
                 {
                     
                     if(countChange.get(x.replace("-", "")) == 0)
                     {
                        if(newMap.get(x.replace("-", "")) == 0)
                        {
                            // System.out.println("inside else of j==0 replacing value of "+x+" to 1");
                            newMap.put(x.replace("-", ""),1);
                            countChange.put(x.replace("-", ""),countChange.get(x.replace("-", ""))+1);
                        }
                        else
                        {
                             //System.out.println("inside else of j==0  replacing value of "+x+" to 0");
                            newMap.put(x.replace("-", ""),0);
                            countChange.put(x.replace("-", ""),countChange.get(x.replace("-", ""))+1);
                        }
                        if(!checkClause(x))
                        {
//                            count++;
//                            this.nodeBackTracked = count;
                            newMap.put(x.replace("-", ""),-1);
                            //System.out.println("inside else of j==0  of checkclause returning false for "+x);
                            countChange.put(x.replace("-", ""),0);
                        }
                         else
                        {
                          //  System.out.println("recursive call for backtrack");
                           return backTrack(addclauses.get(j-1),j-1);
                        }
                     }
                 }         
           }
          
       }
       return false;
       
       }
   public boolean checkClause(String x)
   {
           if(x.contains("-"))
           {
              // System.out.println(x+" contains -");
               if(newMap.get(x.replace("-", ""))==0)
               {
                   //System.out.println("inversing value returning true if");
                return true;
               }
               
           }
           else
           {
               if(newMap.get(x) ==1)
               {
                  // System.out.println("checking value returning true else");
                   return true;
               }
           }
       
    
       return false;
   }
    
}
