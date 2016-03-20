package com.rollingstone.interfaces;

import java.time.LocalDate;
import java.time.LocalTime;

public class BankATM implements BankTeller {

  private String atmNumber;
  private LocalDate installedOn;
  private LocalTime serviceTime;
  private float cashLimit;
  private float totalCashimit;

  public BankATM(String atmNumber, LocalDate installedOn, LocalTime serviceTime, float cashLimit,
      float totalCashimit) {

    this.atmNumber = atmNumber;
    this.installedOn = installedOn;
    this.serviceTime = serviceTime;
    this.cashLimit = cashLimit;
    this.totalCashimit = totalCashimit;
  }

  public BankATM() {

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
