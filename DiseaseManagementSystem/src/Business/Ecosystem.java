/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Directories.CityList;
import Business.Directories.DoctorList;
import Business.Directories.HospitalList;
import Business.Directories.InsuranceAdminList;
import Business.Directories.LaboratoryAdminList;
import Business.Directories.NGOAdminList;
import Business.Directories.PatientList;
import Business.Directories.PharmacyAdminList;
import Business.Directories.TreatmentUnitAdminList;

/**
 *
 * @author atish
 */
public class Ecosystem {
    private static Ecosystem business;
    
    CityList cityList;
    DoctorList doctorList;
    HospitalList hospitalList;
    PatientList patientList;
    PharmacyAdminList pharmacyAdminList;
    LaboratoryAdminList laboratoryAdminList;
    TreatmentUnitAdminList treatmentUnitAdminList;
    NGOAdminList nGOAdminList;
    InsuranceAdminList insuranceAdminList;
    
    

    public Ecosystem(CityList cityList, DoctorList doctorList, HospitalList hospitalList, PatientList patientList, PharmacyAdminList pharmacyAdminList) {
        this.cityList = cityList;
        this.doctorList = doctorList;
        this.hospitalList = hospitalList;
        this.patientList = patientList;
        this.pharmacyAdminList = pharmacyAdminList;
    }

    public Ecosystem() {
        this.cityList = new CityList();
        this.doctorList = new DoctorList();
        this.hospitalList = new HospitalList();
        this.patientList = new PatientList();
        this.pharmacyAdminList = new PharmacyAdminList();
        this.laboratoryAdminList = new LaboratoryAdminList();
        this.treatmentUnitAdminList = new TreatmentUnitAdminList();
        this.nGOAdminList = new NGOAdminList();
        this.insuranceAdminList = new InsuranceAdminList();
        
    }
    public NGOAdminList getnGOAdminList() {
        return nGOAdminList;
    }

    public InsuranceAdminList getInsuranceAdminList() {
        return insuranceAdminList;
    }

    public void setInsuranceAdminList(InsuranceAdminList insuranceAdminList) {
        this.insuranceAdminList = insuranceAdminList;
    }

    public void setnGOAdminList(NGOAdminList nGOAdminList) {
        this.nGOAdminList = nGOAdminList;
    }

    public TreatmentUnitAdminList getTreatmentUnitAdminList() {
        return treatmentUnitAdminList;
    }

    public void setTreatmentUnitAdminList(TreatmentUnitAdminList treatmentUnitAdminList) {
        this.treatmentUnitAdminList = treatmentUnitAdminList;
    }

    public PharmacyAdminList getPharmacyAdminList() {
        return pharmacyAdminList;
    }

    public LaboratoryAdminList getLaboratoryAdminList() {
        return laboratoryAdminList;
    }

    public void setLaboratoryAdminList(LaboratoryAdminList laboratoryAdminList) {
        this.laboratoryAdminList = laboratoryAdminList;
    }

    public void setPharmacyAdminList(PharmacyAdminList pharmacyAdminList) {
        this.pharmacyAdminList = pharmacyAdminList;
    }
    
    public static void setInstance(Ecosystem system)
    {
        business = system;
    }
    
    
    public static Ecosystem getInstance()
    {
     if(business == null)
     {
         business = new Ecosystem();
     }
     return business;
    }
    

    public CityList getCityList() {
        return cityList;
    }

    public void setCityList(CityList cityList) {
        this.cityList = cityList;
    }

    public DoctorList getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorList doctorList) {
        this.doctorList = doctorList;
    }

    public HospitalList getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(HospitalList hospitalList) {
        this.hospitalList = hospitalList;
    }

    public PatientList getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientList patientList) {
        this.patientList = patientList;
    }
}
