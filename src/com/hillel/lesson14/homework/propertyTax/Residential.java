package com.hillel.lesson14.homework.propertyTax;

public class Residential extends Realty {
double subsidy;

    public Residential(double s, double subsidy) {
        super(s);
        this.subsidy = subsidy;
    }
    public double getTax() {
        subsidy /= 100;
        if (subsidy == 0) {
            return result = this.s * taxK;
        } else {
            result = this.s * taxK;
            return result *= subsidy;
        }
    }
    public String toString() {
        return "residential";
    }


}
