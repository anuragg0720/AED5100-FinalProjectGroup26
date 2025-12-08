/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Admins.PharmacyAdmin;
import java.util.ArrayList;
/**
 *
 * @author anurag
 */
public class PharmacyAdminList {
    ArrayList<PharmacyAdmin> pharmacyAdminList;

    public PharmacyAdminList() {
        System.out.println("in cons");
        this.pharmacyAdminList = new ArrayList<PharmacyAdmin>();
        
    }

    public ArrayList<PharmacyAdmin> getPharmacyAdminList() {
        
        System.out.println("get");
        return pharmacyAdminList;
    }

    public void setPharmacyAdminList(ArrayList<PharmacyAdmin> pharmacyAdminList) {
        this.pharmacyAdminList = pharmacyAdminList;
    }

    
    
    
    public PharmacyAdmin addPharmacyAdmin(){
        System.out.println("in pharmfirst");
        PharmacyAdmin pa = new PharmacyAdmin();
        System.out.println("in pharm");
        pharmacyAdminList.add(pa);
        return pa;
        
       
    }
    
    
}
