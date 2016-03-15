package com.rollingstone.arrays;

import java.util.Scanner;

import com.rollingstone.arrays.model.ParkedCar;

public class StreetParallelParkingWithArrays {

  static ParkedCar[] parkedCars = new ParkedCar[5];

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String plateNumber = "";
    String color = "";
    String cont = "";
    int carParkingSpot = 0;
    ParkedCar p = null;
    do {
      System.out.println("Enter a plate number: ");
      plateNumber = input.nextLine();
      System.out.println("Enter the car color: ");
      color = input.nextLine();

      p = new ParkedCar(plateNumber, color);
      if (carParkingSpot < 20) {
        parkedCars[carParkingSpot++] = p;
        System.out.println("Filled parking spot : " + (carParkingSpot - 1));
        System.out.println("Next parking spot : " + carParkingSpot);
      } else {
        System.out.println("Parking Full");
      }
      System.out.println("More Cars: ");
      cont = input.nextLine();
    } while (cont.equals("Y"));

    for (int parkingSpot = 0; parkingSpot < 5; parkingSpot++) {
      System.out.println(parkedCars[parkingSpot]);
    }

  }
}
