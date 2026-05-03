class Vehicle {
    protected String brand; 
    private String model;   

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("The " + brand + " engine is starting...");
    }
    public final void showDetails() {
        System.out.println("Vehicle Detail: " + brand + " " + model);
    }
}

// Child Class 1 (Subclass)
class Car extends Vehicle {
    private int doorCount;

    public Car(String brand, String model, int doorCount) {
        super(brand, model); 
        this.doorCount = doorCount;
    }
    @Override
    public void startEngine() {
        System.out.println("The car safety system is checking... Engine Started!");
    }
    public void openDoors() {
        System.out.println("Opening all " + doorCount + " doors.");
    }
}
// Child Class 2 (Subclass)
class Truck extends Vehicle {
    private double payloadCapacity;
    public Truck(String brand, String model, double payloadCapacity) {
        super(brand, model);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("The heavy truck engine is warming up... Vroom!");
    }

    public void showPayloadCapacity() {
        System.out.println("Payload capacity: " + payloadCapacity + " tons.");
    }
}
public class VehicleApp {
    public static void main(String[] args) {
        // ኦብጀክቶችን መፍጠር (Creating objects)
        Car myCar = new Car("Toyota", "Camry", 4);
        Truck myTruck = new Truck("Volvo", "FH16", 25.5);

        System.out.println("--- Vehicle Assignment Output ---");
        myCar.showDetails();
        myCar.startEngine();
        myCar.openDoors();
        System.out.println("---------------------------------");
        myTruck.showDetails();
        myTruck.startEngine();
        myTruck.showPayloadCapacity();
    }
}
