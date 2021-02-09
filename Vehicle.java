public class Vehicle {

    //declaring vehicle attributes
    private String make;
    private String model;
    private String color;
    private int mileage;
    private int cost;
    private boolean rented;

    //no arg constructor
    public Vehicle() {
        this("No Make Info", "No Model Info", "No Color Info", 0, 0, false);
    }

    //constructor with all arguments
    public Vehicle(String make, String model, String color, int mileage, int cost, boolean rented) {
        //set all attributes from arguments
        this.make = make;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.cost = cost;
        this.rented = rented;
    }

    //overridden toString method
    @Override
    public String toString() {
        //declare and initialize return string
        String retVal = "";

        //check if rented and update return value
        if (isRented()) retVal = "Rented: ";
        else retVal = "Available: ";

        //add details to return value
        retVal = retVal + getColor() + " " + getMake() + " " + getModel() + " with " +
                getMileage() + " miles";

        return retVal;


    }

    //attribute getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
