import java.util.*;

public class Main {
    public static void main(String[] args) {
        VehicleOrderSystem vos = new VehicleOrderSystem();
        List<Vehicle> inventory = vos.Order();
        Map<String, Object> features = new HashMap<>();
        features.put("sunroof", true);
        features.put("transmission", "Automatic");
        Ordering.placeOrder("Car", features);

        // Example order for a Truck with cargo capacity 1500
        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
       Ordering.placeOrder("Truck", truckFeatures);




    }

}
