/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;


import Business.Model.Doctor;
import java.util.ArrayList;

/**
 *
 * @author agnel
 */
public class DoctorList {
    
    ArrayList<Doctor> doctorList;

    public DoctorList() {
        this.doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    
    public Doctor addDoctor(){
        Doctor d = new Doctor();
        doctorList.add(d);
        return d;
        
    }
    
    
    
}