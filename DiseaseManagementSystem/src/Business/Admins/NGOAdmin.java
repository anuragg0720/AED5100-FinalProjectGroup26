/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Admins;

import Business.Model.City;
import Business.Model.User;

/**
 *
 * @author anurag
 */
public class NGOAdmin extends User {
    
    City city;

    public NGOAdmin() {
    }

    public NGOAdmin(City city, String Name, String Username, String password) {
        super(Name, Username, password);
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
    
}
