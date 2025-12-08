/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author agnel
 */
public class Hospital {
    String hospitalName;
    String username;
    String password;
    
    City city;
    String location;

    public Hospital(String hospitalName, String username, String password, City city, String location) {
        this.hospitalName = hospitalName;
        this.username = username;
        this.password = password;
        this.city = city;
        this.location = location;
    }

    public Hospital() {
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    @Override
    public String toString()
    {
        return hospitalName;
    }
    
    
}
