package flightapplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hlsmith1
 */
public abstract class BaseFlight {
    private static int aircraftCounter = 0; //Class variable
    private int aircraftID;               //Instance variable    
    private int speed;
    private double latitude;
    private double longitude;
    private String planeType;
    private int fuel;
    private int course;
    private int altitude;

    public int getCourse() {
        return course;
    }

    /**
     * 
     * @param altitude
     * @param speed
     * @param latitude
     * @param longitude
     * @param planeType
     * @param fuel
     * @param course 
     */
    public BaseFlight(int altitude, int speed, double latitude, double longitude,
            String planeType, int fuel, int course) {
        this.altitude = altitude;
        this.speed = speed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.planeType = planeType;
        this.fuel = fuel;
        this.course = course;
         this.aircraftID = ++this.aircraftCounter;
    }
    
    public void changeSpeed(int speedChange){
        int speedBuffer = speed;
        this.speed += speedChange;
        if(speed < 0){
            speed = speedBuffer;
        }
    }
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    
    public int getSpeed() {
        return speed;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getPlaneType() {
        return planeType;
    }

    public int getFuel() {
        return fuel;
    }
    
    public void setCourse(int course) {
        if(course >= 0 || course <360){
            this.course = course;
        }else if(course < 0){
            this.course = 0;                
        }else if(course >= 360){
            this.course = course;
        }
    }

    public void changeCourse(int courseChange){
        int courseBuffer = this.course;
        this.course += courseChange;
        if(this.course >= 360)
            this.course -= 360;
        if(this.course < 0)
            this.course += 360;
        
    }
    /**
     * 
     * @param altitude
     * @param speed
     * @param latitude
     * @param longitude
     * @param planeType
     * @param fuel 
     */
    public BaseFlight(int altitude, int speed, double latitude, double longitude, 
            String planeType, int fuel) {
        this.altitude = altitude;
        this.speed = speed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.planeType = planeType;
        this.fuel = fuel;
         this.aircraftID = ++this.aircraftCounter;
    }
    
//    public int compare(, MilitaryFlight a2 ){
//        return a1.getPlaneType().compareTo(a2.getPlaneType());
//    }
//    
    @Override
    public String toString() {
        return "BaseFlight{" + "course= " + course + ", speed= " + speed + ", "
                + " altitude= " + altitude + ", latitude= " + latitude + ", "
                + " longitude= " + longitude + ", fuel= " + fuel 
                + " planeType= " + planeType + ", "
                + " aircraftID = " + aircraftID + "\n} ";
    }
    
}
