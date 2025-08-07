import java.util.List;
import java.util.Map;

public class CalculateAvailability{

   public  static boolean check(List<Vehicle> inventory, String type, Map<String, Object> desiredFeatures) {
        for (Vehicle v : inventory) {
            if (v.getType().equals(type) && v.getAvailability()) {
                boolean matches = true;
                for (String key : desiredFeatures.keySet()) {
                    if (!v.getFeatures().containsKey(key) ||
                            !v.getFeatures().get(key).equals(desiredFeatures.get(key))) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    return true;
                }
            }
        }
        return false;
    }
}
