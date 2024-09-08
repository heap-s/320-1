public class Automobile {
    public enum Condition {
        NEW, USED, DAMAGED, SALVAGE
    }

    public enum Transmission {
        AUTOMATIC, MANUAL
    }

    public enum FuelType {
        GASOLINE, DIESEL, ELECTRIC, HYBRID
    }

    private int Id;
    private String make;
    private String model;
    private int year;
    private String vin;
    private String color;
    private int mileage;
    private double price;
    private boolean isAvailable;
    private Condition condition;
    private Transmission transmission;
    private FuelType fuelType;

    public Automobile(){
        this.Id = 0;
        this.make = "";
        this.model = "";
        this.year = 0;
        this.vin = "";
        this.color = "";
        this.mileage = 0;
        this.price = 0;
        this.isAvailable = true;
        this.condition = Condition.NEW;
        this.transmission = Transmission.AUTOMATIC;
        this.fuelType = FuelType.GASOLINE;
    }

    public Automobile(int Id, String make, String model, int year, String vin, String color, int mileage, double price, boolean isAvailable, Condition condition, Transmission transmission, FuelType fuelType){
        this.Id = Id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
        this.isAvailable = isAvailable;
        this.condition = condition;
        this.transmission = transmission;
        this.fuelType = fuelType;
    }
}
