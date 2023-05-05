package day46_AbstractClassAndInterface.car;

public class Togg extends Car{
    public Togg(String model,String color,int year, double price){
        super("Togg",model,color,year,price);
    }
    public void start(){
        System.out.println("Say \"Start\" to start the engine");
    }

    public void zoom(){
        System.out.println("Zoom meeting is starting, smile to the camera");
    }
}
