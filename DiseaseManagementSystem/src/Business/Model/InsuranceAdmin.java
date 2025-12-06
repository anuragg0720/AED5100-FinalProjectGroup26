/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

import Business.Model.User;
import java.util.ArrayList;

/**
 *
 * @author atish
 */
public class InsuranceAdmin  extends User  {
    
    int premium;
    int coverage;
    ArrayList<Patient> insurancePatientList;
    

   

    public InsuranceAdmin(int premium, int coverage, String Name, String Username, String password) {
        super(Name, Username, password);
        this.premium = premium;
        this.coverage = coverage;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public InsuranceAdmin() {
        
        this.insurancePatientList = new ArrayList<>();
        
    }

    public ArrayList<Patient> getInsurancePatientList() {
        return insurancePatientList;
    }

    public void setInsurancePatientList(ArrayList<Patient> insurancePatientList) {
        this.insurancePatientList = insurancePatientList;
    }
    
    
    @Override
    public String toString()
    {
        return Name;
    }
    
}
