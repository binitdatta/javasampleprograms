package com.rollingstone.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.rollingstone.common.Address;

public class BankBranch {

  Address branchAddress;

  Manager branchManager;

  List<BankTeller> tellers = new ArrayList<BankTeller>();

  BankBranch(Address address, Manager manager, List<BankTeller> tellers) {

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

  public List<BankTeller> getTellers() {
    return tellers;
  }

  public void setTellers(List<BankTeller> tellers) {
    this.tellers = tellers;
  }


}
