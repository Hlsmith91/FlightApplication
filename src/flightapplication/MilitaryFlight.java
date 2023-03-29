/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightapplication;

import java.util.ArrayList;

/**
 *
 * @author Hlsmith1
 */
public class MilitaryFlight extends BaseFlight{
    
    private String mission;
    private boolean inFlightRefuel;
    private ArrayList<String> weapons;
    private ArrayList<String> sensors;
    private ArrayList<String> crew;

  
    public String getMission() {
        return mission;
    }

    public boolean isInFlightRefuel() {
        return inFlightRefuel;
    }

    public ArrayList<String> getWeapons() {
        return weapons;
    }

    public ArrayList<String> getSensors() {
        return sensors;
    }

    public ArrayList<String> getCrew() {
        return crew;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    /**
     * 
     * @param mission
     * @param inFlightRefuel
     * @param weapons
     * @param sensors
     * @param crew
     * @param altitude
     * @param speed
     * @param latitude
     * @param longitude
     * @param planeType
     * @param fuel
     * @param course 
     */
    public MilitaryFlight(String mission, boolean inFlightRefuel, ArrayList<String> weapons,
            ArrayList<String> sensors, ArrayList<String> crew, int altitude, int speed, double latitude, double longitude, String planeType, int fuel, int course) {
        super(altitude, speed, latitude, longitude, planeType, fuel, course);
        this.mission = mission;
        this.inFlightRefuel = inFlightRefuel;
        this.weapons = weapons;
        this.sensors = sensors;
        this.crew = crew;
    }
    
    
      @Override
    public String toString() {
        return super.toString() + "\nMilitaryFlight{" + "mission=" + mission + 
                ", inFlightRefuel=" + inFlightRefuel + ", weapons=" + weapons + 
                ", sensors=" + sensors + ", crew=" + crew + '}';
    }

}
