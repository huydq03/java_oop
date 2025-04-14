package s5_interfaces.example2;

public class Main {
    public static void main(String[] args) {
        Driveable driveable = new Car();
        driveable.start();
        driveable.stop();

        Car car = new Car();
        car.start();
        car.stop();
    }
}
