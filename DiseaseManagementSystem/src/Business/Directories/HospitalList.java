/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Model.Hospital;
import java.util.ArrayList;

/**
 *
 * @author agnel
 */
public class HospitalList {
    
    ArrayList<Hospital> hospitalList;

    public HospitalList() {
        this.hospitalList = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public Hospital addHospital(){
        Hospital h = new Hospital();
        hospitalList.add(h);
        return h;
        
    }

    public Hospital findHospitalByHospitalName(String hospitalString) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for(Hospital h : hospitalList){
            if(h.getHospitalName().equals(hospitalString)){
                return h;
            }
        }
        return null;
    }
    
    
    
}
