/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Admins.TreatmentUnitAdmin;
import java.util.ArrayList;

/**
 *
 * @author anurag
 */
public class TreatmentUnitAdminList {
    
    ArrayList<TreatmentUnitAdmin> treatmentUnitAdminList;

    public TreatmentUnitAdminList() {
        
        this.treatmentUnitAdminList = new ArrayList<TreatmentUnitAdmin>();
    }

    public ArrayList<TreatmentUnitAdmin> getTreatmentUnitAdminList() {
        return treatmentUnitAdminList;
    }

    public void setTreatmentUnitAdminList(ArrayList<TreatmentUnitAdmin> treatmentUnitAdminList) {
        this.treatmentUnitAdminList = treatmentUnitAdminList;
    }
    
    public TreatmentUnitAdmin addTreatmentUnitAdmin()
    {
        TreatmentUnitAdmin ta = new TreatmentUnitAdmin();
        treatmentUnitAdminList.add(ta);
        return ta;
        
    }

    
}

