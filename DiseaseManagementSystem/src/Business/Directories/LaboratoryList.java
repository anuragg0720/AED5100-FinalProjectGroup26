/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Model.Laboratory;
import java.util.ArrayList;

/**
 *
 * @author atish
 */
public class LaboratoryList {
    
    ArrayList<Laboratory> laboratoryList;

    public LaboratoryList() {
        this.laboratoryList = new ArrayList<Laboratory>();
        
    }

    public ArrayList<Laboratory> getLaboratoryList() {
        return laboratoryList;
    }

    public void setLaboratoryList(ArrayList<Laboratory> laboratoryList) {
        this.laboratoryList = laboratoryList;
    }
    
    public Laboratory addLaboratory(){
        Laboratory l = new Laboratory();
        laboratoryList.add(l);
        return l;
        
    }
    
}
