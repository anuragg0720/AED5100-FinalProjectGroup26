/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

import java.util.ArrayList;

/**
 *
 * @author agnel
 */
public class Doctor extends User{
    String degree;
    City city;
    Hospital hospital;
    String qualification;
    ArrayList<Patient> patientList;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    

    public Doctor() {
        this.patientList=new ArrayList<Patient>();
    }

    public ArrayList<Patient> getDocPatList() {
        return patientList;
    }

//    public PatientList getPatientList() {
//        return patientList;
//    }
//
//    public void setPatientList(PatientList patientList) {
//        this.patientList = patientList;
    public void setDocPatList(ArrayList<Patient> docPatList) {
        this.patientList = docPatList;
    }

//    }
    public Doctor(String degree, City city, Hospital hospital, String Name, String Username, String password) {
        super(Name, Username, password);
        this.degree = degree;
        this.city = city;
        this.hospital = hospital;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String toString()
    {
        return Name;
    }
    
    
}
