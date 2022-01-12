package activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) {
        Plane plane =new Plane(10);
        plane.onboard("Passenger1");
        plane.onboard("Passenger2");
        System.out.println("Plane took off at: " + plane.takeOff());
        System.out.println("No. of passengers: " + plane.getPassengers());
        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("No. of people after landing: " + plane.getPassengers());

         }


}
