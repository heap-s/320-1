package PP;

import java.io.IOException;
import java.io.FileWriter;
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
    
    public ArrayList<AutoInventory> getInventory() {
        return inventory;
    }

    public String removeVehicle(int index) {
        inventory.remove(index);

        return "Success";
    }

    public void printInventory() {
        for (AutoInventory vehicle : inventory) {
            System.out.println(vehicle.toString());
        }
    }

    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        AutoInventory vehicle = new AutoInventory(make, model, color, year, mileage);
        inventory.set(inventory.indexOf(vehicle), vehicle);

        return "Success";
    }

    public void writeToFile() {
        try{
            FileWriter fw = new FileWriter("C:\\Temp\\Autos.txt");
            fw.write(inventory.toString());
            fw.close();
        }catch(IOException e){
            System.out.println("Error writing to file. Please try again.");
        }
    }
}
