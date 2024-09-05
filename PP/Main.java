package PP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        while (true){
            AutoInventory inventory = new AutoInventory();
            System.out.println("Welcome to the Auto Inventory System");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Get Inventory");
            System.out.println("5. Exit"); 
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter the make of the vehicle");
                        String make = scan.next();
                        System.out.println("Enter the model of the vehicle");
                        String model = scan.next();
                        System.out.println("Enter the color of the vehicle");
                        String color = scan.next();
                        System.out.println("Enter the year of the vehicle");
                        int year = scan.nextInt();
                        System.out.println("Enter the mileage of the vehicle");
                        int mileage = scan.nextInt();
                        inventory.addVehicle(make, model, color, year, mileage);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid input. Please try again.");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Enter the index of the vehicle to remove");
                        inventory.printInventory();
                        int index = scan.nextInt();
                        inventory.removeVehicle(index);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid input. Please try again.");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter the make of the vehicle to update");
                        String make = scan.next();
                        System.out.println("Enter the model of the vehicle to update");
                        String model = scan.next();
                        System.out.println("Enter the color of the vehicle to update");
                        String color = scan.next();
                        System.out.println("Enter the year of the vehicle to update");
                        int year = scan.nextInt();
                        System.out.println("Enter the mileage of the vehicle to update");
                        int mileage = scan.nextInt();
                        inventory.updateVehicle(make, model, color, year, mileage);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid input. Please try again.");
                    }
                    break;
                case 4:
                    try {
                        inventory.getInventory();
                    } catch (Exception e) {
                        System.out.println("Error getting inventory. Please try again.");
                    }
                    break;
                case 5:
                    System.out.println("Would you like to write the inventory to a file? (y/n)");
                    String write = scan.next();
                    if (write.equals("y") || write.equals("Y")) {
                        try{
                            inventory.writeToFile();
                        }catch(Exception e){
                            System.out.println("Error writing to file. Please try again.");
                        }
                    }else if (write.equals("n") || write.equals("N")){
                        try{
                            inventory.printInventory();
                        }catch(Exception e){
                            System.out.println("Error printing inventory. Please try again.");
                        }
                    }
                    System.out.println("Thank you for using the Auto Inventory System");
                    System.exit(0);
                    scan.close();
                    break;
            }
        }
    }
}
