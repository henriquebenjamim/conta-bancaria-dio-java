package model;

public class BankAccount {
  private int Number;
  private String Agency;
  private String ClientName;
  private double Amount;
  
  public BankAccount() {
  }

  public BankAccount(int number, String agency, String clientName, double amount) {
    Number = number;
    Agency = agency;
    ClientName = clientName;
    Amount = amount;
  }
  
  public int getNumber() {
    return Number;
  }
  public void setNumber(int number) {
    Number = number;
  }
  public String getAgency() {
    return Agency;
  }
  public void setAgency(String agency) {
    Agency = agency;
  }
  public String getClientName() {
    return ClientName;
  }
  public void setClientName(String clientName) {
    ClientName = clientName;
  }
  public double getAmount() {
    return Amount;
  }
  public void setAmount(double amount) {
    Amount = amount;
  }

  
}
