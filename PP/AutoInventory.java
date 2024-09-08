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

    public AutoInventory() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0000;
        this.mileage = 0000;
    }

    public AutoInventory(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try{
            if (make == null || model == null || color == null || year == 0 || mileage == 0) {
                throw new IllegalArgumentException();
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid input. Please try again.");
            return "Invalid input. Please try again.";
        }

        AutoInventory vehicle = new AutoInventory(make, model, color, year, mileage);
        inventory.add(vehicle);

        return "Success";
    }

    public String removeVehicle(int index) {
        try{
            inventory.remove(index);
            return "Success";
        }catch(Exception e){
            System.out.println("Error removing vehicle. Please try again.");
            return "Error removing vehicle. Please try again.";
        }
    }

    public void printInventory() {
        try{
            int counter = 1;
            for(int i = 0; i < inventory.size(); i++){
                System.out.println(counter + ": " + inventory.get(i).getMake() + " " + inventory.get(i).getModel() + " " + inventory.get(i).getColor() + " " + inventory.get(i).getYear() + " " + inventory.get(i).getMileage());
                counter++;
            }
        }catch(Exception e){
            System.out.println("Error printing inventory. Please try again.");
        }
    }

    public String updateVehicle(int index, String make, String model, String color, int year, int mileage) {
        try{
            inventory.get(index).setMake(make);
            inventory.get(index).setModel(model);
            inventory.get(index).setColor(color);
            inventory.get(index).setYear(year);
            inventory.get(index).setMileage(mileage);
            return "Success";
        }catch(Exception e){
            System.out.println("Error updating vehicle. Please try again.");
            return "Error updating vehicle. Please try again.";
        }
    }

    public void writeToFile() {
        try{
            FileWriter fw = new FileWriter("Autos.txt");
            int counter = 1;
            for(int i = 0; i < inventory.size(); i++){
                fw.write(counter + ": " + inventory.get(i).getMake() + " " + inventory.get(i).getModel() + " " + inventory.get(i).getColor() + " " + inventory.get(i).getYear() + " " + inventory.get(i).getMileage() + "\n");
                counter++;
            }
            fw.close();
            System.out.println("Inventory written to file Autos.txt.");
        }catch(IOException e){
            System.out.println("Error writing to file. Please try again.");
        }
    }
}
