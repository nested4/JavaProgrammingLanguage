package day47_Polymorphism.shape;

public class Cube extends Shape implements Volume{
    private double side;

    public Cube( double side) {
        super("cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            System.err.println("Invalid side"+side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}
