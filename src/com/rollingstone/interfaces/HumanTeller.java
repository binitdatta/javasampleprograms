package com.rollingstone.interfaces;

import java.time.LocalDate;

public class HumanTeller implements BankTeller {

  private int employeeNumber;
  private String firstName;
  private String middleName;
  private String lastName;
  private LocalDate dateOfBirth;
  private LocalDate dateOfJoin;

  public HumanTeller() {

  }

  public HumanTeller(int employeeNumber, String firstName, String middleName, String lastName,
      LocalDate dateOfBirth, LocalDate dateOfJoin) {

    this.employeeNumber = employeeNumber;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.dateOfBirth = dateOfJoin;
  }

  public int getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(int employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public LocalDate getDateOfJoin() {
    return dateOfJoin;
  }

  public void setDateOfJoin(LocalDate dateOfJoin) {
    this.dateOfJoin = dateOfJoin;
  }

  @Override
  public double depositCash(Account account, double amount) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public double depositCheck(Account account, Check check) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public double withdrawCash(Account account, double amount) {
    // TODO Auto-generated method stub
    return 0;
  }

}
