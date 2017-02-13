/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Claims;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class ClaimDirectory {
     private ArrayList<Claim> claimList;
    
    public ClaimDirectory()
    {
        claimList = new ArrayList<Claim>();
    }

    public ArrayList<Claim> getClaimList() {
        return claimList;
    }

    public void setClaimList(ArrayList<Claim> claimList) {
        this.claimList = claimList;
    }

   

    public Claim createClaim()
    {
        Claim claim = new Claim();
        claimList.add(claim);
        return claim;
    }
    public void deleteClaim(Claim c)
    {
        claimList.remove(c);
    }
}
