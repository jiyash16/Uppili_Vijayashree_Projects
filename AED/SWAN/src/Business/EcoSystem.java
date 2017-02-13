package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private RouteMap rmap;
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null,null);
        networkList = new ArrayList<>();
        rmap = new RouteMap();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
     public void deleteNetwork(Network network) {
        
        networkList.remove(network);
        
    }

    public RouteMap getRmap() {
        return rmap;
    }

    public void setRmap(RouteMap rmap) {
        this.rmap = rmap;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

          for (Network network : networkList) {
            if (!this.getUserAccountDirectory().searchUserAccount(username)) {
               return false;
             }

      
        }

        return true;
    }
}