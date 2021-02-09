import java.util.*;

public class Driver {

    //create scanner object to read user input
    private static Scanner scan = new Scanner(System.in);

    //create variable to store user input
    private static int choice = 0;

    public static void main(String[] args) {


        //create vehicle objects
        Vehicle vehicle1 = new Economy_Car("Nissan", "Versa", "Blue", 105, 14500, 25);
        Vehicle vehicle2 = new Economy_Car("Toyota", "Yaris", "White", 8422, 17500, 25);
        Vehicle vehicle3 = new Midsize_Car("Dodge", "Avenger", "Green", 15720, 15000, 45);
        Vehicle vehicle4 = new Midsize_Car("Ford", "Focus", "Yellow", 2368, 14500, 45);
        Vehicle vehicle5 = new SUV("Toyota", "Rav4", "Silver", 432, 26150, 80);

        //create vehicle list
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        //add vehicles to list
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);

        //do while loop to ensure menu prints at least once
        do {
            //display menu
            System.out.println("1. Rent cars");
            System.out.println("2. Return cars");
            System.out.println("3. Quit");
            //read user input
            choice = Integer.parseInt(scan.nextLine());

            //switch statement to evaluate choice
            switch (choice) {
                case 1:
                    rent_cars(vehicleList);
                    break;
                case 2:
                    return_cars(vehicleList);
                    break;
            }
        } while (choice != 3);
    }

    //show cars methods
    public static void show_cars(ArrayList<Vehicle> vehicleList) {

        //declare counter
        int x = 1;

        //print return option
        System.out.println("0. Return");

        //for loop to print all vehicles
        for (Vehicle vehicle : vehicleList) {
            System.out.println(x + ". " + vehicle.toString());
            x++;
        }
    }


    //method to facilitate car rental
    public static void rent_cars(ArrayList<Vehicle> vehicleList) {

        //Request input from user, display vehicles, accept user input
        System.out.println("Choose a car to rent: ");
        show_cars(vehicleList);
        choice = Integer.parseInt(scan.nextLine());

        //if choice is 0, return to main menu
        if (choice == 0) return;
        else {
            //set status to rented
            vehicleList.get(choice - 1).setRented(true);
            rent_cars(vehicleList);
        }

    }

    //method to facilitate car return
    public static void return_cars(ArrayList<Vehicle> vehicleList) {

        //Request input from user, display vehicles, accept user input
        System.out.println("Choose a car to return: ");
        show_cars(vehicleList);
        choice = Integer.parseInt(scan.nextLine());

        //if choice is 0, return to main menu
        if (choice == 0) return;
        else {
            //set status to returned
            vehicleList.get(choice - 1).setRented(false);
            return_cars(vehicleList);
        }

    }
}
