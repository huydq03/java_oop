package s5_interfaces.example7;

public interface Shape {
    double getArea();

    static Shape createCircle(double radius) {
        return new Circle(radius);
    }

    static void printShape() {
        System.out.println("hiiii");
    }
}
