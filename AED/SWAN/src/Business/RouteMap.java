/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class RouteMap {
    
    private ArrayList<IPConfig> iplist;
    
    public RouteMap()
    {
        iplist = new ArrayList<IPConfig>();
         for(int i = 0 ; i<10;i++)
        {
            IPConfig ip = addnewIP();
            ip.setIp("172.16.000.00"+i);
            ip.setLocation("USA");
        }
        for(int i1 = 10 ; i1<99;i1++)
        {
            IPConfig ip = addnewIP();
            ip.setIp("172.16.000.00"+i1);
            ip.setLocation("USA");
        }
        for(int j = 0 ; j<10;j++)
        {
            IPConfig ip = addnewIP();
            ip.setIp("172.31.000.00"+j);
            ip.setLocation("India");
        }
        for(int j1 = 10 ; j1<100;j1++)
        {
            IPConfig ip = addnewIP();
            ip.setIp("172.31.000.0"+j1);
            ip.setLocation("India");
        }
    }

    public ArrayList<IPConfig> getIplist() {
        return iplist;
    }

    public void setIplist(ArrayList<IPConfig> iplist) {
        this.iplist = iplist;
    }
    
    public IPConfig addnewIP()
    {
        IPConfig ip = new IPConfig();
        iplist.add(ip);
        return ip;
    }
    public IPConfig checkIPPresent(String IP)
    {
        for(IPConfig ip : iplist)
        {
            if(ip.getIp().equals(IP))
            {
                return ip;
            }
        }
        return null;
    }
    public void deleteIP(String ip)
    {
         for(IPConfig ip1 : iplist)
        {
            if(ip1.getIp().equals(ip))
            {
                System.out.println("removing ip");
                iplist.remove(ip1);
            }
        }
    }
    public void deleteCompleteIP(IPConfig ip)
    {
         
                iplist.remove(ip);
        
    }
}
