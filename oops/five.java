abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car moves");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();
    }
}