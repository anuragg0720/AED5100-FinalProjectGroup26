/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Admins.NGOAdmin;
import java.util.ArrayList;

/**
 *
 * @author anurag
 */
public class NGOAdminList {
    
    ArrayList<NGOAdmin> ngoAdminList;

    public NGOAdminList(ArrayList<NGOAdmin> ngoAdminList) {
        this.ngoAdminList = ngoAdminList;
    }

    public NGOAdminList() {
        
        
        this.ngoAdminList = new ArrayList<>();
        
    }

    public ArrayList<NGOAdmin> getNgoAdminList() {
        return ngoAdminList;
    }

    public void setNgoAdminList(ArrayList<NGOAdmin> ngoAdminList) {
        this.ngoAdminList = ngoAdminList;
    }
    
    
    public NGOAdmin addNGOAdmin (){
        
        NGOAdmin na = new NGOAdmin();
        ngoAdminList.add(na);
        return na;
        
    }
    
    
    
    
}
