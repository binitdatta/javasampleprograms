package com.rollingstone.arrays.model;

import java.time.LocalDateTime;

public class ParkedCar {

  String plateNumber;
  String color;
  LocalDateTime entryTime;
  LocalDateTime exitTime;

  public ParkedCar() {

  }

  public ParkedCar(String plateNumber, String color) {
    this.plateNumber = plateNumber;
    this.color = color;
  }


  public LocalDateTime getEntryTime() {
    return entryTime;
  }

  public void setEntryTime(LocalDateTime entryTime) {
    this.entryTime = entryTime;
  }

  public LocalDateTime getExitTime() {
    return exitTime;
  }

  public void setExitTime(LocalDateTime exitTime) {
    this.exitTime = exitTime;
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
