package com.company;

/**
 * Created by AndyTrump on 5/3/2015.
 */
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    //This is a constructor for Vehicle.
    Vehicle (int p,int f,int m) {
        passengers = p;
        fuelcap =f;
        mpg =m;
    }

    // Return the range.
    int range() {
        return mpg*fuelcap;
    }

    //compute fuel needed for a given distance.
    double fuelneeded (int miles){
        return (double) miles/mpg;
    }
}

public class VehConsDemo {
    public static void main(String[] args) {

        // construction complete vehicles
        Vehicle minivan = new Vehicle (7,6,21);
        Vehicle sportscar = new Vehicle (2,14,12);
        double gallons;
        int dist = 252;

        gallons=minivan.fuelneeded(dist);
        System.out.println("To go "+dist+" miles minivan needs "+gallons+" gallons of fuel.");

        gallons=sportscar.fuelneeded(dist);
        System.out.println("To go "+dist+" miles sportscar needs "+gallons+" gallons of fuel.");

    }
}
