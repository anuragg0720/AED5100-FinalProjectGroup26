/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Model.Encounter;
import java.util.ArrayList;

/**
 *
 * @author agnel
 */
public class EncounterHistory {
    
    ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addEncounter()
    {
        Encounter encounter=new Encounter();
        encounterHistory.add(encounter);
        return encounter;
        
    }
    
    
    
}