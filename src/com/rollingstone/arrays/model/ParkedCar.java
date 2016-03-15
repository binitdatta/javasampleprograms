package com.rollingstone.arrays.model;

public class ParkedCar {

  String plateNumber;
  String color;

  public ParkedCar() {

  }

  public ParkedCar(String plateNumber, String color) {
    this.plateNumber = plateNumber;
    this.color = color;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return "Plate Number :" + plateNumber + "  and color is :" + color;
  }

}
