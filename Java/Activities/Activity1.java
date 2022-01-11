package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car verna = new Car();
        verna.color = "Black";
        verna.transmission = "Manual";
        verna.make = 2014;
        verna.accelerate();
        verna.brake();
    }
}
