/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Directories.CityList;
import Business.Model.City;
import Business.Model.Doctor;
import Business.Model.Hospital;
import Business.Model.InsuranceAdmin;
import Business.Model.Patient;

/**
 *
 * @author agnel
 */
public class ConfigureASystem {
        public static Ecosystem configure(){
            
       Ecosystem system= Ecosystem.getInstance();
//   
//     Employee employee= system.getEmployeeDir().createEmployee("SYSTEM ADMIN");
//     //added userAccounts
//     UserAccount ua= system.getUserAccountDir().createUserAccount("admin","admin", employee, new SystemAdminRole());

            City c = system.getCityList().addCity();
            c.setCityName("Pune");
            
            Hospital h = system.getHospitalList().addHospital();
            h.setHospitalName("Pune baby hospital");
            h.setCity(c);
            
            
            Patient p = system.getPatientList().addPatient();
            p.setUsername("p");
            p.setPassword("p");
            p.setName("AmeyP");
            p.setCity(c);
            
            
            
            
            
            
            
            
            
            Doctor d = system.getDoctorList().addDoctor();
            d.setCity(c);
            d.setQualification("MBBS");
            d.setName("Doc");
            d.setUsername("d");
            d.setPassword("d");
            d.setHospital(h);
            
            Doctor smith = system.getDoctorList().addDoctor();
smith.setCity(c);
smith.setQualification("MS");
smith.setName("Smith");
smith.setUsername("smith");
smith.setPassword("smith");
smith.setHospital(h);

Doctor anderson = system.getDoctorList().addDoctor();
anderson.setCity(c);
anderson.setQualification("BAMS");
anderson.setName("Anderson");
anderson.setUsername("anderson");
anderson.setPassword("anderson");
anderson.setHospital(h);

Doctor brown = system.getDoctorList().addDoctor();
brown.setCity(c);
brown.setQualification("MD");
brown.setName("Brown");
brown.setUsername("brown");
brown.setPassword("brown");
brown.setHospital(h);

Doctor clark = system.getDoctorList().addDoctor();
clark.setCity(c);
clark.setQualification("MD");
clark.setName("Clark");
clark.setUsername("clark");
clark.setPassword("clark");
clark.setHospital(h);

Doctor evans = system.getDoctorList().addDoctor();
evans.setCity(c);
evans.setQualification("MBBS");
evans.setName("Evans");
evans.setUsername("evans");
evans.setPassword("evans");
evans.setHospital(h);

Doctor green = system.getDoctorList().addDoctor();
green.setCity(c);
green.setQualification("MBBS");
green.setName("Green");
green.setUsername("green");
green.setPassword("green");
green.setHospital(h);

Doctor harris = system.getDoctorList().addDoctor();
harris.setCity(c);
harris.setQualification("MBBS");
harris.setName("Harris");
harris.setUsername("harris");
harris.setPassword("harris");
harris.setHospital(h);

Doctor king = system.getDoctorList().addDoctor();
king.setCity(c);
king.setQualification("BAMS");
king.setName("King");
king.setUsername("king");
king.setPassword("king");
king.setHospital(h);

Doctor morgan = system.getDoctorList().addDoctor();
morgan.setCity(c);
morgan.setQualification("MBBS");
morgan.setName("Morgan");
morgan.setUsername("morgan");
morgan.setPassword("morgan");
morgan.setHospital(h);

Doctor phillips = system.getDoctorList().addDoctor();
phillips.setCity(c);
phillips.setQualification("MBBS");
phillips.setName("Phillips");
phillips.setUsername("phillips");
phillips.setPassword("phillips");
phillips.setHospital(h);

            
            
            

            
            
           // Create and configure patients
Patient michael = system.getPatientList().addPatient();
michael.setUsername("michael");
michael.setPassword("michael");
michael.setName("Michael");
michael.setAddress("123 Main St");
michael.setPurpose("Routine Checkup");
michael.setCity(c);

Patient emily = system.getPatientList().addPatient();
emily.setUsername("emily");
emily.setPassword("emily");
emily.setName("Emily");
emily.setAddress("456 Elm St");
emily.setPurpose("Consultation");
emily.setCity(c);

Patient jacob = system.getPatientList().addPatient();
jacob.setUsername("jacob");
jacob.setPassword("jacob");
jacob.setName("Jacob");
jacob.setAddress("789 Oak St");
jacob.setPurpose("Follow-up");
jacob.setCity(c);

Patient sophia = system.getPatientList().addPatient();
sophia.setUsername("sophia");
sophia.setPassword("sophia");
sophia.setName("Sophia");
sophia.setAddress("101 Pine St");
sophia.setPurpose("Treatment");
sophia.setCity(c);

Patient william = system.getPatientList().addPatient();
william.setUsername("william");
william.setPassword("william");
william.setName("William");
william.setAddress("111 Maple St");
william.setPurpose("Preventive Care");
william.setCity(c);

Patient olivia = system.getPatientList().addPatient();
olivia.setUsername("olivia");
olivia.setPassword("olivia");
olivia.setName("Olivia");
olivia.setAddress("222 Cedar St");
olivia.setPurpose("Physical Therapy");
olivia.setCity(c);

Patient benjamin = system.getPatientList().addPatient();
benjamin.setUsername("benjamin");
benjamin.setPassword("benjamin");
benjamin.setName("Benjamin");
benjamin.setAddress("333 Birch St");
benjamin.setPurpose("Medication Refill");
benjamin.setCity(c);

// Similarly configure mia, james, and ava with their respective details
// ...

// Assuming 'c' is the City object or string you're setting for each patient


Patient mia = system.getPatientList().addPatient();
mia.setUsername("mia");
mia.setPassword("mia");
mia.setName("Mia");
mia.setAddress("25 Rockledge St");
mia.setPurpose("Ailment");
mia.setCity(c);

Patient james = system.getPatientList().addPatient();
james.setUsername("james");
james.setPassword("james");
james.setName("james");
james.setAddress("25 Rockledge St");
james.setPurpose("Ailment");
james.setCity(c);

Patient ava = system.getPatientList().addPatient();
ava.setUsername("ava");
ava.setPassword("ava");
     ava.setName("ava");
ava.setAddress("25 Rockledge St");
ava.setPurpose("Ailment");
ava.setCity(c);       
            Doctor da = system.getDoctorList().addDoctor();
            da.setCity(c);
            da.setHospital(h);
            da.setUsername("d");
            da.setPassword("d");
            da.setName("AmeyD");
            da.setQualification("MS");
            
            
            InsuranceAdmin ia = system.getInsuranceAdminList().addInsuranceAdmin();
            ia.setName("Amey Satwe");
            ia.setUsername("ia");
            ia.setPassword("ia");
            
            
            
            
       return system;
    }
}
