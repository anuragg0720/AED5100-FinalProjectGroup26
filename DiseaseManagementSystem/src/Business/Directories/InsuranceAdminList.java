/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Model.InsuranceAdmin;
import java.util.ArrayList;

/**
 *
 * @author atish
 */
public class InsuranceAdminList {
    
    ArrayList< InsuranceAdmin> insuranceAdminList;

    public InsuranceAdminList(ArrayList<InsuranceAdmin> insuranceAdminList) {
        this.insuranceAdminList = insuranceAdminList;
    }

    public InsuranceAdminList() {
        this.insuranceAdminList = new ArrayList<>();
        
    }

    public ArrayList<InsuranceAdmin> getInsuranceAdminList() {
        return insuranceAdminList;
    }

    public void setInsuranceAdminList(ArrayList<InsuranceAdmin> insuranceAdminList) {
        this.insuranceAdminList = insuranceAdminList;
    }
    
    public InsuranceAdmin addInsuranceAdmin () {
        InsuranceAdmin ia = new InsuranceAdmin();
        insuranceAdminList.add(ia);
        return ia;
    }
    
}
