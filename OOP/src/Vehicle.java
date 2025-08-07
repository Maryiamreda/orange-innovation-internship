import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vehicle {
    private  String registrationNumber;
    private String vehicleType; // e.g., Car, Motorcycle, Truck
    private String fuelType; // Petrol, Diesel, Electric, Hybrid
    private boolean isAvailable;
    private Map<String, Object> features; // e.g., sunroof, cargo capacity, etc.
    // Getter
    public String getRegNum() {
        return registrationNumber;

    }
    public String getType() {

        return  vehicleType; // e.g., Car, Motorcycle, Truck

    }
    public String getFuel() {
        return fuelType; // Petrol, Diesel, Electric, Hybrid

    }
    public boolean getAvailability() {
        return isAvailable;
    }
    public void setAvailability(boolean isavailable) {
        this.isAvailable = isavailable;
    }
    public double calculatePrice() {
        return 0.0;
    }


    public Map<String, Object> getFeatures() {
        return features;
    }

    // Setter



    public void setVehicle(String regNum, String type, String fuel, Map<String, Object> feats) {
        this.registrationNumber = regNum;
        this.vehicleType = type;
        this.fuelType = fuel;
        this.isAvailable = true;
        this.features = feats;
    }


}
class Car extends Vehicle {
    public Car(String regNum, String fuel, Map<String, Object> features) {
    }

    public double calculatePrice() {
        double basePrice = 50;
        if (getFeatures().containsKey("sunroof") && (Boolean)equals(getFeatures().get("sunroof"))) {
            basePrice += 10;
        }
        return basePrice;
    }
}

// Truck class
class Truck extends Vehicle {
    public Truck(String regNum, String fuel, Map<String, Object> features) {
    }

    public double calculatePrice() {
        double basePrice = 80;
        if (getFeatures().containsKey("cargoCapacity") ) {
            int cargoCapacity = (int) getFeatures().get("cargoCapacity");
            basePrice += cargoCapacity * 0.05;        }
        return basePrice;
    }

}

// Motorcycle class
class Motorcycle extends Vehicle {
    public Motorcycle(String regNum, String fuel, Map<String, Object> features) {
    }



    public double calculatePrice() {
        return 30;
    }
}

