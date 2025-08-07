import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleOrderSystem {

    public  List<Vehicle> Order() {

        List<Vehicle> inventory = new ArrayList<>();
        Map<String, Object> carFeatures = new HashMap<>();
        carFeatures.put("sunroof", true);
        carFeatures.put("transmission", "Automatic");

        Vehicle car = new Vehicle();
        car.setVehicle("ABC123", "Car", "Petrol", carFeatures);
        inventory.add(car);

        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);

        Vehicle truck = new Vehicle();
        truck.setVehicle("XYZ789", "Truck", "Diesel", truckFeatures);
        inventory.add(truck);

        return inventory;
    }

}
