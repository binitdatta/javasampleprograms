package com.rollingstone.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.rollingstone.common.Address;

public class AlternativeBankBranch {

  Address branchAddress;

  Manager branchManager;

  List<HumanTeller> humanTellers = new ArrayList<HumanTeller>();

  List<BankATM> atmTellers = new ArrayList<BankATM>();


  AlternativeBankBranch(Address address, Manager manager, List<HumanTeller> humanTellers,
      List<BankATM> atmTellers) {

    this.branchAddress = address;
    this.branchManager = manager;
    this.humanTellers = humanTellers;
    this.atmTellers = atmTellers;
  }


  public Address getBranchAddress() {
    return branchAddress;
  }


  public void setBranchAddress(Address branchAddress) {
    this.branchAddress = branchAddress;
  }


  public Manager getBranchManager() {
    return branchManager;
  }


  public void setBranchManager(Manager branchManager) {
    this.branchManager = branchManager;
  }


  public List<HumanTeller> getHumanTellers() {
    return humanTellers;
  }


  public void setHumanTellers(List<HumanTeller> humanTellers) {
    this.humanTellers = humanTellers;
  }


  public List<BankATM> getAtmTellers() {
    return atmTellers;
  }


  public void setAtmTellers(List<BankATM> atmTellers) {
    this.atmTellers = atmTellers;
  }


}
