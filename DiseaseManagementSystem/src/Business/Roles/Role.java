/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Ecosystem;
import javax.swing.JPanel;

/**
 *
 * @author agnel
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAdmin("Lab Admin"),
        TreatmentUnitAdmin("TreatmentAdmin"),
        Patient("Patient"),
        HospitalAdmin("HospitalAdmin"),
        PharmacyAdmin("PharmacyAdmin"),
        NGOAdmin("NGOAdmin"),
        InsuranceAdmin("InsuranceAdmin"),
        GovernmentAdmin("GovAdmin")
        ;
        
        
        
        private final String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
        
        
    }
    
    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, Ecosystem ecosystem);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }

}
