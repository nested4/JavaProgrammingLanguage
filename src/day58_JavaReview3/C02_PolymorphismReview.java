package day58_JavaReview3;

import day58_JavaReview3.abstractionReview.*;

public class C02_PolymorphismReview {
    public static void main(String[] args) {

//        Car car = new Car(); // Can not create obj from abstract classes\
        Car car1 = new Tofas();
        Car car2 = new BMW();
        Car car3 = (Car) new Togg(); // Typecasting upcasting

//        Autopilot autopilot = new Autopilot() // an not create obj from interface
//            Autopilot autopilot = (Autopilot) new Tofas();  // is a relation
//        System.out.println(autopilot);
        //ClassCastException

        Autopilot autopilot = new BMW();
        autopilot.autoPark();

        Car electricCar = new Togg();
        electricCar.driver();
        electricCar.start();
        electricCar.stop();
//        electricCar.autoPark(); // Reference type decides what to be access
        ((Togg) electricCar).autoPark(); // Typecasting Downcasting


    }
}
