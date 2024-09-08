package PP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutoInventory inventory = new AutoInventory();

        while (true) {
            System.out.println("Welcome to the Auto Inventory System");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Print Inventory");
            System.out.println("5. Write to File");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addVehicle(scanner, inventory);
                    break;
                case 2:
                    removeVehicle(scanner, inventory);
                    break;
                case 3:
                    updateVehicle(scanner, inventory);
                    break;
                case 4:
                    inventory.printInventory();
                    break;
                case 5:
                    inventory.writeToFile();
                    break;
                case 6:
                    exitProgram(scanner, inventory);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addVehicle(Scanner scanner, AutoInventory inventory) {
        System.out.println("Enter the make of the vehicle");
        String make = scanner.nextLine();
        System.out.println("Enter the model of the vehicle");
        String model = scanner.nextLine();
        System.out.println("Enter the color of the vehicle");
        String color = scanner.nextLine();
        System.out.println("Enter the year of the vehicle");
        int year = scanner.nextInt();
        System.out.println("Enter the mileage of the vehicle");
        int mileage = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String result = inventory.addVehicle(make, model, color, year, mileage);
        System.out.println(result);
    }

    private static void removeVehicle(Scanner scanner, AutoInventory inventory) {
        System.out.println("Enter the index of the vehicle to remove");
        inventory.printInventory();
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        String result = inventory.removeVehicle(index);
        System.out.println(result);
    }

    private static void updateVehicle(Scanner scanner, AutoInventory inventory) {
        System.out.println("Enter the index of the vehicle to update");
        inventory.printInventory();
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the make of the vehicle to update");
        String make = scanner.nextLine();
        System.out.println("Enter the model of the vehicle to update");
        String model = scanner.nextLine();
        System.out.println("Enter the color of the vehicle to update");
        String color = scanner.nextLine();
        System.out.println("Enter the year of the vehicle to update");
        int year = scanner.nextInt();
        System.out.println("Enter the mileage of the vehicle to update");
        int mileage = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String result = inventory.updateVehicle(index,make, model, color, year, mileage);
        System.out.println(result);
    }


    private static void exitProgram(Scanner scanner, AutoInventory inventory) {
        System.out.println("Would you like to write the inventory to a file? (y/n)");
        String write = scanner.nextLine().toLowerCase();
        if (write.equals("y") || write.equals("Y")) {
            inventory.writeToFile();
        } else {
            inventory.printInventory();
        }
        System.out.println("Thank you for using the Auto Inventory System");
        scanner.close();
    }
}
