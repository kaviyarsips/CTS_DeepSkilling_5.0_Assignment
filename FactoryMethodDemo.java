
interface Vehicle {
    void start();
}


class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}


class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}


class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {

        if (vehicleType == null) {
            return null;
        }

        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        return null;
    }
}


public class FactoryMethodDemo {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle1 = factory.getVehicle("Car");
        vehicle1.start();

        Vehicle vehicle2 = factory.getVehicle("Bike");
        vehicle2.start();
    }
}