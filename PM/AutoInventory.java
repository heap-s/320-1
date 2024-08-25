package PM;
import java.util.ArrayList;

public class AutoInventory {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    
    private static ArrayList<AutoInventory> inventory = new ArrayList<>();

    public AutoInventory() {}

    public AutoInventory(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public String addVehicle(String make, String model, String color, int year, int mileage) {

        if (make == null || model == null || color == null || year == 0 || mileage == 0) {
            throw new IllegalArgumentException();
        }

        AutoInventory vehicle = new AutoInventory(make, model, color, year, mileage);
        inventory.add(vehicle);

        return "Success";
    }
    public static ArrayList<AutoInventory> getInventory() {
        System.out.println(inventory);
        return inventory;
    }

    public String removeVehicle(String make, String model, String color, int year, int mileage) {
        AutoInventory vehicle = new AutoInventory(make, model, color, year, mileage);
        inventory.remove(vehicle);

        return "Success";
    }

    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        AutoInventory vehicle = new AutoInventory(make, model, color, year, mileage);
        inventory.remove(vehicle);
        inventory.add(vehicle);

        return "Success";
    }

}
