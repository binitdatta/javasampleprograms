package com.rollingstone.interfaces;

public interface BankTeller {

  double depositCash(Account account, double amount);

  double depositCheck(Account account, Check check);

  double withdrawCash(Account account, double amount);

}
