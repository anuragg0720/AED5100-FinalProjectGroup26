/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

import Business.Directories.MedicineList;
import Business.Directories.LaboratoryList;
import java.util.ArrayList;


/**
 *
 * @author anurag
 */
public class Treatment {
    ArrayList<Medicine> medicineList;
    ArrayList<Laboratory> laboratoryList;
    String Status;
    String medicineStatus;
    String laboratoryStatus;
    String treatmentStatus;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Treatment(MedicineList medicineList, LaboratoryList laboratoryList, String Status) {
//        this.medicineList = medicineList;
//        this.laboratoryList = laboratoryList;

        this.medicineList= new ArrayList<Medicine>();
        this.laboratoryList = new ArrayList<Laboratory>();
        this.Status = Status;
        
    }

    public String getTreatmentStatus() {
        return treatmentStatus;
    }

    public void setTreatmentStatus(String treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public ArrayList<Laboratory> getLaboratoryList() {
        return laboratoryList;
    }

    public void setLaboratoryList(ArrayList<Laboratory> laboratoryList) {
        this.laboratoryList = laboratoryList;
    }

    public Treatment() {
        
        this.medicineList= new ArrayList();
        this.laboratoryList = new ArrayList();
        this.medicineStatus= "Pending";
        this.laboratoryStatus="Pending";
        this.treatmentStatus = "Pending";   
    }

    public String getLaboratoryStatus() {
        return laboratoryStatus;
    }

    public void setLaboratoryStatus(String laboratoryStatus) {
        this.laboratoryStatus = laboratoryStatus;
    }
    
    public String getMedicineStatus() {
        return medicineStatus;
    }

    public void setMedicineStatus(String medicineStatus) {
        this.medicineStatus = medicineStatus;
    }
    
    
     @Override
    public String toString()
    {
        return medicineStatus;
    }

}
