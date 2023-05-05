package day47_Polymorphism.shape;

public class Circle extends Shape{
    private double radius;

    public final static double PI= Math.PI;

    public Circle(double radius) {
        super("circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            System.err.println("Invalid radius"+radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
