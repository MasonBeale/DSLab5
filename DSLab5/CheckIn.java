

import java.util.*;

public class CheckIn {
    private List<Passenger> deltaPassengers;
    private List<Passenger> unitedPassengers;
    
    public CheckIn(List<Passenger> deltaPassengers, List<Passenger> unitedPassengers) {
        this.deltaPassengers = deltaPassengers;
        this.unitedPassengers = unitedPassengers;
    }
    
    public void addPassenger(String airline, Passenger passenger) {
        if(airline.equals("Delta")) {
            deltaPassengers.add(passenger);
        }
        else if(airline.equals("United")) {
            unitedPassengers.add(passenger);
        }
        else {
            System.out.println("Invalid airline, Please enter a valid airline");
            return;
        }
        
        for(Passenger passenger : passengers) {
            if (passenger.getName().equals(passengerName)) {
                passenger.setCheckIn(true);
                System.out.println("Passenger " + passengerName + " checked in for " + airline + "in " + passenger.getSeatClass() + " class, seat " + passenger.getSeatNumber() + ".");
                return;
            }
        }
        
        System.out.println("Passenger " + passengerName + " not found in " + airline + " passenger list.");
        
    }
    

}
