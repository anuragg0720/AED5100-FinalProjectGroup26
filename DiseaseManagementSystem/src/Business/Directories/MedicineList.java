/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Model.Medicine;
import java.util.ArrayList;

/**
 *
 * @author agnel
 */
public class MedicineList {
    
    ArrayList<Medicine> medicineList;
    
    String medicineStatus;

    public String getMedicineStatus() {
        return medicineStatus;
    }

    public void setMedicineStatus(String medicineStatus) {
        this.medicineStatus = medicineStatus;
    }

    public MedicineList() {
        this.medicineList = new ArrayList<>();
        this.medicineStatus = "Pending";
    }

    

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine addMedicine(){
        Medicine m = new Medicine();
        medicineList.add(m);
        return m;
        
                
    }
    
    
    
    
    
    
}
