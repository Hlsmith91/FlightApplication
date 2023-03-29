package flightapplication;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hlsmith1
 
 */
public class CommercialFlight extends BaseFlight{

   
    private static int 
            numberOfCommercialFlights = 0; //Class variable - one for the entire program
    private int commercialFlightID;
    private int passengers;
    private String flightNo;
    private String destinationLocation;
    private String departureLocation;
    private ArrayList<String> crew;

    
   

    public int getCommercialFlightID() {
        return commercialFlightID;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }
    
    public ArrayList<String> getCrew(){
        return crew;
    }

    /**
     * 
     * @param passengers
     * @param flightNo
     * @param destinationLocation
     * @param departureLocation
     * @param crew
     * @param speed
     * @param latitude
     * @param longitude
     * @param planeType
     * @param fuel
     * @param course 
     */
    public CommercialFlight(int passengers,
            String flightNo,
            String destinationLocation,
            String departureLocation,
            ArrayList<String> crew,
            int altitude, int speed, double latitude, double longitude, 
            String planeType, int fuel, int course) {
        super(altitude, speed, latitude, longitude, planeType, fuel, course);
        this.passengers = passengers;
        this.flightNo = flightNo;
        this.destinationLocation = destinationLocation;
        this.departureLocation = departureLocation;        
        this.crew = crew;
        this.commercialFlightID = ++numberOfCommercialFlights;
    }
    

     @Override
    public String toString() {
        return "CommercialFlight{" + 
                super.toString() +
                "commercialFlightID=" + commercialFlightID + 
                ", passengers=" + passengers + 
                ", flightNo=" + flightNo + ", destinationLocation=" 
                + destinationLocation + ", departureLocation=" 
                + departureLocation + ", crew=" 
                + crew + '}';
    }
    }

    

