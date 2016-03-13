package com.rollingstone.healthcare;

import java.util.List;

import com.rollingstone.common.Address;

public class IndividualCustomer extends Customer {

  private String memberID;
  private String groupID;
  private String firstName;
  private String middleName;
  private String lastName;

  private String emailAddress;

  private boolean isPrimaryMember;
  private String primaryCustomerID;

  private List<IndividualCustomer> dependents;

  public IndividualCustomer() {
    super();
  }

  public IndividualCustomer(String customerID, Address address, boolean isOrganization,
      boolean isIndividual, String memberID, String groupID, String firstName, String middleName,
      String lastName, String emailAddress, boolean isPrimary) {
    super(customerID, address, isOrganization, isIndividual);

    System.out.println("A IndividualCustomer is being created");

    this.memberID = memberID;
    this.groupID = groupID;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
    this.isPrimaryMember = isPrimary;

  }

  public String getPrimaryCustomerID() {
    return primaryCustomerID;
  }

  public void setPrimaryCustomerID(String primaryCustomerID) {
    this.primaryCustomerID = primaryCustomerID;
  }

  public String getMemberID() {
    return memberID;
  }

  public void setMemberID(String memberID) {
    this.memberID = memberID;
  }

  public String getGroupID() {
    return groupID;
  }

  public void setGroupID(String groupID) {
    this.groupID = groupID;
  }

  public List<IndividualCustomer> getDependents() {
    return dependents;
  }

  public void setDependents(List<IndividualCustomer> dependents) {
    this.dependents = dependents;
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

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public boolean isPrimaryMember() {
    return isPrimaryMember;
  }

  public void setPrimaryMember(boolean isPrimaryMember) {
    this.isPrimaryMember = isPrimaryMember;
  }


}
