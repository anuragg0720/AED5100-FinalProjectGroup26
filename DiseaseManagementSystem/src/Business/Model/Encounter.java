/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

import java.util.Date;

/**
 *
 * @author agnel
 */
public class Encounter {
    public static int counter=100;
   
   String encounterName ;
    
    VitalSigns vitalSigns;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Encounter.counter = counter;
    }
    
    Doctor doctor;
    
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    

    
    
    Treatment treatment;
    
    String diagnosis;

    public Encounter(VitalSigns vitalSigns, Treatment treatment, String diagnosis,Doctor doctor) {
        this.vitalSigns = vitalSigns;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.doctor=doctor;
        this.encounterName = encounterName;
        
        
        
        
        this.date = new Date();
        
        
        counter++;
        
        
    }

    public String getEncounterName() {
        return encounterName;
    }

    public void setEncounterName(String encounterName) {
        this.encounterName = encounterName;
    }
    
    public Encounter() {
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    
     @Override
    public String toString()
    {
        return encounterName;
    }

    
}
