package com.rollingstone.healthcare;

import java.util.ArrayList;
import java.util.List;

import com.rollingstone.common.Address;

public class OrganizationCustomer extends Customer {


  private boolean isPrimaryCustomer;
  private String name;
  List<OrganizationCustomer> subsidiaries = new ArrayList<>();
  List<IndividualCustomer> employees = new ArrayList<>();


  public OrganizationCustomer() {
    super();
  }

  public OrganizationCustomer(String customerID, String name, Address address,
      boolean isOrganization, boolean isIndividual, boolean isPrimaryCustomer) {
    super(customerID, address, isOrganization, isIndividual);
    System.out.println("A OrganizationCustomer is being created");

    this.isPrimaryCustomer = isPrimaryCustomer;
    this.name = name;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isPrimaryCustomer() {
    return isPrimaryCustomer;
  }

  public void setPrimaryCustomer(boolean isPrimaryCustomer) {
    this.isPrimaryCustomer = isPrimaryCustomer;
  }

  public List<OrganizationCustomer> getSubsidiaries() {
    return subsidiaries;
  }

  public void setSubsidiaries(List<OrganizationCustomer> subsidiaries) {
    this.subsidiaries = subsidiaries;
  }

  public List<IndividualCustomer> getEmployees() {
    return employees;
  }

  public void setEmployees(List<IndividualCustomer> employees) {
    this.employees = employees;
  }

  public long getTotalNumberOfMembers() {
    long totalEmployees = 0;

    for (OrganizationCustomer orgnCustomer : subsidiaries) {
      for (IndividualCustomer employee : orgnCustomer.employees) {
        totalEmployees++;
      }
    }

    for (IndividualCustomer employee : employees) {
      totalEmployees++;
    }
    return totalEmployees;
  }


}
