/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;



import Business.Admins.LaboratoryAdmin;
import java.util.ArrayList;

/**
 *
 * @author atish
 */
public class LaboratoryAdminList {
    
    ArrayList<LaboratoryAdmin> laboratoryAdminList;

    public LaboratoryAdminList() {
        
        this.laboratoryAdminList = new ArrayList<LaboratoryAdmin>();
                
    }

    public ArrayList<LaboratoryAdmin> getLaboratoryAdminList() {
        return laboratoryAdminList;
    }

    public void setLaboratoryAdminList(ArrayList<LaboratoryAdmin> laboratoryAdminList) {
        this.laboratoryAdminList = laboratoryAdminList;
    }
    
    public LaboratoryAdmin addLaboratoryAdmin()
    {
        LaboratoryAdmin la = new LaboratoryAdmin();
        laboratoryAdminList.add(la);
        return la;
    }
    
    
    
}
