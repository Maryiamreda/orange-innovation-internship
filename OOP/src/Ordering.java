import java.util.List;
import java.util.Map;

public class Ordering {
    public static   void placeOrder( String type, Map<String, Object> desiredFeatures) {
        VehicleOrderSystem vos = new VehicleOrderSystem();
        List<Vehicle> inventory = vos.Order();
        if (CalculateAvailability.check(inventory,type, desiredFeatures)) {
            Vehicle v = reserveVehicle.reserve(inventory ,type, desiredFeatures);
            double price = CalculatePrice.calculate(v);
            System.out.println("Vehicle reserved: " + v.getRegNum());
            System.out.println("Total price: $" + price);
        } else {
            System.out.println("No available vehicle matches your criteria.");
        }
    }
}
