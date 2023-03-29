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
public class FlightApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("\n\nCommercial Flight ArrayList");
        ArrayList<CommercialFlight> commList = new ArrayList<CommercialFlight>();
        ArrayList crew = new ArrayList<String>();
        crew.add("Unger");
        crew.add("Dunne");
        
        CommercialFlight comm1 = new CommercialFlight(65, "EMC2", "CHA", "DTX", crew, 290, 34, 
                34.0, 125.0, "Boeing737-400", 2750, 25);
        commList.add(comm1);

        CommercialFlight comm2 = new CommercialFlight(0, "Flight666", "HELL", 
                "CHA", crew, 890, 6500, 32.4, -123.0, "Airbus Doomed 320", 234, 180);
        commList.add(comm2);
        
        CommercialFlight comm3 = new CommercialFlight(250, "616", "CHA", "LAX", crew, 230, 550, 
                34.0, -133.5, "MD88", 2500, 175);
        commList.add(comm3);
        
        commList.add(new CommercialFlight(250, "1588", "CHA", "DTW", crew, 230, 3400, 
                34.0, -133.5, "MD88", 2500, 175));
        
   /* Anonymous inner class with an instance initializer (also known as a "double brace initialization") 
   *    https://stackoverflow.com/questions/1005073/initialization-of-an-arraylist-in-one-line
   * coodbird answer Jun 17, 2009   */
        ArrayList<String> crewList = new ArrayList<String>() {{
             add("A");
             add("B");
             add("C");
        }};        
        commList.add(new CommercialFlight(500, "Genesis 1", "CHA", "DTW", crewList, 15000, 350, 35.0455, -8.30972, "Boeing 737-800", 15000, 158));
        crewList.clear();
        
        
//        for(CommercialFlight item: commList){
//            System.out.println("Retrieved element" + item.toString());
//        }
        
        
        ArrayList<String> weapons = new ArrayList<String>(){{
            add("Bombs");
        }};
        ArrayList<String> sensors = new ArrayList<String>(){{
            add("Radar");
        }};
        ArrayList<String>crewList2 = new ArrayList<String>() {{ add("Brooks"); add("Dunn");}};
                
        MilitaryFlight pizza =new MilitaryFlight("Deliver Pizza", true, weapons, sensors, crewList2, 
                4000, 1000, 33.6, -133.6, "A6-D", 1000, 180);
        System.out.println("Military: " + pizza.toString());
        
        
        
        
    }
}
