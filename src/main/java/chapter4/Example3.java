package main.java.chapter4;

// Add range to Vehicle.

class Vehicle_4_3 {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Display the range.
    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}

class AddMeth {
    public static void main(String args[]) {
        Vehicle_4_3 minivan = new Vehicle_4_3();
        Vehicle_4_3 sportscar = new Vehicle_4_3();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        System.out.print("Minivan can carry " + minivan.passengers +
                ". ");

        minivan.range(); // display range of minivan

        System.out.print("Sportscar can carry " + sportscar.passengers +
                ". ");

        sportscar.range(); // display range of sportscar.
    }
}