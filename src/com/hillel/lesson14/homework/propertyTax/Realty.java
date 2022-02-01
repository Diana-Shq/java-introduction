package com.hillel.lesson14.homework.propertyTax;

public class Realty {
  double s;
  int taxK = 90;
  double result;

  protected Realty(double s) {
      this.s = s;
  }
  public double getTax() {
      return result = this.s * taxK;
  }
  public String toString() {
      return "realty";
  }
}
