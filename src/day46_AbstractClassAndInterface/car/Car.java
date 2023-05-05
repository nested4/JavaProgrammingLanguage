package day46_AbstractClassAndInterface.car;

public abstract class Car {
    private final String brand,model;
    private String color;
    private final int year;

    private double price;

    public  Car(String brand,String model,String color,int year, double price ){
        this.brand=brand;
        this.model=model;
        setColor(color);
        if(year<1886){
            System.err.println("Invalid Year"+year);
        }
        this.year=year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid Price"+price);
        }
        this.price = price;
    }

    public void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}
/*Car Task:
	abstract Car:
		make, model, color, year, price....
		start();
		stop()

	Honda extends Car:
		start(): twist the key to start

	Audi extends Car:
		start(): push the start button

	Tesla extends Car:
		start(): Say "Start"
* */