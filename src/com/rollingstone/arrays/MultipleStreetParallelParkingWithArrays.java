package com.rollingstone.arrays;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.rollingstone.arrays.model.ParkedCar;

public class MultipleStreetParallelParkingWithArrays {

  static ParkedCar[][] parkedCars = new ParkedCar[3][3];

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String plateNumber = "";
    String color = "";
    String cont = "";
    int carParkingSpot = 0;
    ParkedCar p = null;
    System.out.println("***********Main Menu************");
    System.out.println("1. Park Cars");
    System.out.println("2. Check Car Out");
    System.out.println("***********Main Menu************");
    do {
      System.out.println("Enter a choice: ");
      cont = input.nextLine();
      if (cont.trim().equals("1")) {
        parkCars();
      } else if (cont.trim().equals("2")) {
        ParkedCar leavingCar = checkOutCar();
        System.out.println("The Car stayed for :"
            + (leavingCar.getEntryTime().until(leavingCar.getExitTime(), ChronoUnit.SECONDS))
            + " Minutes.");
        System.out.println("The Car Enterd the Lot :" + (leavingCar.getExitTime()) + " Minutes.");
        System.out.println("The Car is Exiting  @:" + (leavingCar.getExitTime()) + " Minutes.");
      }
      continue;
    } while (!cont.equals("3"));

    for (int parkingSpot = 0; parkingSpot < parkedCars.length; parkingSpot++) {
      System.out.println(parkedCars[parkingSpot]);
    }

  }

  public static void parkCars() {
    Scanner input1 = new Scanner(System.in);

    String plateNumber = "";
    String color = "";
    String cont = "";
    int carParkingSpot = 0;
    int streetNumber = 0;
    ParkedCar p = null;
    do {
      System.out.println("Enter a plate number: ");
      plateNumber = input1.nextLine();
      System.out.println("Enter the car color: ");
      color = input1.nextLine();

      p = new ParkedCar(plateNumber, color);
      p.setEntryTime(LocalDateTime.now());

      if (carParkingSpot < 20) {
        parkedCars[carParkingSpot++][streetNumber++] = p;
        System.out.println("Filled parking spot : " + (carParkingSpot - 1));
        System.out.println("Next parking spot : " + carParkingSpot);
      } else {
        System.out.println("Parking Full");
      }
      System.out.println("More Cars: ");
      cont = input1.nextLine();
    } while (cont.equals("Y"));

  }

  public static ParkedCar checkOutCar() {
    Scanner input = new Scanner(System.in);

    String plateNumber = "";
    ParkedCar p = null;

    System.out.println("Enter a plate number: ");
    plateNumber = input.nextLine();

    for (int i = 0; i < parkedCars.length; i++) {
      for (int j = 0; j < 3; j++) {
        if (parkedCars[i][j].getPlateNumber().equals(plateNumber)) {
          p = parkedCars[i][j];
          p.setExitTime(LocalDateTime.now());
        }
      }
    }

    return p;

  }
}
