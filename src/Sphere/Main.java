package Sphere;

public class Main {
    public static void main(String[] args) {
        Circle krug = new Circle(20, new Point(10, 20));

        System.out.println("Радиус круга: " + krug.radius + "\nДлина окружности: " + krug.krugLen() + "\nПлощадь круга: "  + krug.krugS());
    }
}
