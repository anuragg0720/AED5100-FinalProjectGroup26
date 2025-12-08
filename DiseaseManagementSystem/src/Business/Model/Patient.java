/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

import Business.Directories.EncounterHistory;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author agnel
 */
public class Patient extends User{
    String address;
    City city;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    double phone;
    String purpose;
    Date date;
    ArrayList<Doctor> doctors;
    
    InsuranceAdmin insuranceAdmin;
    
    
    boolean ngoRequest;
    
    int accountBal ;
    
    String insuranceRequest;
    
    int coverAmount;

    public String getInsuranceRequest() {
        return insuranceRequest;
    }

    public void setInsuranceRequest(String insuranceRequest) {
        this.insuranceRequest = insuranceRequest;
    }

   

   
    EncounterHistory encounterhistory;
    
    ArrayList<Encounter> encounterHistory;
    

    public Patient(String address, City city, double phone, String purpose, Date date, String Name, String Username, String password) {
        super(Name, Username, password);
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.purpose = purpose;
        this.date = date;
        
        this.encounterHistory = new ArrayList<Encounter>();
        this.doctors = new ArrayList<>();
        
        
    }
    
     public Patient() {
         this.encounterHistory = new ArrayList<Encounter>();
         this.accountBal = 0;
         this.ngoRequest= false;
         this.insuranceRequest = "Not Insured";
         this.coverAmount = 0;
         this.doctors = new ArrayList<>();
         
         
         
         
    }

    public int getCoverAmount() {
        return coverAmount;
    }

    public void setCoverAmount(int coverAmount) {
        this.coverAmount = coverAmount;
    }

    public int getAccountBal() {
        return accountBal;
    }

    public boolean isNgoRequest() {
        return ngoRequest;
    }

    public InsuranceAdmin getInsuranceAdmin() {
        return insuranceAdmin;
    }

    public void setInsuranceAdmin(InsuranceAdmin insuranceAdmin) {
        this.insuranceAdmin = insuranceAdmin;
    }

    public void setNgoRequest(boolean ngoRequest) {
        this.ngoRequest = ngoRequest;
    }

    public void setAccountBal(int accountBal) {
        this.accountBal = accountBal;
    }

//    public Doctor getDoctor() {
//        return doctor;
//    }
//
//    public void setDoctor(Doctor doctor) {
//        this.doctor = doctor;
//    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    @Override
    public String toString()
    {
        return Name;
    }

}
