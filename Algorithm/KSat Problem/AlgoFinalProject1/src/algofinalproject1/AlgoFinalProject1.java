/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinalproject1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jiya
 */
public class AlgoFinalProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,t,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select ways to solve k-sat:");
        System.out.println("1 ---- Read from file");
        System.out.println("2 ---- Random Generation");
        int choice = sc.nextInt();
        if(choice == 1)
        {
             try {
                    FileInputStream fis = new FileInputStream("E:/sample.txt");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

                //    System.out.println("Reading File line by line using BufferedReader");

                     n = Integer.parseInt(reader.readLine());
                     t = Integer.parseInt(reader.readLine());
                     k = 3;
                     String[] line = reader.readLine().split(" ");
                     Predicate p = new Predicate(n);
                     String[][] pre = new String[t][k];
                     Map<String,Integer> vars = p.getCls().getLit().getV().getVars();
                     int m = 0;
                     for(int i = 0; i<t; i++)
                     {
                         for(int j = 0; j< k;j++)
                         {
                              int lit = Integer.parseInt(line[m]);

//                                if(lit == n)
//                                lit = 0; 
                                if(vars.containsKey("x"+lit))
                                {   
                                    pre[i][j] = "x"+lit;
                                }
                                else
                                {
                                    int diff = Math.abs(lit-n);
                                    if(diff == n)
                                        diff = 0;
                                    pre[i][j] = "-x"+diff; 
                                }
                                m++;
                         }
                     }

                      findSolution(pre,n,t,k,p);

                } 
                catch (FileNotFoundException ex) {
                     System.out.println("No such file found");
                }
                catch(IOException e)
                {
                 
                }
                catch(Exception e)
                {
                    System.out.println("Invalid inputs");
                }
        }
        else
        {
            try
            {
                System.out.println("Enter number of variable:");
                 n = sc.nextInt();
                System.out.println("Enter number of clauses:");
                 t = sc.nextInt();
                System.out.println("Enter number of K-Sat:");
                 k = sc.nextInt();
                Predicate p = new Predicate(n);
                String[][] pre = p.getPre(t,k);
                findSolution(pre,n,t,k,p);
            }
            catch(Exception e)
            {
                System.out.println("Invalid inputs");
            }
        }
        
    }
    public static void findSolution(String[][] pre,int n,int t,int k,Predicate p)
    {
        Map<String,Integer> vars = p.getCls().getLit().getV().getVars();
        //String[][] addClause;
        if(n >0)
        {
            printPredicate(pre,t,k);
            int loop = 0;
            boolean solved = false;
                while(!solved && loop < 10)
                {
                        for(int j= 0; j<pre.length; j++)
                        {
                           // System.out.println("inside for");
                            String[] clause = pre[j];
                            if(!p.isClause(clause))
                            {
                                  solved = true;
                            }
                        }
                        if(solved)
                        {
                           System.out.println("Solution "+ loop +" : No solution found");
                           System.out.println("Node BackTracked :"+ nodeBackTracked(p));
                        }
                         else
                        {
                           
                            System.out.println("Solution "+ loop +" : ");
                            
                            for(Map.Entry<String,Integer> i : vars.entrySet())
                           {
                               if(i.getValue() == -1)
                                  System.out.println(i.getKey()+": Any Value");
                               else
                                  System.out.println(i.getKey()+":" + i.getValue()); 
                            }
                             System.out.println("Node BackTracked :"+ nodeBackTracked(p));
                        }

                        loop++;
                        p.clearClauses();
                         shuffle(pre,t,k);
                         unAssignVariables(vars);
                         p.clearCountMap();
                }

        }
        else
            System.out.println("Number of varibles should be greater than 0");
        
    }
     public static void shuffle(String[][] arr, int row, int col) {
  
         for(int i = 0; i<row;i++)
         {
                int r1 = i + (int) (Math.random() * (row - i));
                String[] swap1 = arr[r1];
                arr[r1] = arr[i];
                arr[i] = swap1;
                for(int j = 0; j<col; j++)
                {
                    int r2 = j + (int) (Math.random() * (col - j));
                     String swap2 = arr[i][r2];
                     arr[i][r2] = arr[i][j];
                     arr[i][j] = swap2;
                }
         }

         //System.out.println("shuffling clause");
       // printPredicate(arr,row,col);
    }
    public static void printPredicate(String[][] pre, int t, int k)
    {
           
        for(int i = 0; i<t;i++)
        {
            System.out.print("(");
            for(int j = 0; j<k;j++)
            {
                if(j== k-1)
                System.out.print(pre[i][j]);
                else
                System.out.print(pre[i][j]+"||");    
            }
            if(i == t-1)
            System.out.print(")");
            else
            System.out.print(")&&");    
        }
        System.out.println("");
    }
    public static void unAssignVariables(Map<String,Integer> vars)
    {
         for(Map.Entry<String,Integer> i : vars.entrySet())
          {
              vars.put(i.getKey(), -1);
          }
    }
    public static String nodeBackTracked(Predicate p)
    {
        int count = 0;
        for(Map.Entry<String,Integer> node : p.getCountChange().entrySet())
        {
            if(node.getValue()>=1 )
                count++;
        }
        return ""+count;
    }
}
