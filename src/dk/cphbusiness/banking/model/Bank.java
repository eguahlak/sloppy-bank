package dk.cphbusiness.banking.model;

import java.util.Collection;

public interface Bank {
  String getName();
  Account findAccount(String number);
  Collection<Account> listAccounts();
  void addAccount(Account account);
  }
