package Sphere;

public class Circle {
    double radius;

    Point center;


    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double krugLen(){
        return (2 * Math.PI * radius);
    }

    public double krugS(){
        return (Math.PI * radius * radius);
    }
}
