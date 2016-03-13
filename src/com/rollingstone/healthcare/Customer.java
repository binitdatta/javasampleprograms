package com.rollingstone.healthcare;

import com.rollingstone.common.Address;

public class Customer {

  protected String customerID;
  protected Address address;
  private boolean isOrganization;
  private boolean isIndividual;

  public Customer() {

  }

  public Customer(String customerID, Address address, boolean isOrganization,
      boolean isIndividual) {
    System.out.println("A Customer is being created");

    this.customerID = customerID;
    this.address = address;
    this.isIndividual = isIndividual;
    this.isOrganization = isOrganization;
  }

  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public boolean isOrganization() {
    return isOrganization;
  }

  public void setOrganization(boolean isOrganization) {
    this.isOrganization = isOrganization;
  }

  public boolean isIndividual() {
    return isIndividual;
  }

  public void setIndividual(boolean isIndividual) {
    this.isIndividual = isIndividual;
  }



}
