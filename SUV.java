public class SUV extends Vehicle {

    //add additional attributes
    private int daily_rental_rate;

    //no arg constructor
    public SUV() {
        this("No Make Info", "No Model Info", "No Color Info", 0, 0, 0);
    }

    //constructor with all arguments
    public SUV(String make, String model, String color, int mileage, int cost, int daily_rental_rate) {
        super(make, model, color, mileage, cost, false);
        this.daily_rental_rate = daily_rental_rate;

    }

    //overriden toString method
    @Override
    public String toString() {
        return "SUV: " + super.toString();
    }

    //attribute getters and setters
    public int getDaily_rental_rate() {
        return daily_rental_rate;
    }

    public void setDaily_rental_rate(int daily_rental_rate) {
        this.daily_rental_rate = daily_rental_rate;
    }
}
