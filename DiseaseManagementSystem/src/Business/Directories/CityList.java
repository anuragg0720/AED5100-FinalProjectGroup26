/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Directories;

import Business.Model.City;
import java.util.ArrayList;

/**
 *
 * @author agnel
 */
public class CityList {
    
    ArrayList<City> cityList;

    public CityList() {
        this.cityList = new ArrayList<City>();
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public City addCity(){
        City c = new City();
        cityList.add(c);
        return c;
    }

    public City findCityByCityName(String cityString) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for(City c : cityList){
            if(c.getCityName().equals(cityString)){
                return c;
            }
        }
        return null;
    }
    
    
    
}